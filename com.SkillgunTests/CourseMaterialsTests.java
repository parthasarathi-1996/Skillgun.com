package com.SkillgunTests;

import java.nio.file.DirectoryStream;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CommonDrivers.BasePage;
import com.SkillgunPages.CourseMaterials;
import com.SkillgunPages.StudentHome;

public class CourseMaterialsTests extends BasePage {
	CourseMaterials course_material;

	@BeforeMethod
	public void setup() {
		course_material = new CourseMaterials(driver);
	}

	@Test(priority = 1)
	public void testCourseMaterialsLinkRedirectsToCourseMaterialPage() {
		StudentHome stud_home = new StudentHome(driver);
		stud_home.clickCourseMaterials();
	}

	@Test(priority = 2)
	public void testCSS3BoxDownloadCourseMaterialOnClick() {
		course_material.clickCss3();
	}

	@Test(priority = 3)
	public void testHTMLCSSBoxDownloadCourseMaterialOnClick() {
		course_material.clickHtmlCss();

	}

	@Test(priority = 4)
	public void testHTML5BoxDownloadCourseMaterialOnClick() {
		course_material.clickHtml5();
	}

	@Test(priority = 5)
	public void testJAVASCRIPTBoxDownloadCourseMaterialOnClick() {
		course_material.clickJavaScript();
	}

	@Test(priority = 6)
	public void testCOREJAVABoxDownloadCourseMaterialOnClick() {
		course_material.clickCoreJava();
	}
}
