package salesforce.testng.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.utilities.CommonUtilities;

import salesforce.testng.pages.ContactsPage;
import salesforce.testng.pages.HomePage;
import salesforce.testng.pages.LeadsPage;
import salesforce.testng.pages.LoginPage;

public class ContactsTest extends BaseTest{
	
	WebDriver driver;
	LoginPage loginPage;	
	HomePage homepage;
	LeadsPage leadspage;
	ContactsPage contactspage;
	
	
	@BeforeMethod
	public void Launchapp() throws IOException {	
		driver = getDriver();
		CommonUtilities common=new CommonUtilities();
		String url=common.getApplicationProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
		homepage = new HomePage(driver);
		leadspage = new LeadsPage(driver);
		contactspage = new ContactsPage(driver);
	}
	
	@Test
	//Create New Account Testcase-25
	public void CreateAccount() {
		loginPage.login("klm@123.com", "anumanu@29");
		Assert.assertNotNull(loginPage.getUserLabel());
		//Line-2
		contactspage.ClickOnContactsTab();
		contactspage.ClickOnContactsPopUpWindow();
		String actual = contactspage.validatingContactsHomePage();
		String expected = "Home";
		Assert.assertEquals(actual, expected);
		System.out.println("Contacts Homepage is Displayed");
		//Line-3
		contactspage.ClickOnNewButton();
		String actualvalue = contactspage.validatingNewContactsPage();
		String expectedvalue = "New Contact";
		Assert.assertEquals(actualvalue, expectedvalue);
		System.out.println("New Contacts page is Displayed");
		//Line-4
		contactspage.EnterTextInToLastName("Anu");
		//Line-5
		contactspage.EnterTextInToAccountName("Testing");
		contactspage.ClickOnSaveButton();
		String actualaccountpage = contactspage.validatingNewAccount();
		String expectedaccountpage = "AnuTesting";
		Assert.assertEquals(actualaccountpage, expectedaccountpage);
		System.out.println("New Account page is displayed with New Account name");
		
	}
	
	@Test
	//Create new view in contact page Testcase-26
	  public void CreatNewViewContactPage() {
		loginPage.login("klm@123.com", "anumanu@29");
		Assert.assertNotNull(loginPage.getUserLabel());
		//Line-2
		contactspage.ClickOnContactsTab();
		contactspage.ClickOnContactsPopUpWindow();
		String actual = contactspage.validatingContactsHomePage();
		String expected = "Home";
		Assert.assertEquals(actual, expected);
		System.out.println("Contacts Homepage is Displayed");
		//Line-3
		contactspage.ClickOnCreateNewView();
		String actualpage = contactspage.validatingNewViewPage();
		String expectedpage = "Create New View";
		Assert.assertEquals(actualpage,expectedpage);
		System.out.println("Contacts New view page is Displayed");
		//Line-4
		contactspage.EnterTextInToViewName("Apple");
		//contactspage.EnterTextInToViewUniqueName("Apple");
		contactspage.ClickOnviewSaveButton();
		System.out.println("Contacts New view page is Displayed in the Dropdown");
		
	}
	
	@Test
	//Check recently created contact in the contact page testcase-27
	 public void RecentlyCreatedContactPage() {
		loginPage.login("klm@123.com", "anumanu@29");
		Assert.assertNotNull(loginPage.getUserLabel());
		//Line-2
		contactspage.ClickOnContactsTab();
		contactspage.ClickOnContactsPopUpWindow();
		String actual = contactspage.validatingContactsHomePage();
		String expected = "Home";
		Assert.assertEquals(actual, expected);
		System.out.println("Contacts Homepage is Displayed");
		//Line-3
		contactspage.ClickOnRecentlyCreated();
		String actualvalue = contactspage.ValidatingRecentContactsPage();
		String expectedvalue = "Recent Contacts";
		Assert.assertEquals(actualvalue, expectedvalue);
		System.out.println("Displayed Recent Contacts Page");
	}
	
	@Test
	//Check My Contacts View in the Contact page Testcase-28
	public void MyContactsView() {
		loginPage.login("klm@123.com", "anumanu@29");
		Assert.assertNotNull(loginPage.getUserLabel());
		//Line-2
		contactspage.ClickOnContactsTab();
		contactspage.ClickOnContactsPopUpWindow();
		String actual = contactspage.validatingContactsHomePage();
		String expected = "Home";
		Assert.assertEquals(actual, expected);
		System.out.println("Contacts Homepage is Displayed");
		//Line-3
		contactspage.ClickOnMyContacts();
		contactspage.ClickOnGoButton();
		String actualvalue = contactspage.validatingMyContactsPage();
		String expectedvalue = "My Contacts";
		Assert.assertEquals(actualvalue, expectedvalue);
		System.out.println("Displayed My Contacts Page");
		
	}
	
