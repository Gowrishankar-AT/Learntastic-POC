@GroupUserFulltest @Fulltest
Feature: C_TC_13_Pending_Employees_Invites

  @C_TC_13_Pending_Employees_Invites
  Scenario: TC_13 Validate Pending Employee Invite
    Given GroupUser navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When GroupUser enters Username "Orgdemo@cpraedcourse.com" and clicks on the continue button
    And GroupUser enters Password "123456789" and clicks on the login button
    Then GroupUser is redirected to the Dashboard page
    
    When GroupUser clicks on "Pending Invite" under Purchased Courses
    And GroupUser should be navigated to the Employees page
    
    Then GroupUser clicks the status filter and sees the available options
    And GroupUser selects the "Waiting" option
    Then GroupUser should see the list of employees with the status "Invited"
