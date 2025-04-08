@SingleUserFulltest @Fulltest
Feature: Learntastic for Group User

  @SU_TC_10_Add_Remove_Items_from_Cart
  Scenario: TC_10 Add and Remove Items from Cart for Single User
    Given User hits the "https://staging-lms.gitview.net/register"
    Then User is on the Register page
    When User enters the following details:
      | Field            | Value               |
      |------------------|---------------------|
      | FirstName        | Johny               |
      | LastName         | Doe                 |
      | Email            | johny@thinktime.in  |
      | Password         | Pass@1234           |
      | Phone Number     | 12345678912         |
    And User clicks the Register button
    Then User should land on the dashboard page and Professional Information page appears
    When User selects "Healthcare" from the Category dropdown
    And User selects "Physicians" from the sub Category dropdown
    And User taps on the save button
    Then The selected "Healthcare" category and sub Category "Physicians" should be displayed correctly for User
    When User searches the "Healthcare, First Aid & Bloodborne Pathogens Combo" course in the search bar
    And User adds the course to the cart
    Then The selected course "Healthcare, First Aid & Bloodborne Pathogens Combo" should be successfully added to the cart
    When User deletes the added course from the cart
    Then The course should be deleted from the cart
