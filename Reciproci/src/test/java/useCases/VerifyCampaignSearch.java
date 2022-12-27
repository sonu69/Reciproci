package useCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reciproci.pages.CampaignSearch;
import reciproci.pages.LoginPageAct;
import reciproci.pages.Menu;

public class VerifyCampaignSearch {
	
	@BeforeTest
	public void doLogin() throws Exception {
		LoginPageAct lp = new LoginPageAct();
		lp.doLogin("admin", "test@123");
	}
	
	@Test
	public void verifyCampaign() throws Exception {
		CampaignSearch cs = Menu.Marketing.Campaigns.searchCampaigns();
		cs.verifyGlobalSearch("");
	}
	
	

}
