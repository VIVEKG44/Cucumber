package com.allfileinsamefolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.sourceforge.htmlunit.corejs.javascript.ast.ThrowStatement;

public class MyFirstStepDef 

{	
		WebDriver driver;
	
	@Given("^open facebook page$")
	
	
	public void OpenFacebookPage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Softwares\\chromedriver_win32_B39\\chromedriver.exe"
				);
		 driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
	
	}
		@When("^I enter Login name$")
		public void Loginname() throws Throwable 
		{
			driver.findElement(By.id("email")).sendKeys("Vivek");
			Thread.sleep(2000);
		}
		
		@Then("^I verify textbox value$")
		public void i_verify_textbox_value() throws Throwable 
		{
			driver.findElement(By.id("pass")).sendKeys("123456");
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(4000);
			driver.close();
		}

}