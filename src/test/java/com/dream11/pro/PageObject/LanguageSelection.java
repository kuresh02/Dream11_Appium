package com.dream11.pro.PageObject;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LanguageSelection {

    private final AppiumDriver driver;

    // Constructor, as every page needs an AppiumDriver to find elements
    public LanguageSelection(AppiumDriver driver) {
        // Initialize the local driver
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@text='CONTINUE']")
    @CacheLookup
    private WebElement continueButton;

    /**
     * Clicks the continue button to proceed with the application using the default
     * language (English).
     */
    public void clickContinueButton() {
        continueButton.click();
    }
}
