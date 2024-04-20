package com.SkillgunPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentLoginPage {
	ChromeDriver driver;
	@FindBy(id = "ContentPlaceHolder1_tbPhoneNumber")
	private WebElement elem_mobile;
	@FindBy(id = "ckbkPolicyAgreement")
	private WebElement elem_placement_policy_chkBox;
	@FindBy(id = "ContentPlaceHolder1_tbEmail")
	private WebElement elem_email;
	@FindBy(id = "ContentPlaceHolder1_tbPassword")
	private WebElement elem_pass;
	@FindBy(id = "ContentPlaceHolder1_btnLogin")
	private WebElement elem_login;

	public StudentLoginPage(ChromeDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void openPage() {
		this.driver.get("https://skillgun.com/");
	}

	public void enterMobileNumber(String mobNum) {
		elem_mobile.sendKeys(mobNum);
	}

	public void checkPlacementPolicyCheckBox() {
		elem_placement_policy_chkBox.click();
	}

	public void enterEmail(String email) {
		elem_email.sendKeys(email);
	}

	public void enterPassword(String password) {
		elem_pass.sendKeys(password);
	}

	public void login() {
		elem_login.click();
	}
}