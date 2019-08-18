#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Login details for Aynax
    Given I want login for <URL>
    When I enter my <username> and <password>
    And I added this line
    When I Click on Login button
    And I must see HomePage
    And Clicked on Logout
    

    Examples: 
      | URL                             | username              | password |
      | https://www.aynax.com/login.php | manju.ole23@gmail.com | olemanju |
      


  @tag1
  Scenario: Create a login with valid Username and Password
    Given I logged in aynaxwebsite
    When I logged in "aynax" site
    And I Entered "Username" and "Password"
    When I Click on Login button
    And I must see HomePage
    And Clicked on Logout
