package com.thinktimetechno.projects.website.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.thinktimetechno.keywords.WebUI;


public class LoginPage {

public  void hiturl(String url) {
WebUI.getURL(url);
WebUI.clickElementWithJs(By.xpath("//div[@class='modal-content']/div/button[@class='close']"));

}

public void password(String password) {
	WebUI.setText(By.xpath("//input[@name=\"password\"]"), password);
	WebUI.clickElement(By.xpath("//button[contains(.,'Login')]"));
}

public void username(String username) {
	WebUI.setText(By.xpath("//input[@id=\"email\"]"), username);
	WebUI.clickElement(By.xpath("//button[@id=\"btn-continue\"]"));
	
}


public void assertion() throws InterruptedException {
	WebUI.waitForPageLoaded();
	WebUI.waitForElementVisible(By.xpath("//div[@class=\"student_title\"]"));
	Assert.assertEquals(WebUI.getPageTitle(),"Purchased courses list | Learntastic");
}

public void forgotpassword() throws InterruptedException {
	WebUI.clickElement(By.xpath("//div[@class=\"login-forgot-pass\"]/a"));
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//h3[@class=\"login-form_title\"]")),"Password Recovery");
}

public void recoverymail() {
	WebUI.waitForPageLoaded();
	WebUI.setText(By.xpath("//div[@class=\"input_email_login\"]//input"),"shankar@thinktime.in");
	WebUI.clickElement(By.xpath("//button[contains(.,'Continue')]"));
	
}

public void successmessage() {
Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class=\"forget-password-success\"]/p[1]")),"To reset your password, please check your email");	
	
}

public void assertion01() throws InterruptedException {
	
	WebUI.waitForPageLoaded();
	Assert.assertEquals(WebUI.getPageTitle(),"Dashboard | Learntastic");
}





}
