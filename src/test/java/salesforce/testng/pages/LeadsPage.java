package salesforce.testng.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class LeadsPage extends BasePage{

	public LeadsPage(WebDriver driver) {
		super(driver);
		
	}
	//Testcase-20 LeadsTab
	@FindBy(xpath="//li[@id='Lead_Tab']//a[contains(text(),'Leads')]")
	WebElement Leads;
	
	public void ClickOnLeads() {
		waitforElement(Leads);
		Leads.click();
	}
		
	@FindBy(xpath="//h2[normalize-space()='Home']")
	WebElement LeadsHomePage;
	
	public String validatingLeadsHomePage() {
		waitforElement(LeadsHomePage);
		return LeadsHomePage.getText();
		
	}
	
	@FindBy(xpath="//div[@class='topLeft']//a[@id='tryLexDialogX']")
	WebElement LeadsPopUpWindow;
	
	public void ClickOnLeadsPopUpClose() {
		waitforElement(LeadsPopUpWindow);
		LeadsPopUpWindow.click();
	}
	
	//Testcase-21 Line-2
	
	@FindBy(xpath="(//select[@class='title']/option)")
	List<WebElement> LeadsDropDownList;              //Leads DropDown list of elements
	
	public List<WebElement> LeadsDropDownList() {
		return LeadsDropDownList;
	}
	
	//Testcase-22 Line-2
	
	@FindBy(xpath="//select[@id='fcf']//option[@value='00B5f000004QQDd']")
	WebElement TodaysLead;
	
	public void SelectOnDropdownTodaysLead() {
		waitforElement(TodaysLead);
		TodaysLead.click();
	}
	
	//Line-5
	@FindBy(xpath="//input[@title='Go!']")
	WebElement LeadsViewGoButton;
	
	public void ClickOnLeadsViewGoButton() {
		waitforElement(LeadsViewGoButton);
		LeadsViewGoButton.click();
	}
	
	@FindBy(xpath="//li[@id='Lead_Tab']//a[contains(text(),'Leads')]")
	WebElement TodaysLeadsPage;
	
	public String ValidatingTodaysLeadsViewPage() {
		waitforElement(TodaysLeadsPage);
		return TodaysLeadsPage.getText();
	}
	
	//Testcase-23 Line-2
	
      //same Testcase 22  methods was used
	
	//Testcase-24 Line-2
	
	@FindBy(xpath="//input[@title='New']")
	WebElement NewButton;
	
	public void ClickOnNewButton() {
		waitforElement(NewButton);
		NewButton.click();
	}
	
	@FindBy(xpath="//h2[normalize-space()='New Lead']")
	WebElement NewLeadPage;
	
	public String ValidateNewLeadPage() {
		waitforElement(NewLeadPage);
		return NewLeadPage.getText();
	}
	
	@FindBy(xpath="//input[@id='name_lastlea2']")
	WebElement LastName;
	
	public String EnterTextInToLastName(String strLastName)
	{
		waitforElement(LastName);
		LastName.clear();
		LastName.sendKeys(strLastName);
		return strLastName;
		
	}
	
	@FindBy(xpath="//input[@id='lea3']")
	WebElement CompanyName;
	
	public String EnterTextInToCompanyName(String strCompanyName)
	{
		waitforElement(CompanyName);
		CompanyName.clear();
		CompanyName.sendKeys(strCompanyName);
		return strCompanyName;
		
	}
	
	@FindBy(xpath="//td[@id='topButtonRow']//input[@title='Save']")
	WebElement SaveButton;
	
	public void ClickOnSaveButton() {
		waitforElement(SaveButton);
		SaveButton.click();
	}
	
	@FindBy(xpath="//h2[@class='topName']")
	WebElement ABCDLeadPage;
	
	public String ValidateABCDLeadPage() {
		waitforElement(ABCDLeadPage);
		return ABCDLeadPage.getText();
	}

}
