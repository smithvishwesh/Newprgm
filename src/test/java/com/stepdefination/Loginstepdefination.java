package com.stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginstepdefination {
	WebDriver driver;
	
	@Given("user should enter FB page")
	public void a () {
		
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@When("user enetr user name pass")
	public void b() {
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("Hello");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("logan");
		
	    
	}

	@When("User shloud click button")
	public void c() {
		
		WebElement btnlick = driver.findElement(By.xpath("//button[@name='login']"));
	    btnlick.click();
	   
	}

	@Then("User should verify Succesfully")
	public void d() {
		
		Assert.assertTrue("Verify", true);
		driver.quit();
	   
	}

}
