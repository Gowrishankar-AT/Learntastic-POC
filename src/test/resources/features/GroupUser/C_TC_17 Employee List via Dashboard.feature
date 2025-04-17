@GroupUserFulltest @Fulltest
Feature: C_TC_17_Employee_List_via_Dashboard

  @C_TC_17_Employee_List_via_Dashboard
  Scenario: TC_17 Validate Employee_List_via_Dashboard
    Given GroupUser navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When GroupUser enters Username "Orgdemo@cpraedcourse.com" and clicks on the continue button
    And GroupUser enters Password "123456789" and clicks on the login button
    Then GroupUser is redirected to the Dashboard page
    
    When GroupUser clicks on "All Employee" under Purchased Courses
    And GroupUser should be navigated to the Employees page
    
    Then GroupUser should see the list of all employees
