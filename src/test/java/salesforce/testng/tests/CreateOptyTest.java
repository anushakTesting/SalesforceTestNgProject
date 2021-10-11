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

import salesforce.testng.pages.CreateAccountPage;
import salesforce.testng.pages.CreateOptyPage;
import salesforce.testng.pages.HomePage;
import salesforce.testng.pages.LoginPage;

public class CreateOptyTest extends BaseTest {

	WebDriver driver;
	LoginPage loginPage;	
	HomePage homepage;
	CreateAccountPage accountpage;
	CreateOptyPage optypage;
	
	@BeforeMethod
	public void Launchapp() throws IOException {	
		driver = getDriver();
		CommonUtilities common=new CommonUtilities();
		String url=common.getApplicationProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
		homepage = new HomePage(driver);
		optypage = new CreateOptyPage(driver);
	}
	
	@Test
	//Oppurtunities DropDown TestCase-15
	public void OppurtunitiesDropDown() throws InterruptedException {
		
		 String[] expectedDropDownElements = new String[] {"All Opportunities","Closing Next Month","Closing This Month","My Opportunities",
			   "New Last Week","New This Week","Opputurinity Pipeline","Private","Recently Viewed Opportunities","Won"};
		 loginPage.login("klm@123.com", "anumanu@29");
		 loginPage.getUserLabel();
		 Assert.assertNotNull(loginPage.getUserLabel());
		 //Line-2
		 optypage.clickOnOpportunities();
		 String actualoptypage = optypage.VerifyingOpportunitiesHomePage();
		 String expectedoptypage = "Opportunities";
		 Assert.assertEquals(actualoptypage, expectedoptypage);
		 System.out.println("Opportunities home page is opened successfully");
		 optypage.clickOnOpportunitiesPopUpWindow();
		 // Line-3
	     optypage.clickOnOpportunitiesDropDown();
	     Thread.sleep(5000);
		 List<WebElement> elements = optypage.OpportunitiesDropDownList();
			
			for(int i=0; i< elements.size(); i++) {
				WebElement element = elements.get(i);
				Assert.assertEquals(expectedDropDownElements[i], element.getText());
				//System.out.println("DRopDown List of Elements are:"+elements.get(i).getText());
			}
			
			System.out.println("Testcase Oppurtunities DropDown is Completed");
		 
	}
	
	@Test
	//Create a new Opty TestCase-16
	public void CreateANewOpty() throws InterruptedException {
		
		 loginPage.login("klm@123.com", "anumanu@29");
		 loginPage.getUserLabel();
		 Assert.assertNotNull(loginPage.getUserLabel());
		 optypage.clickOnOpportunities();
		 String actualoptypage = optypage.VerifyingOpportunitiesHomePage();
		 String expectedoptypage = "Opportunities";
		 Assert.assertEquals(actualoptypage, expectedoptypage);
		 System.out.println("Opportunities home page is opened successfully");
		 optypage.clickOnOpportunitiesPopUpWindow();
		// Thread.sleep(5000);
		 //Line-3
		 optypage.clickOnNewButton();
		 optypage.EnterInToOpportunityName("Tester");
//		 optypage.clickOnAccountNameLookUp();
//		 driver.switchTo().defaultContent();
//		 optypage.clickOnLookUpNewButton();
//		 optypage.EnterInToAccountName("Tester");
//		 optypage.clickOnLookUpSaveButton();
		 optypage.SelectLeadSourceValue();
		 optypage.SelectCloseDate();
		 optypage.SelectStageValue();
		 optypage.EnterInToProbability(10);
		 Thread.sleep(5000);
		 optypage.ClickOnSaveButton();
		 String actualOpportunitypage = optypage.VerifyingOpportunityPage();
		 String expectedOpportunitypage = "Tester";
		 Assert.assertEquals(actualOpportunitypage, expectedOpportunitypage);
		 System.out.println("New Opportunity page is Displayed Successfulyy");
		 
		 }
	
