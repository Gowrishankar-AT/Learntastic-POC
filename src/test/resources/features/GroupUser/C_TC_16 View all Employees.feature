@GroupUserFulltest @Fulltest
Feature: Learntastic for Group User

  @C_TC_16_View_all_Employees
  Scenario: TC_16 Validate GroupUser can see all Employees
    Given GroupUser navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When GroupUser enters Username "Orgdemo@cpraedcourse.com" and clicks on the continue button
    And GroupUser enters Password "123456789" and clicks on the login button
    Then GroupUser is redirected to the Dashboard page
    
    When GroupUser clicks on Employees in the Header
    And GroupUser should be navigated to the Employees page
    
    Then GroupUser should see the list of all employees
