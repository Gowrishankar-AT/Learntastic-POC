@SingleUserFulltest @Fulltest
Feature: SU_TC_26_Invalid_Discount_Coupon

  @SU_TC_26_Invalid_Discount_Coupon
  Scenario: TC_26 Invalid Discount Coupon for Single User
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
    And User taps on the Proceed To Checkout button
    And User enters the Discount code as "QAPERCENT30"
    Then User should able to see error message
  
