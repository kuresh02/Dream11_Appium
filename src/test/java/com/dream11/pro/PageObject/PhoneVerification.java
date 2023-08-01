package com.dream11.pro.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;



public class PhoneVerification {
    AppiumDriver ldriver;
	
	public PhoneVerification(AppiumDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//android.widget.EditText")
	@CacheLookup
	WebElement phinputbox;
	
	@FindBy(xpath="//*[@text='Next']")
	@CacheLookup
	WebElement nxtbtn;
	
	@FindBy(xpath="//*[@text='Allow']")
	@CacheLookup
	WebElement allowotp;
	
	public WebElement PhonenNumInputbox ()
	{
		return phinputbox;
	}
	
	public void NxtBtn ()
	{
		nxtbtn.click();
	}
	

	
	public void ClickAllow ()
	{
		allowotp.click();
	}
	
}
