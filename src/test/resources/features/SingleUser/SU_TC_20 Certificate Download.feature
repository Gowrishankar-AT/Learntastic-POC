@SingleUserFulltest @Fulltest
Feature: SU_TC_20_Certificate Download

  @SU_TC_20_Certificate_Download
  Scenario: TC_20 Validate Single user Certificate Download
    Given User navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When User enters Username "shankar33@thinktime.in" and clicks the continue button
    And User enters Password "123456789" and clicks the login button
    Then User is redirected to the Dashboard page
    When User clicks on the more options
    And User clicks on the clicks on download certificate
    Then User able to see the downloaded certificate
