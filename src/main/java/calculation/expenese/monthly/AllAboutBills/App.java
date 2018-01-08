package calculation.expenese.monthly.AllAboutBills;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("credentialBeans.xml");
		LoginCredentialBeans loginCredentialBeans = (LoginCredentialBeans) context.getBean("LoginCredentialBeans");

		AePLogin aep = new AePLogin();
		aep.goToWebSite();
		aep.enterCredentials(loginCredentialBeans);
		aep.signIn();
	}
}