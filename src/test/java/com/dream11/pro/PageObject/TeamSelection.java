package com.dream11.pro.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

//This class used  to select player
public class TeamSelection {
AppiumDriver ldriver;
	
	public TeamSelection(AppiumDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//android.view.ViewGroup[1] )[60]")
	@CacheLookup
	WebElement player1;
	
	@FindBy(xpath="//android.view.ViewGroup[1] )[57]")
	@CacheLookup
	WebElement player2;
	
	@FindBy(xpath="//android.view.ViewGroup[1] )[54]")
	@CacheLookup
	WebElement player3;
	
	@FindBy(xpath="//android.view.ViewGroup[1] )[32]")
	@CacheLookup
	WebElement switchtobatsman;
	
	@FindBy(xpath="//android.view.ViewGroup[1] )[54]")
	@CacheLookup
	WebElement player4;
	
	@FindBy(xpath="//android.view.ViewGroup[1] )[57]")
	@CacheLookup
	WebElement player5;
	
	@FindBy(xpath="//android.view.ViewGroup[1] )[60]")
	@CacheLookup
	WebElement player6;
	
	@FindBy(xpath="//android.view.ViewGroup[1] )[63]")
	@CacheLookup
	WebElement player7;
	
	@FindBy(xpath="//android.view.ViewGroup[1] )[66]")
	@CacheLookup
	WebElement player8;
	
	@FindBy(xpath="//android.view.ViewGroup[1] )[69]")
	@CacheLookup
	WebElement player9;
	
	@FindBy(xpath="//android.view.ViewGroup[1] )[33]")
	@CacheLookup
	WebElement switchtoallrounder;
	
	@FindBy(xpath="//android.view.ViewGroup[1] )[60]")
	@CacheLookup
	WebElement player10;
	
	@FindBy(xpath="//android.view.ViewGroup[1] )[34]")
	@CacheLookup
	WebElement switchtobowler;
	
	@FindBy(xpath="//android.view.ViewGroup[1] )[60]")
	@CacheLookup
	WebElement player11;
	
	@FindBy(xpath="(//android.view.ViewGroup[1] )[79]")
	@CacheLookup
	WebElement nxtbtn;
	
	
	public void Player1 ()
	{
		player1.click();
	}
	
	public void Player2 ()
	{
		player2.click();
	}
	
	public void Player3 ()
	{
		player3.click();
	}
	
	public void SwitchToBatsman ()
	{
		switchtobatsman.click();
	}	
	public void Player4 ()
	{
		player4.click();
	}	
	public void Player5 ()
	{
		player5.click();
	}
	
	public void Player6 ()
	{
		player6.click();
	}	
	public void Player7 ()
	{
		player7.click();
	}
	
	public void Player8 ()
	{
		player8.click();
	}
	public void Player9 ()
	{
		player9.click();
	}	
	
	public void SwitchToAllRounder ()
	{
		switchtoallrounder.click();
	}	
	
	
	public void Player10 ()
	{
		player10.click();
	}
	
	public void SwitchToAllBowler ()
	{
		switchtobowler.click();
	}	
	
	public void Player11 ()
	{
		player11.click();
	}
	
	public void nextbtn ()
	{
		nxtbtn.click();
	}
	
}
