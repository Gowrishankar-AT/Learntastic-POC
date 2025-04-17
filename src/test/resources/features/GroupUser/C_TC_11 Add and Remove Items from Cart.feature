@GroupUserFulltest @Fulltest
Feature: C_TC_11_Add_Remove_Items_from_Cart_for_GroupUser

  @C_TC_11_Add_Remove_Items_from_Cart_for_GroupUser
  Scenario: TC_11 Add and Remove Items from Cart for GroupUser
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
    
    When GroupUser searches for the "Healthcare, First Aid & Bloodborne Pathogens Combo" course in the search bar
    And GroupUser adds the course to the cart
    Then GroupUser should see the course "Healthcare, First Aid & Bloodborne Pathogens Combo" successfully added to the cart
    
    When GroupUser deletes the added course from the cart
    Then GroupUser should see that the course is deleted from the cart
