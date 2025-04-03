@SingleFulltest
 Feature: Learntatstic for Single User
@SU_TC_15_Course_Initiation
 Scenario: TC_15 Course Initiation from Dashboard for User 
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
  And User clicks the Register button
  Then User should land on the dashboard page and Professional Information page appears
  When User selects "Healthcare" from the Category dropdown
  And User selects "Physicians" from the sub Category dropdown
  And User Taps on the save button
 Then The selected "Healthcare" category and sub Category "Physicians" should be displayed correctly for User
  When User searches the "Healthcare, First Aid & Bloodborne Pathogens Combo" course in the search bar
  And User add the course in cart
  And User taps on the Proceed To Checkout button
  And User enters the Discount code as "QACOUPON10"
  When User enters all the checkout details:
  | Field            | Value                    |
  |------------------|--------------------------|
  | CardNumber        | 4242 4242 4242 4242     |
  | ExpirationDate    | 12/27                   |
  | SecurityCode      | 123                     | 
  And User Selects the Country name as "India"
  And User Tap on the Pay Now button 
  And User should see the "Thank You" message
  Then User navigated to the Dashboard page
  When User clicks on Course name in dashboard
  Then User is navigated to Course section page
  And User clicks on start button
  Then User able to see the course material in the new tab