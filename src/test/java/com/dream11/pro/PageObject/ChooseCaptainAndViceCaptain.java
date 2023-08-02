package com.dream11.pro.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class ChooseCaptainAndViceCaptain {

	AppiumDriver driver;

	// Constructor, as every page needs a AppiumDriver to find elements
	public ChooseCaptainAndViceCaptain(AppiumDriver driver) {
		// to initiate the local driver
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[@text='C'])[1]")
	@CacheLookup
	WebElement captain;

	@FindBy(xpath = "(//*[@text='CD'])2]")
	@CacheLookup
	WebElement vccaptain;

	@FindBy(xpath = "//*[@text='SAVE']")
	@CacheLookup
	WebElement saveteambtn;

	// Method used to select Captain
	public void clickCaptain() {
		captain.click();
	}

	// Method used to select Vice Captain
	public void clickViceCaptain() {
		vccaptain.click();
	}

	// Method used to save created team
	public void saveTeam() {
		saveteambtn.click();
	}

}
