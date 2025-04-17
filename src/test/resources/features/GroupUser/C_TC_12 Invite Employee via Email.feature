@GroupUserFulltest @Fulltest
Feature: C_TC_12_Invite_Employees_via_Email

  @C_TC_12_Invite_Employees_via_Email
  Scenario: TC_12 Validate Employee invite via Email
    Given GroupUser navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When GroupUser enters Username "Orgdemo@cpraedcourse.com" and clicks on the continue button
    And GroupUser enters Password "123456789" and clicks on the login button
    Then GroupUser is redirected to the Dashboard page
    
    When GroupUser clicks on Invite New Student
    Then GroupUser should see the popup for Email Input
    And GroupUser enters the email in the popup
    And GroupUser clicks the Send Invitation button
    Then GroupUser should see the success message
