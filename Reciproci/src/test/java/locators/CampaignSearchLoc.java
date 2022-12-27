package locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignSearchLoc {
	
	@FindBy(xpath="//input[@placeholder='Search by Campaign Name']") public WebElement globalSearch;
	
	@FindBy(css=".search-btn") public WebElement searchbtn;
	
	@FindBy(css=".filter-btn.open") public WebElement moreFilter;
	
	@FindBy(xpath="//span[text()='Activity']") public WebElement communicationType;
	
	@FindBy(xpath="//span[text()='Communication Type']") public WebElement activityType;
	
	@FindBy(xpath="//button[contains(text(),'APPLY')]") public WebElement submit;
	
	@FindBy(xpath="") public WebElement toDate;
	
	@FindBy(css=".text-blue") public List<WebElement> campaigns;
	
	@FindBy(xpath="//div[contains(text(),'No Records Found!')]") public WebElement NoRecord;
	
	
	

}
