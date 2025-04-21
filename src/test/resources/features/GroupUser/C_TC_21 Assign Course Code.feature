#@GroupUserFulltest @Fulltest
Feature: C_TC_21_Assign_Course_Code

  @C_TC_21_Assign_Course_Code
  Scenario: TC_21 Assign Course Code
    Given GroupUser navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When GroupUser enters Username "Orgdemo@cpraedcourse.com" and clicks on the continue button
    And GroupUser enters Password "123456789" and clicks on the login button
    Then GroupUser is redirected to the Dashboard page
    
   When GroupUser searches for the "First Aid Course" course in the search bar
    And GroupUser adds the course to the cart
    And GroupUser taps on the Proceed To Checkout button
    And GroupUser enters the Discount code as null
    
    When GroupUser enters all the checkout details:
      | Field            | Value                    |
      |------------------|--------------------------|
      | CardNumber       | 4242 4242 4242 4242      |
      | ExpirationDate   | 12/27                    |
      | SecurityCode     | 123                      |
    
    And GroupUser selects the Country name as "India"
    And GroupUser taps on the Pay Now button
    Then GroupUser should see the "Thank You" message
    And GroupUser is redirected to dashboard
    When GroupUser clicks on the distribution in header
    Then GroupUser is redirected to distribution page
    When GroupUser clicks on the assign code
    And GroupUser selects the purchase code and employee
    And GroupUser selects the Assign code and save changes
    Then GroupUser able to see the course assigned to the employee
    