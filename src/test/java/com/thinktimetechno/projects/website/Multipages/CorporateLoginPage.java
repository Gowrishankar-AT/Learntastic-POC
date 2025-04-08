package com.thinktimetechno.projects.website.Multipages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.thinktimetechno.keywords.WebUI;

public class CorporateLoginPage {

	public void hiturl(String url) {
		WebUI.getURL(url);
		WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		if (WebUI.verifyElementExists(
				By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"))) {
			WebUI.moveToElement(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
			WebUI.clickElementWithJs(
					By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		}

	}

	public void password(String password) {
		WebUI.setText(By.xpath("//input[@name='password']"), password);
		WebUI.clickElement(By.xpath("//button[contains(.,'Login')]"));
	}

	public void username(String username) {

		WebUI.setText(By.xpath("//input[@id='email']"), username);
		WebUI.clickElementWithJs(By.xpath("//button[contains(text(),'Continue')]"));

	}

	public void assertion() throws InterruptedException {
		WebUI.waitForPageLoaded();
		WebUI.waitForElementVisible(By.xpath("//div[@class='student_title']"));
		Assert.assertEquals(WebUI.getPageTitle(), "Purchased courses list | Learntastic");
	}

	public void forgotpassword() throws InterruptedException {
		WebUI.clickElement(By.xpath("//div[@class='login-forgot-pass']/a[text()='Forgot your password?']"));
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//h3[@class='login-form_title']")), "Password Recovery");
	}

	public void recoverymail() {

//	WebUI.waitForElementVisible(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
//	WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close dis-modal-close']"));
		WebUI.setText(By.xpath("//input[@id='email']"), "shankar@thinktime.in");
		WebUI.waitForElementClickable(By.xpath("//button[contains(.,'Continue')]"));
		WebUI.clickElementWithJs(By.xpath("//button[contains(.,'Continue')]"));

	}

	public void successmessage() {
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='forget-password-success']/p[1]")),
				"To reset your password, please check your email");

	}

	public void assertion01() throws InterruptedException {

		WebUI.waitForPageLoaded();
		Assert.assertEquals(WebUI.getPageTitle(), "Dashboard | Learntastic");
	}

}
