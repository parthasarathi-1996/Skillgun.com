package com.SkillgunPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QRCodePage {

	private ChromeDriver driver;

	@FindBy(xpath = "//a[@href='Home.aspx']")
	private WebElement elem_go_to_home;

	public QRCodePage(ChromeDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goToHome() {
		elem_go_to_home.click();
	}
}
