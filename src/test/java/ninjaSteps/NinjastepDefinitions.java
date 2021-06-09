package ninjaSteps;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class NinjastepDefinitions {
	
	WebDriver driver;

	@Given("^launch browser and open ninjastore$")
	public void launch_browser_and_open_ninjastore() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "E:\\NewChrome\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@When("^search products \"([^\"]*)\" in searchbox$")
	public void search_products_in_searchbox(String product) throws Throwable {
		
		driver.findElement(By.name("search")).sendKeys(product);
		driver.findElement(By.xpath("//button[@type=\"button\"][@class=\"btn btn-default btn-lg\"]")).click();

	}

	@Then("^select MacBook Pro$")
	public void select_MacBook_Pro() throws Throwable {
		
		Thread.sleep(2000);
		List<WebElement> productlist = driver.findElements(By.xpath("//*[@id=\"content\"]/div[3]/div[*]/div/div[2]/div[1]/h4/a"));
		for(WebElement i:productlist) {
			if(i.getText().contains("MacBook Pro")) {
				i.click();
			}
		}
		driver.findElement(By.id("button-cart")).click();
		

	}
	
	@Then("select iphone mobile")
	public void select_iphone_mobile() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> productlist = driver.findElements(By.xpath("//*[@id=\"content\"]/div[3]/div[*]/div/div[2]/div[1]/h4/a"));
		for(WebElement i:productlist) {
			if(i.getText().contains("iphone")) {
				i.click();
			}
		}
		driver.findElement(By.id("button-cart")).click();
	}

	
	@Then("select samsung tab")
	public void select_samsung_tab() throws InterruptedException {
		Thread.sleep(2000);
		List<WebElement> productlist = driver.findElements(By.xpath("//*[@id=\"content\"]/div[3]/div[*]/div/div[2]/div[1]/h4/a"));
		for(WebElement i:productlist) {
			if(i.getText().contains("Samsung Galaxy Tab 10.1")) {
				i.click();
			}
		}
		driver.findElement(By.id("button-cart")).click();
	}
	
	
	@After
    public void afterScenario(Scenario scenario) throws InterruptedException{
		TakesScreenshot tc = (TakesScreenshot) driver;
		byte[] src = tc.getScreenshotAs(OutputType.BYTES);
		scenario.attach(src, "image/png", "screenshot");
		
		Thread.sleep(1000);	
        driver.close();
    }
	
}
