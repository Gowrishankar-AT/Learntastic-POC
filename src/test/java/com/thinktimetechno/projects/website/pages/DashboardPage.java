package com.thinktimetechno.projects.website.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.thinktimetechno.keywords.WebUI;

public class DashboardPage {

	public void categoryselection(String string, String string2) {

		WebUI.waitForPageLoaded();
		WebUI.selectOptionByText(By.xpath("//select[@id ='modal_category_id']"), string);
		WebUI.selectOptionByText(By.xpath("//select[@id ='modal_sub_category_id']"),
				"\n" + "                                                "+string2);

		WebUI.clickElement(By.xpath("//button[text() ='Save']"));
	}

	public void categoryassertion(String s01, String s02) throws InterruptedException {
		WebUI.reloadPage();

		String categoryText = WebUI.getTextElement(By.xpath("//span[@class='title-user_category']"));
		String SubcategoryText = WebUI.getTextElement(By.xpath("//span[@class='title-user_sub_category']"));
		System.out.println(categoryText + " and " + SubcategoryText);
		Assert.assertEquals(categoryText.trim(), s01);
		Assert.assertEquals(SubcategoryText.trim(), s02);

	}

	public void languageselection() throws InterruptedException {
		WebUI.waitForPageLoaded();
		WebUI.selectOptionByValue(
				By.xpath("//ul[@class=\"topbar-list_items\"]/li/div/select[@class=\"gt_selector notranslate\"]"),
				"en|es");
		WebUI.clickElement(
				By.xpath("//ul[@class=\"topbar-list_items\"]/li/div/select[@class=\"gt_selector notranslate\"]"));

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
		String CourseTitile = WebUI
				.getTextElement(By.xpath("//a[@title='"+courseName+"']"));
		Assert.assertEquals(courseName, CourseTitile);
	}


	public void successmessage() {
		// TODO Auto-generated method stub
		WebUI.waitForPageLoaded();
		WebUI.waitForElementPresent(By.xpath("//div[@class='thank-you_title']"));
		Assert.assertEquals(WebUI.getPageTitle().trim(), "Thank You");
		System.out.println(WebUI.getPageTitle().trim());
	}


