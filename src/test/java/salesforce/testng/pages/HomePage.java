package salesforce.testng.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//div[@id='userNav']")
	WebElement userNavigate;
	
	@FindBy(xpath="//div[@id='userNav-menuItems']")
	WebElement userNavMenuItems;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;
	
	@FindBy(xpath="//a[@title='My Profile']")
	WebElement MyProfile;
	
	@FindBy(xpath="(//a[@class='contactInfoLaunch editLink'])[1]")
	WebElement EditProfileIcon;
	
	@FindBy(xpath="//h2[@id='contactInfoTitle']")
	WebElement EditProfilePage;
	
	@FindBy(xpath="//a[normalize-space()='About']")
	WebElement AboutTab;
	
	@FindBy(xpath="//input[@name='lastName']")
	public
	WebElement LastName;
	
	@FindBy(xpath="//input[@value='Save All']")
	WebElement SaveAll;
	
	@FindBy(xpath="//iframe[@id='contactInfoContentId']")
	WebElement iFrame;
	
	@FindBy(xpath="(//a[@id='publisherAttachTextPost'])[1]")
	WebElement post;
	
	//span[contains(@class,'publisherattachtext')][contains(text(),'File')]
	//iframe[contains(@title,'Rich Text Editor, publisherRichTextEditor')]

	@FindBy(xpath="//iframe[@title='Rich Text Editor, publisherRichTextEditor']")
	WebElement postTextIframe;

	@FindBy(xpath=("//html[1]/body[1]"))
	WebElement postText;
	
	@FindBy(xpath=("//input[@id='publishersharebutton']"))
	WebElement shareButton;
	
	@FindBy(xpath="//span/p")
	WebElement sharedPostMessage;
	
	@FindBy(xpath="//a[@id='publisherAttachContentPost']")  //span[@class='publisherattachtext']
	WebElement fileClick;
	
	@FindBy(xpath="//a[normalize-space()='Upload a file from your computer']")  //td[@id='chatterUploadFileActionPanel']
	WebElement uploadAFileFromComputer;
	
	@FindBy(xpath="//input[@id='chatterFile']") 
	WebElement chooseFile;
	
	@FindBy(xpath="//input[@id='publishersharebutton']")
	WebElement ShareFileButton;
	
	@FindBy(xpath="//span[@class='contentTitleLink']")
	WebElement sharedFileMessage;
	
	//@FindBy(xpath="//span[@id='displayBadge']")
	//WebElement mouseHoverOnAddPhoto;

	@FindBy(xpath="//a[normalize-space()='Add Photo']")
	WebElement addPhoto;
	
	@FindBy(xpath="//iframe[@id='uploadPhotoContentId']")
	WebElement fileTextIFrame;
	
	@FindBy(xpath="//input[@class='fileInput']")
	WebElement choosePhoto;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement savePhoto;
	
	//TestCase-7 My Settings
	
	@FindBy(xpath="//a[@title='My Settings']")
	WebElement MySettings;
	
	@FindBy(xpath="//span[normalize-space()='My Settings']")
	WebElement MySettingsValidatePage;
	
	@FindBy(xpath="//span[@id='PersonalInfo_font']")
	WebElement Personal;
	
	@FindBy(xpath="//span[@id='LoginHistory_font']")
	WebElement LoginHistory;
	
	@FindBy(xpath="//a[contains(text(),'Download login history for last six months, includ')]")
	WebElement DownloadLoginHistory;
	
	@FindBy(xpath="//span[@id='DisplayAndLayout_font']")
	WebElement DisplayAndLayout;
	
	@FindBy(xpath="//span[@id='CustomizeTabs_font']")
	WebElement CustomizeMyTabs;
	
	@FindBy(xpath="//select[@id='p4']")
	WebElement CustomApp;
	
	@FindBy(xpath="//option[@value='02u5f000001DojQ']")
	WebElement SalesforceChatter;
	
	@FindBy(xpath="//option[@value='report']")
	WebElement ReportsInAvailableTabs;
	
	@FindBy(xpath="//img[@title='Add']")
	WebElement Add;
	
	@FindBy(xpath="//option[@value='report']")
	WebElement ReportsInSelectedTabs;
	
	@FindBy(xpath="//input[@title='Save']")
	WebElement SaveButton;
	
	@FindBy(xpath="//a[@id='zen-moreTabsAssistiveLink']//b")
	WebElement SalesforceLink;
	
	@FindBy(xpath="//a[normalize-space()='Reports']")
	WebElement CheckforReports;
	//Email
	@FindBy(xpath="//span[@id='EmailSetup_font']")
	WebElement Email;
	
	@FindBy(xpath="//a[@id='EmailSettings_font']")
	WebElement EmailSettings;
	
	@FindBy(xpath="//input[@id='sender_name']")
	WebElement EmailName;
	
	@FindBy(xpath="//input[@id='sender_email']")
	WebElement EmailAddress;
	
	@FindBy(xpath="//input[@id='auto_bcc1']")
	WebElement AutomaticBccButton;
	
	@FindBy(xpath="//input[@title='Save']")
	WebElement EmailSaveButton;
	//Calender And Reminders
	@FindBy(xpath="//span[@class='folderIcon CalendarAndReminders_icon']")
	WebElement CalendersAndRemainders;
	
	@FindBy(xpath="//a[@id='Reminders_font']")
	WebElement ActivityRemainders ;
	
	@FindBy(xpath="//input[@id='testbtn']")
	WebElement OpensaTestReminder ;
	
	@FindBy(xpath="//div[@id='summary']")
	WebElement SampleEventPopUpWindow;
	
	//DevelopersConsole Testcase-8
	
	@FindBy(xpath="//html")
	WebElement DevelopersConsole;
	
