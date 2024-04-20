package com.SkillgunTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CommonDrivers.BasePage;
import com.SkillgunPages.ProfileSettings;
import com.SkillgunPages.StudentHome;

public class ProfileSettingsTests extends BasePage {
	ProfileSettings pro_set;
	@BeforeClass
	public void setup() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickProfileSettings();
	}
	@BeforeMethod
	public void objectCreation() {
		pro_set = new ProfileSettings(driver);
	}
	
	@Test(priority=1)
	public void testAttend_Course_Details_is_Visible(){
		WebElement elem_Attend_Course_Details = driver.findElement(By.xpath("//table[@class='table table-bordered']"));
		Boolean Attend_Course_Details_displayed = elem_Attend_Course_Details.isDisplayed();
		Assert.assertTrue(Attend_Course_Details_displayed);
	}
	
	@Test(priority=2)
	public void testTechnology_Known_is_Visible(){
		WebElement elem_Technology_Known = driver.findElement(By.xpath("//div[@id='ContentPlaceHolder1_KnownTechnologies']"));
		Boolean Technology_Known_displayed = elem_Technology_Known.isDisplayed();
		Assert.assertTrue(Technology_Known_displayed);
	}
	
	@Test(priority=3)
	public void testadd_technology_expands_Technologies(){
		WebElement elem_add_technology_expands_Technologies = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnAddMore']"));
		elem_add_technology_expands_Technologies.click();
		
		WebElement elem_Checkbox = driver.findElement(By.xpath("//input[@name='language']"));
		Boolean Checkbox_Visible = elem_Checkbox.isDisplayed();
		Assert.assertTrue(Checkbox_Visible);
		
		WebElement elem_click_C_lang = driver.findElement(By.xpath("//input[@id='c']"));
		elem_click_C_lang.click();
		
		WebElement elem_click_C_Plus_Plus_lang = driver.findElement(By.xpath("//input[@id='cpp']"));
		elem_click_C_Plus_Plus_lang.click();
		
		WebElement elem_click_Close_Button = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnCancelsub']"));
		elem_click_Close_Button.click();
		
		WebElement elem_Checkbox_after_clicking_close_button = driver.findElement(By.xpath("//input[@name='language']"));
		Boolean Checkbox_after_clicking_close_button_Visible = elem_Checkbox_after_clicking_close_button.isDisplayed();
		Assert.assertFalse(Checkbox_after_clicking_close_button_Visible);
	}

	@Test(priority=4)
	public void testProfile_Picture_is_Visible(){
		WebElement elem_Profile_Picture = driver.findElement(By.xpath("//img[@id='ContentPlaceHolder1_imgProfilePhoto']"));
		Boolean picture_displayed = elem_Profile_Picture.isDisplayed();
		Assert.assertTrue(picture_displayed);
	}
	
	@Test(priority=5)
	public void testPlacement_Status_is_Visible(){
		WebElement elem_Placement_Status = driver.findElement(By.xpath("//span[@id='ContentPlaceHolder1_tbPlacementStatus']"));
		Boolean Placement_Status_displayed = elem_Placement_Status.isDisplayed();
		Assert.assertTrue(Placement_Status_displayed);
	}
	
	@Test(priority=6)
	public void testChangePasswordLink_Redirects_To_ChangePasswordPage(){
		pro_set.clickChangePasswordLink();
		WebElement elem_change_password_page = driver.findElement(By.xpath("//div[@class='modal-content']"));
		Boolean page_displayed = elem_change_password_page.isDisplayed();
		Assert.assertTrue(page_displayed);
		WebElement elem_change_password_page_Cancel_Button = driver.findElement(By.xpath("//input[@id='ContentPlaceHolder1_btnCancel']"));
		elem_change_password_page_Cancel_Button.click();
	}
	
	@Test(priority=7)
	public void testEditContactDetailsLink_Redirects_To_EditContactPage(){
		pro_set.clickEditContactDetails();
		String exp_url = "https://skillgun.com/Student/EditContactDetails.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/ProfileSetting.aspx");
	}

	@Test(priority=8)
	public void testEditEducationDetailsLink_Redirects_To_EditEducationDeatilsPage() {
		pro_set.clickEditEducationDetails();
		String exp_url = "https://skillgun.com/Student/EducationDetails.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/ProfileSetting.aspx");
	}

	@Test(priority=9)
	public void testUploadResumeLink_Redirects_To_UploadResumePage() {
		pro_set.clickUploadResume();
		String exp_url = "https://skillgun.com/Student/UploadResume.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/ProfileSetting.aspx");
	}
	@Test(priority=10)
	public void testGoToHomeLink_Redirects_To_Home_Page() {
		pro_set.clickGoToHome();
		String exp_url = "https://skillgun.com/Student/Home.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
	}

}
