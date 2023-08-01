package com.dream11.pro.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class ChooseCaptainAndViceCaptain {
	
	AppiumDriver ldriver;
	public ChooseCaptainAndViceCaptain(AppiumDriver driver)
	{
		
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath="(//android.view.ViewGroup[2] )[7]")
	@CacheLookup
	WebElement captain;
	
	@FindBy(xpath="(//android.view.ViewGroup[3] )[6]")
	@CacheLookup
	WebElement vccaptain;
	
	@FindBy(xpath="(//android.view.ViewGroup[5] )[2]")
	@CacheLookup
	WebElement saveteambtn;
	
	public void ClickCaptain()
	{
		captain.click();
	}
	
	public void ClickViceCaptain()
	{
		captain.click();
	}
	
	public void Saveteam()
	{
		saveteambtn.click();
	}
	
}
