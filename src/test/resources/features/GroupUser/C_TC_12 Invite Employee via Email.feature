@GroupFulltest
Feature: Learntastic for Group user
@C_TC_12_Invite_Employees_via_Email
Scenario: TC_12 Validate Employee invite via Email
      Given Groupuser navigate to Login Page for user "https://staging-lms.gitview.net/login"
      When Groupuser enter Username "Orgdemo@cpraedcourse.com" and click on continue button
      And Groupuser enter Password "123456789" and click on login button
      Then Groupuser is redirected to the Dashboard page
      When Groupuser click on invite new student
      And Groupuser able to see the popup for EmailInput
      Then Groupuser enters the email in the popup
      And Groupuser clicks the send invitation button
      Then Groupuser able to see the success message

      
      