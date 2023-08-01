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
		lngs.ClickContinueButton();
		
		logger.info("Language Selected");
		
		
		//This method is used to select Login
		LoginPage logp = new LoginPage(driver);
		logp.ClickLoginButton();
		
		logger.info("Login Button Selected");
		
		
		//This method is used to phone verification
		PhoneVerification phv = new PhoneVerification(driver);
		String phnumber=readconfig.getMobNumber();
		phv.PhonenNumInputbox().sendKeys(phnumber );
		
		logger.info("Mobile number given");
		
		phv.NxtBtn();
		phv.ClickAllow();
		
		logger.info("Sucessfully Login");
		
		
		//Match selection
		HomePage ment = new  HomePage(driver);
		ment.MatchSelect();
		
		MatchEntry mchent = new MatchEntry(driver);
		mchent.Matchentry();
		mchent.Matchentry();
		logger.info("Sucessfully Enter to team selection");
		//This  is used for join a contest
		mchent.MatchJoin();
		
		TeamSelection teamsel = new TeamSelection(driver);
		
		logger.info(" team selection started");
		//It will select Wicket keeper
		teamsel.Player1();;
		teamsel.Player2();
		teamsel.Player3();
		
		//It will switch to Batsman selection
		teamsel.SwitchToBatsman();
		teamsel.Player4();
		teamsel.Player5();
		teamsel.Player6();
		teamsel.Player7();
		teamsel.Player8();
		teamsel.Player9();
		
		//It will switch to Allrounder selection
		teamsel.SwitchToAllRounder();
		teamsel.Player10 ();
		

		//It will switch to Bowler selection
		teamsel.SwitchToAllBowler();
		teamsel.Player11 ();
		
		//Select next for next step 
		teamsel.nextbtn ();
		
		//Captain and viceCaptain selection and Click save to save my team
		logger.info(" Selection of Captain and ViceCaptain started");
		ChooseCaptainAndViceCaptain ccv = new ChooseCaptainAndViceCaptain(driver);
		ccv.ClickCaptain();
		ccv.ClickViceCaptain();
		ccv.Saveteam();
		logger.info(" team selected sucessfully");
		
	}
}
