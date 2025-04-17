@GroupUserFulltest @Fulltest
Feature: C_TC_03_Login_with_valid_credentials

  @C_TC_03_Login_with_valid_credentials
  Scenario: TC_03 Validate Group user login
    Given GroupUser navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When GroupUser enters Username "Orgdemo1@cpraedcourse.com" and clicks on the continue button
    And GroupUser enters Password "123456789" and clicks on the login button
    Then GroupUser is redirected to the Dashboard page


      
      