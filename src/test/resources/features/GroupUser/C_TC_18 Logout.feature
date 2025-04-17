@GroupUserFulltest @Fulltest
Feature: C_TC_18_Logout

  @C_TC_18_Logout
  Scenario: TC_03 Validate Group user logout
    Given GroupUser navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When GroupUser enters Username "Orgdemo@cpraedcourse.com" and clicks on the continue button
    And GroupUser enters Password "123456789" and clicks on the login button
    Then GroupUser is redirected to the Dashboard page
    When GroupUser clicks on the profile
    And GroupUser able to see the dropdown
    When GroupUser clicks on the logout in dropdown
    Then GroupUser navigates to the homepage

      
      