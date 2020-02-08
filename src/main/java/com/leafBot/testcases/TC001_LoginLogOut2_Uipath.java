package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.leafBot.pages.LoginPage2_Uipath;
import com.leafBot.testng.api.base.ProjectSpecificMethods2_Uipath;

public class TC001_LoginLogOut2_Uipath extends ProjectSpecificMethods2_Uipath{	

	@BeforeTest
	public void setValues() {
		testCaseName = "Login and LoginOut";
		testDescription = "Login testCase using DemoSalesManager UserName and LogOut";
		nodes = "Leads";
		authors = "Gopinath";
		category = "Smoke";
		dataSheetName = "TC001";
	}

	@Test(dataProvider = "fetchData")
	public void createLeaf(String uName, String pwd) {
	
		new LoginPage2_Uipath(driver, node, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.verifyPageTitle("ACME");
		System.out.println(driver.getTitle());
	
		
		
	
	}
	


}





