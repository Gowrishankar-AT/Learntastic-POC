@GroupUserFulltest @Fulltest
Feature: C_TC_06_Language_Selection

  @C_TC_06_Language_Selection
  Scenario: TC_06 Language Selection for Group User
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
    
    When GroupUser changes the language to "Spanish"
    Then Content on the page should be updated to Spanish for GroupUser
