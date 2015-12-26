package pages;

import utils.Reporter;
import wrapper.LinkedInWrappers;

public class HomePage extends LinkedInWrappers {
	public HomePage() {

		if (!driver.getTitle().contains("Welcome")) {
			Reporter.reportStep("This is not Home page !! ", "FAIL");
		}
	}

	public HomePage verifyLoggedinUserName(String userName) {
		verifyTextByXpath(objProp.getProperty("logInName"), userName);
		return this;

	}

	public HomePage mouseOverOnUserIcon() {
		mouseOverByXpath(objProp.getProperty("userIcon"));
		return this;

	}

	public SignOutPage logOut() {
		clickByLink(objProp.getProperty("logOut"));
		return new SignOutPage();
	}

	public SignOutPage signOut() {
		return mouseOverOnUserIcon().logOut();
	}

}
