package com.thinktimetechno.projects.website.Multipages;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.thinktimetechno.keywords.WebUI;

public class CorporateEmployeePage {

public void PendingInviteassertion() {
		
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='common-title']")), "All Employee");
	}

	public void selectstatus() {
		
		WebUI.clickElement(By.xpath("//span[normalize-space()='Status']"));
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//label[normalize-space()='Waiting']")),"Waiting");
	}

	public void selectdesiredstatus(String string) {
		
		WebUI.clickElement(By.xpath("//label[normalize-space()='Waiting']"));
		WebUI.waitForPageLoaded();
	}

	public void waitingassertion() {
		
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//span[@class='font-o']")), "Invited");
	}

	public void employees() {
		
		WebUI.clickElement(By.xpath("//div[@class='topbar-menu']/ul/li/a[normalize-space()='Employees']"));
	}

	public void employeelist() {
		
		Assert.assertEquals("# of records: "+WebUI.getTextElement(By.xpath("//p[normalize-space()='Total Student']/ancestor::div[@class='parameter_items_info']/p[@class='parameter-items_number']")), WebUI.getTextElement(By.xpath("//div[@class='wrap-paginate-custom']/div")));
	}

	public void emailsearch(String string) {
		
		WebUI.clickElement(By.xpath("//input[@id='keyword']"));
		WebUI.setText(By.xpath("//input[@id='keyword']"), string);
	}

	public void search() {
		
		WebUI.clickElement(By.xpath("//button[@class='button_search']"));
	}

	public void searchassertion() {
		
		String textValue = WebUI.getTextElement(By.xpath("//td[normalize-space()='1']/following-sibling::td[2]"));
		String inputValue = WebUI.getAttributeElement(By.xpath("//input[@id='keyword']"), "value");
		Assert.assertTrue(textValue.equalsIgnoreCase(inputValue));
	}

	public void namesearch(String string) {
		
		WebUI.clickElement(By.xpath("//input[@id='keyword']"));
		WebUI.setText(By.xpath("//input[@id='keyword']"), string);
	}
	public void searchassertionname() {
		
		String textValue1 = WebUI.getTextElement(By.xpath("//td[normalize-space()='1']/following-sibling::td[1]"));
		String inputValue = WebUI.getAttributeElement(By.xpath("//input[@id='keyword']"), "value");
		String textValue = textValue1.split("id:")[0].trim();
		Assert.assertEquals(inputValue, textValue);
	}


}
