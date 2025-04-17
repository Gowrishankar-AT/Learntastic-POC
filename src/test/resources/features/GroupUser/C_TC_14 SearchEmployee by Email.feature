@GroupUserFulltest @Fulltest
Feature: C_TC_14_Search_Employee_by_Email

  @C_TC_14_Search_Employee_by_Email
  Scenario: TC_14 Validate GroupUser Search Employees By Email
    Given GroupUser navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When GroupUser enters Username "Orgdemo@cpraedcourse.com" and clicks on the continue button
    And GroupUser enters Password "123456789" and clicks on the login button
    Then GroupUser is redirected to the Dashboard page
    
    When GroupUser clicks on Employees in the Header
    And GroupUser should be navigated to the Employees page
    
    Then GroupUser should see the list of all employees
    And GroupUser enters the email "shankar@thinktime.in" in the search bar
    And GroupUser clicks the search button
    Then GroupUser should see the user with the related email
