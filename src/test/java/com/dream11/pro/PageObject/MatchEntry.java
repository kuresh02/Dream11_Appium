//package com.dream11.pro.PageObject;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import io.appium.java_client.AppiumDriver;
//
//public class MatchEntry {
//
//	AppiumDriver ldriver;
//
//	// Constructor, as every page needs a AppiumDriver to find elements
//	public MatchEntry(AppiumDriver driver) {
//		// to initiate the local driver
//		ldriver = driver;
//		PageFactory.initElements(driver, this);
//	}
//
//	@FindBy(xpath = "//*[@text='ENTRY']")
//	@CacheLookup
//	WebElement matchentry;
//
//	@FindBy(xpath = "//*[@text='10 spots']/../android.view.ViewGroup//android.widget.TextView")
//	@CacheLookup
//	WebElement matchjoin;
//
//	// method is use to filter and entry to match as per requirement
//	public void Matchentry() {
//		matchentry.click();
//	}
//
//	// method is use to click on the join contest group (ex- group of 10/4/2 etc)
//	public void MatchJoin() {
//		matchjoin.click();
//	}
//
//}


package com.dream11.pro.PageObject;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MatchEntry {

    private final AppiumDriver driver;

    // Constructor, as every page needs an AppiumDriver to find elements
    public MatchEntry(AppiumDriver driver) {
        // Initialize the local driver
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@text='ENTRY']")
    @CacheLookup
    private WebElement matchEntry;

    @FindBy(xpath = "//*[@text='10 spots']/../android.view.ViewGroup//android.widget.TextView")
    @CacheLookup
    private WebElement matchJoin;

    /**
     * Clicks the Match Entry button to view match entry options.
     */
    public void clickMatchEntry() {
        matchEntry.click();
    }

    /**
     * Clicks on the join contest group (e.g., group of 10/4/2 spots).
     */
    public void clickMatchJoin() {
        matchJoin.click();
    }
}
