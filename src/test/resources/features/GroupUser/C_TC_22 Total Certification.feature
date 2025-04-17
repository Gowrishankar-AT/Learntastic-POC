@GroupUserFulltest @Fulltest
Feature: C_TC_22_Total_Certification

  @C_TC_22_Total_Certification
  Scenario: TC_22 Total Certification
    Given GroupUser navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When GroupUser enters Username "Orgdemo@cpraedcourse.com" and clicks on the continue button
    And GroupUser enters Password "123456789" and clicks on the login button
    Then GroupUser is redirected to the Dashboard page
    
    When GroupUser clicks on the Copy Management under the Total Certification 
    Then GroupUser is navigated to the Total Certification page
    When GroupUser searches the employee name in search bar
    And GroupUser enters the search button
    Then GroupUser able to see the employees