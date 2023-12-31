package com.dream11.pro.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

//This class used  to select player
public class TeamSelection {
	AppiumDriver ldriver;

//Constructor, as every page needs a AppiumDriver to find elements
	public TeamSelection(AppiumDriver driver) {
		// to initiate the local driver
		ldriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")
	@CacheLookup
	WebElement player1;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")
	@CacheLookup
	WebElement player2;

	

	@FindBy(xpath = "//*[@text='BAT (0)']")
	@CacheLookup
	WebElement switchtobatsman;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")
	@CacheLookup
	WebElement player3;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")
	@CacheLookup
	WebElement player4;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]")
	@CacheLookup
	WebElement player5;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]")
	@CacheLookup
	WebElement player6;


	

	@FindBy(xpath = "//*[@text='AR (0)']")
	@CacheLookup
	WebElement switchtoallrounder;
	

	@FindBy(xpath = "(//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup)[1]")
	@CacheLookup
	WebElement player7;

	@FindBy(xpath = "//*[@text='BOWL (0)']")
	@CacheLookup
	WebElement switchtobowler;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")
	@CacheLookup
	WebElement player8;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]")
	@CacheLookup
	WebElement player9;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]")
	@CacheLookup
	WebElement player10;
	
	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]")
	@CacheLookup
	WebElement player11;

	@FindBy(xpath = "//*[@text='NEXT']")
	@CacheLookup
	WebElement nxtbtn;

	// methods are use to select player
	public void player1() {
		player1.click();
	}

	public void player2() {
		player2.click();
	}

	public void player3() {
		player3.click();
	}

	// method is used to select player from batsman section
	public void switchToBatsman() {
		switchtobatsman.click();
	}

	public void player4() {
		player4.click();
	}

	public void player5() {
		player5.click();
	}

	public void player6() {
		player6.click();
	}

	public void player7() {
		player7.click();
	}

	public void player8() {
		player8.click();
	}

	public void player9() {
		player9.click();
	}

	// method is used to select player from allrounder section
	public void switchToAllRounder() {
		switchtoallrounder.click();
	}

	public void player10() {
		player10.click();
	}

	// method is used to select player from bowler section
	public void switchToAllBowler() {
		switchtobowler.click();
	}

	public void player11() {
		player11.click();
	}

	// method is used to go to next section i.e selection of captain and
	// vice-captain
	public void nextbtn() {
		nxtbtn.click();
	}

}