	@Test
	//Test Oppurtunity Pipeline Report testcase-17
	
	public void Opportunities() throws InterruptedException {
		 loginPage.login("klm@123.com", "anumanu@29");
		 loginPage.getUserLabel();
		 Assert.assertNotNull(loginPage.getUserLabel());
		 optypage.clickOnOpportunities();
		 String actualoptypage = optypage.VerifyingOpportunitiesHomePage();
		 String expectedoptypage = "Opportunities";
		 Assert.assertEquals(actualoptypage, expectedoptypage);
		 System.out.println("Opportunities home page is opened successfully");
		 //Line-3
		 optypage.ClickOnOpportunityPipelineLink();
		 String actualpage = optypage.VerifyingReportsPageUnderOpportunityPipeline();
		 String expectedpage = "Opportunity Pipeline";
		 Assert.assertEquals(actualpage, expectedpage);
		 System.out.println("Reports page under Opportunities pipelined is Displayed");
	}
	
	@Test
	//Test Stuck Oppotunities Report TestCase-18
	public void StuckOpportunities() throws InterruptedException  {
		 loginPage.login("klm@123.com", "anumanu@29");
		 loginPage.getUserLabel();
		 Assert.assertNotNull(loginPage.getUserLabel());
		 optypage.clickOnOpportunities();
		 String actualoptypage = optypage.VerifyingOpportunitiesHomePage();
		 String expectedoptypage = "Opportunities";
		 Assert.assertEquals(actualoptypage, expectedoptypage);
		 optypage.clickOnOpportunitiesPopUpWindow();
		 System.out.println("Opportunities home page is opened successfully ");
		 //Line-3
		 optypage.ClickOnStuckOpportunitiesLink();
         String actualpage = optypage.VerifyingStuckOpportunitiesReportpage();
		 String expectedpage = "Stuck Opportunities";
		 Assert.assertEquals(actualpage, expectedpage);
		 System.out.println("Reports page under Opportunities that are Stuck is Displayed");
	}
	
	@Test
	//Test Quarterly Summary Report Testcase-19
	public void QuarterlySummaryReport() throws InterruptedException  {
		 loginPage.login("klm@123.com", "anumanu@29");
		 loginPage.getUserLabel();
		 Assert.assertNotNull(loginPage.getUserLabel());
		 optypage.clickOnOpportunities();
		 String actualoptypage = optypage.VerifyingOpportunitiesHomePage();
		 String expectedoptypage = "Opportunities";
		 Assert.assertEquals(actualoptypage, expectedoptypage);
		 optypage.clickOnOpportunitiesPopUpWindow();
		 System.out.println("Opportunities home page is opened successfully ");
		 //Line-3
		 optypage.SelectQuarterlyReportInterval1();
		 optypage.SelectQuarterlyReportInclude1();
		 optypage.ClickOnRunReport();
//		 optypage.clickOnOpportunities();
//		 optypage.clickOnOpportunitiesPopUpWindow();
//		 optypage.SelectQuarterlyReportInterval2();
//		 optypage.SelectQuarterlyReportInclude2();
//		 optypage.ClickOnRunReport();
//		 
//		 optypage.SelectQuarterlyReportInterval3();
//		 optypage.SelectQuarterlyReportInclude3();
//		 optypage.ClickOnRunReport();
		 String actualpage = optypage.VerifyingRunReportOpportunitypage();;
		 String expectedpage = "Opportunity Report";
		 Assert.assertEquals(actualpage, expectedpage);
		 System.out.println("Reports page with Opportunities satifies the search criteria is Displayed");
		 
		 
	}
	
	
	
	
	
	 @AfterMethod
		public void Close() throws IOException, InterruptedException
		{
			takescreenshot(driver);
			Thread.sleep(1000);
			driver.close();		
		}
	
}
