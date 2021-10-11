package salesforce.testng.tests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.utilities.CommonUtilities;

import salesforce.testng.pages.HomePage;
import salesforce.testng.pages.LeadsPage;
import salesforce.testng.pages.LoginPage;

public class LeadsTest extends BaseTest {
	WebDriver driver;
	LoginPage loginPage;	
	HomePage homepage;
	LeadsPage leadspage;
	
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
	}
	
	@Test
	//LeadsTab Testcase-20
	public void LeadsTab() throws InterruptedException {
		loginPage.login("klm@123.com", "anumanu@29");
		leadspage.ClickOnLeads();
		String actualvalue = leadspage.validatingLeadsHomePage();
		String expectedvalue = "Home";
		Assert.assertEquals(actualvalue,expectedvalue);
		System.out.println("Leads Homepage is successfully Displayed");
		leadspage.ClickOnLeadsPopUpClose();
		Thread.sleep(2000);
	}
	
	@Test 
	//LeadsSelectView Testcase-21
	public void LeadsSelectView() throws InterruptedException {
		String[] expectedDropDownElements = new String[] {"All Open Leads","My Unread Leads","Recently Viewed Leads","Today's Leads",
				                     "View-Custom-1","View-Custom-2"};
		loginPage.login("klm@123.com", "anumanu@29");
		leadspage.ClickOnLeads();
		String actualvalue = leadspage.validatingLeadsHomePage();
		String expectedvalue = "Home";
		Assert.assertEquals(actualvalue,expectedvalue);
		System.out.println("Leads Homepage is successfully Displayed");
		leadspage.ClickOnLeadsPopUpClose();
		List<WebElement> elements = leadspage.LeadsDropDownList();
		
		for(int i=0; i< elements.size(); i++) {
			WebElement element = elements.get(i);
			Assert.assertEquals(expectedDropDownElements[i], element.getText());
			System.out.println("DropDown List of Elements are:"+elements.get(i).getText());
		}
		
		System.out.println("Testcase Leads DropDown is Completed");
	}
	
	@Test
	//DefaultView Testcase-22
	public void DefaultView() throws InterruptedException {
		loginPage.login("klm@123.com", "anumanu@29");
		leadspage.ClickOnLeads();
		String actualvalue = leadspage.validatingLeadsHomePage();
		String expectedvalue = "Home";
		Assert.assertEquals(actualvalue,expectedvalue);
		System.out.println("Leads Homepage is successfully Displayed");
		leadspage.ClickOnLeadsPopUpClose();
		leadspage.SelectOnDropdownTodaysLead();
//		homepage.clickOnLogout();  //Error
//		Thread.sleep(5000);
//		loginPage.login("klm@123.com", "anumanu@29");
//		leadspage.ClickOnLeads();
//		String actualvalue1= leadspage.validatingLeadsHomePage();
//		String expectedvalue1 = "Home";
//		Assert.assertEquals(actualvalue,expectedvalue);
//		System.out.println("Leads Homepage is successfully Displayed");
		leadspage.ClickOnLeadsViewGoButton();
		String actual = leadspage.ValidatingTodaysLeadsViewPage();
		String expected = "Leads";
		Assert.assertEquals(actual, expected);
		System.out.println("Default view is Todays Leads view was selected during last session");
		
	}
	
	@Test
	//User Logged out and application Closed Testcase-23
	public void UserLoggedandApplicationClosed() throws InterruptedException {
	loginPage.login("klm@123.com", "anumanu@29");
	leadspage.ClickOnLeads();
	String actualvalue = leadspage.validatingLeadsHomePage();
	String expectedvalue = "Home";
	Assert.assertEquals(actualvalue,expectedvalue);
	System.out.println("Leads Homepage is successfully Displayed");
	leadspage.ClickOnLeadsPopUpClose();
	//Line-2
	leadspage.SelectOnDropdownTodaysLead();
	Thread.sleep(5000);
	leadspage.ClickOnLeadsViewGoButton();;
	String actual = leadspage.ValidatingTodaysLeadsViewPage();
	String expected = "Leads";
	Assert.assertEquals(actual, expected);
	System.out.println("Todays Leads view page is Displayed");
	
	}
	
	@Test
	//New Lead Testcase-24
	public void NewLead() throws InterruptedException {
		loginPage.login("klm@123.com", "anumanu@29");
		leadspage.ClickOnLeads();
		String actualvalue = leadspage.validatingLeadsHomePage();
		String expectedvalue = "Home";
		Assert.assertEquals(actualvalue,expectedvalue);
		System.out.println("Leads Homepage is successfully Displayed");
		leadspage.ClickOnLeadsPopUpClose();
		//Line-2
		leadspage.ClickOnNewButton();
		String actual = leadspage.ValidateNewLeadPage();
		String expected = "New Lead";
		Assert.assertEquals(actual, expected);
		System.out.println("Todays Leads view page is Displayed");
		//Line-3
		leadspage.EnterTextInToLastName("ABCD");
		//Line-4
		leadspage.EnterTextInToCompanyName("ABCD");
		//Line-5
		leadspage.ClickOnSaveButton();
		String actualNewLeadPage = leadspage.ValidateABCDLeadPage();
		String expectedNewLeadPage ="ABCD";
		Assert.assertEquals(actualNewLeadPage, expectedNewLeadPage);
		System.out.println("New Lead page ABCD is Opened Successfully");
		
	}
	
	
	   @AfterMethod
		public void Close() throws IOException, InterruptedException
		{
			takescreenshot(driver);
			Thread.sleep(1000);
			driver.close();		
		}

}
