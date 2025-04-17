@SingleUserFulltest @Fulltest
Feature: SU_TC_03_Register_via_JoinForFree

  @SU_TC_03_Register_via_JoinForFree
  Scenario: TC_03 Registration via "Join for Free" Pop-up
    Given User visits "https://staging-lms.gitview.net/"
    When User clicks on the Join for Free button on the landing page
    Then Join for Free pop-up should appear
    
    When User enters the following details:
      | Field            | Value               |
      |------------------|---------------------|
      | FirstName        | John                |
      | LastName         | Doe                 |
      | Email            | johny@google.com    |
      | Password         | Pass@1234           |
      | Phone Number     | 12345678912         |
      | Agree to Terms   | Yes                 |
    
    When User clicks the Join Free button in the pop-up
    Then User should be redirected to the application dashboard or the appropriate page
