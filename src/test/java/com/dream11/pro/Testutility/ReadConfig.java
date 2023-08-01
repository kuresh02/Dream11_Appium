package com.dream11.pro.Testutility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import io.appium.java_client.AppiumDriver;

public class ReadConfig {


		Properties pro;
		
		public ReadConfig()
		{
			File src = new File("./Configuration/config.properties");

			try {
				FileInputStream fis = new FileInputStream(src);
				pro = new Properties();
				pro.load(fis);
			} catch (Exception e) {
				System.out.println("Exception is " + e.getMessage());
			}
		}
		

		public String getMobNumber() {
			// TODO Auto-generated method stub
			String phnum=pro.getProperty("phonenumber");
			return phnum;
		}
}
