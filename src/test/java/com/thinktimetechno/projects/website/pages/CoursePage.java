package com.thinktimetechno.projects.website.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.thinktimetechno.keywords.WebUI;

public class CoursePage {

	public void startcourse() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//a[normalize-space()='Start']"));
	}

	public void coursepage() {
		// TODO Auto-generated method stub
		WebUI.waitForPageLoaded();
		WebUI.waitForElementPresent(By.xpath("//div[@class='learning-content']/div/div/span"), 10);
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='learning-content']/div/div/span")),
				"Course-Section");
	}

	public void coursematerial() {
		// TODO Auto-generated method stub
		WebUI.switchToWindowOrTabByUrl(
				"https://staging-lms.gitview.net/courses/understanding-mental-illness-for-all-healthcare-professionals-integrating-physical-and-mental-health-care/file/191/showHtml");

		Assert.assertEquals(WebUI.getPageTitle(), "Course-Section | Learntastic");
	}

}
