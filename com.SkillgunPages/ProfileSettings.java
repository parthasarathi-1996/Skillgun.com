package com.SkillgunPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettings {

	private ChromeDriver driver;
	
	@FindBy(id = "ContentPlaceHolder1_btnChngPassword")
	private WebElement elem_change_password_link;
	
	@FindBy(id = "ContentPlaceHolder1_hlEditContact")
	private WebElement elem_edit_contact_details;
	
	@FindBy(id = "ContentPlaceHolder1_hlEditEducational")
	private WebElement elem_edit_Education_details;
	
	@FindBy(id = "ContentPlaceHolder1_hlUploadResume")
	private WebElement elem_Upload_Resume;
	
	@FindBy(xpath = "//a[@href='Home.aspx']")
	private WebElement elem_Go_To_Home;

	public ProfileSettings(ChromeDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickChangePasswordLink() {
		elem_change_password_link.click();
	}

	public void clickEditContactDetails() {
		elem_edit_contact_details.click();
	}

	public void clickEditEducationDetails() {
		elem_edit_Education_details.click();
	}

	public void clickUploadResume() {
		elem_Upload_Resume.click();
	}
	public void clickGoToHome() {
		elem_Go_To_Home.click();
	}
}
