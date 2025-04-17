@GroupUserFulltest @Fulltest
Feature: C_TC_19_Invoice_Page

  @C_TC_19_Invoice_Page
  Scenario: TC_16 Invoice Page
    Given GroupUser navigates to the Login Page for user "https://staging-lms.gitview.net/login"
    When GroupUser enters Username "Orgdemo@cpraedcourse.com" and clicks on the continue button
    And GroupUser enters Password "123456789" and clicks on the login button
    Then GroupUser is redirected to the Dashboard page
    
    When GroupUser clicks on "Total Invoices" under Purchased Codes
    Then GroupUser should be navigated to the Invoice page
    And GroupUser enters the coursename "Wound Care" in the search bar
    
    And GroupUser clicks the search button
    Then GroupUser should see the course with the related name
    When GroupUser clicks on the ViewInvoice under Action
    Then GroupUser able to see the Invoice popup displayed
    When GroupUser clicks on the Download PDF button
    Then GroupUser clicks on the close button  