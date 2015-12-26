package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.LinkedInWrappers;

public class TC01LoginFailure extends LinkedInWrappers {

	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC01 - Fail" ;
		testCaseName 	= "TC01 - Login (POM)";
		testDescription = "Login(Negative test case) to Linked In Using POM";
	}
	@Test(dataProvider="fetchData")
	public void loginLogout(String userName, String password, String errString){
		new LoginPage()
		.loginToLinkedInForFailure(userName, password, errString);
	}
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
