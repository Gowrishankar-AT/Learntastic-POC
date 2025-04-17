@SingleUserFulltest @Fulltest
Feature: SU_TC_17_Logout

  @SU_TC_17_Logout
  Scenario: TC_06 Validate Single user logout
    Given User navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When User enters Username "shankar33@thinktime.in" and clicks the continue button
    And User enters Password "123456789" and clicks the login button
    Then User is redirected to the Dashboard page
    When User clicks on the profile
    And User able to see the dropdown
    When User clicks on the logout in dropdown
    Then User navigates to the homepage
