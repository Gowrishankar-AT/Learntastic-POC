@GroupFulltest
Feature: Learntastic for Group user
@C_TC_03_Login_with_valid_credentials
Scenario: TC_03 Validate Group user login
      Given Groupuser navigate to Login Page for user "https://staging-lms.gitview.net/login"
      When Groupuser enter Username "Orgdemo@cpraedcourse.com" and click on continue button
      And Groupuser enter Password "123456789" and click on login button
      Then Groupuser is redirected to the Dashboard page

      
      