package calculation.expenese.monthly.AllAboutBills;

import org.openqa.selenium.support.PageFactory;

import PageObjectsAndBeans.LoginObjects;
import PageObjectsAndBeans.PageObjectsInterface;

public class AePLogin implements LogInSite{
	
	PageObjectsInterface pageObject = new LoginObjects();
	LoginCredentialBeans credentialBean;
	

	public void goToWebSite() {
		
		System.out.println("getaeppageobject is: "+ pageObject.getAepUserName());

		System.out.println("Navigating to AEP Login page.");
		driver.navigate().to("https://www.aepohio.com/account/bills/");
	
	}

	public void enterCredentials(LoginCredentialBeans beans) {
		PageFactory.initElements(driver, LoginObjects.class);
System.out.println("Entering login credentials");
System.out.println("username from credentialBean is: " + beans.getAepUserNameCredential());
		pageObject.getAepUserName().sendKeys(beans.getAepUserNameCredential());
		pageObject.getAepPassword().sendKeys(beans.getAepPasswordCredential());

	}

	public void signIn() {
		PageFactory.initElements(driver, LoginObjects.class);
		pageObject.getAepLoginBtn().click();
//		Try .submit() if .click() does not work.
		System.out.println(driver.getCurrentUrl());
	}

}
