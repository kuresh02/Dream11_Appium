package com.dream11.pro.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class LoginPage {
AppiumDriver ldriver;
	
	public LoginPage(AppiumDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//*[@text='Log In']")
	@CacheLookup
	WebElement loginbtn;
	
	public void ClickLoginButton ()
	{
		loginbtn.click();
	}
	
}
