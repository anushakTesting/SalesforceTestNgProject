package salesforce.testng.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class CreateOptyPage extends BasePage{


	public CreateOptyPage(WebDriver driver) {
		super(driver);
		
	}
	//Testcase-15 Line-2
	@FindBy(xpath="//a[normalize-space()='Opportunities']")
	WebElement Opportunities;
    
	public void clickOnOpportunities() {
		Opportunities.click();
	}
	
	@FindBy(xpath="//h2[@class='pageDescription']")
	WebElement OpportunitiesHomePage;
    
	public String VerifyingOpportunitiesHomePage() {
		waitforElement(OpportunitiesHomePage);
		return Opportunities.getText();
	}
	//Line-3
	@FindBy(xpath="//select[@id='fcf']")
	WebElement OpportunitiesDropDown;
    
	public void clickOnOpportunitiesDropDown() {
		OpportunitiesDropDown.click();
	}
	
	@FindBy(xpath="(//select[@class='title']/option)")
	List<WebElement> OpportunitiesDropDownList;              //DropDown list of elements
	
	public List<WebElement> OpportunitiesDropDownList() {
		return OpportunitiesDropDownList;
	}
	
	@FindBy(xpath="//div[@class='topLeft']/a[@class='dialogClose']")
	WebElement OpportunitiesPopUpWindow;
	
	public void clickOnOpportunitiesPopUpWindow() {
		OpportunitiesPopUpWindow.click();
	}
	
	//Testcase-16 Line-3
	
	@FindBy(xpath="//td[@class='pbButton']/input[@title='New']")
	WebElement NewButton;
    
	public void clickOnNewButton() {
		NewButton.click();
	}
	
	@FindBy(xpath="//input[@id='opp3']")
	WebElement OpportunityName;
	
	public String EnterInToOpportunityName(String strOpportunityName) {
		waitforElement(OpportunityName);
		OpportunityName.clear();
		OpportunityName.sendKeys(strOpportunityName);
		return strOpportunityName;
	}
	
	@FindBy(xpath="//a[@id='opp4_lkwgt']//img[@title='Account Name Lookup (New Window)']")////a[@title='Account Name Lookup (New Window)']/img[@class='lookupIcon']
	WebElement AccountNameLookUp;
    
	public void clickOnAccountNameLookUp() {
		AccountNameLookUp.click();
	}
	
	@FindBy(xpath="//div[@class='pBody']/input[@name='new']")
	WebElement LookUpNewButton;
    
	public void clickOnLookUpNewButton() {
		LookUpNewButton.click();
	}
	
	@FindBy(xpath="//div[@class='requiredInput']/input[@id='2']") 
	WebElement AccountName;
	
	public String EnterInToAccountName(String strAccountName) {
		waitforElement(AccountName);
		AccountName.clear();
		AccountName.sendKeys(strAccountName);
		return strAccountName;
	}
	
	@FindBy(xpath="//td[@id='bottomButtonRow']//input[@title='Save']")
	WebElement LookUpSave;
    
	public void clickOnLookUpSaveButton() {
		LookUpSave.click();
	}
	
	@FindBy(xpath="//select[@id='opp6']//option[@value='Phone Inquiry']")
	WebElement LeadSource;
    
	public void SelectLeadSourceValue() {
		LeadSource.click();
	}
	
	@FindBy(xpath="//span[@class='dateFormat']")
	WebElement CloseDate;
    
	public void SelectCloseDate() {
		CloseDate.click();
	}
	

	@FindBy(xpath="//select[@id='opp11']//option[@value='Qualification']")
	WebElement SelectStage;
    
	public void SelectStageValue() {
		SelectStage.click();
	}
	
	@FindBy(xpath="//td[@class='dataCol']//input[@id='opp12']") 
	WebElement Probability;
	
	public void EnterInToProbability(Integer intProbability) {
		waitforElement(Probability);
		 Probability.clear();
		 Probability.sendKeys(String.valueOf(intProbability));
		
	}
	
	@FindBy(xpath="//td[@id='topButtonRow']//input[@title='Save']")
	WebElement SaveButton;
    
	public void ClickOnSaveButton() {
		SaveButton.click();
	}
	
	@FindBy(xpath="//h2[normalize-space()='Tester']")
	WebElement OpportunityPage;
    
	public String VerifyingOpportunityPage() {
		waitforElement(OpportunityPage);
		return OpportunityPage.getText();
	}
	
	//Testcase-17 Line-3
	
	@FindBy(xpath="//a[normalize-space()='Opportunity Pipeline']")
	WebElement OpportunityPipeline;
    
	public void ClickOnOpportunityPipelineLink() {
		 OpportunityPipeline.click();
	}
	
	@FindBy(xpath="//div[@class='content']//h1[@class='noSecondHeader pageType']")
	WebElement ReportsPage;
    
	public String VerifyingReportsPageUnderOpportunityPipeline() {
		waitforElement( ReportsPage);
		return ReportsPage.getText();
	}
	
	//Testcase-18 Line-3
	
	@FindBy(xpath="//a[normalize-space()='Stuck Opportunities']")
	WebElement StuckOpportunities;
    
	public void ClickOnStuckOpportunitiesLink() {
		StuckOpportunities.click();
	}
	
	@FindBy(xpath="//div[@class='content']//h1[normalize-space()='Stuck Opportunities']")
	WebElement StuckOpportunitiesReportpage;
    
	public String VerifyingStuckOpportunitiesReportpage() {
		waitforElement(StuckOpportunitiesReportpage);
		return  StuckOpportunitiesReportpage.getText();
	}
	
	//Testcase-19 Line-3
	@FindBy(xpath="//select[@id='quarter_q']//option[@value='current']")
	WebElement Interval1;
    
	public void SelectQuarterlyReportInterval1() {
		Interval1.click();
	}
	
	@FindBy(xpath="//select[@id='open']//option[@value='open']")
	WebElement Include1;
	
	public void SelectQuarterlyReportInclude1() {
		Include1.click();
	
	}
	
    @FindBy(xpath="//input[@title='Run Report']")
	WebElement RunReport;
	
	public void ClickOnRunReport() {
		RunReport.click();
	
	}
	
	@FindBy(xpath="//select[@id='quarter_q']//option[@value='next1']")
	WebElement Interval2;
    
	public void SelectQuarterlyReportInterval2() {
		Interval2.click();
	}
	
	@FindBy(xpath="//select[@id='open']//option[@value='closed']")
	WebElement Include2;
	
	public void SelectQuarterlyReportInclude2() {
		Include2.click();
	
	}
	
	@FindBy(xpath="//select[@id='quarter_q']//option[@value='curnext3']")
	WebElement Interval3;
    
	public void SelectQuarterlyReportInterval3() {
		Interval3.click();
	}
	
	@FindBy(xpath="//select[@id='open']//option[@value='closedwon']")
	WebElement Include3;
	
	public void SelectQuarterlyReportInclude3() {
		Include3.click();
	
	}
	
	@FindBy(xpath="//div[@class='content']//h1[@class='noSecondHeader pageType']")
	WebElement RunReportOpportunityPage;
    
	public String VerifyingRunReportOpportunitypage() {
		waitforElement(RunReportOpportunityPage);
		return  RunReportOpportunityPage.getText();
	}
	
   
    
	
	
}
