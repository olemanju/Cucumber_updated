package com.wip.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AynaxScenarioOutline 
{
	
	public static WebDriver driver;
	
	@Given("^I want to Launch the ([^\"]*)$")
	public void LaunchUrl(String urlname)
	{
		
		 System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
	        driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        String Url= urlname;
	        System.out.println("URL is " + Url);
	        driver.get(Url);
	}
	
	@Then("^I Clicked on the Login button$")
	public void i_Clicked_on_the_Login_button() throws Throwable {

		
		 try {
			WebElement ed=driver.findElement(By.className("loginButton"));
			ed.click();
		} catch (Exception e) 
		 {
			WebElement xpath_Login= driver.findElement(By.xpath("//input[@value='Login']"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", xpath_Login);
			e.printStackTrace();
		}
	    
	}
	
	//@When("^I enter my ([^\"]*) and ([^\"]*)$")
	@When("^I enter the  ([^\"]*) and ([^\"]*)$")
	public void enter_usernameAndPassword(String uname, String pass) throws InterruptedException
	{
	Thread.sleep(2000);
		 driver.findElement(By.name("emailaddress")).sendKeys(uname);
		 driver.findElement(By.name("password")).sendKeys(pass);
	 }
	
	@Then("^I should able to see HomePage$")
	public void i_should_able_to_see_HomePage() throws Throwable {
	  
	 Thread.sleep(3000);
 	String homepage= driver.getTitle();
 	System.out.println(homepage);
 	Thread.sleep(3000);
 	//driver.quit();
	}
	 
	/* 	@Then("^I should see the Home Page$")
	 	public void verify_Home_Page() throws Throwable 
	 	{
	 		Thread.sleep(3000);
		 	String homepage1= driver.getTitle();
		 	System.out.println(homepage1);
		 	Thread.sleep(3000);
	 	}*/
	@Then("^I Click on Logoutbutton$")
	public void i_Click_on_Logoutbutton() throws InterruptedException
	{
		WebElement sett= driver.findElement(By.xpath("//ul[@id='utilities']//li/a[text()='Settings']"));
				Actions act= new Actions(driver);
				act.moveToElement(sett);
				Thread.sleep(3000);
				WebElement logot= driver.findElement(By.xpath("//li/a[text()='Log out']"));
				act.moveToElement(logot).click().build().perform();
				driver.close();
	}
	/*@Then("^I Clicked on Logout button$")
	public void i_Clicked_on_Logout_button() throws InterruptedException
	{
		WebElement sett= driver.findElement(By.xpath("//ul[@id='utilities']//li/a[text()='Settings']"));
				Actions act= new Actions(driver);
				act.moveToElement(sett);
				Thread.sleep(3000);
				WebElement logot= driver.findElement(By.xpath("//li/a[text()='Log out']"));
				act.moveToElement(logot).click().build().perform();
				driver.close();
	}*/
	
	@Then("^I should see the Home Page$")
	public void i_should_see_the_Home_Page() throws Throwable {
	    System.out.println("HomePage Displayed");
	}
	
	@Then("^I Clicked on Logout button$")
	public void i_Clicked_on_Logout_button() throws Throwable {
	    System.out.println("Clicked On Logout Button");
	    
	    WebElement dae= driver.findElement(By.xpath("//ul[@id='utilities']//li/a[text()='Settings']"));
		Actions act= new Actions(driver);
		act.moveToElement(dae);
		Thread.sleep(3000);
		WebElement logot= driver.findElement(By.xpath("//li/a[text()='Log out']"));
		act.moveToElement(logot).click().build().perform();
		driver.close();
	    
	}
}
