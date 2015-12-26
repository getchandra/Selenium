package pages;

import utils.Reporter;
import wrapper.LinkedInWrappers;

public class SignOutPage extends LinkedInWrappers {
	
	public SignOutPage() {
		
		if (!driver.getTitle().contains("Signed Out")) {
			Reporter.reportStep("This is not Signed Out page !! ", "FAIL");
		}
	}

}
