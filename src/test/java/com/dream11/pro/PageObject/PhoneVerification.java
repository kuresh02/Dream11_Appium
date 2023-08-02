package com.dream11.pro.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class PhoneVerification {
	AppiumDriver ldriver;

	// Constructor, as every page needs a AppiumDriver to find elements
	public PhoneVerification(AppiumDriver driver) {
		// to initiate the local driver
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.EditText")
	@CacheLookup
	WebElement phinputbox;

	@FindBy(xpath = "//*[@text='Next']")
	@CacheLookup
	WebElement nxtbtn;

	@FindBy(xpath = "//*[@text='Allow']")
	@CacheLookup
	WebElement allowotp;

	// method is used to select the phone inputbox
	public WebElement phonenNumInputbox() {
		return phinputbox;
	}

	// method is used to click on next button after mobile number given
	public void clickNxtBtn() {
		nxtbtn.click();
	}

	// method is used to allow to read the otp
	public void clickAllow() {
		allowotp.click();
	}

}
