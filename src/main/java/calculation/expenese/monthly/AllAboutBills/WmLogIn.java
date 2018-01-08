package calculation.expenese.monthly.AllAboutBills;

import org.openqa.selenium.By;



import PageObjectsAndBeans.LoginObjects;
import PageObjectsAndBeans.PageObjectsInterface;

public class WmLogIn implements LogInSite{

	PageObjectsInterface loginObject = new LoginObjects();

	public void goToWebSite() {
		driver.navigate().to("");

	}

	public void enterCredentials(LoginCredentialBeans beans) {
		loginObject.getWmUserName().sendKeys("");
		loginObject.getWmPassWord().sendKeys("");
	}

	public void signIn() {

		loginObject.getWmLoginBtn().click();
		// TRY submit() if .click does not work
	}

}
