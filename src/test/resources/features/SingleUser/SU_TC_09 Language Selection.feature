@SingleUserFulltest @Fulltest
Feature: Learntastic for Single User

  @SU_TC_09_Language_Selection
  Scenario: TC_09 Verify Language selection for Single User
    Given User navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When User enters Username "shankar33@thinktime.in" and clicks the continue button
    And User enters Password "123456789" and clicks the login button
    Then User is redirected to the Dashboard page
    And User selects the language from the dropdown
    Then User is able to see the content in the selected language
