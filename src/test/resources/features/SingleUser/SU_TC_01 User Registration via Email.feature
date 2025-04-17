@SingleUserFulltest @Fulltest
Feature: SU_TC_01_Register_with_valid_credentials

  @SU_TC_01_Register_with_valid_credentials
  Scenario: TC_01 Validate new user registration process for Single User
    Given User visits "https://staging-lms.gitview.net/register"
    Then User is on the Register page
    
    When User enters the following details:
      | Field            | Value               |
      |------------------|---------------------|
      | FirstName        | Johnony             |
      | LastName         | Doe                 |
      | Email            | johny@thinktime.in  |
      | Password         | Pass@1234           |
      | Phone Number     | 12345678912         |
      | Agree to Terms   | Yes                 |
    
    When User clicks the signup button
    Then User should be logged in automatically
