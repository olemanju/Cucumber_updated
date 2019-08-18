Feature: Login Functionality Feature

@sft1
Scenario: Login Functionality
Given user navigates to SOFTWARETETINGHELP.COM
When user logs in using Username as "Username"
And password as "password"
Then login should be successful
And Home page should be displayed