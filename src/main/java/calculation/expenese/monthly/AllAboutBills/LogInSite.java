package calculation.expenese.monthly.AllAboutBills;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public interface LogInSite {
	
	WebDriver driver = new HtmlUnitDriver();
	public void goToWebSite();
	public void enterCredentials(LoginCredentialBeans beans);
	public void signIn();

}
