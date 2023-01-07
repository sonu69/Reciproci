package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignAddLoc {
	
	@FindBy(xpath="//h1[contains(text(),'Add Campaigns')]") public WebElement pageHeader;
	
	@FindBy(xpath="//span[text()='Activity']/..") public WebElement clickActivity;
	
	@FindBy(xpath="//span[contains(text(),'Other')]") public WebElement otherCampaignType;
	
	@FindBy(css="input[placeholder='Campaign Name']") public WebElement campaignName;
	
	@FindBy(css="textarea[formcontrolname='campaignDesc']") public WebElement campaignDescription;
	
	@FindBy(xpath="//span[contains(text(),'App-Push Notification')]") public WebElement pushCommunicationType;
	
	@FindBy(xpath="//span[text()=' SMS']") public WebElement smsCommunicationType;
	
	@FindBy(xpath="//span[contains(text(),'Email')]") public WebElement EmailCommunicationType;
	
	@FindBy(xpath="//span[text()='Frequency']") public WebElement deliverySchedule;
	
	@FindBy(xpath="//span[contains(text(),'IMMEDIATE')]") public WebElement immediateSchedule;
	
	@FindBy(xpath="//span[contains(text(),' ONE TIME ')]") public WebElement oneTime;
	
	@FindBy(xpath="//span[contains(text(),'WEEKLY')]") public WebElement weekly;
	
	@FindBy(css=".mat-button-wrapper> svg") public List<WebElement> calendar;
	
	@FindBy(xpath="//input[@formcontrolname='deliveryTime']") public WebElement selTime;
	
	@FindBy(xpath="//mat-select[@aria-multiselectable='true']/div")  public WebElement selDays;
	
	@FindBy(xpath="//button[contains(text(),'CONTINUE')]") public List<WebElement> continueBasic;
	
	@FindBy(css="input[placeholder='Notification Limit']") public WebElement notificationLimit;
	
	@FindBy(xpath="//a[text()='SEGMENT RULE']") public WebElement selectSegment;
	
	@FindBy(xpath="//select[@class='form-control']") public WebElement segmentRule;
	
	@FindBy(xpath="//button[text()='ADD']") public List<WebElement> submitSegment;
	
	@FindBy(xpath="") public WebElement continueAudience;
	
	@FindBy(xpath="//mat-panel-title[contains(text(),'App-Push Notification')]") public WebElement pushContentTab;
	
	@FindBy(xpath="//span[contains(text(),'Link To')]") public WebElement liknTo;
	
	@FindBy(xpath="//mat-option/span[contains(text(),'Coupons')]") public WebElement liknToOption;
	
	@FindBy(xpath="//textarea[@placeholder='Subject']") public List<WebElement> subject;
	
	@FindBy(xpath="//textarea[@placeholder='Content']") public List<WebElement> content;
	
	@FindBy(xpath="//mat-panel-title[contains(text(),'SMS')]") public WebElement smsContentTab;
	
	@FindBy(xpath="//span[text()='Username']") public WebElement smsUserNamedd;
	
	@FindBy(xpath="//span[text()='Sender ID' and contains(@class,'mat-select-placeholder')]") public WebElement smsSenderIDdd;
	
	@FindBy(xpath="//span[contains(text(),'clubtest')]")  public WebElement smsUsername;
	
	@FindBy(xpath="//span[contains(text(),'CLUBAPPAREL')]")  public WebElement smsSenderID;
	
	@FindBy(xpath="//mat-panel-title[contains(text(),'Email')]") public WebElement emailContentTab;
	
	@FindBy(xpath="//span[text()='Sender Email ID']") public WebElement emailSenderIDdd;

	@FindBy(css=".mat-option.ng-star-inserted.mat-active") public WebElement emailSenderID;
	
	@FindBy(xpath="//span[text()='IsInclude Arabic ']") public WebElement arabicCheckbox;
	
	@FindBy(xpath="//mat-panel-title[contains(text(),'English')]") public WebElement engEmailContent;
	
	@FindBy(xpath="//mat-panel-title[contains(text(),'Arabic')]") public WebElement arbEmailContent;
	
	@FindBy(css="#tinymce> p") public WebElement emailContentBody;
		
	@FindBy(xpath="//iframe") public List<WebElement> sonuEContent;
	
	@FindBy(xpath="//input[@aria-label='pushTemplate']") public WebElement pushTemplate;
	
	@FindBy(xpath="//input[@aria-label='smsTemplate']") public WebElement smsTemplate;
	
	@FindBy(xpath="//input[@aria-label='emailTemplate']") public WebElement emailTemplate;
	
	@FindBy(xpath="//span[contains(text(),'IsInclude Arabic') and @class='mat-checkbox-label']")  public WebElement isArabic;
	
	@FindBy(xpath="//button[text()='ADD']/../button[text()='CANCEL']") public WebElement cancelCampaign;
	
	@FindBy(xpath="//button[text()='ADD']") public WebElement submitCampaign;
	
	@FindBy(xpath="//div[contains(text(),'Please fill all mandatory fields')]") public WebElement allMandatory;
	
	@FindBy(xpath="//div[contains(text(),'Campaign Name already exist')]") public WebElement duplicateName;
	
	@FindBy(xpath="//div[contains(text(),'Invalid Characters Entered')]") public WebElement invalidCharacter;
	
	
	
}
