package com.thinktimetechno.projects.website.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.thinktimetechno.driver.DriverManager;
import com.thinktimetechno.keywords.WebUI;

public class RegistrationPage {
	private By inputEmail = By.xpath("//input[@id='email']");
	private By inputPassword = By.xpath("//input[@name='password']");
	private By policyButton = By.xpath("//input[@name='term']");
	private By mobileno = By.xpath("//input[@name='mobile']");
	private By firstname = By.xpath("//input[@name='first_name']");
	private By lastname = By.xpath("//input[@name='last_name']");

	public void register01(String fname, String lname, String email, String password, String mobile) {
		String dateTime = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		String emailAddress = email.replace("johny", "johny" + dateTime);
		WebUI.setText(firstname, fname);
		WebUI.setText(lastname, lname);
		WebUI.setText(inputEmail, emailAddress);
		WebUI.setText(mobileno, mobile);
		WebUI.setText(inputPassword, password);
		WebUI.clickElement(policyButton);

	}

	public void register00(String fname, String lname, String email, String password, String mobile) {

		String dateTime = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		String emailAddress = email.replace("johny", "johny" + dateTime);

		WebUI.waitForPageLoaded();
		WebUI.waitForElementClickable(By.xpath("//input[@id='first_name']"));
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].value='';", WebUI.getWebElement(firstname));

		WebUI.setText(By.xpath("//input[@id='first_name']"), fname);
		WebUI.setText(lastname, lname);
		WebUI.setText(mobileno, mobile);
		WebUI.setText(By.xpath("//input[@id='email']"), emailAddress);
		WebUI.setText(inputPassword, password);
		WebUI.clickElement(policyButton);

	}

	public void registergroup(String fname, String lname, String email, String password, String mobile,
			String invitecode) {
		String dateTime = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		String emailAddress = email.replace("johndoe", "johndoe" + dateTime);
		WebUI.setText(firstname, fname);
		WebUI.setText(lastname, lname);
		WebUI.setText(mobileno, mobile);
		WebUI.setText(By.xpath("//input[@id='email']"), emailAddress);
		WebUI.setText(mobileno, mobile);
		WebUI.setText(inputPassword, password);
		WebUI.setText(By.xpath("//input[@id='invite_code']"), invitecode);
		WebUI.clickElement(policyButton);

	}

	public void signIn() {
		WebUI.clickElement(By.xpath("//button[text()='Signup']"));

	}

	public void joinFree() throws InterruptedException {

		WebUI.clickElement(By.xpath("//button[contains(.,'Join For Free')]"));

	}

	public void dashboardassertion() {
		WebUI.waitForPageLoaded();
		Assert.assertEquals(WebUI.getPageTitle(), "Purchased courses list | Learntastic");

	}

	public void dashboardassertion01() {
		WebUI.waitForPageLoaded();
		Assert.assertEquals(WebUI.getPageTitle(), "Online Courses and Career Opportunities");

	}

	public void registerassertion() {
		WebUI.waitForPageLoaded();
		Assert.assertEquals(WebUI.getPageTitle(), "Register | learntastic | online courses");
		WebUI.waitForElementVisible(
				By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"), 10);
		WebUI.clickElement(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		if (WebUI.verifyElementExists(
				By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
			WebUI.moveToElement(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
			WebUI.clickElementWithJs(
					By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		}

	}

	public void registerassertion1() {
		WebUI.waitForPageLoaded();
		Assert.assertEquals(WebUI.getPageTitle(), "Online Courses and Career Opportunities");

	}

	public void loginassertion() {
		WebUI.waitForPageLoaded();
		Assert.assertEquals(WebUI.getPageTitle(), "Student Login | Learntastic");

	}

	public void register02() {
		WebUI.clickElement(By.xpath("//button[@class='close dis-modal-close']"));
		WebUI.clickElement(By.xpath("//span[contains(.,'Log In  with Google')]"));

	}

	public void googleassertion() {
		Assert.assertEquals(WebUI.getPageTitle(), "Sign in - Google Accounts");

	}

	public void gmailInput() {
		WebUI.setText(By.xpath("//input[@id=\"identifierId\"]"), "shankar@thinktime.in");
		WebUI.clickElement(By.xpath("//span[contains(.,'Next')]"));

	}

	public void gmailPassword() {
		WebUI.setText(By.xpath("//input[@name=\"Passwd\"]"), "123456789");
		WebUI.clickElement(By.xpath("//span[contains(.,'Next')]"));

	}

	public void popupclose() {
		WebUI.waitForElementVisible(
				By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"), 10);
		WebUI.waitForElementClickable(
				By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"), 10);
		WebUI.clickElement(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
	}

	public void joinforfree() throws InterruptedException {
		WebUI.waitForElementVisible(
				By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		WebUI.clickElement(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		WebUI.clickElementWithJs(
				By.xpath("//div[@class='home-item_desc']/descendant::button[contains(text(),'Join for free')]"));

	}

	public void popupassertion() {
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//p[contains(text(),'Sign up & start learning')]")),
				"Sign up & start learning");

	}

	public void registergroupdetail(String fname, String lname, String companyname, String mobile, String email,
			String password) {
		String dateTime = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());
		String emailid = email.replace("Orgdemo", "Orgdemo" + dateTime);

		WebUI.setText(By.xpath("//input[@id='first_name']"), fname);
		WebUI.setText(By.xpath("//input[@name='last_name']"), lname);
		WebUI.setText(By.xpath("//input[@name='company_name']"), companyname);
		WebUI.setText(By.xpath("//input[@name='mobile']"), mobile);
		WebUI.setText(By.xpath("(//input[@id='email'])[1]"), emailid);
		WebUI.setText(By.xpath("//input[@name='password']"), password);
	}

	public void registerbutton() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//button[normalize-space()='Signup']"));
	}

	public void checkbox() {
		// TODO Auto-generated method stub
		WebElement termsCheckbox = WebUI.getWebElement(By.xpath("//input[@id='term']"));

		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", termsCheckbox);
	}

	public void groupdiscount() {
		// TODO Auto-generated method stub
		WebElement discount = WebUI.getWebElement(By.xpath("//a[normalize-space()='Group Discount']"));
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", discount);
	}

	public void loginassertion01() {
		// TODO Auto-generated method stub
		Assert.assertEquals(WebUI.getPageTitle(), "Login");
	}

}