	@Test
	//View a contact in the contact page Testcase-29
	public void Contactname() {
	loginPage.login("klm@123.com", "anumanu@29");
	Assert.assertNotNull(loginPage.getUserLabel());
	//Line-2
	contactspage.ClickOnContactsTab();
	contactspage.ClickOnContactsPopUpWindow();
	String actual = contactspage.validatingContactsHomePage();
	String expected = "Home";
	Assert.assertEquals(actual, expected);
	System.out.println("Contacts Homepage is Displayed");
	//Line-3
	contactspage.ClickOnContactNameLink();
	String actualpage = contactspage.validatingContactNamePage();
	String expectedpage = "Mr. Sean Forbes";
	Assert.assertEquals(actualpage, expectedpage);
	System.out.println("Displayed Mr. Sean Forbes Contacts Page");
	
	}
	
	@Test
	//Checking the error message in new view in contacts Testcase-30
	public void ErrorMessageInContactNewViewPage() {
		loginPage.login("klm@123.com", "anumanu@29");
		Assert.assertNotNull(loginPage.getUserLabel());
		//Line-2
		contactspage.ClickOnContactsTab();
		contactspage.ClickOnContactsPopUpWindow();
		String actual = contactspage.validatingContactsHomePage();
		String expected = "Home";
		Assert.assertEquals(actual, expected);
		System.out.println("Contacts Homepage is Displayed");
		//Line-3
		contactspage.ClickOnCreateNewView();
		String actualpage = contactspage.validatingNewViewPage();
		String expectedpage = "Create New View";
		Assert.assertEquals(actualpage,expectedpage);
		System.out.println("Contacts New view page is Displayed");
		//Line-4
		contactspage.EnterTextInToViewUniqueName("EFGH");
		contactspage.ClickOnviewSaveButton();
		String actualvalue = contactspage.validatingErrorMessage();
		String expectedvalue = "Error: You must enter a value";
		Assert.assertEquals(actualvalue, expectedvalue);
		System.out.println("Error Message is displayed on contacts new view page");
		
		}
	
	@Test
	//Check the Button works fine in Creaye New View Testcase-31
	public void CreateNewViewButtonWorks() {
		loginPage.login("klm@123.com", "anumanu@29");
		Assert.assertNotNull(loginPage.getUserLabel());
		//Line-2
		contactspage.ClickOnContactsTab();
		contactspage.ClickOnContactsPopUpWindow();
		String actual = contactspage.validatingContactsHomePage();
		String expected = "Home";
		Assert.assertEquals(actual, expected);
		System.out.println("Contacts Homepage is Displayed");
		//Line-3
		contactspage.ClickOnCreateNewView();
		String actualpage = contactspage.validatingNewViewPage();
		String expectedpage = "Create New View";
		Assert.assertEquals(actualpage,expectedpage);
		System.out.println("Contacts New view page is Displayed");
		//Line-4
		contactspage.EnterTextInToViewName("ABCD");
		contactspage.EnterTextInToViewUniqueName("EFGH");
		contactspage.ClickOnCancelButton();
		String actualvalue = contactspage.validatingContactsHomePage();
		String expectedvalue = "Home";
		Assert.assertEquals(actualvalue, expectedvalue);
		System.out.println("Contacts Homepage is Displayed without saving any New Names");
		
	}
	
	@Test
	//Check the Save and New Buttons works in New contact page Testcase-32
	public void SaveAndNewButtonWorks() {
		loginPage.login("klm@123.com", "anumanu@29");
		Assert.assertNotNull(loginPage.getUserLabel());
		//Line-2
		contactspage.ClickOnContactsTab();
		contactspage.ClickOnContactsPopUpWindow();
		String actual = contactspage.validatingContactsHomePage();
		String expected = "Home";
		Assert.assertEquals(actual, expected);
		System.out.println("Contacts Homepage is Displayed");
		//Line-3
		contactspage.ClickOnNewButton();
		String actualvalue = contactspage.validatingNewContactsPage();
		String expectedvalue = "New Contact";
		Assert.assertEquals(actualvalue, expectedvalue);
		System.out.println("New Contacts page is Displayed");
		//Line-4
		contactspage.EnterTextInToLastName("Anu");
		contactspage.EnterTextInToAccountName("GlobalMedia");
		contactspage.ClickOnSaveAndNewButton();
		String actualcontactedit = contactspage.validatingNewContact();
		String expectedcontactedit ="New Contact";
		Assert.assertEquals(actualcontactedit, expectedcontactedit);
		System.out.println("Contact Edit:New Contact page is Displayed");
	}
	
	@AfterMethod
	public void Close() throws IOException, InterruptedException
	{
		takescreenshot(driver);
		Thread.sleep(1000);
        driver.close();		
	}


	

	

}
