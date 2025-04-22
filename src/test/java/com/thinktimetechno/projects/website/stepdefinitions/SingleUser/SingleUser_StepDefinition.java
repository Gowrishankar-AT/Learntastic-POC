package com.thinktimetechno.projects.website.stepdefinitions.SingleUser;

import java.util.Map;

import org.testng.Assert;

import com.thinktimetechno.hooks.TestContext;
import com.thinktimetechno.keywords.WebUI;
import com.thinktimetechno.projects.website.pages.*;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SingleUser_StepDefinition {

	DashboardPage dashboardPage;
	LoginPage loginPage;
	RegistrationPage registrationPage;
	CoursePage coursePage;
	PaymentPage paymentPage;
	CartPage cartPage;
	InvoicePage invoicePage;
    StorePage storePage;
    
	public SingleUser_StepDefinition(TestContext testContext) {
		dashboardPage = testContext.getDashboardPage();
		loginPage = testContext.getLoginPage();
		registrationPage = testContext.getRegistrationPage();
		cartPage = testContext.getCartPage();
		paymentPage = testContext.getPaymentPage();
		coursePage = testContext.getCoursePage();
		invoicePage = testContext.getInvoicePage();
		storePage = testContext.getStorePage();
	}

	// SU_TC_01
	@Given("User visits {string}")
	public void user_hit_the(String url) throws InterruptedException {
		WebUI.getURL(url);

	}

	@Then("User is on the Register page")
	public void user_is_on_the_register_page() {
		registrationPage.registerassertion();
		WebUI.waitForPageLoaded();

		;
	}

	@When("User enters the following details:")
	public void user_enters_the_following_details(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		String firstName = data.get("FirstName");
		String lastName = data.get("LastName");
		String emailAddress = data.get("Email");
		String password = data.get("Password");
		String phoneNumber = data.get("Phone Number");
		registrationPage.register01(firstName, lastName, emailAddress, password, phoneNumber);
	}

	@When("User enters the following details1:")
	public void user_enters_the_following_details1(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		String firstName = data.get("FirstName");
		String lastName = data.get("LastName");
		String emailAddress = data.get("Email");
		String password = data.get("Password");
		String phoneNumber = data.get("Phone Number");

		registrationPage.register00(firstName, lastName, emailAddress, password, phoneNumber);
	}

	@When("User clicks the signup button")
	public void user_clicks_the_button() throws InterruptedException {

		registrationPage.signIn();
		WebUI.waitForPageLoaded();

	}

	@Then("User should be logged in automatically")
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

	// SU_TC_03
	@When("User clicks on the Join for Free button on the landing page")
	public void user_clicks_on_the_button_on_the_landing_page() throws InterruptedException {
		registrationPage.joinforfree();
	}

	@Then("Join for Free pop-up should appear")
	public void a_pop_up_should_appear() {
		registrationPage.popupassertion();
	}

	@When("User clicks the Join Free button in the pop-up")
	public void user_clicks_the_Join_free_button_in_popup() throws InterruptedException {
		registrationPage.joinFree();
	}

	@Then("User should be redirected to the application dashboard or the appropriate page")
	public void user_should_be_redirected_to_the_application_dashboard_or_appropriate_page()
			throws InterruptedException {
		registrationPage.dashboardassertion01();
	}

	// SU_TC_06
	@Given("User navigates to the Login Page for user {string}")
	public void user_navigate_to_login_page_for_user(String string) {
		loginPage.hiturl(string);

	}

	@When("User enters Username {string} and clicks the continue button")
	public void user_enter_username_and_click_on_continue_button(String string) {
		loginPage.username(string);
	}

	@When("User enters Password {string} and clicks the login button")
	public void user_enter_password_and_click_on_login_button(String string) {
		loginPage.password(string);
	}

	@Then("User is redirected to the Dashboard page")
	public void user_is_redirected_to_the_dashboard_page() throws InterruptedException {
		loginPage.assertion();
	}

	// SU_TC_05
	@When("User selects the {string} category and {string} subcategory")
	public void user_selects_the_and(String string, String string2) {
		dashboardPage.categoryselection(string,string2);
	}

	@Then("User should see courses related to the {string} category and {string} subcategory")
	public void user_able_to_see_courses_related_to_the_category_and(String s01, String s02)
			throws InterruptedException {
		dashboardPage.categoryassertion(s01, s02);
	}
//SU_TC_08

	@When("User clicks on the forgot password link and is navigated to the password recovery page")
	public void user_click_on_the_forgotpassword_link_and_navigated_to_the_password_recovery_page()
			throws InterruptedException {
		loginPage.forgotpassword();
	}

	@When("User enters the email id in the input field and clicks continue")
	public void user_enters_the_mail_id_in_the_input_field_and_click_continue() {
		loginPage.recoverymail();
	}

	@Then("User is able to see the success message")
	public void user_able_to_see_the_success_image() {
		loginPage.successmessage();
	}
//C_TC_09
	@When("User selects the language from the dropdown")
	public void user_selects_the_language_from_dropdown() throws InterruptedException {
		dashboardPage.languageselection();
	}

	@Then("User is able to see the content in the selected language")
	public void user_able_to_see_the_content_in_the_selected_language() {
		dashboardPage.languageassertion();
	}

	// course purchase SU_TC_11  
	@When("User searches the {string} course in the search bar")
	public void User_searches_the_course_in_the_search_bar(String courseName) throws InterruptedException {

		dashboardPage.search(courseName);
	}

	@When("User adds the course to the cart")
	public void User_add_the_course_in_cart() {
		cartPage.addtocart();
	}

	@When("User taps on the Proceed To Checkout button")
	public void User_taps_on_the_proceed_to_checkout_button() {
		cartPage.checkoutbutton();

	}

	@When("User enters the Discount code as null")
	public void User_enters_the_discount_code_as() {
		

		paymentPage.discount();
	}

	@When("User enters all the checkout details:")
	public void User_enters_all_the_checkout_details(io.cucumber.datatable.DataTable dataTable) {
		WebUI.waitForPageLoaded();
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		String Cardnumber = data.get("CardNumber");
		String Expirationdate = data.get("ExpirationDate");
		String Securitycode = data.get("SecurityCode");

		paymentPage.carddetails(Cardnumber, Expirationdate, Securitycode);
	}

	@When("User selects the Country name as {string}")
	public void User_selects_the_country_name_as(String string) {
		paymentPage.country(string);
	}

	@When("User taps on the Pay Now button")
	public void User_tap_on_the_pay_now_button() throws InterruptedException {
		// Ensure you switched back from the iframe

		paymentPage.paynowbutton();
	}



	@When("User selects the {string} checkbox")
	public void user_selects_the_checkbox(String string) {

		registrationPage.checkbox();
	}

	@When("User clicks the Register button")
	public void group_user_clicks_the_register_button() {
		registrationPage.registerbutton();
	}

	@Then("User should land on the dashboard page and Professional Information page appears")
	public void user_should_land_on_the_dashboard_page_and_professional_information_page_appears() {
		registrationPage.dashboardassertion();
	}

	@When("User selects {string} from the Category dropdown")
	public void user_selects_from_the_category_dropdown(String category) {

		dashboardPage.categoryselection01(category);

	}

	@When("User selects {string} from the sub Category dropdown")
	public void user_selects_from_the_sub_category_dropdown(String subcategory) {
		dashboardPage.subcategoryselection01(subcategory);

	}

	@When("User taps on the save button")
	public void user_taps_on_the_save_button() {
		dashboardPage.savebutton();
	}

	@Then("The selected {string} category and sub Category {string} should be displayed correctly for User")
	public void the_selected_category_and_sub_category_physicians_should_be_displayed_correctly_for_user(String s1,
			String s2) throws InterruptedException {
		dashboardPage.categoryassertion(s1, s2);
	}

	@Then("User should see the Thank You message")
	public void User_should_see_the_message1() throws InterruptedException {
		dashboardPage.successmessage();
	}

	@Given("User hits the {string}")
	public void group_user_hits_the(String url) {
		WebUI.getURL(url);
	}

	@Then("User is on the Online Courses and Career Opportunities page")
	public void group_user_is_on_the_register_page() {
		registrationPage.dashboardassertion01();
	}

	@When("User closes the PopUp Page")
	public void user_closes_the_pop_up_page() {

		registrationPage.popupclose();
	}

	@When("User Taps on Group Discount button")
	public void user_taps_on_group_discount_button() {

		registrationPage.groupdiscount();
	}

	@Then("User lands on the Registration Page")
	public void user_lands_on_the_registration_page() {

		registrationPage.loginassertion01();
	}

	
//SU_TC_10
	
	@Then("The selected course {string} should be successfully added to the cart")
	public void the_selected_course_successfully_added_to_the_cart(String string) {
		cartPage.cartassertion(string);
	}
	
	@When("User deletes the added course from the cart")
	public void user_delete_the_added_course_in_the_cart() {
		cartPage.itemdelete();
	}
	
	@Then("The course should be deleted from the cart")
	public void the_course_should_be_deleted_from_the_cart() {
		cartPage.emptycart();
	}
//SU_TC_12 Course Purchase
	
	@Then("User selects the course catalog in the header")
	public void user_selects_the_course_catalog_in_header() {
		dashboardPage.coursecataog();
	}

	@Then("The User is navigated to the course catalog page")
	public void the_user_navigated_to_the_course_catalog_page() {
		dashboardPage.catalogassertion();
	}

//SU_TC_13 Bulk purchase
	
	@When("User adds multiple courses to the cart")
	public void user_adds_multiple_course_in_cart() {
		cartPage.bulkpurchase();
	}

//SU_TC_14 Failed Payment
	//payment page
	@Then("User should see the error message for Failed payment")
	public void user_should_see_the_error_message_for_failed_payment() {
		paymentPage.errorassertion();
	}
//SU_TC_15Course Initiation from Dashboard

	@Then("User should be navigated to the Dashboard page")
	public void user_navigated_to_the_dashboard_page() {
		dashboardPage.courseassertion();
	}

	@When("User clicks on the course name in the dashboard")
	public void user_clicks_on_course_name_in_dashboard() {
		dashboardPage.coursesection();
	}
// course page
	@Then("User is navigated to the Course section page")
	public void user_is_navigated_to_course_section_page() {
		coursePage.coursepage();
	}
	// course page
	@Then("User clicks on the start button")
	public void user_clicks_on_start_button() {
		coursePage.startcourse();
	}
	// course page
	@Then("User should be able to see the course material in the new tab")
	public void user_able_to_see_the_course_material_in_the_new_tab() {
		coursePage.coursematerial();
	}

//SU_TC_16  Store Purchase
	@When("User clicks on Store Purchases in the dashboard")
	public void user_clicks_on_store_purchases_in_dashboard() {
		dashboardPage.storepurchase();
	}

	@When("User clicks on the purchase toggle button")
	public void user_clicks_on_the_purchase_toggle_button() {
		dashboardPage.purchasetogglebutton();
	}

	@Then("User should be able to see the purchased course")
	public void user_able_to_see_the_purchased_course() {
		dashboardPage.purchaseassertion();
	}

	@When("User clicks on the Go to Learning button")
	public void user_clicks_on_the_go_to_learning_page() {
		dashboardPage.learningpageclick();
	}
	
	//C_TC_17
	@When("User clicks on the profile")
	public void user_clicks_on_the_profile() {
	   dashboardPage.profile();
	}
	@When("User able to see the dropdown")
	public void user_able_to_see_the_dropdown() {
	    dashboardPage.profileassertion();
	}
	@When("User clicks on the logout in dropdown")
	public void user_clicks_on_the_logout_in_dropdown() {
	    dashboardPage.logout();
	}
	@Then("User navigates to the homepage")
	public void user_navigates_to_the_homepage() {
	    registrationPage.registerassertion1();
	}
	//SU_TC_18
	@Then("User should be able to see the course material in the new tab1")
	public void user_able_to_see_the_course_material_in_the_new_tab1() {
		coursePage.coursematerial1();
	}
	
	@Then("User is navigated to the Course section page1")
	public void user_is_navigated_to_course_section_page1() {
		coursePage.coursepage1();
	}
	@When("User navigates to the bottom and clicks on Quiz")
	public void user_navigates_to_the_bottom_and_clicks_on_quiz() throws InterruptedException {
		coursePage.quizbutton();
	}
	@When("User clicks on the start quiz button")
	public void user_clicks_on_the_start_quiz_button() {
		coursePage.startquizbutton();
	}
	@Then("User able to see the Questions for the quiz")
	public void user_able_to_see_the_questions_for_the_quiz() {
	    coursePage.questions();
	}
	@When("User attends all the questions")
	public void user_attends_all_the_questions() throws InterruptedException {
	    coursePage.quizattend();
	}
	@When("User able to see the score")
	public void user_able_to_see_the_score() {
	    coursePage.scoreassertion();
	}
	@When("User clicks on exitcourse button")
	public void user_clicks_on_exitcourse_button() {
	   coursePage.exitcoursebutton();
	}
	@Then("User is navigated to the dashboard page and result is updated")
	public void user_is_navigated_to_the_dashboard_page_and_result_is_updated() {
	    dashboardPage.resultassertion();
	}

	
	//SU_TC_19
	@When("User clicks on the invoice in dropdown")
	public void user_clicks_on_the_invoice_in_dropdown() {
		dashboardPage.invoice();
	}
	@Then("User navigates to the invoice page")
	public void user_navigates_to_the_invoice_page() {
	   
	    invoicePage.invoiceassertion();
	}
	@Then("User enters the coursename {string} in the search bar")
	public void user_enters_the_coursename_in_the_search_bar(String string) {
	    invoicePage.search(string);
	}
	@Then("User clicks the search button")
	public void user_clicks_the_search_button() {
	    invoicePage.searchbutton();
	}
	@Then("User should see the course with the related name")
	public void user_should_see_the_course_with_the_related_name() {
	    invoicePage.invoiceassertion1();
	}
	@When("User clicks on the ViewInvoice under Action")
	public void user_clicks_on_the_view_invoice_under_action() {
	    invoicePage.details();
	}
	@Then("User able to see the Invoice popup displayed")
	public void user_able_to_see_the_invoice_popup_displayed() {
	    invoicePage.popupassertion();
	}
	@When("User clicks on the Download PDF button")
	public void user_clicks_on_the_download_pdf_button() {
	   invoicePage.downloadbutton();
	}
	@Then("User clicks on the close button")
	public void user_clicks_on_the_close_button() throws InterruptedException {
		Thread.sleep(1000);
	    invoicePage.close();
	}
	//SU_TC_20
	@When("User clicks on the more options")
	public void user_clicks_on_the_more_options() {
	    dashboardPage.moreoptions();
	}
	@When("User clicks on the clicks on download certificate")
	public void user_clicks_on_the_clicks_on_download_certificate() {
		dashboardPage.downloadcertificate();
	}
	@Then("User able to see the downloaded certificate")
	public void user_able_to_see_the_downloaded_certificate() {
	    dashboardPage.certificateassertion();
	}
	
	//SU_TC_21
	
	@When("User clicks on the clicks on download ce certificate")
	public void user_clicks_on_the_clicks_on_download_wallet_card() {
		dashboardPage.downloadwalletcard();
	}
	
	@Then("User able to see the popup")
	public void user_able_to_see_the_popup() {
	    dashboardPage.popupassertion();
	}
	@When("User enters the details of the popup")
	public void user_enters_the_details_of_the_popup() {
	    dashboardPage.popupquestions();
	}
	@When("User enters the submit button")
	public void user_enters_the_submit_button() {
	    dashboardPage.submitbutton();
	}
	@Then("User able to see the download")
	public void user_able_to_see_the_download() {
		WebUI.switchToWindowOrTabByTitle("Download CE Certificate");
	    Assert.assertEquals(WebUI.getPageTitle(), "Download CE Certificate");
	}
	
	//SU_TC_22
	@When("User clicks on the store in header")
	public void user_clicks_on_the_store_in_header() {
	    dashboardPage.storeitems();
	}
	@Then("User navigated to the stores page")
	public void user_navigated_to_the_stores_page() {
	    storePage.assertion();
	}
	@When("User clicks on the desired item and selects the course")
	public void user_clicks_on_the_desired_item_and_selects_the_course() {
	    storePage.storeitem();
	}
	@When("User selects the desired Quantity and clicks on add to cart")
	public void user_selects_the_desired_quantity_and_clicks_on_add_to_cart() {
	    storePage.quantity();
	}
	@Then("User navigated to the cart page")
	public void user_navigated_to_the_cart_page() {
	    cartPage.cartassertion("CE Certificate");
	}
	//C_TC_23
	
	@Given("User Clicks on the view detail")
	public void user_clicks_on_the_view_detail() {
	   dashboardPage.viewdetail();
	}
	@Given("User navigated to the detail page")
	public void user_navigated_to_the_detail_page() {
	    dashboardPage.detailassertion();
	}
	@Then("User not able to view the start course button")
	public void user_not_able_to_view_the_start_course_button() {
	    dashboardPage.startcourse();
	}
	
	//C_TC_24
	@When("User clicks on the desired session and selects the course")
	public void user_clicks_on_the_desired_session_and_selects_the_course() {
	    storePage.storeitem1();
	}
	@When("User selects the desired Quantity and clicks on add to cart1")
	public void user_selects_the_desired_quantity_and_clicks_on_add_to_cart1() {
	    storePage.quantity1();
	}
	@Then("User navigated to the cart page1")
	public void user_navigated_to_the_cart_page1() {
	    cartPage.cartassertion("The virtual review session");
	}
	//C_TC_25
	@When("User clicks on the clicks on virtual review")
	public void user_clicks_on_the_clicks_on_virtual_review() {
		dashboardPage.virtualreview();
	}
	
	@When ("User selects date and time")
	public void user_selects_date_and_time() {
		dashboardPage.date();
	}
	@Given("User selects the details for payment")
	public void user_selects_the_details_for_payment() {
	   dashboardPage.details();
	}
	@Then("User schedules the training")
	public void user_schedules_the_training() {
	    cartPage.virtual();
	}
	//SU_TC_26
	@Given("User enters the Discount code as {string}")
	public void user_enters_the_discount_code_as(String string) {
	    cartPage.discount(string);
	}
	@Then("User should able to see error message")
	public void user_should_able_to_see_error_message() {
	    cartPage.error();
	}
}
