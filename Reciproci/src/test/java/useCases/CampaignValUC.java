package useCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reciproci.pages.CampaignAddPage;
import reciproci.pages.LoginPageAct;
import reciproci.pages.Menu;

public class CampaignValUC {
	
	@BeforeTest
	public void doLogin() {
		LoginPageAct lp = new LoginPageAct();
		lp.doLogin("admin", "test@123");
	}
	
	@Test(enabled=false)
	public void createmultilingualCampaign() throws Exception {
		CampaignAddPage cp = Menu.Marketing.Campaigns.addCampaigns();
		cp.createmultilingualCampaign();
	}
	
	@Test
	public void addCampaign() throws Exception {
		CampaignAddPage cp = Menu.Marketing.Campaigns.addCampaigns();
		cp.addCampaign();
	}

}