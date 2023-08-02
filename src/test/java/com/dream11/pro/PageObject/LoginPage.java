//package com.dream11.pro.PageObject;
//
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//import io.appium.java_client.AppiumDriver;
//
//public class LoginPage {
//	AppiumDriver ldriver;
//
////Constructor, as every page needs a AppiumDriver to find elements
//	public LoginPage(AppiumDriver driver) {
//		// to initiate the local driver
//		ldriver = driver;
//		PageFactory.initElements(driver, this);
//	}
//
//	@FindBy(xpath = "//*[@text='Log In']")
//	@CacheLookup
//	WebElement loginbtn;
//
//	// method used for click on Login button
//	public void ClickLoginButton() {
//		loginbtn.click();
//	}
//
//}
package com.dream11.pro.PageObject;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private final AppiumDriver driver;

    // Constructor, as every page needs an AppiumDriver to find elements
    public LoginPage(AppiumDriver driver) {
        // Initialize the local driver
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@text='Log In']")
    @CacheLookup
    private WebElement loginButton;

    /**
     * Clicks the Login button to proceed with the login process.
     */
    public void clickLoginButton() {
        loginButton.click();
    }
}

