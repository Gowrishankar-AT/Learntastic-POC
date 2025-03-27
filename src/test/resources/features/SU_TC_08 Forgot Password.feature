@Fulltest
Feature: Learntastic for single user

@SU_TC_08_Forgot_Password
   
    Scenario: TC_08 Verify Forgot password page
      Given User navigate to Login Page for user "https://staging-lms.gitview.net/login"
      When user enter Username "shankar33@thinktime.in" and click on continue button
      Then user click on the forgotpassword link and navigated to the password recovery page
      When user enters the mail id in the input field and click continue
      Then user able to see the success image
       

      
      