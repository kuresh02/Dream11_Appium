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

	@FindBy(xpath = "(//android.view.ViewGroup[2] )[7]")
	@CacheLookup
	WebElement captain;

	@FindBy(xpath = "(//android.view.ViewGroup[3] )[6]")
	@CacheLookup
	WebElement vccaptain;

	@FindBy(xpath = "(//android.view.ViewGroup[5] )[2]")
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
