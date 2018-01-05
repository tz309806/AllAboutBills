package calculation.expenese.monthly.AllAboutBills;

import PageObjects.LoginObjects;
import PageObjects.PageObjectsInterface;

public class AePLogin implements LogInSite{
	
	PageObjectsInterface pageObject = new LoginObjects();

	public void goToWebSite() {
		driver.navigate().to("https://www.aepohio.com/account/bills/");
	
	}

	public void enterCredentials() {

		pageObject.getAepUserName().sendKeys("");
		pageObject.getAepPassword().sendKeys("");
		
	}

	public void signIn() {

		pageObject.getAepLoginBtn().click();
//		Try .submit() if .click() does not work.
	}

}
