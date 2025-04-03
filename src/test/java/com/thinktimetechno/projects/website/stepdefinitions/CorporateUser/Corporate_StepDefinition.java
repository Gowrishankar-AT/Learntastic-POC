package com.thinktimetechno.projects.website.stepdefinitions.CorporateUser;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.thinktimetechno.driver.DriverManager;
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
	public Corporate_StepDefinition(TestContext testContext) {
		corporatedashboardPage=testContext.getCorporateDashboardPage();
		corporateloginPage=testContext.getCorporateLoginPage();
		corporateregistrationPage=testContext.getCorporateRegistrationPage();
		
	}
	// C-TC_01
	
	@Given("Groupuser hit the {string}")
	public void user_hit_the(String url) throws InterruptedException {
		WebUI.getURL(url);
	}
	
	@Then("Groupuser is on the Register page")
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
		    corporateregistrationPage.registergroup(firstName,lastName,emailAddress,password,phoneNumber,invitecode);
	}
	
	@When("Groupuser clicks the signup button")
	public void user_clicks_the_button() throws InterruptedException {
		
	  corporateregistrationPage.signIn();
	  
	}
	@Then("Groupuser should be logged in automatically.")
	public void user_should_be_logged_in_automatically() throws InterruptedException {
		WebUI.waitForPageLoaded();
		corporateregistrationPage.dashboardassertion();
   }
	
	//C_TC_03
	
	@Given("Groupuser navigate to Login Page for user {string}")
	public void user_navigate_to_login_page_for_user(String string) {
	    corporateloginPage.hiturl(string);
	    
	}
	@When("Groupuser enter Username {string} and click on continue button")
	public void user_enter_username_and_click_on_continue_button(String string) {
	   corporateloginPage.username(string);
	}
	@When("Groupuser enter Password {string} and click on login button")
	public void user_enter_password_and_click_on_login_button(String string) {
	   corporateloginPage.password(string);
	}
	@Then("Groupuser is redirected to the Dashboard page")
	public void user_is_redirected_to_the_dashboard_page() throws InterruptedException {
	   corporateloginPage.assertion01();
	}
	
	//C_TC_05
	
	@Given("GroupUser hits the {string}")
	public void group_user_hits_the(String url) {
		 WebUI.getURL(url);
	}
	@Then("GroupUser is on the Online Courses and Career Opportunities page")
	public void group_user_is_on_the_register_page() {
			corporateregistrationPage.registerassertion1();
	}
	@When("GroupUser closes the PopUp Page")
	public void user_closes_the_pop_up_page() {
		corporateregistrationPage.popupclose();
	}
	
	@When("GroupUser Taps on Group Discount button")
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
	@When("GroupUser selects the {string} checkbox")
	public void user_selects_the_checkbox(String string) {   
		
		corporateregistrationPage.checkboxselection();
	}
	@When("GroupUser clicks the Register button")
	public void group_user_clicks_the_register_button() {
	  corporateregistrationPage.registerbutton();
	}
@Then("GroupUser should land on the dashboard page and Professional Information page appears")
public void user_should_land_on_the_dashboard_page_and_professional_information_page_appears() {
	
	corporateregistrationPage.dashboard01();
}
//C_TC_05
@When("GroupUser selects {string} from the Category dropdown")
public void user_selects_from_the_category_dropdown(String category) {
	WebUI.selectOptionByText(By.id("modal_category_id"), category);
   corporatedashboardPage.categoryselection(category);
}
@When("GroupUser selects {string} from the sub Category dropdown")
public void user_selects_from_the_sub_category_dropdown(String subcategory) {
	
	corporatedashboardPage.subcategoryselection(subcategory);
}

@When("GroupUser Taps on the save button")
public void user_taps_on_the_save_button() {
	 
	  corporatedashboardPage.savebutton();
}
@Then("GroupUser The selected category and sub Category should be displayed correctly for GroupUser")
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


@Then("Content on the page is updated to Spanish for GroupUser")
public void the_content_on_the_page_is_updated_to_spanish() throws InterruptedException {
	corporatedashboardPage.languageassertion();
}

