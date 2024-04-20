package com.SkillgunTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.CommonDrivers.BasePage;
import com.SkillgunPages.StudentLoginPage;

public class StudentLoginTest extends BasePage {

	StudentLoginPage std_login = new StudentLoginPage(driver);

	@FindBy(id = "ckbkPolicyAgreement")
	private WebElement elem_placement_policy_chkBox;

	@BeforeClass
	public void run_FindBy_Elements() {
		PageFactory.initElements(driver, this);
	}

	@DataProvider(name = "mobileNumberList")
	public Object[][] mobileNumberProvider() {
		return new Object[][] { { "7681095919" }, { "7681095918" } };
	}

	@Test(priority = 1)
	public void testCurrentPageUrl() {
		std_login.openPage();
		String exp_url = "https://skillgun.com/";
		String cur_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, cur_url);
	}

	@Test(dataProvider = "mobileNumberList", priority = 2)
	public void testLoginControlsDisplayedWithValidStudentMobileAndUpdatedEmail(String MobNum) {
		std_login.enterMobileNumber(MobNum);
		WebElement elem_email = driver.findElement(By.id("ContentPlaceHolder1_tbEmail"));
		FluentWait<ChromeDriver> f_wait_email = new FluentWait<ChromeDriver>(BasePage.driver);
		f_wait_email.withTimeout(Duration.ofMillis(4000));
		f_wait_email.pollingEvery(Duration.ofMillis(100));
		f_wait_email.until(ExpectedConditions.visibilityOf(elem_email));
		Boolean email_control_visible = elem_email.isDisplayed();
		Assert.assertTrue(email_control_visible);
	}

	@Test(priority = 3)
	public void testLoginButtonEnabledAfterClickingPlacementPolicyCheckbox() {
		std_login.checkPlacementPolicyCheckBox();
		WebElement elem_Login = driver.findElement(By.id("ContentPlaceHolder1_btnLogin"));
		FluentWait<ChromeDriver> f_wait_email = new FluentWait<ChromeDriver>(BasePage.driver);
		f_wait_email.withTimeout(Duration.ofMillis(4000));
		f_wait_email.pollingEvery(Duration.ofMillis(100));
		f_wait_email.until(ExpectedConditions.elementToBeClickable(elem_Login));
		Boolean Login_enabled = elem_Login.isEnabled();
		Assert.assertTrue(Login_enabled);
	}

	@Test(priority = 4)
	public void testValidLoginRedirectsToHomePage() throws InterruptedException {
		std_login.enterEmail("im.parthasarathi1996@gmail.com");
		std_login.enterPassword("Partha@123");
		Thread.sleep(10000);
		std_login.login();
		String cur_url = BasePage.driver.getCurrentUrl();
		String exp_url = "https://skillgun.com/Student/Home.aspx";
		Assert.assertEquals(cur_url, exp_url);
	}
}