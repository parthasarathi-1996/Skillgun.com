package com.SkillgunTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.CommonDrivers.BasePage;
import com.SkillgunPages.StudentHome;

public class StudentHomeTest extends BasePage {
	@FindBy(xpath = "//h3/span/[text()='parthasarathi senapati']")
	private WebElement elem_welcome_user_name;

	public StudentHomeTest() {
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 1)
	public void testHomePageDisplayWelcomeAndUserNameAfterLogin() {
		FluentWait<ChromeDriver> f_wait_email = new FluentWait<ChromeDriver>(BasePage.driver);
		f_wait_email.withTimeout(Duration.ofMillis(4000));
		f_wait_email.pollingEvery(Duration.ofMillis(100));
		f_wait_email.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//h3/span[text()='parthasarathi senapati']")));
		WebElement elem_welcome_user_name = driver.findElement(By.xpath("//h3/span[text()='parthasarathi senapati']"));
		Boolean user_displayed = elem_welcome_user_name.isDisplayed();
		Assert.assertTrue(user_displayed);
	}

	@Test(priority = 2)
	public void testProfileLinkRedirectsToProfilePage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickProfileSettings();
		String exp_url = "https://skillgun.com/Student/ProfileSetting.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/Home.aspx");
	}
	
	@Test(priority = 3)
	public void testCourseMaterialsLinkRedirectsToCourseMaterialPage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickCourseMaterials();
		String exp_url = "https://skillgun.com/Student/CourseMaterial.aspx?st_id=21";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/Home.aspx");
	}
	
	@Test(priority = 4)
	public void testNewPlacementDriveLinkRedirectsToNewPlacementDrivePage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickNewPlacementDriveApply();
		String exp_url = "https://skillgun.com/Student/NewPlacementDrive.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/Home.aspx");
	}
	
	@Test(priority = 5)
	public void testInterviewSchedulesLinkRedirectsToInterviewSchedulesPage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickInterviewSchedules();
		String exp_url = "https://skillgun.com/Student/Interviews.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/Home.aspx");
	}
	
	@Test(priority = 6)
	public void testAppliedDrivesLinkRedirectsToAppliedDrivesPage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickAppliedDrives();
		String exp_url = "https://skillgun.com/Student/AppliedDrives.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/Home.aspx");
	}
	
	@Test(priority = 7)
	public void testAttendedDrivesLinkRedirectsToAttendedDrivesPage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickAttendedDrives();
		String exp_url = "https://skillgun.com/Student/AttendedDriveDetails.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/Home.aspx");
	}
	
	@Test(priority = 8)
	public void testModelResumeLinkRedirectsToModelResumePage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickModelResume();
		String exp_url = "https://skillgun.com/Student/ModelResumes.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/Home.aspx");
	}

	@Test(priority = 9)
	public void testEguruDetailsLinkRedirectsToEguruDetailsPage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickEguruDetails();
		String exp_url = "https://skillgun.com/Student/EGuruDetails.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/Home.aspx");
	}
	
	@Test(priority = 10)
	public void testMockInterviewReportLinkRedirectsToMockInterviewReportPage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickMockInterviewReport();
		String exp_url = "https://skillgun.com/Student/MockResult.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/Home.aspx");
	}
	
	@Test(priority = 11)
	public void testSoftwareInstallationLinkRedirectsToSoftwareInstallationPage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickSoftwareInstallation();
		String exp_url = "https://skillgun.com/Student/SoftwareInstallationHelp.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/Home.aspx");
	}
	
	@Test(priority = 12)
	public void testCodingtestResultLinkRedirectsToCodingTestResultPage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickCodingTestresult();
		String exp_url = "https://skillgun.com/StudentCodingTestResult.aspx?phNo=7681095918";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/Home.aspx");
	}
	
	@Test(priority = 13)
	public void testMockInterviewTipsLinkRedirectsToMockInterviewTipsPage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickMockInterviewTips();
		String exp_url = "https://skillgun.com/Student/MockInterviewTips.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/Home.aspx");
	}
	
	@Test(priority = 14)
	public void testSelfIntroductionLinkRedirectsToSelfIntroductionPage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickSelfIntroduction();
		String exp_url = "https://skillgun.com/Student/SelfIntroduction.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/Home.aspx");
	}
	
	@Test(priority = 15)
	public void testUploadAnswerPaperLinkRedirectsToUploadAnswerPaperPage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickUploadAnswerPaper();
		String exp_url = "https://skillgun.com/Student/UploadCodingTestAnswerPapers.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/Home.aspx");
	}
	
	@Test(priority = 16)
	public void testQRCodeLinkRedirectsToQRCodePage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickQRCode();
		String exp_url = "https://skillgun.com/Student/Student_QR_Code.aspx";
		String act_url = driver.getCurrentUrl();
		Assert.assertEquals(exp_url, act_url);
		driver.get("https://skillgun.com/Student/Home.aspx");	
	}
}


