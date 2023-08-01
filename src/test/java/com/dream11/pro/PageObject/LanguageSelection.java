package com.dream11.pro.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;


public class LanguageSelection {

	AppiumDriver ldriver;
	
	public LanguageSelection(AppiumDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//*[@text='CONTINUE']")
	@CacheLookup
	WebElement continuebtn;
	
	public void ClickContinueButton ()
	{
		continuebtn.click();
	}
	

	
	
}
