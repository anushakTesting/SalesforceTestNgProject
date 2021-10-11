package salesforce.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class LoginPage extends BasePage {	

	public LoginPage(WebDriver driver) {
		super(driver);		
	}

	@FindBy(xpath="//input[@type='email']")
	WebElement username;

	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='Login']")
	WebElement loginButton;
	
	@FindBy(xpath="//div[@id='error']")
	WebElement errorField;
	
	@FindBy(xpath="//span[@id='userNavLabel']")  //Logged in user name 
	WebElement userLabel;
	
	@FindBy(xpath="//input[@id='rememberUn']")
	WebElement rememberMe;
	
	@FindBy(xpath="//a[@id='forgot_password_link']")
	WebElement forgotpassword;
	
	@FindBy(xpath="//span[@id='idcard-identity']")
	WebElement userNameSpan;
	
	@FindBy(xpath="//div[@id='error']")
	WebElement errorMessage;
	
	
	
	public void enterIntoUsername(String strusername){
		username.sendKeys(strusername);

	}
	
	public void enterIntoPassword(String strpassword){
		password.sendKeys(strpassword);
	}

	public void clickLoginButton() {
		loginButton.click();
		
	}
	
	public void login(String strUserName, String strPassword) {
		username.sendKeys(strUserName);
		password.sendKeys(strPassword);
		loginButton.click();
	}
	
	public String getLoginErrorMessage() {
		return errorField.getText();
	}
	
	public String getUserLabel() {
		return userLabel.getText();
	}
	
	public void rememberMe() {
		rememberMe.click();	
	}
	
	public void clickonforgotPassword() {
		forgotpassword.click();	
	}
	
	public String getUsername() {
		waitforElement(userNameSpan);
		return userNameSpan.getText();
	}
	
	public String displaysErrorMessage() {
		waitforElement(errorMessage);
		return errorMessage.getText();
		
	}
	

	public void logintapplication(String strusername, String strpassword) {
		username.sendKeys(strusername);
		password.sendKeys(strpassword);
		loginButton.click();
	}

	
}
