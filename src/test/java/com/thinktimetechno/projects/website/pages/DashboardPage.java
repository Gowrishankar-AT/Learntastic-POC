package com.thinktimetechno.projects.website.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

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
	WebUI.waitForElementPresent(By.xpath("//span[@class=\"hide-mobi\"]/font/font[contains(.,'Buscar')]"));
	

}
}
