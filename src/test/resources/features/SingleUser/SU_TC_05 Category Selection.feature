@SingleUserFulltest @Fulltest
Feature: SU_TC_05_Category_Selection

  @SU_TC_05_Category_Selection
  Scenario: TC_05 Category Selection for Single User
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
    
    When User selects the "Healthcare" category and "Pharmacist" subcategory
    Then User should see courses related to the "Healthcare" category and "Pharmacist" subcategory
