@SingleUserFulltest @Fulltest
Feature: SU_TC_25_Virtual Session Dashboard

  @SU_TC_25_Virtual_Session_From_Dashboard
  Scenario: TC_24 Validate Single user Virtual Session Dashboard
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
    When User searches the "Online Bloodborne Pathogens Certification Course" course in the search bar
    And User adds the course to the cart
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
    And User should be navigated to the Dashboard page
    And User should be navigated to the Dashboard page
    When User clicks on the course name in the dashboard
    Then User is navigated to the Course section page1
    And User clicks on the start button
    Then User should be able to see the course material in the new tab1
    When User navigates to the bottom and clicks on Quiz
    And User clicks on the start quiz button
    Then User able to see the Questions for the quiz
    When User attends all the questions
    And User able to see the score
    And User clicks on exitcourse button
    Then User is navigated to the dashboard page and result is updated
    When User clicks on the more options
    And User clicks on the clicks on virtual review
    When User selects date and time
    And User selects the details for payment 
    Then User schedules the training