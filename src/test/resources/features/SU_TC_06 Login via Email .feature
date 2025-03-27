@Fulltest
Feature: Learntastic for single user

@SU_TC_06_Login_via_Email
    Scenario: TC_06 Validate Single user login
      Given User navigate to Login Page for user "https://staging-lms.gitview.net/login"
      When user enter Username "shankar33@thinktime.in" and click on continue button
      Then user enter Password "123456789" and click on login button
      Then user is redirected to the Dashboard page

      
      