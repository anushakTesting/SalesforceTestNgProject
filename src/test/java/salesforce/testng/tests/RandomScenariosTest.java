package salesforce.testng.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.utilities.CommonUtilities;

import salesforce.testng.pages.CreateOptyPage;
import salesforce.testng.pages.HomePage;
import salesforce.testng.pages.LoginPage;
import salesforce.testng.pages.RandomScenariosPage;

public class RandomScenariosTest extends BaseTest {
	
	WebDriver driver;
	LoginPage loginPage;	
	HomePage homepage;
	CreateOptyPage optypage;
	RandomScenariosPage randomscenariospage;
	
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
		randomscenariospage = new RandomScenariosPage(driver);
	}
	
	@Test
	//Verify the firstname and lastname of the logged in username Testcase-33
	public void VerifyingLoggedUsername() {
		loginPage.login("klm@123.com", "anumanu@29");
		Assert.assertNotNull(loginPage.getUserLabel());
		//Line-2
		randomscenariospage.ClickOnHomeTab();
		String actual = randomscenariospage.ValidatingUserAccountName();
		String expected = "Sai New Last";
		Assert.assertEquals(actual, expected);
		randomscenariospage.clickOnRandonScenariosPopUpWindow();
		System.out.println("First and Lastname of the User Account is valid in Home page");
		//Line-3
		randomscenariospage.ClickOnUserNameLink();
		String actualpage = randomscenariospage.ValidatingProfilePage();
		String expectedpage = "Sai New Last ";
		Assert.assertEquals(actualpage, expectedpage);
		System.out.println("UserProfilepage is same as like My Profile Page");
	}
	
	@Test
	//Verify teh Edited LastNAme is Updated or Not
	public void VerifyingEditedLastName() {
		String newLastName = "Abcd";
		loginPage.login("klm@123.com", "anumanu@29");
		Assert.assertNotNull(loginPage.getUserLabel());
		//Line-2
		randomscenariospage.ClickOnHomeTab();
		String actual = randomscenariospage.ValidatingUserAccountName();
		String expected = "Sai Abcd";
		Assert.assertEquals(actual, expected);
	    optypage.clickOnOpportunitiesPopUpWindow();
		System.out.println("First and Lastname of the User Account is valid in Home page");
		//Line-3
		randomscenariospage.ClickOnUserNameLink();
		String actualpage = randomscenariospage.ValidatingProfilePage();
		String expectedpage = "Sai Abcd ";
		Assert.assertEquals(actualpage, expectedpage);
		System.out.println("UserProfilepage is Displayed");
		homepage.clickOnEditProfile();
		String actualValue=homepage.editProfilePage();
		String expectedValue="Edit Profile";
		Assert.assertEquals(actualValue, expectedValue);
		driver.switchTo().frame(homepage.getIframeId());
		System.out.println("Edit page id opened with contact tab is selected");
		//Line-4
		homepage.clickOnAboutTab();
		homepage.clearLastName();
		homepage.enterIntoLastName(newLastName);
		homepage.clickOnSaveAll();
		String actualLastName=homepage.getUserText();
		String expectedLastName="Sai Abcd  ";
		Assert.assertEquals(actualLastName, expectedLastName);
		System.out.println("User Lastname is changed Successfully");
	}
	
	@AfterMethod
	public void Close() throws IOException, InterruptedException
	{
		takescreenshot(driver);
		Thread.sleep(1000);
        driver.close();		
	}

}
