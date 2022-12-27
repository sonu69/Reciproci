package reciproci.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import locators.CampaignSearchLoc;
import reciproci.base.Base;

public class CampaignSearch extends Base{
	
	CampaignSearchLoc cl = new CampaignSearchLoc();
	
	public CampaignSearch()  throws Exception{
		AjaxElementLocatorFactory aj = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(aj, cl);
	}
	
	
	public void verifyGlobalSearch(String campaigName) throws InterruptedException {
		waitv(cl.globalSearch);
		cl.globalSearch.sendKeys(campaigName);
		Thread.sleep(1000);
		cl.searchbtn.click();
		
		if(cl.campaigns.isEmpty()==false) {
			System.out.println(cl.NoRecord.getText());
		}else if(cl.campaigns.get(0).getText().contains(campaigName)){
			System.out.println("Matching Result Found");
		}		
	}
	
	
	public void multipleFilter() {
		
	}
	
	
	
	
	

}
