package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.LinkedInWrappers;

public class TC01Login extends LinkedInWrappers {

	@BeforeClass
	public void startTestCase(){
		browserName 	= "firefox";
		dataSheetName 	= "TC01";
		testCaseName 	= "TC01 - Login (Hybrid)";
		testDescription = "Login to Linked In Using Hybrid";
	}
	@Test(dataProvider="fetchData")
	public void loginLogout(String userName, String password, String name){
		new LoginPage()
		.loginToLinkedIn(userName, password)
		.verifyLoggedinUserName(name)
		.signOut();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
