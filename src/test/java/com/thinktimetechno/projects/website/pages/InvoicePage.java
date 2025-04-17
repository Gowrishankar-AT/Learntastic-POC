package com.thinktimetechno.projects.website.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.thinktimetechno.keywords.WebUI;

public class InvoicePage {

	public void invoiceassertion() {
		// TODO Auto-generated method stub
		 Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='common-title']")),"My Invoices");
	}

	public void search(String string) {
		// TODO Auto-generated method stub
		WebUI.setText(By.xpath("//input[@id='search_name']"), string);
	}

	public void searchbutton() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//button[@class='button_search']"));
	}

	public void invoiceassertion1() {
		// TODO Auto-generated method stub
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//td[normalize-space()='Healthcare, First Aid & Bloodborne Pathogens Combo']")), "Healthcare, First Aid & Bloodborne Pathogens Combo");
	}

	public void details() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//td[normalize-space()='Healthcare, First Aid & Bloodborne Pathogens Combo']/following-sibling::td[5]"));
	}

	public void popupassertion() {
		// TODO Auto-generated method stub
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='m-invoice-title']")), "Invoice To");
	}

	public void downloadbutton() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//a[@class='employees-invite_student']"));
	}

	public void close() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//button[@class='employees-purchase_code']"));
	}

	
}