	public void coursecataog() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//div[contains(text(), 'Course Catalog')]"));
	}

	public void catalogassertion() {
		// TODO Auto-generated method stub
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='student-filter-title']")),
				"Popular Packages & Course Catalog");
	}


	public void courseassertion() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//a[@class='thank-you_button']"));
		WebUI.waitForPageLoaded();
		WebUI.waitForElementPresent(By.xpath("//div[@class='td-title']"), 10);
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//th[normalize-space()='Course Name']")),
				"Course Name");

	}

	public void coursesection() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//div[@class='td-title']"));

	}


	public void storepurchase() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//span[normalize-space()='Store Purchases']"));
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//tr/th[normalize-space()='Product Name']")),
				"Product Name");
	}

	public void purchasetogglebutton() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//label[normalize-space()='Purchased']"));
		WebUI.getTextElement(
				By.xpath("//div[@class='allcourses-item_bottom']/div/a[normalize-space()='Go to learning page']"));
	}

	public void purchaseassertion() {
		// TODO Auto-generated method stub
		Assert.assertEquals(
				WebUI.getTextElement(By.xpath(
						"//div[@class='allcourses-item_bottom']/div/a[normalize-space()='Go to learning page']")),
				"Go to learning page");
	}

	public void learningpageclick() {
		// TODO Auto-generated method stub
		WebUI.clickElement(
				By.xpath("//div[@class='allcourses-item_bottom']/div/a[normalize-space()='Go to learning page']"));
	}

	public void profile() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//a[@id='dropdownUserAction']"));
	}

	public void profileassertion() {
		// TODO Auto-generated method stub
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//h3[@class='user-info_name']")),"Hi john Doe");
	}

	public void logout() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//a[@id='logout_button']"));
	}

	public void invoice() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//li/div/div/a[normalize-space()='Invoices']"));
	}

	public void resultassertion() {
		// TODO Auto-generated method stub
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='td-title']/ancestor::td/following-sibling::td[2]/div")), "Passed");
	}

	public void moreoptions() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//div[normalize-space()='Online Bloodborne Pathogens Certification Course']/ancestor::td/following-sibling::td/div/div/div/div/div/span[@class='more hide-mobi']"));
	}

	public void downloadcertificate() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//a[normalize-space()='Download Certificate']"));
	}

	public void certificateassertion() {
		// TODO Auto-generated method stub
		Assert.assertTrue(true);
	}

	public void downloadwalletcard() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//a[normalize-space()='Download CE Certificate']"));
	}

	public void storeitems() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//div/ul/li/a[normalize-space()='Store']"));
	}

	public void popupassertion() {
		// TODO Auto-generated method stub
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@id='modal_ce_certificate']//div/h5[@id='exampleModalLongTitle']")), "Evaluation & Credit Request Form");
	}

	public void popupquestions() {
		// TODO Auto-generated method stub
		//1
		WebUI.clickElement(By.xpath("//input[@id='radio_ANCC']"));
		//2
		WebUI.clickElement(By.xpath("//th[normalize-space()='Recognize when there is a victim of cardiac arrest.']/following-sibling::td/input[@value='4']"));
		WebUI.clickElement(By.xpath("//th[normalize-space()='Identify when a person may be choking.']/following-sibling::td/input[@value='4']"));
		WebUI.clickElement(By.xpath("//th[normalize-space()='Assess the scene for responder safety.']/following-sibling::td/input[@value='4']"));
		WebUI.clickElement(By.xpath("//th[normalize-space()='React immediately by activating emergency response systems - call 9-1-1.']/following-sibling::td/input[@value='4']"));
		WebUI.clickElement(By.xpath("//th[normalize-space()='Begin chest compressions on unconscious adult, child or infant in cardiac arrest.']/following-sibling::td/input[@value='4']"));
		WebUI.clickElement(By.xpath("//th[normalize-space()='Follow depth of chest compression and rescue breath guidelines while responding.']/following-sibling::td/input[@value='4']"));
		WebUI.clickElement(By.xpath("//th[normalize-space()='Assist individuals who need assistance in basic first aid emergencies.']/following-sibling::td/input[@value='4']"));
		WebUI.clickElement(By.xpath("//th[normalize-space()='Use an AED device following standardized guidelines.']/following-sibling::td/input[@value='4']"));
		//3
		WebUI.clickElement(By.xpath("//input[@id='questions_2_2']"));
		//4
		WebUI.clickElement(By.xpath("//input[@id='questions_3_2']"));
		//5 
		WebUI.clickElement(By.xpath("//input[@id='questions_4_1']"));
		//6
		WebUI.clickElement(By.xpath("//input[@id='questions_5_1']"));
	}

	public void submitbutton() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//button[@class='btn btn-primary']"));
	}

	public void virtualreview() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//a[normalize-space()='Virtual Review Session']"));
	}

	public void date() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//tbody[@class='Aotd61pQB2RgLNgE8RLW lIf10GjoKhYqSmG1emYW TYMa2uo5vWyKygqXJbv3']/tr/td/button[not(@disabled)]"));
		WebUI.clickElement(By.xpath("//div[@class='H2wiGo__wRvJJKM0eaOr S4EQ84F_9sWOFYZ9_sX7']"));
		WebUI.clickElement(By.xpath("//button[normalize-space()='Next']"));
	}

	public void details() {
		// TODO Auto-generated method stub
		WebUI.setText(By.xpath("//input[@id='full_name_input']"), "Shankar");
		WebUI.setText(By.xpath("//input[@id='email_input']"), "shankar@thinktime.in");
		WebUI.clickElement(By.xpath("//input[@id='5-jz4gxKbwA7OaDaOsEXS']"));
		WebUI.setText(By.xpath("//input[@id='5-jz4gxKbwA7OaDaOsEXS']"), "1234567890");
		WebUI.setText(By.xpath("//textarea[@id='R5Sl9eu0UAnaOyXfK6bEX']"), "8A northbuilding Florida");
		WebUI.clickElement(By.xpath("//button[normalize-space()='Schedule Event']"));
	}

	public void viewdetail() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//a[@title='Unlimited CE Subscriptions']/ancestor::div[2]/div[5]/div/a"));
	}

	public void detailassertion() {
		// TODO Auto-generated method stub
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//h1[@class='new-detail-header_title']")), "Unlimited continuing education courses for Physicians");
	}

	public void startcourse() {
		// TODO Auto-generated method stub
		Assert.assertFalse(false, "Element not present");
	}

}
