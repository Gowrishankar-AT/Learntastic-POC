package com.thinktimetechno.projects.website.stepdefinitions.CorporateUser;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.thinktimetechno.driver.DriverManager;
import com.thinktimetechno.hooks.TestContext;
import com.thinktimetechno.keywords.WebUI;
import com.thinktimetechno.projects.website.pages.DashboardPage;
import com.thinktimetechno.projects.website.pages.LoginPage;
import com.thinktimetechno.projects.website.pages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Corporate_StepDefinition {
	 DashboardPage dashboardPage;
		LoginPage loginPage;
		 RegistrationPage registrationPage;
	public Corporate_StepDefinition(TestContext testContext) {
		dashboardPage=testContext.getDashboardPage();
		loginPage=testContext.getLoginPage();
		registrationPage=testContext.getRegistrationPage();
		
	}
	@Given("Groupuser hit the {string}")
	public void user_hit_the(String url) throws InterruptedException {
		WebUI.getURL(url);
		
		registrationPage.popupclose();
	}
	@Then("Groupuser is on the Register page")
	public void user_is_on_the_register_page() {
		registrationPage.registerassertion();
;	}
	@When("Groupuser enters the following details for group user:")
	public void user_enters_the_following_details_for_group_user(io.cucumber.datatable.DataTable dataTable) {
		 Map<String, String> data = dataTable.asMap(String.class, String.class);
		    String firstName = data.get("FirstName");
		    String lastName = data.get("LastName");
		    String emailAddress = data.get("Email");
		    String password = data.get("Password");
		    String phoneNumber = data.get("Phone Number");
		    String invitecode = data.get("Invite code");
		    registrationPage.registergroup(firstName,lastName,emailAddress,password,phoneNumber,invitecode);
	}
	
	@When("Groupuser clicks the signup button")
	public void user_clicks_the_button() throws InterruptedException {
		
	  registrationPage.signIn();
	  
	}
	@Then("Groupuser should be logged in automatically.")
	public void user_should_be_logged_in_automatically() throws InterruptedException {
		WebUI.waitForPageLoaded();
		registrationPage.dashboardassertion();
   }
	
	@Given("Groupuser navigate to Login Page for user {string}")
	public void user_navigate_to_login_page_for_user(String string) {
	    loginPage.hiturl(string);
	    
	}
	@When("Groupuser enter Username {string} and click on continue button")
	public void user_enter_username_and_click_on_continue_button(String string) {
	   loginPage.username(string);
	}
	@When("Groupuser enter Password {string} and click on login button")
	public void user_enter_password_and_click_on_login_button(String string) {
	   loginPage.password(string);
	}
	@Then("Groupuser is redirected to the Dashboard page")
	public void user_is_redirected_to_the_dashboard_page() throws InterruptedException {
	   loginPage.assertion01();
	}
	@Given("GroupUser hits the {string}")
	public void group_user_hits_the(String url) {
		 WebUI.getURL(url);
	}
	@Then("GroupUser is on the Online Courses and Career Opportunities page")
	public void group_user_is_on_the_register_page() {
			Assert.assertEquals(WebUI.getPageTitle(),"Online Courses and Career Opportunities");
	}
	@When("GroupUser closes the PopUp Page")
	public void user_closes_the_pop_up_page() {
		WebElement element = WebUI.waitForElementVisible(By.xpath("//button[@class='close']"));

		// Use JavaScript Executor to click the element
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", element);
	}
	
	@When("GroupUser Taps on Group Discount button")
	public void user_taps_on_group_discount_button() {

	WebElement discount=WebUI.getWebElement(By.xpath("//a[normalize-space()='Group Discount']"));
	JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
	js.executeScript("arguments[0].click();", discount);
	}
	@Then("GroupUser lands on the Registration Page")
	public void user_lands_on_the_registration_page() {
		Assert.assertEquals(WebUI.getPageTitle(),"Login");

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
		    registrationPage.registergroupdetail(firstName, lastName, companyname, phoneNumber, emailid, password);
	}
	@When("GroupUser selects the {string} checkbox")
	public void user_selects_the_checkbox(String string) {   
		WebElement termsCheckbox = WebUI.getWebElement(By.xpath("//label[contains(text(),'I agree with')]/preceding-sibling::input[@id='term']"));

		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", termsCheckbox);
	}
	@When("GroupUser clicks the Register button")
	public void group_user_clicks_the_register_button() {
	  WebUI.clickElement(By.xpath("//button[normalize-space()='Register']"));
	}
@Then("GroupUser should land on the dashboard page and Professional Information page appears")
public void user_should_land_on_the_dashboard_page_and_professional_information_page_appears() {
	Assert.assertEquals(WebUI.getPageTitle(),"Dashboard | Learntastic");
}
@When("GroupUser selects {string} from the Category dropdown")
public void user_selects_from_the_category_dropdown(String category) {
	WebUI.selectOptionByText(By.id("modal_category_id"), category);

}
@When("GroupUser selects {string} from the sub Category dropdown")
public void user_selects_from_the_sub_category_dropdown(String subcategory) {
	WebUI.selectOptionByText(By.id("modal_sub_category_id"), subcategory);

}

@When("GroupUser Taps on the save button")
public void user_taps_on_the_save_button() {
	  WebUI.clickElement(By.xpath("(//button[contains(@class,'button-save-user')])[1]"));
	
}
@Then("The selected category and sub Category should be displayed correctly for GroupUser")
public void the_selected_category_and_sub_category_should_be_displayed_correctly() {
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[contains(text(),'Physicians -  Packages')]")),"Physicians - Packages");
}
@When("GroupUser changes the language to {string}")
public void the_user_changes_the_language_to(String language) throws InterruptedException {
//	WebElement languageDropdown = WebUI.getWebElement(By.xpath("//select[@class='gt_selector notranslate']"));
	WebUI.selectOptionByText(By.xpath("//select[@class='gt_selector notranslate']"), language);
	WebUI.clickElement(By.xpath("//select[@class='gt_selector notranslate']"));
//	WebUI.clickElement(By.xpath("//div[@class='topbar-logo']"));
	
	    }


@Then("Content on the page is updated to Spanish for GroupUser")
public void the_content_on_the_page_is_updated_to_spanish() throws InterruptedException {
    WebUI.waitForPageLoaded();
    WebElement panelElement = WebUI.waitForElementVisible(By.xpath("//font[contains(text(),'Panel')]"));
    String panelText = panelElement.getText();
    Assert.assertEquals(panelText, "Panel", "The content did not change to Spanish.");
}
@When("GroupUser searches the {string} course in the search bar")
public void GroupUser_searches_the_course_in_the_search_bar(String courseName) throws InterruptedException {
   WebElement searchbar = WebUI.getWebElement(By.xpath("//span[@role='combobox']"));	
   WebUI.scrollToElementToTop(searchbar);	
   searchbar.click();
   WebUI.setText(By.xpath("//input[@role='searchbox']"), courseName);
   
   WebUI.waitForElementVisible(By.xpath("//ul[@class='select2-results__options']/child::li[contains(text(),'Healthcare, First Aid')]"));
   WebElement listElement = WebUI.getWebElement(By.xpath("//ul[@class='select2-results__options']/child::li[contains(text(),'Healthcare, First Aid')]"));
   
   listElement.click();
   WebUI.waitForPageLoaded();
   String CourseTitile = WebUI.getTextElement(By.xpath("//div[@class='allcourses-item_title']/descendant::h3[contains(text(),'Healthcare, First Aid')]")).trim();
   Assert.assertEquals(courseName, CourseTitile);
  
}
@When("GroupUser add the course in cart")
public void GroupUser_add_the_course_in_cart() {
   WebUI.clickElement(By.xpath("//div[@class='allcourses_list-item']/child::div/descendant::h3[contains(text(),'Healthcare, First Aid')]/ancestor::div[@class='allcourses_list-item']/descendant::div[@class='allcourses-item_bottom']/descendant::button[@class='allcourses_button']"));
}
@When("GroupUser taps on the Proceed To Checkout button")
public void GroupUser_taps_on_the_proceed_to_checkout_button() {
   WebUI.clickElement(By.xpath("//a[@class='cart-mini_checkout']"));
}
@When("GroupUser enters the Discount code as {string}")
public void GroupUser_enters_the_discount_code_as(String code) {
	//WebUI.setText(By.xpath("//input[@id='coupon_input']"), code);
    
    By proceedToCheckoutButton = By.xpath("//button[@id='btn_submit_cart']");
    WebElement btn = WebUI.getWebElement(proceedToCheckoutButton);

    // JavaScript click if normal click fails
    ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", btn);
}
@When("GroupUser enters all the checkout details:")
public void GroupUser_enters_all_the_checkout_details(io.cucumber.datatable.DataTable dataTable) {
	WebUI.waitForPageLoaded();
	Map<String, String> data = dataTable.asMap(String.class, String.class);
    String Cardnumber = data.get("CardNumber");
    String Expirationdate = data.get("ExpirationDate");
    String Securitycode = data.get("SecurityCode");
    
    WebUI.waitForElementPresent(By.xpath("//h2[@class='cart-title' and contains(text(),'Checkout')]"));
    Assert.assertEquals(WebUI.getPageTitle(), "Checkout | Learntastic");
    
    WebUI.switchToFrameByElement(By.xpath("//iframe[@title='Secure payment input frame']"));
    WebUI.waitForPageLoaded();
    WebUI.setText(By.xpath("//div[@class='p-CardNumberInput']/descendant::input[@name='number']"), Cardnumber);
    WebUI.setText(By.xpath("//input[@name='expiry']"), Expirationdate);
    WebUI.setText(By.xpath("//input[@id='Field-cvcInput']"), Securitycode);
    
}
@When("GroupUser Selects the Country name as {string}")
public void GroupUser_selects_the_country_name_as(String string) {
   WebUI.selectOptionByText(By.id("Field-countryInput"), "India");
}
@When("GroupUser Tap on the Pay Now button")
public void GroupUser_tap_on_the_pay_now_button() throws InterruptedException {
	// Ensure you switched back from the iframe
    WebUI.switchToDefaultContent();
    By payNow = By.xpath("//span[contains(text(),'Pay Now')]");
    WebElement button = WebUI.waitForElementClickable(payNow, 15);

    WebUI.scrollToElementToBottom(button);
    JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
    js.executeScript("arguments[0].click();", button);
    WebUI.waitForPageLoaded();
}

@When("GroupGroupUser should see the {string} message")
public void GroupUser_should_see_the_message(String string) throws InterruptedException {
	    WebUI.waitForPageLoaded();
        Thread.sleep(5000);
		Assert.assertEquals(WebUI.getPageTitle().trim(), "Thank You");
		System.out.println(WebUI.getPageTitle().trim());
		}

//Add to cart test cases
	@Then("The selected course {string} successfully added to the cart")
	public void the_selected_course_successfully_added_to_the_cart(String courseName) {
		
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='cart-mini_item']/descendant::a")).trim(), courseName);
	
	}
	
	@When("GroupUser delete the added course in the cart")
	public void groupUser_delete_the_added_course_in_the_cart() {
		WebUI.clickElement(By.xpath("//button[@class='remove-cart-mini']"));
		
	}
	@Then("The course should be deleted from the cart")
	public void the_course_should_be_deleted_from_the_cart() {
	    
     WebUI.waitForPageLoaded();	    
	    // Verify the cart is empty or the specific course is no longer visible
	    boolean isCartEmpty = WebUI.verifyElementPresent(By.xpath("//p[contains(.,'Cart is empty.')]"));
	    Assert.assertTrue(isCartEmpty, "The cart is not empty, course not deleted!");
	}
}
