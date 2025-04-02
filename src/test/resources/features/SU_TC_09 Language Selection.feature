@SingleFulltest
Feature: Learntastic for single user

@SU_TC_09_Language_Selection
   
    Scenario: TC_09 verify Language selection for single user
      Given User navigate to Login Page for user "https://staging-lms.gitview.net/login"
      When user enter Username "shankar33@thinktime.in" and click on continue button
      Then user enter Password "123456789" and click on login button
      Then user is redirected to the Dashboard page
      Then user selects the language from dropdown
      And user able to see the content in the selected language

      
      