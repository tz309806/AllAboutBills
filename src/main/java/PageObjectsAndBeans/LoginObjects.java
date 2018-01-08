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
	@FindBy(xpath="//*[@id=\"cphContentMain_ctl00_ctl00_TbUserID\"]")
	private WebElement aepUserName;
	@FindBy(xpath="//*[@id=\"cphContentMain_ctl00_ctl00_TbPassword\"]")
	private WebElement aepPassword;
	@FindBy(xpath="//*[@id=\"cphContentMain_ctl00_ctl00_BtnLogin\"]")
	private WebElement aepLoginBtn;
	public WebElement getWmUserName() {
		return wmUserName;
	}
	public void setWmUserName(WebElement wmUserName) {
		this.wmUserName = wmUserName;
	}
	public WebElement getWmPassWord() {
		return wmPassWord;
	}
	public void setWmPassWord(WebElement wmPassWord) {
		this.wmPassWord = wmPassWord;
	}
	public WebElement getWmLoginBtn() {
		return wmLoginBtn;
	}
	public void setWmLoginBtn(WebElement wmLoginBtn) {
		this.wmLoginBtn = wmLoginBtn;
	}
	public WebElement getSpectrumUserName() {
		return spectrumUserName;
	}
	public void setSpectrumUserName(WebElement spectrumUserName) {
		this.spectrumUserName = spectrumUserName;
	}
	public WebElement getSpectrumPassWord() {
		return spectrumPassWord;
	}
	public void setSpectrumPassWord(WebElement spectrumPassWord) {
		this.spectrumPassWord = spectrumPassWord;
	}
	public WebElement getSpectrumLoginBtn() {
		return spectrumLoginBtn;
	}
	public void setSpectrumLoginBtn(WebElement spectrumLoginBtn) {
		this.spectrumLoginBtn = spectrumLoginBtn;
	}
	public WebElement getEngyCoopUserName() {
		return EngyCoopUserName;
	}
	public void setEngyCoopUserName(WebElement engyCoopUserName) {
		EngyCoopUserName = engyCoopUserName;
	}
	public WebElement getEngyCoopPassWord() {
		return EngyCoopPassWord;
	}
	public void setEngyCoopPassWord(WebElement engyCoopPassWord) {
		EngyCoopPassWord = engyCoopPassWord;
	}
	public WebElement getEngyCoopLoginBtn() {
		return EngyCoopLoginBtn;
	}
	public void setEngyCoopLoginBtn(WebElement engyCoopLoginBtn) {
		EngyCoopLoginBtn = engyCoopLoginBtn;
	}
	public WebElement getAepUserName() {
		return aepUserName;
	}
	public void setAepUserName(WebElement aepUserName) {
		this.aepUserName = aepUserName;
	}
	public WebElement getAepPassword() {
		return aepPassword;
	}
	public void setAepPassword(WebElement aepPassword) {
		this.aepPassword = aepPassword;
	}
	public WebElement getAepLoginBtn() {
		return aepLoginBtn;
	}
	public void setAepLoginBtn(WebElement aepLoginBtn) {
		this.aepLoginBtn = aepLoginBtn;
	}
	
	

	
	
}