//	@FindBy(xpath="//div[@id='toolbar-1043']")
//	WebElement ValidatingDevelopersConsole;
	
	//Logout Tc-9
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement Logout;
	
	@FindBy(xpath="//input[@id='Login']")
	WebElement LoginButton;
	
	
	
	public void clickOnLogout() {
		waitforElement(logout);
		logout.click();	
		
	}
	
	public void clickOnUserNavigate() {
		waitforElement(userNavigate);
		userNavigate.click();
		
	}
	
	public List<WebElement> GetMenuItems() {
		return userNavMenuItems.findElements(By.xpath("./child::*"));
	}
	public void clickOnMyProfile() { //TC6
		waitforElement(MyProfile);
		MyProfile.click();
	}
	
	public void clickOnEditProfile() { //TC6
		waitforElement(EditProfileIcon);
		EditProfileIcon.click();
	}
	
	public String editProfilePage () { //TC6
		waitforElement(EditProfilePage);
	    return EditProfilePage.getText();
	}
	
	public void clickOnAboutTab() {
		waitforElement(AboutTab);
		AboutTab.click();
	}
	public String enterIntoLastName(String strlastName) {
		 LastName.sendKeys(strlastName);
         return strlastName;
	}
	
	public void clearLastName() {
		 LastName.clear();
	}
	
	public void clickOnSaveAll() {
		waitforElement(SaveAll);
		SaveAll.click();
	}
	
	public String getIframeId() {
         return iFrame.getAttribute("id");
		
	}
	
	public String getUserText() { //checking for the user lastname changed or not
		waitforElement(userNavigate);
		return userNavigate.getText();
	}
	
	public void clickOnPost() {
		waitforElement(post);
		post.click();
	}
	
	public String enterIntopostText(String strpostText) {
		waitforElement(postText);
		 postText.sendKeys(strpostText);
         return strpostText;
	}
	
	public void clickOnShareButton() {
		waitforElement(shareButton);
		shareButton.click();
	}
	
	public WebElement postTextIFrame() {
		return postTextIframe;
	}
	
	public String validateEneterdPostText() {
		waitforElement(sharedPostMessage);
		return sharedPostMessage.getText();
		
	}
	public void clickOnTheFile() {
		waitforElement(fileClick);
		fileClick.click();
	}
	
	public void clickOnUploadAFileFromComputer() {
		waitforElement(uploadAFileFromComputer);
		uploadAFileFromComputer.click();
	}

	public void clickOnChooseFile(String path) {
		waitforElement(chooseFile);
		chooseFile.sendKeys(path);
		//chooseFile.click();
	}
	
	public void clickShareFile() {
		waitforElement(ShareFileButton);
		ShareFileButton.click();
	}
	public String validateEneterdFileText() {
		waitforElement(sharedFileMessage);
		return sharedFileMessage.getText();
		
	}
