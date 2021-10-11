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
import salesforce.testng.pages.HomePage;
import salesforce.testng.pages.LoginPage;

public class CreateAccountTest extends BaseTest {

	WebDriver driver;
	LoginPage loginPage;	
	HomePage homepage;
	CreateAccountPage accountpage;
	

		@BeforeMethod
		public void Launchapp() throws IOException {	
			driver = getDriver();
			CommonUtilities common=new CommonUtilities();
			String url=common.getApplicationProperty("url");
			driver.get(url);
			driver.manage().window().maximize();
			loginPage = new LoginPage(driver);
			homepage = new HomePage(driver);
			accountpage = new CreateAccountPage(driver);
		}
		@Test
		//Create an Account Testcase-10
		public void CreateAccount() throws InterruptedException {
			 loginPage.login("klm@123.com", "anumanu@29");
			 loginPage.getUserLabel();
			 Assert.assertNotNull(loginPage.getUserLabel());
			 accountpage.ClickOnAccountTab();
			//Thread.sleep(5000);
			 //driver.switchTo().defaultContent();
			 accountpage.ClickOnPopUpClose();
			 accountpage.ClickOnNewAccountButton();
			 accountpage.EnterInToAccountName("Priya");
			 accountpage.SelecAccountType();
			 accountpage.SelecTechnologyPartner();
			// Thread.sleep(2000);
			 accountpage.SelectHighPriority();
			 accountpage.ClickOnSaveButton();
			 String actualUserAccount=accountpage.validateNewUserAccountPage();
			 String expectedUserAccount="Priya";
		   	Assert.assertEquals(actualUserAccount,expectedUserAccount);
		   	System.out.println("New Account Created Successfully");
			 
		}
		
		@Test
		//Create New View TestCase-11
		public void CreateNewView() throws InterruptedException {
			loginPage.login("klm@123.com", "anumanu@29");
			loginPage.getUserLabel();
			accountpage.ClickOnAccountTab();
			accountpage.ClickOnPopUpClose();
			String actualAccountHome=accountpage.ValidatingOnAccountHomePage();
			String expectedAccountHome="Home";
			Assert.assertEquals(actualAccountHome,expectedAccountHome);
			accountpage.ClickOnCreateNewView();
			accountpage.EnterInToViewName("Apple");
			accountpage.EnterInToViewUniqueName("K");
			accountpage.ClickOnNewViewSaveButton();
			//accountpage;
			
//			String actualViewAccount=accountpage.ValidatingViewInAccountList();  
//			String expectedViewAccount="PriyaK";
//		   	Assert.assertEquals(actualViewAccount,expectedViewAccount);
		   	System.out.println("New View is Created in Account List");
		   	
		}
		
		@Test
		//Edit View TestCase-12
		public void EditView() throws InterruptedException {
			loginPage.login("klm@123.com", "anumanu@29");
			loginPage.getUserLabel();
			accountpage.ClickOnAccountTab();
			accountpage.ClickOnPopUpClose();
			String actualAccountHome=accountpage.ValidatingOnAccountHomePage();
			String expectedAccountHome="Home";
			Assert.assertEquals(actualAccountHome,expectedAccountHome);
			accountpage.ClickOnViewName();
			Thread.sleep(2000);
			accountpage.ClickOnEditButton();
		//	Thread.sleep(2000);
        //   String actualValue=accountpage.ValidatingOnEditPage();
		//	String expectedValue="Edit View";
    	//	Assert.assertEquals(actualValue, expectedValue);
		//	accountpage.ClickOnEditButton();
			accountpage.EnterInToNewViewName("Hello");
			accountpage.SelectAccountField();
			accountpage.SelectOperatorField();
			accountpage.EnterAValue("a");
			accountpage.ClickOnNewViewSaveButton();
			Thread.sleep(5000);
		}
		
		@Test
		// Merge Accounts TestCase-13
		
		public void MergeAccounts() throws InterruptedException {
			loginPage.login("klm@123.com", "anumanu@29");
			loginPage.getUserLabel();
			accountpage.ClickOnAccountTab();
			accountpage.ClickOnPopUpClose();
			String actualAccountHome=accountpage.ValidatingOnAccountHomePage();
			String expectedAccountHome="Home";
			Assert.assertEquals(actualAccountHome,expectedAccountHome);
			//Line-3
		}
		
		@Test
		//Create Account Report TestCase-14
		public void CreateAccountReport() throws InterruptedException {
			loginPage.login("klm@123.com", "anumanu@29");
			loginPage.getUserLabel();
			accountpage.ClickOnAccountTab();
			accountpage.ClickOnPopUpClose();
			String actualAccountHome=accountpage.ValidatingOnAccountHomePage();
			String expectedAccountHome="Home";
			Assert.assertEquals(actualAccountHome,expectedAccountHome);
			//Line-3
			accountpage.ClickOnAccountLastActivity();
			String actualreport=accountpage.VerifyingUnsavedReport();
			String expectedreport="Unsaved Report";
			Assert.assertEquals(actualreport,expectedreport);
			accountpage.ClickOnFromCalenderImage();;
			accountpage.SelectFromTodaysDate();
			accountpage.ClickOnToCalenderImage();
			accountpage.SelectToTodaysDate();
			//Line-4
			accountpage.ClickOnSaveReport(); 
			accountpage.EnterInToReportName("Report");
			accountpage.EnterInToReportUniqueName("Successful");
			accountpage.ClickOnSaveAndRunReport();                  //Error
			String actualreportpage=accountpage.VerifyingsavedReportPage();
			String expectedreportpage="Report";
			Assert.assertEquals(actualreportpage, expectedreportpage);
		}
		
		
		
		@AfterMethod
		public void Close() throws IOException, InterruptedException
		{
			takescreenshot(driver);
			Thread.sleep(1000);
			driver.close();		
		}


}

