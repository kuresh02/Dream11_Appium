package com.dream11.pro.PageObject;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private final AppiumDriver driver;

    // Constructor, as every page needs an AppiumDriver to find elements
    public HomePage(AppiumDriver driver) {
        // Initialize the local driver
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    @FindBy(xpath = "//*[@text='IND']")
    @FindBy(xpath="(//android.widget.TextView[1])[@text='SGCC']")
    @CacheLookup
    private WebElement matchSelect;

    
    // Method used to select a match
	public void clickMatchSelect() {
		matchSelect.click();
	}
}