//C_TC_07
@When("GroupUser searches the {string} course in the search bar")
public void GroupUser_searches_the_course_in_the_search_bar(String courseName) throws InterruptedException {
  
   corporatedashboardPage.coursesearch(courseName);
  
}
@When("GroupUser add the course in cart")
public void GroupUser_add_the_course_in_cart() {
   corporatedashboardPage.addtocart();
}
@When("GroupUser taps on the Proceed To Checkout button")
public void GroupUser_taps_on_the_proceed_to_checkout_button() {
   corporatedashboardPage.proceedtocheckout();
}
@When("GroupUser enters the Discount code as {string}")
public void GroupUser_enters_the_discount_code_as(String code) {
	
    corporatedashboardPage.discountcode(code);
}
@When("GroupUser enters all the checkout details:")
public void GroupUser_enters_all_the_checkout_details(io.cucumber.datatable.DataTable dataTable) {
	WebUI.waitForPageLoaded();
	Map<String, String> data = dataTable.asMap(String.class, String.class);
    String Cardnumber = data.get("CardNumber");
    String Expirationdate = data.get("ExpirationDate");
    String Securitycode = data.get("SecurityCode");
    corporatedashboardPage.checkoutdetails(Cardnumber,Expirationdate,Securitycode);
}
@When("GroupUser Selects the Country name as {string}")
public void GroupUser_selects_the_country_name_as(String string) {
   corporatedashboardPage.country(string);
}
@When("GroupUser Tap on the Pay Now button")
public void GroupUser_tap_on_the_pay_now_button() throws InterruptedException {
	// Ensure you switched back from the iframe
    corporatedashboardPage.paynowbutton();
}

@When("GroupUser should see the {string} message")
public void GroupUser_should_see_the_message(String string) throws InterruptedException {
		corporatedashboardPage.successmessage();
		}

	//C_TC_08 Course purchase via course catalog
	@Then("GroupUser selects the course catalog in header")
	public void group_user_selects_the_course_catalog_in_header() {
		corporatedashboardPage.course();
	}
	@Then("The GroupUser navigated to the course catalog page")
	public void the_group_user_navigated_to_the_course_catalog_page() {
		corporatedashboardPage.catalogassertion();
	}
	//C_TC_09 Bulk course purchase
	@When("GroupUser adds two different courses")
	public void group_user_adds_two_different_courses() {
		corporatedashboardPage.bulkcourse();
	}
	@When("The courses are in cart")
	public void the_courses_are_in_cart() {
		corporatedashboardPage.courseassertion();
	}
	//C_TC_10 Payment Failure
	@When("GroupUser should see the error message and payment is failed")
	public void group_user_should_see_the_error_message_and_payment_is_failed() {
		corporatedashboardPage.errorassertion();
	}
	
	//C_TC_11Add to cart test cases
		@Then("GroupUser The selected course {string} successfully added to the cart")
		public void the_selected_course_successfully_added_to_the_cart(String courseName) {
			corporatedashboardPage.cartassertion(courseName);
			
			
		}
		
		@When("GroupUser delete the added course in the cart")
		public void groupUser_delete_the_added_course_in_the_cart() {
			corporatedashboardPage.removeitem();
		}
		@Then("GroupUser The course should be deleted from the cart")
		public void the_course_should_be_deleted_from_the_cart() {
			corporatedashboardPage.emptycartassertion();
	    
		}
		//C_TC_12 Invite New Employees
		@When("Groupuser click on invite new student")
		public void groupuser_click_on_invite_new_student() {
			corporatedashboardPage.invitebutton();
		}
		@When("Groupuser able to see the popup for EmailInput")
		public void groupuser_able_to_see_the_popup_for_email_input() {
		    corporatedashboardPage.invitepopupassertion();
		}
		@Then("Groupuser enters the email in the popup")
		public void groupuser_enters_the_email_in_the_popup() {
			corporatedashboardPage.InviteEmaiInput();
		}
		@Then("Groupuser clicks the send invitation button")
		public void groupuser_clicks_the_send_invitation_button() {
			corporatedashboardPage.sendInvitebutton();
		}
		@Then("Groupuser able to see the success message")
		public void groupuser_able_to_see_the_success_message() {
			corporatedashboardPage.InviteSentassertion();
		}
		//C_TC_13_Pending_Invite
}
