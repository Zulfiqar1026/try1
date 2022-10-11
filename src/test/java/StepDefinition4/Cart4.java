package StepDefinition4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cart4 {
	WebDriver driver;
	
	@Given("^Launch application url$")
	public void launch_application_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.manage().deleteAllCookies();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
	}

	@Then("^Click Samsung(\\d+)$")
	public void click_Samsung(int arg1) throws Throwable {
	WebElement sumsung = driver.findElement(By.linkText("Samsung galaxy s6"));
	sumsung.click();
		
		
	}

	@When("^Click AddToCart$")
	public void click_AddToCart() throws Throwable {
	 WebElement addingToCart = driver.findElement(By.linkText("Add to cart"));
	 addingToCart.click();
		
	 Thread.sleep(3000);
	 driver.switchTo().alert().accept();
	 
	}

	@Then("^Click Cart$")
	public void click_Cart() throws Throwable {
	 WebElement clickcart = driver.findElement(By.linkText("Cart"));
	 clickcart.click();
		
		
	}

	@Then("^Verify item added in Cart$")
	public void verify_item_added_in_Cart() throws Throwable {
	 boolean cartresult = driver.findElement(By.xpath("//td[text() = 'Samsung galaxy s6']")).isDisplayed();
	 Assert.assertTrue(cartresult);
	 
		
	Thread.sleep(3000);
	driver.close();	
		
	}
	
	
	
}
