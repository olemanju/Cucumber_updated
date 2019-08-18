package com.wip.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginAynax 
{
	
	/*@Before
	public void start()
	{
		System.out.println("Launch the Browser");
	}
	
	@After
	public void teardown()
	{
		System.out.println("Driver closed");
		driver.quit();
		
	}*/
		String url="https://www.aynax.com/login.php";
	 //Given I logged in aynaxwebsite
		public  static WebDriver driver;
	 
	 @Given("^I logged in aynaxwebsite$")
	 public void login_AynaxSite() throws InterruptedException
	 {
		 System.out.println("Hello Bangalore");
		 System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Drivers\\chromedriver_win32\\chromedriver.exe");
	        driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        
		 
	 }
	 
	 @When("^I logged in \"([a-zA-Z]{1,})\" site$")
	 public void i_logged_in_aynax(String URL) throws Throwable
	 {
	     URL=url;
	     driver.get(url);
	 }
	 
	 @And("^I Entered \"([a-zA-Z]{1,})\" and \"([a-zA-Z]{1,})\"$")
	 public void enterUserName(String username,String password)
	 {
		 username="manju.ole23@gmail.com";
		 password="olemanju";
		 driver.findElement(By.name("emailaddress")).sendKeys(username);
		 driver.findElement(By.name("password")).sendKeys(password);
	 }
	 
	 @When("^I Click on Login button$")
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
	 @And("^I  see HomePage$")
	    public void VerifyhomePage() throws InterruptedException
	    {
		 Thread.sleep(3000);
	    	String homepage= driver.getTitle();
	    	System.out.println(homepage);
	    	Thread.sleep(3000);
	    	//driver.quit();
	    }
	
	   @And("^I must see HomePage$")
	    public void homePage() throws InterruptedException
	    {
	    	String homepage= driver.getTitle();
	    	System.out.println(homepage);
	    	Thread.sleep(3000);
	    	//driver.quit();
	    }
	   @And("^Clicked on Logout$")
		public void logout() throws InterruptedException
		{
			WebElement sett= driver.findElement(By.xpath("//ul[@id='utilities']//li/a[text()='Settings']"));
					Actions act= new Actions(driver);
					act.moveToElement(sett);
					Thread.sleep(3000);
					WebElement logot= driver.findElement(By.xpath("//li/a[text()='Log out']"));
					act.moveToElement(logot).click().build().perform();
		}
	   
	   @When("^I landed on HomePage$")
	   public void i_landed_on_HomePage() throws Throwable {
	       
		   String n=null;
		   n= driver.getTitle();
		   System.out.println(n);
	   }
}
