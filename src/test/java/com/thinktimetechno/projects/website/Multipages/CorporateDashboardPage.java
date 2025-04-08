package com.thinktimetechno.projects.website.Multipages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
		System.out.println(categoryText + " and " + SubcategoryText);
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

		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[contains(text(),'Physicians -  Packages')]")),
				"Physicians - Packages");
	}

	public void coursesearch(String courseName) {
		
		WebElement searchbar = WebUI.getWebElement(By.xpath("//span[@role='combobox']"));
		WebUI.scrollToElementToTop(searchbar);
		searchbar.click();
		WebUI.setText(By.xpath("//input[@role='searchbox']"), courseName);

		WebUI.waitForElementVisible(By
				.xpath("//ul[@class='select2-results__options']/child::li[contains(text(),'Healthcare, First Aid')]"));
		WebElement listElement = WebUI.getWebElement(By
				.xpath("//ul[@class='select2-results__options']/child::li[contains(text(),'Healthcare, First Aid')]"));

		listElement.click();
		WebUI.waitForPageLoaded();
		String CourseTitile = WebUI.getTextElement(By.xpath(
				"//div[@class='allcourses-item_title']/descendant::h3[contains(text(),'Healthcare, First Aid')]"))
				.trim();
		Assert.assertEquals(courseName, CourseTitile);
	}


	public void course() {
		
		WebUI.clickElement(By.xpath("//li/a[contains(text(), 'Course Catalog')]"));
	}

	public void catalogassertion() {
		
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class=\"common-title\"]")), "Course Catalog");
	}


	public void invitebutton() {
		
		WebUI.waitForElementPresent(By.xpath("//a[@class='employees-invite_student']"));
		WebUI.clickElement(By.xpath("//a[@class='employees-invite_student']"));
	}

	public void invitepopupassertion() {
		
		WebUI.waitForElementPresent(By.xpath("//h4[@id='exampleModalLabel']"));
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//h4[@id='exampleModalLabel']")), "Invite New Employee");

	}

	public void InviteEmaiInput() {
		
		WebUI.setText(By.xpath("//input[@name='email']"), "Shankar@thinktime.in");
	}

	public void sendInvitebutton() {
		
		WebUI.clickElement(By.xpath("//button[@id='invite_employee_submit']"));
	}

	public void InviteSentassertion() {
		
		WebUI.waitForElementPresent(By.xpath("//h2[@class='jq-toast-heading']"));
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//h2[@class='jq-toast-heading']")), "Success");
	}

	public void PendingInvite(String string) {
		
		WebUI.clickElement(By.xpath("//p[normalize-space()='Pending Invite']"));
	}


}
