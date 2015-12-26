package pages;

import utils.Reporter;
import wrapper.LinkedInWrappers;

public class LoginPage extends LinkedInWrappers {

	public LoginPage() {

		if (!driver.getTitle().contains("World’s Largest Professional Network | LinkedIn")) {
			Reporter.reportStep("This is not login page !! ", "FAIL");
		}
	}

	public LoginPage enterUserName(String userName) {
		enterById(objProp.getProperty("userName"), userName);
		return this;
	}

	public LoginPage enterPassword(String passWord) {
		enterById(objProp.getProperty("passWord"), passWord);
		return this;
	}

	public HomePage clickLogin() {
		clickByName(objProp.getProperty("logIn"));
		return new HomePage();
	}

	public HomePage loginToLinkedIn(String userName, String passWord) {
		return enterUserName(userName).enterPassword(passWord).clickLogin();

	}
	
	
	public LoginPage clickLoginForFailure() {
		clickByName(objProp.getProperty("logIn"));
		return this;
	}
	
	//session_password-login-error
	
	public LoginPage verifyErrorMessage(String errorMessage){
		verifyTextByXpath("//*[@id='session_password-login-error']",errorMessage);
		return this;
	}
	
	
	public LoginPage loginToLinkedInForFailure(String userName, String passWord, String errString){
		enterUserName(userName)
		.enterPassword(passWord)
		.clickLoginForFailure()
		.verifyErrorMessage(errString);
		return this;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
