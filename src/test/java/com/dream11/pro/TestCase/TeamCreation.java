package com.dream11.pro.TestCase;


import java.time.Duration;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.dream11.pro.PageObject.ChooseCaptainAndViceCaptain;
import com.dream11.pro.PageObject.HomePage;
import com.dream11.pro.PageObject.LanguageSelection;
import com.dream11.pro.PageObject.LoginPage;
import com.dream11.pro.PageObject.MatchEntry;
import com.dream11.pro.PageObject.PhoneVerification;
import com.dream11.pro.PageObject.TeamSelection;

import com.dream11.pro.Testutility.ReadConfig;



public class TeamCreation extends BaseClass {
	
	ReadConfig readconfig = new ReadConfig();

	@Test
	public void Dream11TestCase() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		logger.info("Language----- >Selected");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//This method is used to select Language
		LanguageSelection lngs = new LanguageSelection(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='CONTINUE']")));
		lngs.clickContinueButton();
		
		logger.info("Language Selected");
		
		
		//This method is used to select Login
		LoginPage logp = new LoginPage(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Log In']")));
		logp.clickLoginButton();
		
		logger.info("Login Button Selected");
		
		
		//This method is used to phone verification
		PhoneVerification phv = new PhoneVerification(driver);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Next']")));
		String phnumber=readconfig.getMobNumber();
		phv.phonenNumInputbox().sendKeys(phnumber );
		
		logger.info("Mobile number given");
		
		phv.clickNxtBtn();
		Thread.sleep(10000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Allow']")));
		phv.clickAllow();
		
		logger.info("Successfully Login");
		
		
		//Match selection
		HomePage ment = new  HomePage(driver);
		
		ment.clickMatchSelect();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='ENTRY']")));
		MatchEntry mchent = new MatchEntry(driver);
		
		mchent.clickMatchEntry();
		mchent.clickMatchEntry();
		logger.info("Successfully Enter to team selection");
		//This  is used for join a contest
		mchent.clickMatchJoin();
		
		TeamSelection teamsel = new TeamSelection(driver);
		
		logger.info("Team selection started");
		//It will select Wicket keeper
		teamsel.player1();;
		teamsel.player2();
		
		
		//It will switch to Batsman selection
		teamsel.switchToBatsman();
		teamsel.player3();
		teamsel.player4();
		teamsel.player5();
		teamsel.player6();
		
		
		
		//It will switch to Allrounder selection
		
		teamsel.switchToAllRounder();
		teamsel.player7();
		
		

		//It will switch to Bowler selection
		teamsel.switchToAllBowler();
		teamsel.player8 ();
		teamsel.player9();
		teamsel.player10();
		teamsel.player11 ();
		
		//Select next for next step 
		teamsel.nextbtn ();
		
		//Captain and viceCaptain selection and Click save to save my team
		logger.info(" Selection of Captain and ViceCaptain started");
		ChooseCaptainAndViceCaptain ccv = new ChooseCaptainAndViceCaptain(driver);
		ccv.clickCaptain();
		ccv.clickCaptain();
		ccv.saveTeam();
		logger.info(" team selected sucessfully");
		
	}
}
