Feature: Login to Aynax Site.

@aynax
  Scenario Outline: Valid Login and INvalid Login
  Given I want to Launch the <URL>
  When I enter the  <username> and <password>
  And I added this line
  Then I Clicked on the Login button
  And I should able to see HomePage
  And I Click on Logoutbutton
  
  Examples:
  |URL|username|password|
  | https://www.aynax.com/login.php | manju.ole23@gmail.com | olemanju |
  @aynax
  Scenario Outline: Valid Login and INvalid Login
  Given I want to Launch the <URL>
  When I enter the  <username> and <password>
  And I added this line
  Then I Clicked on the Login button
  And I should able to see HomePage
  And I Click on Logoutbutton
  
  Examples:
  |URL|username|password|
  | https://www.aynax.com/login.php | manju.ole23@gmail.com | olemanju |
 
   
  @aynax1
  Scenario: Create a login with valid Username and Password
    Given I logged in aynaxwebsite
    When I logged in "aynax" site
    And I Entered "Username" and "Password"
     Then I Click on Login button
    And I should see the Home Page
  	And I Clicked on Logout button