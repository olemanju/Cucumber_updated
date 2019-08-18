package com.wip.test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class scenaOtline 
{
	 // Given I want to write a step with <name>
	  //  When I check for the <value> in step
	  //  Then I verify the <status> in step
@Given("^I want to write a step with ([^\"]*)$")
public void i_want_step_with(String url)
{
System.out.println("Url is " + url);	
}

@When("^I check for the ([^\"]*) in step$")
public void check_for_the_step(String value)
{
	System.out.println("The Value is " + value);
}

@Then("^I verify the ([^\"]*) in step$")
public void verify_laststep(String whatsstatus)
{
System.out.println("What is the status  " + whatsstatus);	
}

}
