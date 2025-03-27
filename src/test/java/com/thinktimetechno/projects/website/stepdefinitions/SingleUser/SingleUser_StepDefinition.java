package com.thinktimetechno.projects.website.stepdefinitions.SingleUser;

import java.util.Map;

import com.thinktimetechno.hooks.TestContext;
import com.thinktimetechno.keywords.WebUI;
import com.thinktimetechno.projects.website.pages.DashboardPage;
import com.thinktimetechno.projects.website.pages.LoginPage;
import com.thinktimetechno.projects.website.pages.RegistrationPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SingleUser_StepDefinition {
	
	 DashboardPage dashboardPage;
	LoginPage loginPage;
	 RegistrationPage registrationPage;
	public SingleUser_StepDefinition(TestContext testContext) {
		dashboardPage=testContext.getDashboardPage();
		loginPage=testContext.getLoginPage();
		registrationPage=testContext.getRegistrationPage();
	}
	@Given("User hit the {string}")
	public void user_hit_the(String url) throws InterruptedException {
		WebUI.getURL(url);
		
	}
	@Then("User is on the Register page")
	public void user_is_on_the_register_page() {
		registrationPage.registerassertion();

		
;	}
	@When("User enters the following details:")
	public void user_enters_the_following_details(io.cucumber.datatable.DataTable dataTable) {
		 Map<String, String> data = dataTable.asMap(String.class, String.class);
		    String firstName = data.get("FirstName");
		    String lastName = data.get("LastName");
		    String emailAddress = data.get("Email");
		    String password = data.get("Password");
		    String phoneNumber = data.get("Phone Number");
		    registrationPage.register01(firstName,lastName,emailAddress,password,phoneNumber);
	}
	
	@When("User enters the following details1:")
	public void user_enters_the_following_details1(io.cucumber.datatable.DataTable dataTable) {
		 Map<String, String> data = dataTable.asMap(String.class, String.class);
		    String firstName = data.get("FirstName");
		    String lastName = data.get("LastName");
		    String emailAddress = data.get("Email");
		    String password = data.get("Password");
		    String phoneNumber = data.get("Phone Number");
		    registrationPage.register00(firstName,lastName,emailAddress,password,phoneNumber);
	}
	
	
	
	@When("User clicks the signup button")
	public void user_clicks_the_button() throws InterruptedException {
		
	  registrationPage.signIn();
	  
	}
	@Then("User should be logged in automatically.")
	public void user_should_be_logged_in_automatically() throws InterruptedException {
		WebUI.waitForPageLoaded();
		registrationPage.dashboardassertion();
   }
	@Given("User hit the {string} and navigated to the LearnTastic login page")
	public void user_hit_the_and_navigated_to_the_learn_tastic_login_page(String string) {
		WebUI.getURL(string);
		registrationPage.loginassertion();
	}
	@When("User clicks on the {string} button")
	public void user_clicks_on_the_button(String string) {
		registrationPage.register02();
	}
	@Then("The Google Sign-In popup should appear")
	public void the_google_sign_in_popup_should_appear() {
		registrationPage.googleassertion();
	}
	@When("User selects or enters valid Google credentials")
	public void user_selects_or_enters_valid_google_credentials() {
		registrationPage.gmailInput();
	}
	@When("User clicks {string} and enters the password")
	public void user_clicks_and_enters_the_password(String string) {
		registrationPage.gmailPassword();
	}
	@When("User grants any required permissions")
	public void user_grants_any_required_permissions() {
	   
	}
	@Then("User should be redirected to the LearnTastic dashboard")
	public void user_should_be_redirected_to_the_learn_tastic_dashboard() {
		registrationPage.googleassertion();
	}
	
	
	@When("User clicks on the {string} button on the landing page")
	public void user_clicks_on_the_button_on_the_landing_page(String string) throws InterruptedException {
	   registrationPage.joinforfree();
	}
	@Then("a {string} pop-up should appear")
	public void a_pop_up_should_appear(String string) {
		registrationPage.popupassertion();
	}
	
	@When("User clicks the {string} button in popup")
	public void user_clicks_the_Join_free_button_in_popup(String string) throws InterruptedException {
		registrationPage.joinFree();
	}
	
	@Then("User should be redirected to the application dashboard or appropriate page.")
	public void user_should_be_redirected_to_the_application_dashboard_or_appropriate_page() throws InterruptedException {
		Thread.sleep(5000);
		registrationPage.dashboardassertion();
	}
	
	@Given("User navigate to Login Page for user {string}")
	public void user_navigate_to_login_page_for_user(String string) {
	    loginPage.hiturl(string);
	    
	}
	@When("user enter Username {string} and click on continue button")
	public void user_enter_username_and_click_on_continue_button(String string) {
	   loginPage.username(string);
	}
	@Then("user enter Password {string} and click on login button")
	public void user_enter_password_and_click_on_login_button(String string) {
	   loginPage.password(string);
	}
	@Then("user is redirected to the Dashboard page")
	public void user_is_redirected_to_the_dashboard_page() throws InterruptedException {
	   loginPage.assertion();
	}
	@When("User selects the {string} and {string}")
	public void user_selects_the_and(String string, String string2) {
		dashboardPage.categoryselection();
	}
	@Then("User able to see courses related to the category {string} and {string}")
	public void user_able_to_see_courses_related_to_the_category_and(String s01, String s02) throws InterruptedException {
		dashboardPage.categoryassertion(s01,s02);
	}
 
	
	@Then("user click on the forgotpassword link and navigated to the password recovery page")
	public void user_click_on_the_forgotpassword_link_and_navigated_to_the_password_recovery_page() throws InterruptedException {
	   loginPage.forgotpassword();
	}
	@When("user enters the mail id in the input field and click continue")
	public void user_enters_the_mail_id_in_the_input_field_and_click_continue() {
	   loginPage.recoverymail();
	}
	@Then("user able to see the success image")
	public void user_able_to_see_the_success_image() {
	   loginPage.successmessage();
	}
	@Then("user selects the language from dropdown")
	public void user_selects_the_language_from_dropdown() throws InterruptedException {
		dashboardPage.languageselection();
	}
	@And("user able to see the content in the selected language")
	public void user_able_to_see_the_content_in_the_selected_language() {
		dashboardPage.languageassertion();
	}
}
