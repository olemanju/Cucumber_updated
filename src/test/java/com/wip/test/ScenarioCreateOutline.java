package com.wip.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class ScenarioCreateOutline 
{
	String url="https://www.aynax.com/login.php";
	 //Given I logged in aynaxwebsite
		public static  WebDriver driver;
	
	@Given("^I want login for ([^\"]*)$")
	public void login_test(String Url)
	{
		 System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
	        driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        //Url=url;
		     driver.get(Url);
	}
	@When("^I enter my ([^\"]*) and ([^\"]*)$")
	public void enter_usernameAndPassword(String uname, String pass)
	{
	
		 driver.findElement(By.name("emailaddress")).sendKeys(uname);
		 driver.findElement(By.name("password")).sendKeys(pass);
	 }
	
	
	
	@When("^I Clicked on Login button$")
	 public void login()
	 {
		 
		 WebElement ed=null;
		 try {
			 ed=driver.findElement(By.className("loginButton"));
			ed.click();
		} catch (Exception e) {
			WebElement xpath_Login= driver.findElement(By.xpath(" //input[@value='Login']"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", xpath_Login);
			e.printStackTrace();
		}
	 }
}
