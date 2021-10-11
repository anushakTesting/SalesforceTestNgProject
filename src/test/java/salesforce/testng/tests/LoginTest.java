package salesforce.testng.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.utilities.CommonUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import salesforce.testng.pages.ForgotPasswordPage;
import salesforce.testng.pages.HomePage;
import salesforce.testng.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	WebDriver driver;
	LoginPage loginPage;	
	HomePage homepage;
	ForgotPasswordPage forgotpasswordPage;
	
	@BeforeMethod
	public void Launchapp() throws IOException {	
		driver = getDriver();
		CommonUtilities common=new CommonUtilities();
		String url=common.getApplicationProperty("url");
		driver.get(url);
		driver.manage().window().maximize();
		loginPage = new LoginPage(driver);
		homepage = new HomePage(driver);
		forgotpasswordPage = new ForgotPasswordPage(driver);
	}
	
	@Test
	// Login Error Message - 1
	public void Login_EmptyPassword_FailsWithErrorMessage()
	{
//		loginPage.enterIntoUsername("klm@123.com");
//		loginPage.enterIntoPassword("");
//		loginPage.clickLoginButton();
		loginPage.login("klm@123.com", "");
		String actual = loginPage.getLoginErrorMessage();
		Assert.assertEquals(actual, "Please enter your password.");
		
	}
	@Test
	// Login to SalesForce Homepage - Testcase 2
	public void Login_ValidUsername_ValidPassword_HomePage() {
		
//		loginPage.enterIntoUsername("klm@123.com");
//		loginPage.enterIntoPassword("anumanu@29");
//		loginPage.clickLoginButton();
		loginPage.login("klm@123.com", "anumanu@29");
		Assert.assertNotNull(loginPage.getUserLabel()); //Verifying the user successfully logged in or not reffer with user name
	}
	
	@Test
	// Check Remember Me - Testcase -3
	public void LoginPage_RememberMe_ValidUsername_Password() {
		loginPage.enterIntoUsername("klm@123.com");
		loginPage.enterIntoPassword("anumanu@29");
		loginPage.rememberMe();
		loginPage.clickLoginButton();
		homepage.clickOnUserNavigate();
		homepage.clickOnLogout();
		//loginPage.getUsername();
		String actualValue=loginPage.getUsername();
		String expectedValue="klm@123.com";
		Assert.assertEquals(actualValue, expectedValue);		
	}
	
	@Test
	//Forgot Password - Testcase 4A
	public void ForgotPassword() {
		loginPage.clickonforgotPassword();
		forgotpasswordPage.enterIntoUsername("klm@123.com");
		forgotpasswordPage.clickOnContinueButton();
		String actualValue=forgotpasswordPage.checkYourEmail();
		String expectedValue="Check Your Email";
		Assert.assertEquals(actualValue, expectedValue);	
		
	}
	@Test
	//Invalid Credentials -Testcase 4B
     public void Login_InValidUsername_InValidPassword_DisplaysErrorMessage() {
		
//		loginPage.enterIntoUsername("123");
//		loginPage.enterIntoPassword("22131");
//		loginPage.clickLoginButton();
		loginPage.login("123", "22131");
		loginPage.displaysErrorMessage();
		String actualValue=loginPage.displaysErrorMessage();
		String expectedValue="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(actualValue, expectedValue);
	}
	
	
	@AfterMethod
	public void Close() throws IOException, InterruptedException
	{
		takescreenshot(driver);
		Thread.sleep(1000);
		driver.close();		
	}	
	
}
