package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods2_Uipath;

public class LoginPage2_Uipath extends ProjectSpecificMethods2_Uipath{
	
	public LoginPage2_Uipath(RemoteWebDriver driver, ExtentTest node, ExtentTest test){
		this.driver = driver;
		this.node = node;
		this.test = test;
		PageFactory.initElements(driver,this);
	}
	 
	@FindBy(how=How.ID,using="email")
	private WebElement eleUserName;	
	
	@FindBy(how=How.ID,using="password")
	private WebElement elePassword;	
	
	@FindBy(how=How.ID,using="buttonLogin")
	private WebElement eleLogin;
	
	public LoginPage2_Uipath enterUserName(String data) {	
		clearAndType(eleUserName, data);
		return this;
	}	

	public LoginPage2_Uipath enterPassword(String data) {
		clearAndType(elePassword, data);
		return this;
	}	
	
	public HomePage2_Uipath clickLogin() {
		click(eleLogin);
		return new HomePage2_Uipath(driver, node, test);		
	}
		
	
}
