package com.SkillgunPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentHome {
	

	@FindBy(partialLinkText = "profile")
	private WebElement elem_profile;

	@FindBy(xpath = "//a[@id='a1']")
	private WebElement elem_course_materials;
	
	@FindBy(id = "ContentPlaceHolder1_ahrefnewdrive")
	private WebElement elem_new_placement_drive_apply;
	
	@FindBy(id = "ContentPlaceHolder1_ahrefInterview")
	private WebElement elem_interview_schedules;
	
	@FindBy(id = "ContentPlaceHolder1_ahrefapplieddrive")
	private WebElement elem_applied_drives;
	
	@FindBy(id = "ContentPlaceHolder1_ahrefattenddrive")
	private WebElement elem_attended_drives;
	
	@FindBy(id = "ContentPlaceHolder1_a2")
	private WebElement elem_model_resume;
	
	@FindBy(id = "ContentPlaceHolder1_ahrefEguruDetails")
	private WebElement elem_eguru_details;
	
	@FindBy(xpath = "//a[@href= 'MockResult.aspx']")
	private WebElement elem_mock_interview_report;
	
	@FindBy(xpath = "//a[@href= 'SoftwareInstallationHelp.aspx']")
	private WebElement elem_software_installation;
	
	@FindBy(partialLinkText = "coding test results")
	private WebElement elem_coding_test_results;
	
	@FindBy(xpath = "//a[@href='MockInterviewTips.aspx']")
	private WebElement elem_mock_interview_tips;
	
	@FindBy(xpath = "//a[@href='StudentToStudentPeerMockInterview.aspx']")
	private WebElement elem_peer_mock_interview;
	
	@FindBy(xpath = "//a[@href='SelfIntroduction.aspx']")
	private WebElement elem_self_introduction;
	
	@FindBy(xpath = "//a[@href='UploadCodingTestAnswerPapers.aspx']")
	private WebElement elem_upload_answer_papers;
	
	@FindBy(xpath = "//a[@href='Student_QR_Code.aspx']")
	private WebElement elem_qrcode;

	public StudentHome(ChromeDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickProfileSettings() {
		elem_profile.click();
	}

	public void clickCourseMaterials() {
		elem_course_materials.click();
	}
	
	public void clickNewPlacementDriveApply() {
		elem_new_placement_drive_apply.click();
	}
	
	public void clickInterviewSchedules() {
		elem_interview_schedules.click();
	}
	
	public void clickAppliedDrives() {
		elem_applied_drives.click();
	}
	
	public void clickAttendedDrives() {
		elem_attended_drives.click();
	}
	
	public void clickModelResume() {
		elem_model_resume.click();
	}

	public void clickEguruDetails() {
		elem_eguru_details.click();
	}

	public void clickMockInterviewReport() {
		elem_mock_interview_report.click();
	}
	
	public void clickSoftwareInstallation() {
		elem_software_installation.click();
	}
	
	public void clickCodingTestresult() {
		elem_coding_test_results.click();
	}
	
	public void clickMockInterviewTips() {
		elem_mock_interview_tips.click();
	}
	
	public void clickPeerMockInterview() {
		elem_peer_mock_interview.click();
	}
	
	public void clickSelfIntroduction() {
		elem_self_introduction.click();
	}
	
	public void clickUploadAnswerPaper() {
		elem_upload_answer_papers.click();
	}
	
	public void clickQRCode() {
		elem_qrcode.click();
	}
	
	
	
}
