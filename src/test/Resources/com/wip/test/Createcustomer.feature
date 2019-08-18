@tag
Feature: Create a Account in aynax website
  I want to use this template for my feature file

  @tag1
  Scenario: Create a login with valid Username and Password
    Given I logged in aynaxwebsite
    When I logged in "aynax" site
    And I Entered "Username" and "Password"
    When I Click on Login button
    And I must see HomePage
    And Clicked on Logout
