@GroupUserFulltest @Fulltest
Feature: C_TC_08_Course_Purchase_via_Course_Catalog

  @C_TC_08_Course_Purchase_via_Course_Catalog
  Scenario: TC_08 Course Purchase via Course Catalog for GroupUser
    Given GroupUser navigates to "https://staging-lms.gitview.net/"
    Then GroupUser should be on the Online Courses and Career Opportunities page
    
    When GroupUser closes the PopUp Page
    And GroupUser taps on the Group Discount button
    Then GroupUser lands on the Registration Page

    When GroupUser enters all the following details for group user:
      | Field            | Value                    |
      |------------------|--------------------------|
      | FirstName        | John1                    |
      | LastName         | Doe                      |
      | CompanyName      | Thinktime01              |
      | PhoneNumber      | 121234567890             |
      | EmailId          | Orgdemo@cpraedcourse.com |
      | Password         | Pass@1234                |
    
    And GroupUser selects the I agree with terms & rules checkbox
    And GroupUser clicks the Register button
    Then GroupUser should land on the Dashboard page and the Professional Information page should appear
    
    When GroupUser selects "Healthcare" from the Category dropdown
    And GroupUser selects "Physicians" from the Sub-Category dropdown
    And GroupUser taps on the Save button
    Then GroupUser should see the selected category and sub-category displayed correctly
    
    And GroupUser selects the Course Catalog in the header
    And GroupUser is navigated to the Course Catalog page
    
    When GroupUser searches for the "Healthcare, First Aid & Bloodborne Pathogens Combo" course in the search bar
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
