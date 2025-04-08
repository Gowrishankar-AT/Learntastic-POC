package com.thinktimetechno.projects.website.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.thinktimetechno.driver.DriverManager;
import com.thinktimetechno.keywords.WebUI;

public class PaymentPage {



	public void discount() {
		// TODO Auto-generated method stub
		By proceedToCheckoutButton = By.xpath("//button[@id='btn_submit_cart']");
		WebElement btn = WebUI.getWebElement(proceedToCheckoutButton);

		// JavaScript click if normal click fails
		((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", btn);
	}
	

	public void carddetails(String cardnumber, String expirationdate, String securitycode) {
		// TODO Auto-generated method stub
		WebUI.waitForElementPresent(By.xpath("//h2[@class='cart-title' and contains(text(),'Checkout')]"));
		Assert.assertEquals(WebUI.getPageTitle(), "Checkout | Learntastic");

		WebUI.switchToFrameByElement(By.xpath("//iframe[@title='Secure payment input frame']"));
		WebUI.waitForPageLoaded();
		WebUI.setText(By.xpath("//div[@class='p-CardNumberInput']/descendant::input[@name='number']"), cardnumber);
		WebUI.setText(By.xpath("//input[@name='expiry']"), expirationdate);
		WebUI.setText(By.xpath("//input[@id='Field-cvcInput']"), securitycode);
	}


	public void country(String string) {
		// TODO Auto-generated method stub
		WebUI.selectOptionByText(By.id("Field-countryInput"), string);
	}

	public void paynowbutton() {
		// TODO Auto-generated method stub
		WebUI.switchToDefaultContent();
		By payNow = By.xpath("//span[contains(text(),'Pay Now')]");
		WebElement button = WebUI.waitForElementClickable(payNow, 15);

		WebUI.scrollToElementToBottom(button);
		JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
		js.executeScript("arguments[0].click();", button);
		WebUI.waitForPageLoaded();
	}
	
	public void errorassertion() {
		// TODO Auto-generated method stub
		WebUI.waitForElementPresent(By.xpath("//div[@id='payment-message']"));
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@id='payment-message']")),
				"Your card’s expiration year is in the past.");
	}
}
