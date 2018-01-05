package calculation.expenese.monthly.AllAboutBills;

import org.openqa.selenium.By;


import PageObjects.LoginObjects;
import PageObjects.PageObjectsInterface;

public class WmLogIn implements LogInSite{

	PageObjectsInterface loginObject = new LoginObjects();

	public void goToWebSite() {
		driver.navigate().to("");

	}

	public void enterCredentials() {
		loginObject.getWmUserName().sendKeys("");
		loginObject.getWmPassWord().sendKeys("");
	}

	public void signIn() {

		loginObject.getWmLoginBtn().click();
		// TRY submit() if .click does not work
	}

}
