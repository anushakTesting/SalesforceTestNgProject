package salesforce.testng.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class ContactsPage extends BasePage{

	public ContactsPage(WebDriver driver) {
		super(driver);
		
	}
	//Testcase-25 Line-2
	@FindBy(xpath="//a[normalize-space()='Contacts']")
	WebElement ContactsTab;
	
	public void ClickOnContactsTab() {
		waitforElement(ContactsTab);
		ContactsTab.click();
	}
	
	@FindBy(xpath="//h2[normalize-space()='Home']")
	WebElement ContactsHomePage;
	
	public String validatingContactsHomePage() {
		waitforElement(ContactsHomePage);
		return ContactsHomePage.getText();
		
	}
	@FindBy(xpath="//div[@class='topLeft']//a[@id='tryLexDialogX']")
	WebElement ContactsPopUpWindow;
	
	public void ClickOnContactsPopUpWindow() {
		waitforElement(ContactsPopUpWindow);
		ContactsPopUpWindow.click();
	}
	
	//Line-3
	
	@FindBy(xpath="//input[@title='New']")
	WebElement NewButton;
	
	public void ClickOnNewButton() {
		waitforElement(NewButton);
		NewButton.click();
	}
	@FindBy(xpath="//h2[normalize-space()='New Contact']")
	WebElement NewContactsPage;
	
	public String validatingNewContactsPage() {
		waitforElement(NewContactsPage);
		return NewContactsPage.getText();
	}
	//Line-4
	@FindBy(xpath="//input[@id='name_lastcon2']")
	WebElement LastName;
	
	public String EnterTextInToLastName(String strLastName)
	{
		waitforElement(LastName);
		LastName.clear();
		LastName.sendKeys(strLastName);
		return strLastName;
		
	}
	//Line-5
	@FindBy(xpath="//input[@id='con4']")
	WebElement AccountName;
	
	public String EnterTextInToAccountName(String strAccountName)
	{
		waitforElement(AccountName);
		AccountName.clear();
		LastName.sendKeys(strAccountName);
		return strAccountName;
		
	}
	//Line-6
	@FindBy(xpath="//td[@id='topButtonRow']//input[@title='Save']")////td[@id='bottomButtonRow']//input[@title='Save & New']
	WebElement SaveButton;
	
	public void ClickOnSaveButton() {
		waitforElement(SaveButton);
		SaveButton.click();
	}
	
	@FindBy(xpath="//h2[normalize-space()='AnuTesting']")
	WebElement NewAccount;
	
	public String validatingNewAccount() {
		waitforElement(NewAccount);
		return NewAccount.getText();
	}

	//Testcase -26 Line-3
	@FindBy(xpath="//a[normalize-space()='Create New View']")
	WebElement CreateNewView;
	
	public void ClickOnCreateNewView() {
		waitforElement(CreateNewView);
		CreateNewView.click();
	}
	
	@FindBy(xpath="//h2[normalize-space()='Create New View']")
	WebElement NewViewPage;
	
	public String validatingNewViewPage() {
		waitforElement(NewViewPage);
		return NewViewPage.getText();
	}
	
	@FindBy(xpath="//input[@id='fname']")
	WebElement ViewName;
	
	public String EnterTextInToViewName(String strViewName)
	{
		waitforElement(ViewName);
		ViewName.clear();
		ViewName.sendKeys(strViewName);
		return strViewName;
		
	}
	//Line-6
		@FindBy(xpath="//td[@class='pbButtonb']//input[@title='Save']")
		WebElement viewSaveButton;
		
		public void ClickOnviewSaveButton() {
			waitforElement(viewSaveButton);
			viewSaveButton.click();
		}
		@FindBy(xpath="//option[@value='00B5f000009QhiU']")
		WebElement NewViewName;
		
		public String ValidatingNewViewName()
		{
			waitforElement(NewViewName);
			return NewViewName.getText();
			
		}
		
		//Testcase-27  Line-3
		@FindBy(xpath="//select[@id='hotlist_mode']")
		WebElement RecentlyCreated;
		
		public void ClickOnRecentlyCreated() {
			waitforElement(RecentlyCreated);
			RecentlyCreated.click();
		}
		
		@FindBy(xpath="//h3[normalize-space()='Recent Contacts']")
		WebElement RecentContactsPage;
		
		public String ValidatingRecentContactsPage() {
			waitforElement(RecentContactsPage);
			return RecentContactsPage.getText();
		}
	      
		//Testcase-28 Line-3
		
		@FindBy(xpath="//option[@value='00B5f000004QQEK']")
		WebElement MyContacts;
		
		public void ClickOnMyContacts() {
			waitforElement(MyContacts);
			MyContacts.click();
		}
		@FindBy(xpath="//input[@title='Go!']")
		WebElement GoButton;
		
		public void ClickOnGoButton() {
			waitforElement(GoButton);
			GoButton.click();
		}
		
		@FindBy(xpath="//option[@value='00B5f000004QQEK']")
		WebElement MyContactsPage;
		
		public String validatingMyContactsPage() {
			waitforElement(MyContactsPage);
			return MyContactsPage.getText();
		}
		
		//Testcase-29 Line-3
		
		@FindBy(xpath="//a[normalize-space()='Forbes, Sean']")
		WebElement NameLink;
		
		public void ClickOnContactNameLink() {
			waitforElement(NameLink);
			NameLink.click();
		}  
		
		@FindBy(xpath="//h2[normalize-space()='Mr. Sean Forbes']")
		WebElement ContactName;
		
		public String validatingContactNamePage() {
			waitforElement(ContactName);
			return ContactName.getText();
		}

		//Testcase-30 Line-4
		@FindBy(xpath="//input[@id='devname']")
		WebElement ViewUniqueName;
		
		public String EnterTextInToViewUniqueName(String strViewUniqueName)
		{
			waitforElement(ViewUniqueName);
			ViewUniqueName.clear();
			ViewUniqueName.sendKeys(strViewUniqueName);
			return strViewUniqueName;
			
		}
		//Line-5
		@FindBy(xpath="//div[contains(text(),'You must enter a value')]")
		WebElement ErrorMessage;
		
		public String validatingErrorMessage() {
			waitforElement(ErrorMessage);
			return ErrorMessage.getText();
		}
		
		//Testcase-31 line-5
		
		@FindBy(xpath="//div[@class='pbBottomButtons']//input[@title='Cancel']")
		WebElement CancelButton;
		
		public void ClickOnCancelButton() {
			waitforElement(CancelButton);
			CancelButton.click();
		} 
		//Testcase-32 Line-5
		
		@FindBy(xpath="//td[@id='bottomButtonRow']//input[@title='Save & New']")
		WebElement SaveAndNewButton;
		
		public void ClickOnSaveAndNewButton() {
			waitforElement(SaveAndNewButton);
			SaveAndNewButton.click();
		}
		
		@FindBy(xpath="//h2[@class='pageDescription']")
		WebElement NewContact;
		
		public String validatingNewContact() {
			waitforElement(NewContact);
			return NewContact.getText();
		}
		
}
