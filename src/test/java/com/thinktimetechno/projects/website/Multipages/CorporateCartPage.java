package com.thinktimetechno.projects.website.Multipages;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.thinktimetechno.keywords.WebUI;

public class CorporateCartPage {

public void addtocart() {
		
		WebUI.clickElement(By.xpath(
				"//div[@class='allcourses_list-item']/child::div/descendant::h3[contains(text(),'Healthcare, First Aid')]/ancestor::div[@class='allcourses_list-item']/descendant::div[@class='allcourses-item_bottom']/descendant::button[@class='allcourses_button']"));
	}

public void proceedtocheckout() {
	
	WebUI.clickElement(By.xpath("//a[@class='cart-mini_checkout']"));
}

public void bulkcourse() {
	
	WebUI.clickElement(By.xpath(
			"//h3[normalize-space()='CPR/AED Course']/ancestor::div[@class='allcourses_list-item']/div[6]/div/div/button"));
	WebUI.clickElement(By.xpath("//div[@id=\"cart_mini_close\"]"));
	WebUI.clickElement(By.xpath(
			"//h3[normalize-space()='Chronic Obstructive Pulmonary Disease (COPD): Patient Management']/ancestor::div[@class='allcourses_list-item']/div[5]/div/div/button"));
}

public void courseassertion() {
	
	Assert.assertEquals(
			WebUI.getTextElement(By.xpath("//div[@class='cart-mini_info']/a[normalize-space()='CPR/AED Course']")),
			"CPR/AED Course");
	Assert.assertEquals(WebUI.getTextElement(By.xpath(
			"//div[@class='cart-mini_info']/a[normalize-space()='Chronic Obstructive Pulmonary Disease (COPD): Patient Management']")),
			"Chronic Obstructive Pulmonary Disease (COPD): Patient Management");
}

public void cartassertion(String courseName) {
	
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='cart-mini_item']/descendant::a")).trim(),
			courseName);
}

public void removeitem() {
	
	WebUI.clickElement(By.xpath("//button[@class='remove-cart-mini']"));
}

public void emptycartassertion() {
	
	WebUI.waitForPageLoaded();
	// Verify the cart is empty or the specific course is no longer visible
	boolean isCartEmpty = WebUI.verifyElementPresent(By.xpath("//p[contains(.,'Cart is empty.')]"));
	Assert.assertTrue(isCartEmpty, "The cart is not empty, course not deleted!");
}

public void paylater() {
	// TODO Auto-generated method stub
	WebUI.clickElement(By.xpath("//a[@id='payLaterLink']"));
}

public void discountcode(String string) {
	// TODO Auto-generated method stub
	WebUI.setText(By.xpath("//input[@id='coupon_input']"), string);
	WebUI.clickElementWithJs(By.xpath("//button[@id='btn_submit_cart']"));
}

}
