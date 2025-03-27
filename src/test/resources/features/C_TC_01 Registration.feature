@Fulltest
Feature: Learntatstic for group user


@C_TC_01_Register_with_valid_credentials
Scenario: TC_01 Validate new user registration process for Group User 
Given Groupuser hit the "https://staging-lms.gitview.net/register"
Then Groupuser is on the Register page	
When Groupuser enters the following details for group user:
  | Field            | Value               |
  |------------------|---------------------|
  | FirstName        | John1               |
  | LastName         | Doe                 |
  | Email            | johndoe@thinktime.in |
  | Password         | Pass@1234           |
  | Phone Number     | 121234567890         |
  | Invite code      | XSRB4-697f               |
  | Agree to Terms   | Yes                 |
When Groupuser clicks the signup button
Then Groupuser should be logged in automatically.


  