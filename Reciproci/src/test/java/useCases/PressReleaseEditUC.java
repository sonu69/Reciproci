package useCases;

import org.testng.annotations.Test;

import reciproci.pages.LoginPageAct;
import reciproci.pages.Menu;
import reciproci.pages.PressReleaseSearchPage;

public class PressReleaseEditUC {
	
	@Test
	public void verifyEditfunctionality() throws Exception {
		
		LoginPageAct lp = new LoginPageAct();
		Menu mn = lp.doLogin("admin", "test@123");
		PressReleaseSearchPage ps = Menu.PressRelease.searchPressRelease();
		ps.verifyEditFunctionality("Techtree Testing");
		
		
	}

}
