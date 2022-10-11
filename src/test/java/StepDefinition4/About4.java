package StepDefinition4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class About4 {

	WebDriver driver;
	
	@Given("^Launch applications url(\\d+)$")
	public void launch_applications_url(int arg1) throws Throwable {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		
	}
	
	
	@Then("^Click About Link$")
	public void click_About_Link() throws Throwable {
	Thread.sleep(3000);
	
	WebElement aboultlink = driver.findElement(By.linkText("About us"));
	aboultlink.click();
	
		
	}

	@Then("^verify About Page Display$")
	public void verify_About_Page_Display() throws Throwable {
	boolean validation1 = driver.findElement(By.id("videoModalLabel")).isDisplayed();
	Assert.assertTrue(validation1);
	
	
	
//	boolean validation2 = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/button")).isDisplayed();
//	Assert.assertTrue(validation2);
	
		
		Thread.sleep(5000);
		driver.close();
		
		
	}
}
