package useCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reciproci.base.Base;
import reciproci.pages.CampaignAddPage;
import reciproci.pages.LoginPageAct;
import reciproci.pages.Menu;

public class CampaignValUC {
	
	@BeforeTest
	public void doLogin() throws Exception {
		LoginPageAct lp = new LoginPageAct();
		lp.doLogin("admin", "test@123");
	}
	
	
	@Test(dataProvider="excel-data",dataProviderClass=Base.class)
	public void addCampaign(String campaignName,String campaignDescription,String notificationLimit,String pushSubject,String pushContent,String smsContent,String engEmailSubject,String engEmailContent) throws Exception {
		CampaignAddPage cp = Menu.Marketing.Campaigns.addCampaigns();
		cp.englishCampaign(campaignName,campaignDescription,notificationLimit,pushSubject,pushContent,smsContent,engEmailSubject,engEmailContent);
		
		// englishTemplate
	}
	
	
	public void verifyCloneCampaign() {
		
	}
	
	
	public void verifyCampaignCreation() {
		
	}
	
	
	public void verifySearchCampaign(){
		
	}
	
	
}