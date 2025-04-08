package com.thinktimetechno.hooks;

import com.thinktimetechno.driver.DriverManager;
import com.thinktimetechno.driver.TargetFactory;
import com.thinktimetechno.projects.website.pages.DashboardPage;
import com.thinktimetechno.projects.website.pages.LoginPage;
import com.thinktimetechno.projects.website.pages.RegistrationPage;
import com.thinktimetechno.projects.website.pages.CartPage;
import com.thinktimetechno.projects.website.pages.CoursePage;
import com.thinktimetechno.projects.website.pages.PaymentPage;
import com.thinktimetechno.projects.website.Multipages.*;
import com.thinktimetechno.utils.LogUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;

public class TestContext {

	private WebDriver driver;

	public TestContext() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = ThreadGuard.protect(new TargetFactory().createInstance());
		driver.manage().window().maximize();
		DriverManager.setDriver(driver);
		LogUtils.info("Driver in TestContext: " + getDriver());
	}


	private DashboardPage dashboardPage;
	private LoginPage loginPage;
	private RegistrationPage registrationPage;
	private CartPage cartPage;
	private CoursePage coursePage;
	private PaymentPage paymentPage;
	private CorporateLoginPage corporateloginPage;
	private CorporateDashboardPage corporatedashboardPage;
	private CorporateRegistrationPage corporateregistrationPage;
	private CorporateCartPage corporatecartPage;
	private CorporatePaymentPage corporatepaymentPage;
	private CorporateEmployeePage corporateemployeePage;

	public WebDriver getDriver() {
		return DriverManager.getDriver();
	}

	

	public DashboardPage getDashboardPage() {
		if (dashboardPage == null) {
			dashboardPage = new DashboardPage();
		}
		return dashboardPage;
	}

	public LoginPage getLoginPage() {
		if (loginPage == null) {
			loginPage = new LoginPage();
		}
		return loginPage;
	}

	public RegistrationPage getRegistrationPage() {
		if (registrationPage == null) {
			registrationPage = new RegistrationPage();
		}
		return registrationPage;
	}
	
	public CartPage getCartPage() {
		if (cartPage == null) {
			cartPage = new CartPage();
		}
		return cartPage;
	}

	public PaymentPage getPaymentPage() {
		if (paymentPage == null) {
			paymentPage = new PaymentPage();
		}
		return paymentPage;
	}

	public CoursePage getCoursePage() {
		if (coursePage == null) {
			coursePage = new CoursePage();
		}
		return coursePage;
	}
	public CorporateDashboardPage getCorporateDashboardPage() {
		if (corporatedashboardPage == null) {
			corporatedashboardPage = new CorporateDashboardPage();
		}
		return corporatedashboardPage;
	}

	public CorporateLoginPage getCorporateLoginPage() {
		if (corporateloginPage == null) {
			corporateloginPage = new CorporateLoginPage();
		}
		return corporateloginPage;
	}

	public CorporateRegistrationPage getCorporateRegistrationPage() {
		if (corporateregistrationPage == null) {
			corporateregistrationPage = new CorporateRegistrationPage();
		}
		return corporateregistrationPage;
	}

	public CorporatePaymentPage getCorporatePaymentPage() {
		if (corporatepaymentPage == null) {
			corporatepaymentPage = new CorporatePaymentPage();
		}
		return corporatepaymentPage;
	}

	public CorporateEmployeePage getCorporateEmployeePage() {
		if (corporateemployeePage == null) {
			corporateemployeePage = new CorporateEmployeePage();
		}
		return corporateemployeePage;
	}

	public CorporateCartPage getCorporateCartPage() {
		if (corporatecartPage == null) {
			corporatecartPage = new CorporateCartPage();
		}
		return corporatecartPage;
	}
}
