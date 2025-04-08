@SingleUserFulltest @Fulltest
Feature: Learntastic for Single User

  @SU_TC_08_Forgot_Password
  Scenario: TC_08 Verify Forgot Password page
    Given User navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When User enters Username "shankar33@thinktime.in" and clicks the continue button
    And User clicks on the forgot password link and is navigated to the password recovery page
    When User enters the email id in the input field and clicks continue
    Then User is able to see the success message
