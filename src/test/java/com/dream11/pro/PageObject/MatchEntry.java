package com.dream11.pro.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class MatchEntry {
	
	AppiumDriver ldriver;
	public MatchEntry(AppiumDriver driver)
	{
		
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="//*[@text='ENTRY']")
	@CacheLookup
	WebElement matchentry;
	
	@FindBy(xpath="//*[@text='10 spots']/../android.view.ViewGroup//android.widget.TextView")
	@CacheLookup
	WebElement matchjoin;
	
	public void Matchentry()
	{
		matchentry.click();
	}
	
	public void MatchJoin()
	{
		matchjoin.click();
	}

	
}
