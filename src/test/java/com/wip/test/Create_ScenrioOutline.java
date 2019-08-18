package com.wip.test;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Create_ScenrioOutline 
{
	
	@Given("^I logged into ([a-zA-z]{1,})$")
	public void enterURL(String urldetails)
	{
		System.out.println("Hello Bangalore");
	}

	/*@Given("^I logged into ([a-zA-z]{1,})$")
	public void i_logged_into_gmail_com() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello Bangalore");
	}*/
	
	@When("^I added this line$")
	public void i_added_this_line() throws Throwable {
	   System.out.println("Added this line to test the code");
	
	}
}
