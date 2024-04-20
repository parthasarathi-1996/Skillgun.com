package com.SkillgunTests;

import org.testng.annotations.Test;

import com.CommonDrivers.BasePage;
import com.SkillgunPages.QRCodePage;
import com.SkillgunPages.StudentHome;

public class QRCodeTests extends BasePage {

	@Test(priority=1)
	public void testQRCodeLinkRedirectsToQRCodePageTestInternalComponent() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickQRCode();
	}
	@Test(priority = 2)
	public void testQRCodeVisibility() {
		QRCodePage qrpage = new QRCodePage(driver);
//		String qr_visibility = elem_qr_code.getAttribute("src");
//		Assert.assertEquals(qr_visibility, "null");
		qrpage.goToHome();
	}
}