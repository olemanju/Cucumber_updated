package com.wip.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ToolsQa
{

	
	@Given("^I have chosen to sign up$")
	public void i_have_chosen_to_sign_up() throws Throwable {
	    System.out.println("I have chosen to sign up");
	}

	@When("^I sign up with valid details$")
	public void i_sign_up_with_valid_details() throws Throwable {
	   System.out.println("I sign up with valid details");
	}

	@Then("^I should receive a confirmation email$")
	public void i_should_receive_a_confirmation_email() throws Throwable {
	   System.out.println("I should receive a confirmation email");
	}

	@Then("^I should see a personalized greeting message$")
	public void i_should_see_a_personalized_greeting_message() throws Throwable {
	   System.out.println("I should see a personalized greeting message");
	}
	
	@Given("^I have added another given here$")
	public void i_have_added_another_given_here() throws Throwable {
	    System.out.println("I have added another given here");
	}

	@Given("^I have added one more given here$")
	public void i_have_added_one_more_given_here() throws Throwable {
	   System.out.println("I have added one more given here");
	}

	@When("^I have added one when here$")
	public void i_have_added_one_when_here() throws Throwable {
	    System.out.println("I have added one when here");
	}
	
	@And("^I should be offered the option to recover my password$")
public void i_should_be_offered_the_option_to_recover_my_password() throws Throwable {
    System.out.println("I should be offered the option to recover my password");
}
	@But("^I enter an email address that has already registered$")
public void i_enter_an_email_address_that_has_already_registered() throws Throwable {
   System.out.println("I enter an email address that has already registered");
}
@Then("^I should be told that the email is already registered$")
public void i_should_be_told_that_the_email_is_already_registered() throws Throwable {
  System.out.println("I should be told that the email is already registered");
}
}
