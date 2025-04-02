@SingleFulltest
 Feature: Learntatstic for group User
@SU_TC_10_Add_&_Remove_Items_from_Cart
 Scenario: TC_10 Add & Remove Items from Cart for Single User 
 Given User hit the "https://staging-lms.gitview.net/register"
Then User is on the Register page	
When User enters the following details1:
  | Field            | Value               |
  |------------------|---------------------|
  | FirstName        | Johny              |
  | LastName         | Doe                 |
  | Email            | johny@thinktime.in |
  | Password         | Pass@1234           |
  | Phone Number     | 12345678912      |
  #And User selects the "I agree with terms & rules" checkbox
  And User clicks the Register button
  Then User should land on the dashboard page and Professional Information page appears
  When User selects "Healthcare" from the Category dropdown
  And User selects "Physicians" from the sub Category dropdown
  And User Taps on the save button
 Then The selected "Healthcare" category and sub Category "Physicians" should be displayed correctly for User
  When User searches the "Healthcare, First Aid & Bloodborne Pathogens Combo" course in the search bar
  And User add the course in cart
  Then The selected course "Healthcare, First Aid & Bloodborne Pathogens Combo" successfully added to the cart
  When User delete the added course in the cart
  Then The course should be deleted from the cart
  