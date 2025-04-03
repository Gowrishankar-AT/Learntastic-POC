package com.thinktimetechno.projects.website.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.thinktimetechno.driver.DriverManager;
import com.thinktimetechno.keywords.WebUI;



public class DashboardPage {

	
	public void categoryselection() {
		
		WebUI.waitForPageLoaded();
		WebUI.selectOptionByText(By.xpath("//select[@id ='modal_category_id']"), "Healthcare");
		WebUI.selectOptionByText(By.xpath("//select[@id ='modal_sub_category_id']"),"\n"
				+ "                                                Pharmacist");
		
		WebUI.clickElement(By.xpath("//button[text() ='Save']"));
	}



public void categoryassertion(String s01, String s02) throws InterruptedException {
	WebUI.reloadPage();
	
	String categoryText = WebUI.getTextElement(By.xpath("//span[@class='title-user_category']"));
	String SubcategoryText = WebUI.getTextElement(By.xpath("//span[@class='title-user_sub_category']"));
	System.out.println(categoryText+" and "+ SubcategoryText);
	Assert.assertEquals(categoryText.trim(), s01);
	Assert.assertEquals(SubcategoryText.trim(), s02);

}
public void languageselection() throws InterruptedException {
	WebUI.waitForPageLoaded();
	WebUI.selectOptionByValue(By.xpath("//ul[@class=\"topbar-list_items\"]/li/div/select[@class=\"gt_selector notranslate\"]"), "en|es");
	WebUI.clickElement(By.xpath("//ul[@class=\"topbar-list_items\"]/li/div/select[@class=\"gt_selector notranslate\"]"));
	
	
}

public void languageassertion() {
	WebUI.waitForElementPresent(By.xpath("//span[@class='hide-mobi']/font/font[contains(.,'Buscar')]"));
	

}



public void categoryselection01(String category) {
	// TODO Auto-generated method stub
	WebUI.selectOptionByText(By.id("modal_category_id"), category);
}



public void subcategoryselection01(String subcategory) {
	// TODO Auto-generated method stub
	WebUI.selectOptionByText(By.id("modal_sub_category_id"), subcategory);
}



public void savebutton() {
	// TODO Auto-generated method stub
	 WebUI.clickElement(By.xpath("(//button[contains(@class,'button-save-user')])[1]"));
}



public void search(String courseName) {
	// TODO Auto-generated method stub
	 WebElement searchbar = WebUI.getWebElement(By.xpath("//button[@class='button_search_all']"));	
	   WebUI.scrollToElementToTop(searchbar);	

	   WebUI.setText(By.xpath("//input[@id='search_all_keyword']"), courseName);
	   searchbar.click();
	   
	   WebUI.waitForPageLoaded();
	   String CourseTitile = WebUI.getTextElement(By.xpath("//a[@title='Healthcare, First Aid & Bloodborne Pathogens Combo']"));
	   Assert.assertEquals(courseName, CourseTitile);
}



public void addtocart() {
	// TODO Auto-generated method stub
	WebUI.clickElement(By.xpath("//button[@class='allcourses_button']"));
}



public void checkoutbutton() {
	// TODO Auto-generated method stub
	 WebUI.clickElement(By.xpath("//a[@class='cart-mini_checkout']"));
}



public void discount(String code) {
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



public void country() {
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
	System.out.println(WebUI.getPageTitle().trim());
}



public void cartassertion(String string) {
	// TODO Auto-generated method stub
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//a[@class='cart-mini_link_title']")), string);
}



public void itemdelete() {
	// TODO Auto-generated method stub
	WebUI.clickElement(By.xpath("//i[@class='fa-solid fa-trash-can']"));
}



public void emptycart() {
	// TODO Auto-generated method stub
	String string = "Cart is empty. Please add the courses to cart.";
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='cart-mini_empty']/p")),string);  
}



public void coursecataog() {
	// TODO Auto-generated method stub
	WebUI.clickElement(By.xpath("//div[contains(text(), 'Course Catalog')]"));
}



public void catalogassertion() {
	// TODO Auto-generated method stub
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='student-filter-title']")), "Popular Packages & Course Catalog");
}



public void bulkpurchase() {
	// TODO Auto-generated method stub
	WebUI.clickElement(By.xpath("//h3[normalize-space()='Unlimited CE Subscriptions']/ancestor::div[@class='allcourses_list-item']/div[5]/div/button"));
	WebUI.clickElement(By.xpath("//div[@id='cart_mini_close']"));
	WebUI.clickElement(By.xpath("//h3[normalize-space()='Diabetes Care Package']/ancestor::div[@class='allcourses_list-item']/div[5]/div/button"));
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//a[normalize-space()='Unlimited CE Subscriptions']")), "Unlimited CE Subscriptions");
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//a[normalize-space()='Diabetes Care Package']")), "Diabetes Care Package");
}



public void errorassertion() {
	// TODO Auto-generated method stub
	WebUI.waitForElementPresent(By.xpath("//div[@id='payment-message']"));
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@id='payment-message']")), "Your card’s expiration year is in the past.");
}



public void courseassertion() {
	// TODO Auto-generated method stub
	WebUI.clickElement(By.xpath("//a[@class='thank-you_button']"));
	WebUI.waitForPageLoaded();
	WebUI.waitForElementPresent(By.xpath("//div[@class='td-title']"), 10);
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='td-title']")),"Healthcare, First Aid & Bloodborne Pathogens Combo");
	
}



public void coursesection() {
	// TODO Auto-generated method stub
	WebUI.clickElement(By.xpath("//div[@class='td-title']"));
	
	
}



public void startcourse() {
	// TODO Auto-generated method stub
	WebUI.clickElement(By.xpath("//a[normalize-space()='Start']"));
}



public void coursepage() {
	// TODO Auto-generated method stub
	WebUI.waitForPageLoaded();
	WebUI.waitForElementPresent(By.xpath("//div[@class='learning-content']/div/div/span"), 10);
	Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='learning-content']/div/div/span")),"Course-Section");
}



public void coursematerial() {
	// TODO Auto-generated method stub
	WebUI.switchToWindowOrTabByUrl("https://staging-lms.gitview.net/courses/understanding-mental-illness-for-all-healthcare-professionals-integrating-physical-and-mental-health-care/file/191/showHtml");
	
	Assert.assertEquals(WebUI.getPageTitle(),"Course-Section | Learntastic");
}


}
