package locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignAddLoc {
	//span[contains(text(),'Other')]
	@FindBy(xpath="//div[@class='mat-select-value']/span[text()='Activity']/..") public WebElement clickActivity;
	
	@FindBy(xpath="//span[contains(text(),'Other')]") public WebElement otherCampaignType;
	
	@FindBy(css="input[placeholder='Campaign Name']") public WebElement campaignName;
	
	@FindBy(css="textarea[formcontrolname='campaignDesc']") public WebElement campaignDescription;
	
	@FindBy(xpath="//span[contains(text(),'App-Push Notification')]") public WebElement pushCommunicationType;
	
	@FindBy(xpath="//span[text()=' SMS']") public WebElement smsCommunicationType;
	
	@FindBy(xpath="//span[contains(text(),'Email')]") public WebElement EmailCommunicationType;
	
	@FindBy(xpath="//span[text()='Frequency']") public WebElement deliverySchedule;
	
	@FindBy(xpath="//span[contains(text(),'IMMEDIATE')]") public WebElement immediateSchedule;
	
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
	
	@FindBy(xpath="//span[text()='Sender ID']") public WebElement smsSenderIDdd;
	
	@FindBy(xpath="//span[contains(text(),'clubtest')]")  public WebElement smsUsername;
	
	@FindBy(xpath="//span[contains(text(),'CLUBAPPAREL')]")  public WebElement smsSenderID;
	
	@FindBy(xpath="//mat-panel-title[contains(text(),'Email')]") public WebElement emailContentTab;
	
	@FindBy(xpath="//span[text()='Sender Email ID']") public WebElement emailSenderIDdd;

	@FindBy(css=".mat-option.ng-star-inserted.mat-active") public WebElement emailSenderID;
	
	@FindBy(xpath="//mat-panel-title[contains(text(),'English')]") public WebElement engEmailContent;
	
	@FindBy(xpath="//mat-panel-title[contains(text(),'Arabic')]") public WebElement arbEmailContent;
	
	@FindBy(xpath="//textarea[@placeholder='Subject']") public List<WebElement> emailSubject;
	
	@FindBy(css="#tinymce") public List<WebElement> emailContentBody;
	
	@FindBy(xpath="//span[text()='IsInclude Arabic ']") public WebElement arabicCheckbox;
	
	@FindBy(xpath="//textarea[@placeholder='Subject']") public List<WebElement> sonuSubject;
	
	@FindBy(xpath="//textarea[@placeholder='Content']") public List<WebElement> sonuContent;
	
	@FindBy(xpath="//iframe") public List<WebElement> sonuEContent;
	
	@FindBy(xpath="//button[text()='CANCEL']") public WebElement cancelCampaign;
	
	@FindBy(xpath="//button[text()='ADD']") public WebElement submitCampaign;
	
	
	
	

}
