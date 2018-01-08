package PageObjectsAndBeans;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObjects implements PageObjectsInterface {
	
	
	
//	Login objects

	@FindBy(id = "")
	private WebElement wmUserName;
	@FindBy(id="")
	private WebElement wmPassWord;
	@FindBy(id="")
	private WebElement wmLoginBtn;
	@FindBy()
	private WebElement spectrumUserName;
	@FindBy()
	private WebElement spectrumPassWord;
	@FindBy(id="")
	private WebElement spectrumLoginBtn;
	@FindBy()
	private WebElement EngyCoopUserName;
	@FindBy()
	private WebElement EngyCoopPassWord;
	@FindBy()
	private WebElement EngyCoopLoginBtn;
	@FindBy()
	private WebElement aepUserName;
	@FindBy()
	private WebElement aepPassword;
	@FindBy()
	private WebElement aepLoginBtn;
	
	
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#getWmLoginBtn()
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#getWmLoginBtn()
	 */
	public WebElement getWmLoginBtn() {
		return wmLoginBtn;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#setWmLoginBtn(org.openqa.selenium.WebElement)
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#setWmLoginBtn(org.openqa.selenium.WebElement)
	 */
	public void setWmLoginBtn(WebElement wmLoginBtn) {
		this.wmLoginBtn = wmLoginBtn;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#getSpectrumLoginBtn()
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#getSpectrumLoginBtn()
	 */
	public WebElement getSpectrumLoginBtn() {
		return spectrumLoginBtn;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#setSpectrumLoginBtn(org.openqa.selenium.WebElement)
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#setSpectrumLoginBtn(org.openqa.selenium.WebElement)
	 */
	public void setSpectrumLoginBtn(WebElement spectrumLoginBtn) {
		this.spectrumLoginBtn = spectrumLoginBtn;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#getEngyCoopLoginBtn()
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#getEngyCoopLoginBtn()
	 */
	public WebElement getEngyCoopLoginBtn() {
		return EngyCoopLoginBtn;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#setEngyCoopLoginBtn(org.openqa.selenium.WebElement)
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#setEngyCoopLoginBtn(org.openqa.selenium.WebElement)
	 */
	public void setEngyCoopLoginBtn(WebElement engyCoopLoginBtn) {
		EngyCoopLoginBtn = engyCoopLoginBtn;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#getAepLoginBtn()
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#getAepLoginBtn()
	 */
	public WebElement getAepLoginBtn() {
		return aepLoginBtn;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#setAepLoginBtn(org.openqa.selenium.WebElement)
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#setAepLoginBtn(org.openqa.selenium.WebElement)
	 */
	public void setAepLoginBtn(WebElement aepLoginBtn) {
		this.aepLoginBtn = aepLoginBtn;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#getWmUserName()
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#getWmUserName()
	 */
	public WebElement getWmUserName() {
		return wmUserName;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#setWmUserName(org.openqa.selenium.WebElement)
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#setWmUserName(org.openqa.selenium.WebElement)
	 */
	public void setWmUserName(WebElement wmUserName) {
		this.wmUserName = wmUserName;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#getWmPassWord()
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#getWmPassWord()
	 */
	public WebElement getWmPassWord() {
		return wmPassWord;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#setWmPassWord(org.openqa.selenium.WebElement)
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#setWmPassWord(org.openqa.selenium.WebElement)
	 */
	public void setWmPassWord(WebElement wmPassWord) {
		this.wmPassWord = wmPassWord;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#getSpectrumUserName()
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#getSpectrumUserName()
	 */
	public WebElement getSpectrumUserName() {
		return spectrumUserName;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#setSpectrumUserName(org.openqa.selenium.WebElement)
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#setSpectrumUserName(org.openqa.selenium.WebElement)
	 */
	public void setSpectrumUserName(WebElement spectrumUserName) {
		this.spectrumUserName = spectrumUserName;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#getSpectrumPassWord()
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#getSpectrumPassWord()
	 */
	public WebElement getSpectrumPassWord() {
		return spectrumPassWord;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#setSpectrumPassWord(org.openqa.selenium.WebElement)
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#setSpectrumPassWord(org.openqa.selenium.WebElement)
	 */
	public void setSpectrumPassWord(WebElement spectrumPassWord) {
		this.spectrumPassWord = spectrumPassWord;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#getEngyCoopUserName()
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#getEngyCoopUserName()
	 */
	public WebElement getEngyCoopUserName() {
		return EngyCoopUserName;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#setEngyCoopUserName(org.openqa.selenium.WebElement)
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#setEngyCoopUserName(org.openqa.selenium.WebElement)
	 */
	public void setEngyCoopUserName(WebElement engyCoopUserName) {
		EngyCoopUserName = engyCoopUserName;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#getEngyCoopPassWord()
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#getEngyCoopPassWord()
	 */
	public WebElement getEngyCoopPassWord() {
		return EngyCoopPassWord;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#setEngyCoopPassWord(org.openqa.selenium.WebElement)
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#setEngyCoopPassWord(org.openqa.selenium.WebElement)
	 */
	public void setEngyCoopPassWord(WebElement engyCoopPassWord) {
		EngyCoopPassWord = engyCoopPassWord;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#getAepUserName()
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#getAepUserName()
	 */
	public WebElement getAepUserName() {
		return aepUserName;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#setAepUserName(org.openqa.selenium.WebElement)
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#setAepUserName(org.openqa.selenium.WebElement)
	 */
	public void setAepUserName(WebElement aepUserName) {
		this.aepUserName = aepUserName;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#getAepPassword()
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#getAepPassword()
	 */
	public WebElement getAepPassword() {
		return aepPassword;
	}
	/* (non-Javadoc)
	 * @see PageObjects.LoginObjectInterface#setAepPassword(org.openqa.selenium.WebElement)
	 */
	/* (non-Javadoc)
	 * @see PageObjects.PageObjectsInterface#setAepPassword(org.openqa.selenium.WebElement)
	 */
	public void setAepPassword(WebElement aepPassword) {
		this.aepPassword = aepPassword;
	}
	
	
}
