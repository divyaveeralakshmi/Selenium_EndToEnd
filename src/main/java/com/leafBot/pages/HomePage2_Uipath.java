package com.leafBot.pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods2_Uipath;

public class HomePage2_Uipath extends ProjectSpecificMethods2_Uipath{

	public HomePage2_Uipath(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver, this);
	}		

	public HomePage2_Uipath verifyPageTitle(String data) {
		verifyTitle(data);
		return this;
	}	

}










