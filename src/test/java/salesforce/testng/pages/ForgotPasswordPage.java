package salesforce.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class ForgotPasswordPage extends BasePage {

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='un']")
	WebElement userName;
	
	@FindBy(xpath=" //input[@id='continue']")
	WebElement continueButton;
	
	@FindBy(xpath="//h2[@id='header']")
	WebElement checkYourEmail;
	
	public void enterIntoUsername(String strusername){
		waitforElement(userName);
		userName.sendKeys(strusername);	
	}
	
	public void clickOnContinueButton() {
		continueButton.click();		
	}
	public String checkYourEmail() {
		waitforElement(checkYourEmail);
		return checkYourEmail.getText();
		
				
	}

}
