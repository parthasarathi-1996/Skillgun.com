package com.SkillgunPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseMaterials {
	private ChromeDriver driver;

	@FindBy(xpath = "//a[@download='css3.pdf']")
	private WebElement elem_css3;

	@FindBy(xpath = "//a[@download='html & css.pdf']")
	private WebElement elem_HtmlCss;

	@FindBy(xpath = "//a[@download='html5.pdf']")
	private WebElement elem_Html5;

	@FindBy(xpath = "//a[@download='javascript.pdf']")
	private WebElement elem_JavaScript;

	@FindBy(xpath = "//a[@download='core java.pdf']")
	private WebElement elem_CoreJava;

	public CourseMaterials(ChromeDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickCss3() {
		elem_css3.click();
	}

	public void clickHtmlCss() {
		elem_HtmlCss.click();
	}

	public void clickHtml5() {
		elem_Html5.click();
	}

	public void clickJavaScript() {
		elem_JavaScript.click();
	}

	public void clickCoreJava() {
		elem_CoreJava.click();
	}
}
