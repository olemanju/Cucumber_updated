package com.wip.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sftwaretest 
{
	
	//Given user navigates to SOFTWARETETINGHELP.COM
	//When user logs in using Username as “USER”
	//And password as “password”
	//Then login should be successful
	//And Home page should be displayed
	
	@Given("^user navigates to SOFTWARETETINGHELP.COM$")
	public void user_navigates_to_SOFTWARETETINGHELP()
	{
		System.out.println("Heelo User has ectered SOFTWARETETINGHELP ");
	}
	
	@When("^user logs in using Username as \"([^\"]*)\"$")
	public void user_logs_in_using_Username( String name)
	{
		String myname="Ram charan";
		myname=name;
		System.out.println("Enter the Username " + myname);
	}
	@When("^password as \"([^\"]*)\"$")
	public void password_as(String passed) throws Throwable {
	   System.out.println("My password is  " + passed);
	}
	
	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
	    System.out.println("login should be successful");
	}

	@Then("^Home page should be displayed$")
	public void home_page_should_be_displayed() throws Throwable {
	  System.out.println("Home page should be displayed");
	}

}
