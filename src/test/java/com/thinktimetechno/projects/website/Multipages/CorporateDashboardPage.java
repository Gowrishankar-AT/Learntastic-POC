package com.thinktimetechno.projects.website.Multipages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.thinktimetechno.driver.DriverManager;
import com.thinktimetechno.keywords.WebUI;



public class CorporateDashboardPage {

	
	public void categoryselection(String category) {
		
		WebUI.waitForPageLoaded();
		WebUI.selectOptionByText(By.id("modal_category_id"), category);
		
	}


public void categoryassertion(String s01, String s02) throws InterruptedException {
	WebUI.reloadPage();
	
	String categoryText = WebUI.getTextElement(By.xpath("//span[@class='title-user_category']"));
	String SubcategoryText = WebUI.getTextElement(By.xpath("//span[@class='title-user_sub_category']"));
	System.out.println(categoryText+" and "+ SubcategoryText);
	Assert.assertEquals(categoryText.trim(), s01);
	Assert.assertEquals(SubcategoryText.trim(), s02);

}
public void languageselection(String language) throws InterruptedException {
	WebUI.waitForPageLoaded();
	WebUI.selectOptionByText(By.xpath("//select[@class='gt_selector notranslate']"), language);
	WebUI.clickElement(By.xpath("//select[@class='gt_selector notranslate']"));
	
	
	
}

public void languageassertion() {
	 WebUI.waitForPageLoaded();
	    WebElement panelElement = WebUI.waitForElementVisible(By.xpath("//font[contains(text(),'Panel')]"));
	    String panelText = panelElement.getText();
	    Assert.assertEquals(panelText, "Panel", "The content did not change to Spanish.");
	

}

public void subcategoryselection(String subcategory) {
	
	WebUI.selectOptionByText(By.id("modal_sub_category_id"), subcategory);
}


public void savebutton() {
	 WebUI.clickElement(By.xpath("(//button[contains(@class,'button-save-user')])[1]"));
}


public void categoryassertion01() {
	
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[contains(text(),'Physicians -  Packages')]")),"Physicians - Packages");
}


public void coursesearch(String courseName) {
	// TODO Auto-generated method stub
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


public void addtocart() {
	// TODO Auto-generated method stub
	 WebUI.clickElement(By.xpath("//div[@class='allcourses_list-item']/child::div/descendant::h3[contains(text(),'Healthcare, First Aid')]/ancestor::div[@class='allcourses_list-item']/descendant::div[@class='allcourses-item_bottom']/descendant::button[@class='allcourses_button']"));
}


public void proceedtocheckout() {
	// TODO Auto-generated method stub
	 WebUI.clickElement(By.xpath("//a[@class='cart-mini_checkout']"));
}


public void discountcode(String code) {
	// TODO Auto-generated method stub
	 By proceedToCheckoutButton = By.xpath("//button[@id='btn_submit_cart']");
	    WebElement btn = WebUI.getWebElement(proceedToCheckoutButton);

	    // JavaScript click if normal click fails
	    ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].click();", btn);
}


public void checkoutdetails(String cardnumber, String expirationdate, String securitycode) {
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
	WebUI.selectOptionByText(By.id("Field-countryInput"), "India");
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


public void successmessage() {
	// TODO Auto-generated method stub
	WebUI.waitForPageLoaded();
	WebUI.waitForElementPresent(By.xpath("//div[@class='thank-you_title']"));
	Assert.assertEquals(WebUI.getPageTitle().trim(), "Thank You");
	
}


public void cartassertion(String courseName) {
	// TODO Auto-generated method stub
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='cart-mini_item']/descendant::a")).trim(), courseName);
}


public void removeitem() {
	// TODO Auto-generated method stub
	WebUI.clickElement(By.xpath("//button[@class='remove-cart-mini']"));
}


public void emptycartassertion() {
	// TODO Auto-generated method stub
	 WebUI.waitForPageLoaded();	    
	    // Verify the cart is empty or the specific course is no longer visible
	    boolean isCartEmpty = WebUI.verifyElementPresent(By.xpath("//p[contains(.,'Cart is empty.')]"));
	    Assert.assertTrue(isCartEmpty, "The cart is not empty, course not deleted!");
}


public void course() {
	// TODO Auto-generated method stub
	WebUI.clickElement(By.xpath("//li/a[contains(text(), 'Course Catalog')]"));
}


public void catalogassertion() {
	// TODO Auto-generated method stub
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class=\"common-title\"]")),"Course Catalog");
}


public void bulkcourse() {
	// TODO Auto-generated method stub
	
	WebUI.clickElement(By.xpath("//h3[normalize-space()='CPR/AED Course']/ancestor::div[@class='allcourses_list-item']/div[6]/div/div/button"));
	WebUI.clickElement(By.xpath("//div[@id=\"cart_mini_close\"]"));
	WebUI.clickElement(By.xpath("//h3[normalize-space()='Chronic Obstructive Pulmonary Disease (COPD): Patient Management']/ancestor::div[@class='allcourses_list-item']/div[5]/div/div/button"));
}


public void courseassertion() {
	// TODO Auto-generated method stub
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='cart-mini_info']/a[normalize-space()='CPR/AED Course']")), "CPR/AED Course");
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='cart-mini_info']/a[normalize-space()='Chronic Obstructive Pulmonary Disease (COPD): Patient Management']")), "Chronic Obstructive Pulmonary Disease (COPD): Patient Management");
}


}
