package com.dream11.pro.TestCase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;




public class BaseClass {
	public static AppiumDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void mytest() throws MalformedURLException, InterruptedException {
		
		//Define Logger file
		logger = Logger.getLogger("dream11");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		//Here  DesiredCapabilities are defined 
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Xiaomi 11i HyperCharge"); 
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID, "mn99wwrweivcnvlr");
        caps.setCapability("avdLaunchTimeout", 180000);
        System.out.println(System.getProperty("user.dir"));    
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        System.out.println(url);
        String andAppUrl = System.getProperty("user.dir") + File.separator + "src/main/resources" + File.separator + "resources"
                + File.separator + "dream11.apk";
        caps.setCapability("appPackage", "com.app.dream11Pro");
        caps.setCapability(MobileCapabilityType.APP, andAppUrl);
        caps.setCapability("autoGrantPermissions", "true");      
        
      //Application driver start the application 
        driver = new AndroidDriver(url,caps);
        
        logger.info("Application Open");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterClass
	public void mytestend()  {
		
		
	}
	
}