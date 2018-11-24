package com.allfileinsamefolder.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration 

{
	WebDriver driver;
	
	@Given("^Open Registartion Page$")
	
	
	public void OpenFacebookPage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Softwares\\chromedriver_win32_B39\\chromedriver.exe"
				);
		driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	@When("^Enter Personal Details$")
	public void enter_Personal_Details() throws Throwable {
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Vivek");
		Thread.sleep(2000);
	}
	
	@When("^Enter Second name$")
	public void Enter_Second_Name() throws Throwable {
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Gaikwad");
		Thread.sleep(2000);
	} 
	
	
	@When("^Enter Address$")
	public void Enter_Address() throws Throwable {
	driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("Akurdi");
	Thread.sleep(2000);
	}
	
	@Then("^I verify textbox value$")
	public void EmailId() throws Throwable
	{	
		driver.findElement(By.xpath("//*[@id='eid']/input")).sendKeys("vgaikwad12@gmail.com");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.close();
					
	}
	}