//	public void mouseHoverOnPhoto() {
//		waitforElement(mouseHoverOnAddPhoto);
//		return;
//	}
	public void clickOnAddPhoto() {
		waitforElement(addPhoto);
		addPhoto.sendKeys(Keys.ENTER);
	}
	
	public WebElement fileTextIFrame() {
		return postTextIframe;
	}
	
	public void chooseFilePhoto(String path) {
		waitforElement(choosePhoto);
		choosePhoto.sendKeys(path);
		
	}
	public void clickOnSavePhoto() {
		waitforElement(savePhoto);
		savePhoto.click();
	}
	
	// TestCase-7 MySettings
	
	public void clickOnMySettings() { 
		waitforElement(MySettings);
		MySettings.click();
	}
	public String ValidateMySettingsPage() {
		
		waitforElement(MySettingsValidatePage);
		return MySettingsValidatePage.getText();
	}
	
	public void ClickOnPersonal() {
		waitforElement(Personal);
		Personal.click();	
	}
	
	public void ClickOnLoginHistory() {
		waitforElement(LoginHistory);
		LoginHistory.click();	
	}
	
	public void DownloadOnLoginHistory() {
		waitforElement(DownloadLoginHistory);
		DownloadLoginHistory.click();	
	}
	
	public void ClickOnDisplayAndLayout() {
		waitforElement(DisplayAndLayout);
		DisplayAndLayout.click();	
	}
	public void ClickOnCustomizeMyTabs() {
		waitforElement(CustomizeMyTabs);
		CustomizeMyTabs.click();	
	}
	
	public void ClickOnSalesforceChatter() {
		waitforElement(SalesforceChatter);
		SalesforceChatter.click();
	}
	
	public void ClickOnAvailableReports() {
		waitforElement(ReportsInAvailableTabs);
		ReportsInAvailableTabs.click();
	}
	
	public void ClickOnGreaterToAdd() {
		waitforElement(Add);
		Add.click();
	}
	
	public void ClickOnSelectedReports() {
		waitforElement(ReportsInSelectedTabs);
		ReportsInSelectedTabs.click();
	}
	
	public void ClickOnSaveButtonForReports() {
		waitforElement(SaveButton);
		SaveButton.click();
	}
	
	public void ClickOnSalesforceLinkForReports() {
		waitforElement(SalesforceLink);
		SalesforceLink.click();
	}
	
    public String ValidatingReportsInSalesforceLink() {
		waitforElement(CheckforReports);
		return CheckforReports.getText();
	}
	
    public void ClickOnEmail() {
		waitforElement(Email);
		SalesforceLink.click();
	}
    
    public void ClickOnEmailSettings() {
		waitforElement(EmailSettings);
	    EmailSettings.click();
	}
    
    public String EnterInToEmailName(String strEmailName) {
		waitforElement(EmailName);
		 postText.sendKeys(strEmailName);
         return strEmailName;
	}
    
    public String EnterInToEmailAddress(String strEmailAddress) {
		waitforElement(EmailAddress);
		 postText.sendKeys(strEmailAddress);
         return strEmailAddress;
	}
    
    public void ClickOnEmailSaveButton() {
		waitforElement(EmailSaveButton);
		EmailSaveButton.click();
	}
	
    public void ClickOnCalendarsAndReaminders() {
		waitforElement(CalendersAndRemainders);
		CalendersAndRemainders.click();
	}
    
    public void ClickOnActivityRemainders() {
		waitforElement(ActivityRemainders);
		ActivityRemainders.click();
	}
    
    public void ClickOnOpensaTestReminder() {
		waitforElement(OpensaTestReminder);
		OpensaTestReminder.click();
	}
	 
    public WebElement ValidateSamplePopUpWindowDisplayed() {
    	waitforElement(SampleEventPopUpWindow);
		return SampleEventPopUpWindow;
    	
    }
    //Testcase-8 DevelopersConsole
    public void ClickOnDevelopersConsole() {
		waitforElement(DevelopersConsole);
		DevelopersConsole.click();
	}
//    public String DeveloperConsoleText() {
//		waitforElement(ValidatingDevelopersConsole);
//		return ValidatingDevelopersConsole.getAttribute("value");
//	}
    //Testcase-9 Logout
    public void ClickOnLogout() {
		waitforElement(Logout);
		Logout.click();
	}
    public String LoginButtonText() {
		waitforElement(LoginButton);
		return LoginButton.getAttribute("value");
	}
    
   //Create An Account TestCase-10
    
//    @FindBy(xpath="//a[normalize-space()='Accounts']")
// 	WebElement AccountTab;
//    
//    public void ClickOnAccountTab() {
//		waitforElement(AccountTab);
//		AccountTab.click();
//	}
    
//    @FindBy(xpath="//a[@title='Close']")
// 	WebElement PopUpClose ;
//    
//    public void ClickOnPopUpClose() {  //@FindBy(xpath="//div[@class='topLeft']//a[@title='Close']")
//		waitforElement(PopUpClose);
//		PopUpClose.click();
//	}
//    
//    @FindBy(xpath="//input[@title='New']")
// 	WebElement NewButton;
//    
//    public void ClickOnNewAccountButton() {
//		waitforElement(NewButton);
//		NewButton.click();
//	}
//    
//
//    @FindBy(xpath="//input[@id='acc2']")
// 	WebElement AccountName;
//    
//    public String EnterInToAccountName(String strAccountName) {
//    	waitforElement(AccountName);
//    	postText.sendKeys(strAccountName);
//    	return strAccountName;
//    	
//    }
    
	
 	
 	
 	

}