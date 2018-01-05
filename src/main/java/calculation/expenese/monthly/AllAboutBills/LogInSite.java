package calculation.expenese.monthly.AllAboutBills;

import org.openqa.selenium.WebDriver;

public interface LogInSite {
	
	WebDriver driver = null;
	public void goToWebSite();
	public void enterCredentials();
	public void signIn();

}
