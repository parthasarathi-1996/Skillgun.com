package com.CommonDrivers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {

	public static ChromeDriver driver;
	public BasePage() 
	{
		// TODO Auto-generated constructor stub
		if(driver==null) 
		{
		  System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		  ChromeOptions options=new ChromeOptions();
	      options.setBinary("C:\\chrome-win64\\chrome.exe");
	      driver=new ChromeDriver(options);
	      driver.manage().window().maximize();
		}
	}
   
}