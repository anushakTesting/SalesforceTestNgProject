package salesforce.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class RandomScenariosPage extends BasePage {

	public RandomScenariosPage(WebDriver driver) {
		super(driver);
		
	}

	//Testcase-33 Line-2
	@FindBy(xpath="//li[@id='home_Tab']//a[contains(text(),'Home')]")
	WebElement HomeTab;
	
	public void ClickOnHomeTab() {
		waitforElement(HomeTab);
		HomeTab.click();
	}
	
	@FindBy(xpath="//a[@href='/_ui/core/userprofile/UserProfilePage'][normalize-space()='Sai Abcd']")
	WebElement AccountName;
	
	public String ValidatingUserAccountName() {
		waitforElement(AccountName);
		return AccountName.getText();
	}
	//Line-3
	@FindBy(xpath="//a[@href='/_ui/core/userprofile/UserProfilePage'][normalize-space()='Sai Abcd']")
	WebElement UserNameLink;
	
	public void ClickOnUserNameLink() {
		waitforElement(UserNameLink);
		UserNameLink.click();
	}
	
	@FindBy(xpath="//span[@id='tailBreadcrumbNode']")
	WebElement ProfilePage;
	
	public String ValidatingProfilePage() {
		waitforElement(ProfilePage);
		return ProfilePage.getText();
	}
	
	@FindBy(xpath="//div[@class='topLeft']/a[@class='dialogClose']")
	WebElement RandonScenariosPopUpWindow;
	
	public void clickOnRandonScenariosPopUpWindow() {
		RandonScenariosPopUpWindow.click();
	}
}
