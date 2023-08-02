package com.dream11.pro.TestCase;


import org.apache.log4j.Logger;
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
	public  Logger logger;
	ReadConfig readconfig = new ReadConfig();
	
	@Test
	public void Dream11TestCase() {
		
		//This method is used to select Language
		LanguageSelection lngs = new LanguageSelection(driver);
		lngs.clickContinueButton();
		
		logger.info("Language Selected");
		
		
		//This method is used to select Login
		LoginPage logp = new LoginPage(driver);
		logp.clickLoginButton();
		
		logger.info("Login Button Selected");
		
		
		//This method is used to phone verification
		PhoneVerification phv = new PhoneVerification(driver);
		String phnumber=readconfig.getMobNumber();
		phv.phonenNumInputbox().sendKeys(phnumber );
		
		logger.info("Mobile number given");
		
		phv.clickNxtBtn();
		phv.clickAllow();
		
		logger.info("Sucessfully Login");
		
		
		//Match selection
		HomePage ment = new  HomePage(driver);
		ment.clickMatchSelect();
		
		MatchEntry mchent = new MatchEntry(driver);
		mchent.clickMatchEntry();
		mchent.clickMatchEntry();
		logger.info("Sucessfully Enter to team selection");
		//This  is used for join a contest
		mchent.clickMatchJoin();
		
		TeamSelection teamsel = new TeamSelection(driver);
		
		logger.info(" team selection started");
		//It will select Wicket keeper
		teamsel.player1();;
		teamsel.player2();
		teamsel.player3();
		
		//It will switch to Batsman selection
		teamsel.switchToBatsman();
		teamsel.player4();
		teamsel.player5();
		teamsel.player6();
		teamsel.player7();
		teamsel.player8();
		teamsel.player9();
		
		//It will switch to Allrounder selection
		teamsel.switchToAllRounder();
		teamsel.player10 ();
		

		//It will switch to Bowler selection
		teamsel.switchToAllBowler();
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
