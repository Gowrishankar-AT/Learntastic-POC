@Fulltest
Feature: Learntatstic for group user
@C_TC_05_Category_Selection
Scenario: TC_05 Category Selection for Group User 
Given GroupUser hits the "https://staging-lms.gitview.net/"

Then GroupUser is on the Online Courses and Career Opportunities page	
When GroupUser closes the PopUp Page
When GroupUser Taps on Group Discount button
Then GroupUser lands on the Registration Page

When GroupUser enters all the following details for group user:
  | Field            | Value                    |
  |------------------|--------------------------|
  | FirstName        | John1                    |
  | LastName         | Doe                      |
  | CompanyName      | Thinktime01                | 
  | PhoneNumber      | 121234567890             |
  | EmailId          | Orgdemo@cpraedcourse.com     |
  | Password          | Pass@1234                |
And GroupUser selects the "I agree with terms & rules" checkbox
And GroupUser clicks the Register button
Then GroupUser should land on the dashboard page and Professional Information page appears
When GroupUser selects "Healthcare" from the Category dropdown
And GroupUser selects "Physicians" from the sub Category dropdown
And GroupUser Taps on the save button
Then The selected category and sub Category should be displayed correctly for GroupUser


  