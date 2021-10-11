package salesforce.testng.tests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.utilities.CommonUtilities;

import salesforce.testng.pages.HomePage;
import salesforce.testng.pages.LoginPage;

public class HomeTest extends BaseTest{
	WebDriver driver;
	LoginPage loginPage;	
	HomePage homepage;
	
	@BeforeMethod
	public void Launchapp() throws IOException {	
		driver = getDriver();
		CommonUtilities common=new CommonUtilities();
		String url=common.getApplicationProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
		homepage = new HomePage(driver);
	}
	@Test
	//Testcase-5 UserMenu
	public void UserMenu_DropDown() throws InterruptedException {
		String[] expectedUserNavElements = new String[] { "My Profile", "My Settings", "Developer Console", "Switch to Lightning Experience", "Logout"};
		loginPage.login("klm@123.com", "anumanu@29");
		loginPage.getUserLabel();
		homepage.clickOnUserNavigate();
		List<WebElement> elements = homepage.GetMenuItems();
		
		for(int i=0; i< elements.size(); i++) {
			WebElement element = elements.get(i);
			Assert.assertEquals(expectedUserNavElements[i], element.getText());
		}
		Thread.sleep(5000);
	}


     @Test
       //Testcase-6 MyProfile
		public void MyProfile() throws InterruptedException {
    	 
			String newLastName = "New Last";
			loginPage.login("klm@123.com", "anumanu@29");
			loginPage.getUserLabel();
			homepage.clickOnUserNavigate();
			homepage.clickOnMyProfile();

			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			homepage.clickOnEditProfile();
			String actualValue=homepage.editProfilePage();
			String expectedValue="Edit Profile";
			Assert.assertEquals(actualValue, expectedValue);
			driver.switchTo().frame(homepage.getIframeId());
			homepage.clickOnAboutTab();
			homepage.clearLastName();
			homepage.enterIntoLastName(newLastName);
			homepage.clickOnSaveAll();
			String actualLastName=homepage.getUserText();
			String expectedLastName="Sai New Last";
			Assert.assertEquals(actualLastName, expectedLastName);	
		
			//Click on post
			
			homepage.clickOnPost();
			driver.switchTo().frame(homepage.postTextIFrame());
			homepage.enterIntopostText("Hello Everyone");
			driver.switchTo().defaultContent();
			homepage.clickOnShareButton();
			String actualText=homepage.validateEneterdPostText();
			String expectedText="Hello Everyone";
			Assert.assertEquals(actualText, expectedText);
			// click on FileLink and upload choose a file from computer
            //driver.switchTo().defaultContent();
			Thread.sleep(5000);
			homepage.clickOnTheFile();

			Thread.sleep(5000);
			homepage.clickOnUploadAFileFromComputer();
			Thread.sleep(5000);
			//driver.switchTo().defaultContent();
     		homepage.clickOnChooseFile("C:\\Test\\ReadExcel.xls");
     		homepage.clickShareFile();
     		String actualFileText=homepage.validateEneterdFileText();
			String expectedFileText="ReadExcel";
			Assert.assertEquals(actualFileText, expectedFileText);
     		
     		//Click on Add photo
     	//	homepage.mouseHoverOnPhoto();
     		homepage.clickOnAddPhoto();
     		Thread.sleep(5000);
//     		homepage.fileTextIFrame();
//     		homepage.chooseFilePhoto("C:\\Users\\anush\\OneDrive\\Desktop\\Bunny.png");
//     		homepage.clickOnSavePhoto();
			
		}
     
     @Test
     //My Settings Testcase-7
     
     public void MySettings() throws InterruptedException {
			loginPage.login("klm@123.com", "anumanu@29");
			loginPage.getUserLabel();
			homepage.clickOnUserNavigate();
			homepage.clickOnMySettings();
			Thread.sleep(5000);
			String actualmysettingspage=homepage.ValidateMySettingsPage();
			String expectedmysettingspage="My Settings";
			Assert.assertEquals(actualmysettingspage, expectedmysettingspage);
			//Calenders And Reminders
			homepage.ClickOnCalendarsAndReaminders();
			homepage.ClickOnActivityRemainders();
			homepage.ClickOnOpensaTestReminder();

			// Perform the click operation that opens new window

			// Switch to new window opened
//			for(String winHandle : driver.getWindowHandles()){
//			    driver.switchTo().window(winHandle);
//
//				WebElement actualvalue=homepage.ValidateSamplePopUpWindowDisplayed();
//				Assert.assertNotNull(actualvalue);
//			}
     }
     
     @Test
     //Developers Console  TestCase-8
     public void DevelopersConsole() throws InterruptedException {
    	loginPage.login("klm@123.com", "anumanu@29");
		loginPage.getUserLabel();
		homepage.clickOnUserNavigate();
		homepage.ClickOnDevelopersConsole();
			
     }
     
     @Test
     //Logout Testcase-9
     public void Logout() throws InterruptedException {
		loginPage.login("klm@123.com", "anumanu@29");
		loginPage.getUserLabel();
		homepage.clickOnUserNavigate();
		homepage.clickOnLogout();
		String actual = homepage.LoginButtonText();
		String expectedvalueloginpage="Log In";
		Assert.assertEquals(actual, expectedvalueloginpage);
     }
     

     @AfterMethod
	public void Close() throws IOException, InterruptedException
	{
		takescreenshot(driver);
		Thread.sleep(1000);
		driver.close();		
	}
}




