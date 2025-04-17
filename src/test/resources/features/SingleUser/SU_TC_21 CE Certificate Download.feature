@SingleUserFulltest @Fulltest
Feature: SU_TC_21_Ce Certificate Download

  @SU_TC_21_Ce_Certificate_Download
  Scenario: TC_21 Validate Single user Ce Certificate Download
    Given User navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When User enters Username "shankar33@thinktime.in" and clicks the continue button
    And User enters Password "123456789" and clicks the login button
    Then User is redirected to the Dashboard page
    When User clicks on the more options
    And User clicks on the clicks on download ce certificate
    Then User able to see the popup
    When User enters the details of the popup
    And User enters the submit button
    Then User able to see the download
