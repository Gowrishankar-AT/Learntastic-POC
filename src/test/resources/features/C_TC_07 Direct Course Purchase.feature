@GroupFulltest
 Feature: Learntatstic for group GroupUser
@C_TC_07_Direct_Course_Purchase
 Scenario: TC_07 Direct Course Purchase from Dashboard for GroupUser 
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
  | CompanyName      | Thinktime01              | 
  | PhoneNumber      | 121234567890             |
  | EmailId          | Orgdemo@cpraedcourse.com |
  | Password         | Pass@1234                |
  And GroupUser selects the "I agree with terms & rules" checkbox
  And GroupUser clicks the Register button
  Then GroupUser should land on the dashboard page and Professional Information page appears
  When GroupUser selects "Healthcare" from the Category dropdown
  And GroupUser selects "Physicians" from the sub Category dropdown
  And GroupUser Taps on the save button
 Then The selected category and sub Category should be displayed correctly for GroupUser
  When GroupUser searches the "Healthcare, First Aid & Bloodborne Pathogens Combo" course in the search bar
  And GroupUser add the course in cart
  And GroupUser taps on the Proceed To Checkout button
  And GroupUser enters the Discount code as "QACOUPON10"
  When GroupUser enters all the checkout details:
  | Field            | Value                    |
  |------------------|--------------------------|
  | CardNumber        | 4242 4242 4242 4242     |
  | ExpirationDate    | 12/27                   |
  | SecurityCode      | 123                     | 
  And GroupUser Selects the Country name as "India"
  And GroupUser Tap on the Pay Now button 
  And GroupGroupUser should see the "Thank You" message