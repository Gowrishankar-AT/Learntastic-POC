@SingleUserFulltest @Fulltest
Feature: SU_TC_22_Store Item Purchase

  @SU_TC_22_Store_Item_Purchase
  Scenario: TC_22 Validate Single user Store Item Purchase
    Given User navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When User enters Username "shankar33@thinktime.in" and clicks the continue button
    And User enters Password "123456789" and clicks the login button
    Then User is redirected to the Dashboard page
    When User clicks on the store in header
    Then User navigated to the stores page
    When User clicks on the desired item and selects the course
    And User selects the desired Quantity and clicks on add to cart
    Then User navigated to the cart page 
    And User taps on the Proceed To Checkout button
    And User enters the Discount code as null
    When User enters all the checkout details:
      | Field            | Value                    |
      |------------------|--------------------------|
      | CardNumber       | 4242 4242 4242 4242      |
      | ExpirationDate   | 12/27                     |
      | SecurityCode     | 123                       |
    And User selects the Country name as "India"
    And User taps on the Pay Now button
    Then User should see the Thank You message