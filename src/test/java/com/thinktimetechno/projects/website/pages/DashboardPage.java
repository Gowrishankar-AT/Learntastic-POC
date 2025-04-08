package com.thinktimetechno.projects.website.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.thinktimetechno.keywords.WebUI;

public class DashboardPage {

	public void categoryselection() {

		WebUI.waitForPageLoaded();
		WebUI.selectOptionByText(By.xpath("//select[@id ='modal_category_id']"), "Healthcare");
		WebUI.selectOptionByText(By.xpath("//select[@id ='modal_sub_category_id']"),
				"\n" + "                                                Pharmacist");

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
				.getTextElement(By.xpath("//a[@title='Healthcare, First Aid & Bloodborne Pathogens Combo']"));
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
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='td-title']")),
				"Healthcare, First Aid & Bloodborne Pathogens Combo");

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

}
