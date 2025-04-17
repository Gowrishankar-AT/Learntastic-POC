package com.thinktimetechno.projects.website.stepdefinitions.CorporateUser;

import java.util.Map;

import com.thinktimetechno.hooks.TestContext;
import com.thinktimetechno.keywords.WebUI;
import com.thinktimetechno.projects.website.Multipages.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Corporate_StepDefinition {
	CorporateDashboardPage corporatedashboardPage;
	CorporateLoginPage corporateloginPage;
	CorporateRegistrationPage corporateregistrationPage;
	CorporateCartPage corporatecartPage;
	CorporatePaymentPage corporatepaymentPage;
	CorporateEmployeePage corporateemployeePage;
	CorporateInvoicePage corporateinvoicePage;
	CorporateDistributionPage corporatedistributionPage;

	public Corporate_StepDefinition(TestContext testContext) {
		corporatedashboardPage = testContext.getCorporateDashboardPage();
		corporateloginPage = testContext.getCorporateLoginPage();
		corporateregistrationPage = testContext.getCorporateRegistrationPage();
		corporatecartPage = testContext.getCorporateCartPage();
		corporatepaymentPage = testContext.getCorporatePaymentPage();
		corporateemployeePage = testContext.getCorporateEmployeePage();
        corporateinvoicePage = testContext.getCorporateInvoicePage();
        corporatedistributionPage = testContext.getCorporateDistributionPage();
	}
	// C-TC_01

	@Given("Groupuser navigates to the {string}")
	public void user_hit_the(String url) throws InterruptedException {
		WebUI.getURL(url);
	}

	@Then("Groupuser should be on the Register page")
	public void user_is_on_the_register_page() {
		corporateregistrationPage.registerassertion();
	}

	@When("Groupuser enters the following details for group user:")
	public void user_enters_the_following_details_for_group_user(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		String firstName = data.get("FirstName");
		String lastName = data.get("LastName");
		String emailAddress = data.get("Email");
		String password = data.get("Password");
		String phoneNumber = data.get("Phone Number");
		String invitecode = data.get("Invite code");
		corporateregistrationPage.registergroup(firstName, lastName, emailAddress, password, phoneNumber, invitecode);
	}

	@When("Groupuser clicks the signup button")
	public void user_clicks_the_button() throws InterruptedException {

		corporateregistrationPage.signIn();

	}

	@Then("Groupuser should be logged in automatically")
	public void user_should_be_logged_in_automatically() throws InterruptedException {
		WebUI.waitForPageLoaded();
		corporateregistrationPage.dashboardassertion();
	}

	// C_TC_03

	@Given("GroupUser navigates to the Login Page for user {string}")
	public void user_navigate_to_login_page_for_user(String string) {
		corporateloginPage.hiturl(string);

	}

	@When("GroupUser enters Username {string} and clicks on the continue button")
	public void user_enter_username_and_click_on_continue_button(String string) {
		corporateloginPage.username(string);
	}

	@When("GroupUser enters Password {string} and clicks on the login button")
	public void user_enter_password_and_click_on_login_button(String string) {
		corporateloginPage.password(string);
	}

	@Then("GroupUser is redirected to the Dashboard page")
	public void user_is_redirected_to_the_dashboard_page() throws InterruptedException {
		corporateloginPage.assertion01();
	}

	// C_TC_05

	@Given("GroupUser navigates to {string}")
	public void group_user_hits_the(String url) {
		WebUI.getURL(url);
	}

	@Then("GroupUser should be on the Online Courses and Career Opportunities page")
	public void group_user_is_on_the_register_page() {
		corporateregistrationPage.registerassertion1();
	}

	@When("GroupUser closes the PopUp Page")
	public void user_closes_the_pop_up_page() {
		corporateregistrationPage.popupclose();
	}

	@When("GroupUser taps on the Group Discount button")
	public void user_taps_on_group_discount_button() {
		corporateregistrationPage.groupdiscount();

	}

	@Then("GroupUser lands on the Registration Page")
	public void user_lands_on_the_registration_page() {
		corporateregistrationPage.groupdiscountassert();
	}

	@When("GroupUser enters all the following details for group user:")
	public void user_enters_the_following_details_for_group_users(io.cucumber.datatable.DataTable dataTable) {

		Map<String, String> data = dataTable.asMap(String.class, String.class);
		String firstName = data.get("FirstName");
		String lastName = data.get("LastName");
		String companyname = data.get("CompanyName");
		String phoneNumber = data.get("PhoneNumber");
		String emailid = data.get("EmailId");
		String password = data.get("Password");
		corporateregistrationPage.registergroupdetail(firstName, lastName, companyname, phoneNumber, emailid, password);
	}

	@When("GroupUser selects the I agree with terms & rules checkbox")
	public void user_selects_the_checkbox() {

		corporateregistrationPage.checkboxselection();
	}

	@When("GroupUser clicks the Register button")
	public void group_user_clicks_the_register_button() {
		corporateregistrationPage.registerbutton();
	}

	@Then("GroupUser should land on the Dashboard page and the Professional Information page should appear")
	public void user_should_land_on_the_dashboard_page_and_professional_information_page_appears() {

		corporateregistrationPage.dashboard01();
	}

//C_TC_05
	@When("GroupUser selects {string} from the Category dropdown")
	public void user_selects_from_the_category_dropdown(String category) {
		// WebUI.selectOptionByText(By.id("modal_category_id"), category);
		corporatedashboardPage.categoryselection(category);
	}

	@When("GroupUser selects {string} from the Sub-Category dropdown")
	public void user_selects_from_the_sub_category_dropdown(String subcategory) {

		corporatedashboardPage.subcategoryselection(subcategory);
	}

	@When("GroupUser taps on the Save button")
	public void user_taps_on_the_save_button() {

		corporatedashboardPage.savebutton();
	}

	@Then("GroupUser should see the selected category and sub-category displayed correctly")
	public void the_selected_category_and_sub_category_should_be_displayed_correctly() {
		corporatedashboardPage.categoryassertion01();
	}

//C_TC_06
	@When("GroupUser changes the language to {string}")
	public void the_user_changes_the_language_to(String language) throws InterruptedException {
//	WebElement languageDropdown = WebUI.getWebElement(By.xpath("//select[@class='gt_selector notranslate']"));
		corporatedashboardPage.languageselection(language);
//	WebUI.clickElement(By.xpath("//div[@class='topbar-logo']"));

	}

	@Then("Content on the page should be updated to Spanish for GroupUser")
	public void the_content_on_the_page_is_updated_to_spanish() throws InterruptedException {
		corporatedashboardPage.languageassertion();
	}

//C_TC_07
	@When("GroupUser searches for the {string} course in the search bar")
	public void GroupUser_searches_the_course_in_the_search_bar(String courseName) throws InterruptedException {

		corporatedashboardPage.coursesearch(courseName);

	}

	@When("GroupUser adds the course to the cart")
	public void GroupUser_add_the_course_in_cart() {
		corporatecartPage.addtocart();
	}
	
	@When("GroupUser taps on the Proceed To Checkout button")
	public void GroupUser_taps_on_the_proceed_to_checkout_button() {
		corporatecartPage.proceedtocheckout();
	}
	
	@When("GroupUser enters the Discount code as null")
	public void GroupUser_enters_the_discount_code_as_null() {

		corporatepaymentPage.discountcode();
	}

	@When("GroupUser enters all the checkout details:")
	public void GroupUser_enters_all_the_checkout_details(io.cucumber.datatable.DataTable dataTable) {
		WebUI.waitForPageLoaded();
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		String Cardnumber = data.get("CardNumber");
		String Expirationdate = data.get("ExpirationDate");
		String Securitycode = data.get("SecurityCode");
		corporatepaymentPage.checkoutdetails(Cardnumber, Expirationdate, Securitycode);
	}
	
	@When("GroupUser selects the Country name as {string}")
	public void GroupUser_selects_the_country_name_as(String string) {
		corporatepaymentPage.country(string);
	}

	@When("GroupUser taps on the Pay Now button")
	public void GroupUser_tap_on_the_pay_now_button() throws InterruptedException {
		// Ensure you switched back from the iframe
		corporatepaymentPage.paynowbutton();
	}
	
	@Then("GroupUser should see the {string} message")
	public void GroupUser_should_see_the_message(String string) throws InterruptedException {
		corporatepaymentPage.successmessage(string);
	}

	// C_TC_08 Course purchase via course catalog
	@Then("GroupUser selects the Course Catalog in the header")
	public void group_user_selects_the_course_catalog_in_header() {
		corporatedashboardPage.course();
	}

	@When("GroupUser is navigated to the Course Catalog page")
	public void the_group_user_navigated_to_the_course_catalog_page() {
		corporatedashboardPage.catalogassertion();
	}

	// C_TC_09 Bulk course purchase

	@When("GroupUser adds two different courses to the cart")
	public void group_user_adds_two_different_courses() {
		corporatecartPage.bulkcourse();
	}

	@When("The courses are in the cart")
	public void the_courses_are_in_cart() {
		corporatecartPage.courseassertion();
	}

	// C_TC_10 Payment Failure
	@Then("GroupUser should see the error message and the payment should fail")
	public void group_user_should_see_the_error_message_and_payment_is_failed() {
		corporatepaymentPage.errorassertion();
	}

	// C_TC_11Add to cart test cases
	@Then("GroupUser should see the course {string} successfully added to the cart")
	public void the_selected_course_successfully_added_to_the_cart(String courseName) {
		corporatecartPage.cartassertion(courseName);

	}
	
	@When("GroupUser deletes the added course from the cart")
	public void groupUser_delete_the_added_course_in_the_cart() {
		corporatecartPage.removeitem();
	}
	
	@Then("GroupUser should see that the course is deleted from the cart")
	public void the_course_should_be_deleted_from_the_cart() {
		corporatecartPage.emptycartassertion();

	}

	// C_TC_12 Invite New Employees
	@When("GroupUser clicks on Invite New Student")
	public void groupuser_click_on_invite_new_student() {
		corporatedashboardPage.invitebutton();
	}

	@Then("GroupUser should see the popup for Email Input")
	public void groupuser_able_to_see_the_popup_for_email_input() {
		corporatedashboardPage.invitepopupassertion();
	}

	@When("GroupUser enters the email in the popup")
	public void groupuser_enters_the_email_in_the_popup() {
		corporatedashboardPage.InviteEmaiInput();
	}

	@Then("GroupUser clicks the Send Invitation button")
	public void groupuser_clicks_the_send_invitation_button() {
		corporatedashboardPage.sendInvitebutton();
	}

	@Then("GroupUser should see the success message")
	public void groupuser_able_to_see_the_success_message() {
		corporatedashboardPage.InviteSentassertion();
	}
	// C_TC_13_Pending_Invite
	@When("GroupUser clicks on {string} under Purchased Courses")
	public void groupuser_click_on_under_purchased_courses(String string) {
	    
	   corporatedashboardPage.PendingInvite(string);
	}

	@When("GroupUser should be navigated to the Employees page")
	public void groupuser_should_be_navigated_to_the_employees_page() {
	    
		corporateemployeePage.PendingInviteassertion();
	}

	@Then("GroupUser clicks the status filter and sees the available options")
	public void groupuser_click_the_status_and_see_the_filters() {
	    
		corporateemployeePage.selectstatus();
	}

	@Then("GroupUser selects the {string} option")
	public void groupuser_clicks_the_option(String string) {
	    
		corporateemployeePage.selectdesiredstatus(string);
	}

	@Then("GroupUser should see the list of employees with the status {string}")
	public void groupuser_able_to_see_the_list_of_employees_status(String string) {
	    
		corporateemployeePage.waitingassertion();
	}
	//C_TC_14 Search employee by Email

	@Given("GroupUser enters the email {string} in the search bar")
	public void groupuser_enter_the_email_in_the_search_bar(String string) {
	    
		corporateemployeePage.emailsearch(string);
	}

	@Given("GroupUser clicks the search button")
	public void groupuser_click_on_the_search_button() {
		corporateemployeePage.search();
	}

	@Then("GroupUser should see the user with the related email")
	public void groupuser_able_to_see_the_user_with_the_related_email() {
		corporateemployeePage.searchassertion();
	}

	//C_TC_15  Search employee by Name
	@Given("GroupUser enters the name {string} in the search bar")
	public void groupuser_enter_the_name_in_the_search_bar(String string) {
	    
		corporateemployeePage.namesearch(string);
	}

	@Then("GroupUser should see the user with the related name")
	public void groupuser_able_to_see_the_user_with_the_related_name() {
		corporateemployeePage.searchassertionname();
	}

	//C_TC_16 View all Employees
	@When("GroupUser clicks on Employees in the Header")
	public void groupuser_click_on_in_header() {
	    
		corporateemployeePage.employees();
	}

	@Then("GroupUser should see the list of all employees")
	public void groupuser_able_to_see_the_list_of_all_employees() {
	    
		corporateemployeePage.employeelist();
	}
	//C_TC_18 Logout
	@When("GroupUser clicks on the profile")
	public void group_user_clicks_on_the_profile() {
	   corporatedashboardPage.profile();
	}
	@When("GroupUser able to see the dropdown")
	public void group_user_able_to_see_the_dropdown() {
	    corporatedashboardPage.profileassertion();
	}
	@When("GroupUser clicks on the logout in dropdown")
	public void group_user_clicks_on_the_logout_in_dropdown() {
	    corporatedashboardPage.logout();
	}
	@Then("GroupUser navigates to the homepage")
	public void group_user_navigates_to_the_homepage() {
	    corporateregistrationPage.registerassertion1();
	}
	//C_TC_19
	
	
	@When("GroupUser clicks on {string} under Purchased Codes")
	public void groupuser_click_on_under_purchased_codes(String string) {
	    
	   corporateinvoicePage.invoice(string);
	}
	
	@Then("GroupUser should be navigated to the Invoice page")
	public void groupuser_should_be_navigated_to_the_invoice_page() {
	    
		corporateinvoicePage.invoiceassertion();
	}
	
	@Given("GroupUser enters the coursename {string} in the search bar")
	public void group_user_enters_the_coursename_in_the_search_bar(String string) {
		corporateinvoicePage.coursename(string);
	}
	@Then("GroupUser should see the course with the related name")
	public void group_user_should_see_the_course_with_the_related_name() {
		corporateinvoicePage.courseassertion();
	}
	@When("GroupUser clicks on the ViewInvoice under Action")
	public void group_user_clicks_on_the_view_invoice_under_action() {
		corporateinvoicePage.viewinvoice();
	}
	@Then("GroupUser able to see the Invoice popup displayed")
	public void group_user_able_to_see_the_invoice_popup_displayed() {
		corporateinvoicePage.popupassertion();
	}
	@When("GroupUser clicks on the Download PDF button")
	public void group_user_clicks_on_the_download_pdf_button() {
		corporateinvoicePage.download();
	}
	@Then("GroupUser clicks on the close button")
	public void group_user_clicks_on_the_close_button() {
		corporateinvoicePage.close();
	}
	//C_TC_20
	@When("GroupUser taps on paylater option")
	public void group_user_taps_on_paylater_option() {
	    corporatecartPage.paylater();
	}
	@Then("GroupUser is navigated to the invoice page")
	public void group_user_is_navigated_to_the_invoice_page() {
	    corporateinvoicePage.invoiceassertion();
	}
	@When("GroupUser clicks on the complete payment button")
	public void group_user_clicks_on_the_complete_payment_button() {
		corporateinvoicePage.completepayment();
	}
	@When("GroupUser enters the Discount code as {string}")
	public void group_user_enters_the_discount_code_as(String string) {
		corporatecartPage.discountcode(string);
	}
//C_TC_21
	@Given("GroupUser is redirected to dashboard")
	public void group_user_is_redirected_to_dashboard() {
	    corporatepaymentPage.dashboardbutton();
	}
	@When("GroupUser clicks on the distribution in header")
	public void group_user_clicks_on_the_distribution_in_header() {
	    corporatedashboardPage.distibution();
	}
	@Then("GroupUser is redirected to distribution page")
	public void group_user_is_redirected_to_distribution_page() {
		corporatedistributionPage.assertion();
	}
	@When("GroupUser clicks on the assign code")
	public void group_user_clicks_on_the_assign_code() {
		corporatedistributionPage.assigncode();
	}
	@When("GroupUser selects the purchase code and employee")
	public void group_user_selects_the_purchase_code_and_employee() {
		corporatedistributionPage.codesassign();
	}
	@When("GroupUser selects the Assign code and save changes")
	public void group_user_selects_the_assign_code_and_save_changes() {
		corporatedistributionPage.save();
	}
	@Then("GroupUser able to see the course assigned to the employee")
	public void group_user_able_to_see_the_course_assigned_to_the_employee() {
		corporatedistributionPage.assertion1();
	}
	
// C_TC_22
	@When("GroupUser clicks on the Copy Management under the Total Certification")
	public void group_user_clicks_on_the_copy_management_under_the_total_certification() {
		corporatedashboardPage.totalcertification();
	}
	@Then("GroupUser is navigated to the Total Certification page")
	public void group_user_is_navigated_to_the_total_certification_page() {
		corporatedistributionPage.assertiontotal();
	}
	@When("GroupUser searches the employee name in search bar")
	public void group_user_searches_the_employee_name_in_search_bar() {
		corporatedistributionPage.searchbar();
	}
	@When("GroupUser enters the search button")
	public void group_user_enters_the_search_button() {
		corporatedistributionPage.button();
	}
	@Then("GroupUser able to see the employees")
	public void group_user_able_to_see_the_employees() {
		corporatedistributionPage.assertionemployee();
	}
}
