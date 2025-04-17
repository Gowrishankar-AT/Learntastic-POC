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

	public void quizbutton() throws InterruptedException {
		
		WebUI.switchToFrameByElement(By.xpath("//iframe[@class='interactive-file-iframe']"));
        WebUI.switchToFrameByIdOrName("content-frame");
		
		WebUI.clickElementWithJs(By.xpath("//a[normalize-space()='START COURSE']"));
	
		WebUI.clickElementWithJs(By.xpath("//a[normalize-space()='Quiz']"));
	}

	public void startquizbutton() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//button[@class='quiz-header__start-quiz brand--color']"));	}

	public void questions() {
		// TODO Auto-generated method stub
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//h1[@class='visually-hidden-always']/following-sibling::div[2]")), "01/13");
	}

	public void quizattend() throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=0 ; i<13 ; i++) {
			if(i == 0) {
				
				WebUI.waitForElementVisible(By.xpath("//h1[@class='visually-hidden-always']/following-sibling::div[normalize-space()='01/13']"), 10);
				WebUI.clickElementWithJs(By.xpath("//p[contains(text(), 'How to protect yourself and others should you be exposed to blood or blood-containing materials')]"));
				WebUI.clickElementWithJs(By.xpath("//button[contains(text(), 'Continue')]"));
				WebUI.clickElementWithJs(By.xpath("//button[@class='quiz-card__button quiz-card__button--next brand_ui visually-hidden-always']"));
				Thread.sleep(5000);
				
			}else if(i==1) {
				WebUI.waitForElementVisible(By.xpath("//h1[@class='visually-hidden-always']/following-sibling::div[normalize-space()='02/13']"), 10);
				WebUI.clickElementWithJs(By.xpath("//p[contains(text(), 'All of the above')]"));
				WebUI.clickElementWithJs(By.xpath("//button[contains(text(), 'Continue')]"));
				WebUI.clickElementWithJs(By.xpath("//button[@class='quiz-card__button quiz-card__button--next brand_ui visually-hidden-always']"));
				Thread.sleep(5000);
			}else if(i==2) {
				WebUI.waitForElementVisible(By.xpath("//h1[@class='visually-hidden-always']/following-sibling::div[normalize-space()='03/13']"), 10);
				WebUI.clickElementWithJs(By.xpath("//p[contains(text(), 'It weakens your immune system by attacking infection-fighting cells')]"));
				WebUI.clickElementWithJs(By.xpath("//button[contains(text(), 'Continue')]"));
				WebUI.clickElementWithJs(By.xpath("//button[@class='quiz-card__button quiz-card__button--next brand_ui visually-hidden-always']"));
				Thread.sleep(5000);
			}else if(i==3) {
				WebUI.waitForElementVisible(By.xpath("//h1[@class='visually-hidden-always']/following-sibling::div[normalize-space()='04/13']"), 10);
				WebUI.clickElementWithJs(By.xpath("//p[contains(text(), 'TRUE')]"));
				WebUI.clickElementWithJs(By.xpath("//button[contains(text(), 'Continue')]"));
				WebUI.clickElementWithJs(By.xpath("//button[@class='quiz-card__button quiz-card__button--next brand_ui visually-hidden-always']"));
				Thread.sleep(5000);
			}else if(i==4) {
				WebUI.waitForElementVisible(By.xpath("//h1[@class='visually-hidden-always']/following-sibling::div[normalize-space()='05/13']"), 10);
				WebUI.clickElementWithJs(By.xpath("//p[contains(text(), 'Liver')]"));
				WebUI.clickElementWithJs(By.xpath("//button[contains(text(), 'Continue')]"));
				WebUI.clickElementWithJs(By.xpath("//button[@class='quiz-card__button quiz-card__button--next brand_ui visually-hidden-always']"));
				Thread.sleep(5000);
			}else if(i==5) {
				WebUI.waitForElementVisible(By.xpath("//h1[@class='visually-hidden-always']/following-sibling::div[normalize-space()='06/13']"), 10);
				WebUI.clickElementWithJs(By.xpath("//p[contains(text(), 'Goggles (eye protection)')]"));
				WebUI.clickElementWithJs(By.xpath("//button[contains(text(), 'Continue')]"));
				WebUI.clickElementWithJs(By.xpath("//button[@class='quiz-card__button quiz-card__button--next brand_ui visually-hidden-always']"));
				Thread.sleep(5000);
			}else if(i==6) {
				WebUI.waitForElementVisible(By.xpath("//h1[@class='visually-hidden-always']/following-sibling::div[normalize-space()='07/13']"), 10);
				WebUI.clickElementWithJs(By.xpath("//p[contains(text(), 'Check if the scene is safe for you')]"));
				WebUI.clickElementWithJs(By.xpath("//button[contains(text(), 'Continue')]"));
				WebUI.clickElementWithJs(By.xpath("//button[@class='quiz-card__button quiz-card__button--next brand_ui visually-hidden-always']"));
				Thread.sleep(5000);
			}else if(i==7) {
				WebUI.waitForElementVisible(By.xpath("//h1[@class='visually-hidden-always']/following-sibling::div[normalize-space()='08/13']"), 10);
				WebUI.clickElementWithJs(By.xpath("//p[contains(text(), 'Wash your hands with soap and large amounts of water')]"));
				WebUI.clickElementWithJs(By.xpath("//button[contains(text(), 'Continue')]"));
				WebUI.clickElementWithJs(By.xpath("//button[@class='quiz-card__button quiz-card__button--next brand_ui visually-hidden-always']"));
				Thread.sleep(5000);
			}else if(i==8) {
				WebUI.waitForElementVisible(By.xpath("//h1[@class='visually-hidden-always']/following-sibling::div[normalize-space()='09/13']"), 10);
				WebUI.clickElementWithJs(By.xpath("//p[contains(text(), 'All of the above')]"));
				WebUI.clickElementWithJs(By.xpath("//button[contains(text(), 'Continue')]"));
				WebUI.clickElementWithJs(By.xpath("//button[@class='quiz-card__button quiz-card__button--next brand_ui visually-hidden-always']"));
				Thread.sleep(5000);
			}else if(i==9) {
				WebUI.waitForElementVisible(By.xpath("//h1[@class='visually-hidden-always']/following-sibling::div[normalize-space()='10/13']"), 10);
				WebUI.clickElementWithJs(By.xpath("//p[contains(text(), 'Puncture-resistant, sharps disposal container')]"));
				WebUI.clickElementWithJs(By.xpath("//button[contains(text(), 'Continue')]"));
				WebUI.clickElementWithJs(By.xpath("//button[@class='quiz-card__button quiz-card__button--next brand_ui visually-hidden-always']"));
				Thread.sleep(5000);
			}else if(i==10) {
				WebUI.waitForElementVisible(By.xpath("//h1[@class='visually-hidden-always']/following-sibling::div[normalize-space()='11/13']"), 10);
				WebUI.clickElementWithJs(By.xpath("//p[contains(text(), 'Must have a fluorescent orange background with the international biohazard symbol')]"));
				WebUI.clickElementWithJs(By.xpath("//button[contains(text(), 'Continue')]"));
				WebUI.clickElementWithJs(By.xpath("//button[@class='quiz-card__button quiz-card__button--next brand_ui visually-hidden-always']"));
				Thread.sleep(5000);
			}else if(i==11) {
				WebUI.waitForElementVisible(By.xpath("//h1[@class='visually-hidden-always']/following-sibling::div[normalize-space()='12/13']"), 10);
				WebUI.clickElementWithJs(By.xpath("//p[contains(text(), 'Engineering and work practice controls')]"));
				WebUI.clickElementWithJs(By.xpath("//button[contains(text(), 'Continue')]"));
				WebUI.clickElementWithJs(By.xpath("//button[@class='quiz-card__button quiz-card__button--next brand_ui visually-hidden-always']"));
				Thread.sleep(5000);
			}else if(i==12) {
				WebUI.waitForElementVisible(By.xpath("//h1[@class='visually-hidden-always']/following-sibling::div[normalize-space()='13/13']"), 10);
				WebUI.clickElementWithJs(By.xpath("//p[contains(text(), 'Immediately report the incident to your employer and follow the company's exposure control plan')]"));
				WebUI.clickElementWithJs(By.xpath("//button[contains(text(), 'Continue')]"));
				WebUI.clickElementWithJs(By.xpath("//button[@class='quiz-card__button quiz-card__button--next brand_ui visually-hidden-always']"));
				Thread.sleep(5000);
			}
		}
	}

	public void scoreassertion() {
		// TODO Auto-generated method stub
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//h1[normalize-space()='Quiz Results']")), "Quiz Results");
	}

	public void exitcoursebutton() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//button[@class='courseExit__button']"));
	}

	public void coursepage1() {
		// TODO Auto-generated method stub
		WebUI.waitForPageLoaded();
		WebUI.waitForElementPresent(By.xpath("//div[@class='learning-content']/div/div/span"), 10);
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='learning-content']/div/div/span")),
				"Course Section");
	}
	
	public void coursematerial1() {
		// TODO Auto-generated method stub
		WebUI.switchToWindowOrTabByUrl(
				"https://staging-lms.gitview.net/courses/bloodborne-pathogens/file/657/showHtml");

		Assert.assertEquals(WebUI.getPageTitle(), "Course Section | Learntastic");
	}

}
