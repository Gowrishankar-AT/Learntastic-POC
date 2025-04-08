package com.thinktimetechno.projects.website.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.thinktimetechno.keywords.WebUI;

public class CartPage {

	public void addtocart() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//button[@class='allcourses_button']"));
	}

	public void checkoutbutton() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath("//a[@class='cart-mini_checkout']"));
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
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//div[@class='cart-mini_empty']/p")), string);
	}

	public void bulkpurchase() {
		// TODO Auto-generated method stub
		WebUI.clickElement(By.xpath(
				"//h3[normalize-space()='Unlimited CE Subscriptions']/ancestor::div[@class='allcourses_list-item']/div[5]/div/button"));
		WebUI.clickElement(By.xpath("//div[@id='cart_mini_close']"));
		WebUI.clickElement(By.xpath(
				"//h3[normalize-space()='Diabetes Care Package']/ancestor::div[@class='allcourses_list-item']/div[5]/div/button"));
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//a[normalize-space()='Unlimited CE Subscriptions']")),
				"Unlimited CE Subscriptions");
		Assert.assertEquals(WebUI.getTextElement(By.xpath("//a[normalize-space()='Diabetes Care Package']")),
				"Diabetes Care Package");
	}
}
