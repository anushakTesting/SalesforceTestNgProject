package salesforce.testng.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class CreateAccountPage extends BasePage {

	public CreateAccountPage(WebDriver driver) {
		super(driver);
		
	}

//Create An Account TestCase-10
    
    @FindBy(xpath="//a[@title='Accounts Tab']")
 	WebElement AccountTab;
    
    public void ClickOnAccountTab() {
		waitforElement(AccountTab);
		AccountTab.click();
	}
    
     @FindBy(xpath="//h2[normalize-space()='Home']")
 	WebElement AccountHomePage;
    
    public String ValidatingOnAccountHomePage() {
		waitforElement(AccountHomePage);
		return AccountHomePage.getText();
	}
    
    @FindBy(xpath="//a[@title='Close']")
 	WebElement PopUpClose ;
    
    public void ClickOnPopUpClose() {  //@FindBy(xpath="//div[@class='topLeft']//a[@title='Close']")
		waitforElement(PopUpClose);
		PopUpClose.click();
	}
    
    @FindBy(xpath="//input[@title='New']")
 	WebElement NewButton;
    
    public void ClickOnNewAccountButton() {
		waitforElement(NewButton);
		NewButton.click();
	}
    

    @FindBy(xpath="//input[@id='acc2']")
 	WebElement AccountName;
    
    public String EnterInToAccountName(String strAccountName) {
     	waitforElement(AccountName);
     	AccountName.sendKeys(strAccountName);  
    	return strAccountName;
    	
    }
    
    @FindBy(xpath="//select[@id='acc6']")
 	WebElement AccountType;
    
    public void SelecAccountType() {
     	waitforElement(AccountType);
    	AccountType.click();
	    	
    }
    
     @FindBy(xpath="//option[@value='Technology Partner']")
 	WebElement TechnologyPartner;
    
    public void SelecTechnologyPartner() {
     	waitforElement(TechnologyPartner);
     	TechnologyPartner.click();
	    	
    }
    
    @FindBy(xpath="//select/option[@value='High']")
 	WebElement HighPriority;
    
    public void SelectHighPriority() {
		waitforElement(HighPriority);
		HighPriority.click();
	}
    
    @FindBy(xpath="//td[@id='bottomButtonRow']//input[@title='Save']")
 	WebElement SaveButton ;
    
    public void ClickOnSaveButton() {
		waitforElement(SaveButton);
		SaveButton.click();
	}
    
    @FindBy(xpath="//h2[normalize-space()='Priya']")
 	WebElement NewUserAccountPage;
    
     public String validateNewUserAccountPage() {
		waitforElement(NewUserAccountPage);
		return NewUserAccountPage.getText();
		
	}
     //Line 3 Testcase-11
     @FindBy(xpath="//a[normalize-space()='Create New View']")
    	WebElement NewView ;
     
     public void ClickOnCreateNewView() {
 		waitforElement(NewView);
 		NewView.click();
 	}
     
     @FindBy(xpath="//input[@id='fname']")
    	WebElement  ViewName;
     
     public String EnterInToViewName(String strViewName) {
 		waitforElement(ViewName);
 		ViewName.clear();
 		ViewName.sendKeys(strViewName);
 		return strViewName;
 	}
     
     @FindBy(xpath="//input[@id='devname']")
 	WebElement  ViewUniqueName;
  
      public String EnterInToViewUniqueName(String strViewUniqueName) {
		waitforElement(ViewUniqueName);
		ViewUniqueName.clear();
		ViewUniqueName.sendKeys(strViewUniqueName);
		return strViewUniqueName;
	}
      
      
      @FindBy(xpath="//td[@class='pbButtonb']//input[@title='Save']")
     	WebElement ViewSaveButton ;
      
      public void ClickOnNewViewSaveButton() {  //Error
  		waitforElement(ViewSaveButton);
  		ViewSaveButton.click();
  	}
 	
      @FindBy(xpath="//select[@id='fcf']//option[@value='00B5f000008rrsP']")
    	WebElement ViewList;
    
    public void ValidatingViewInAccountList() {
		waitforElement(ViewList);
		ViewList.click();
	}
    
    //Line 2 Tc-12
    @FindBy(xpath="//select[@id='fcf']")
 	WebElement ViewNameList;
  
    public void ClickOnViewName() {
		waitforElement(ViewNameList);
		ViewNameList.click();
	}
   
    @FindBy(xpath="(//a[contains(text(),'Edit')])[1]")
 	WebElement EditButton;
  
    public void ClickOnEditButton() {
		waitforElement(EditButton);
		EditButton.click();
	}
    
    @FindBy(xpath="//h2[@class='pageDescription']")
 	WebElement EditPage;
  
    public String ValidatingOnEditPage() {     //Error 
		waitforElement(EditPage);
		return EditPage.getText();
	
	}
    //Line 3 in tc-12
    @FindBy(xpath="//input[@id='fname']")
	WebElement  NewViewName;
 
     public String EnterInToNewViewName(String strNewViewName) {
		waitforElement(NewViewName);
		NewViewName.clear();
		ViewName.sendKeys(strNewViewName);
		return strNewViewName;
	}
     
     @FindBy(xpath="//select[@id='fcol1']/option[@selected='selected']")
  	WebElement AccountField;
   
     public void SelectAccountField() { //select Account Name in Dropdown
 		waitforElement(AccountField);
 		AccountField.click();
 	}
     
     @FindBy(xpath="//select[@class='operator']/option[@value='c']")
   	  WebElement Operator;
    
      public void SelectOperatorField() {
  		waitforElement(Operator); //select Contains in Dropdown
  		Operator.click();
  	}
      
      @FindBy(xpath="//input[@id='fval1']")
    	WebElement value;
     
       public String EnterAValue(String strValue) {
   		waitforElement(value);
   		value.clear();
   		value.sendKeys(strValue);
   		return strValue;
   	}
       
      // Testcase-13 line 3
       
       
       //Testcase-14 Line 3 Account Report
       
       @FindBy(xpath="//a[normalize-space()='Accounts with last activity > 30 days']") 
    	WebElement LastActivity;
     
       public void ClickOnAccountLastActivity() {
   		waitforElement(LastActivity);
   		LastActivity.click();
   	}

       @FindBy(xpath="//div[@class='content']/h2[normalize-space()='Unsaved Report']")
     	WebElement UnsavedReport;
       
       public String VerifyingUnsavedReport() {
    	   waitforElement(UnsavedReport);
    	   return UnsavedReport.getText();
       }
       
       //Line-4
       
       @FindBy(xpath="//img[@id='ext-gen152']")
  	    WebElement FromCalenderImage;
   
        public void ClickOnFromCalenderImage() {
 		waitforElement(FromCalenderImage); 
 		FromCalenderImage.click();
 	}
	     @FindBy(xpath="//td[@title='Today']//span[contains(text(),'6')]")
	  	  WebElement FromTodayDate;
	   
	     public void SelectFromTodaysDate() {
	 		waitforElement(FromTodayDate); 
	 		FromTodayDate.click();
	 	}
     
     
	       @FindBy(xpath="//img[@id='ext-gen154']")
	    	  WebElement ToCalenderImage;
	     
	       public void ClickOnToCalenderImage() {
	   		waitforElement(ToCalenderImage); 
	   		ToCalenderImage.click();
	   	}
	       @FindBy(xpath="//td[@class='x-date-active x-date-selected']//span[contains(text(),'6')]")
	    	 WebElement ToTodayDate;
	     
	       public void SelectToTodaysDate() {
	   		waitforElement(ToTodayDate); 
	   		ToTodayDate.click();
	   	}
	      //Line-4 TC-14 
	      
	        @FindBy(xpath="//button[@id='ext-gen49']")
	    	 WebElement SaveReport ;
	     
	       public void ClickOnSaveReport() {
	   		waitforElement(SaveReport); 
	   		SaveReport.click();
	   	}
	       
	       @FindBy(xpath="//input[@id='saveReportDlg_reportNameField']")
	    	 WebElement ReportName;
	     
	       public String EnterInToReportName(String strReportName) {
	   		waitforElement(ReportName); 
	   		ReportName.clear();
	   		ReportName.sendKeys(strReportName);
	   		return strReportName;
	   	}
	       
	       @FindBy(xpath="//input[@id='saveReportDlg_DeveloperName']")
	    	 WebElement ReportUniqueName;
	     
	       public String EnterInToReportUniqueName(String strReportUniqueName) {
	   		waitforElement(ReportUniqueName); 
	   		ReportUniqueName.clear();
	   		ReportUniqueName.sendKeys(strReportUniqueName);
	   		return strReportUniqueName;
	   	}
	       
	       @FindBy(xpath="//td[@class='x-btn-mc']//button[@id='ext-gen281']") //Error
	    	 WebElement SaveandRunReport ;
	     
	       public void ClickOnSaveAndRunReport() {
	   		waitforElement(SaveandRunReport); 
	   		SaveandRunReport.click();
	   	}
	       
	       @FindBy(xpath="//h1[normalize-space()='Report']")
	     	WebElement savedReportPage;
	       
	       public String VerifyingsavedReportPage() {
	    	   waitforElement(savedReportPage);
	    	   return savedReportPage.getText();
	       }
	       
	      
     
      
}
