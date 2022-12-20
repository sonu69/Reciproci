package useCases;

import org.testng.annotations.Test;
import reciproci.pages.LoginPageAct;
import reciproci.pages.Menu;
import reciproci.pages.PressReleaseADDPage;
import reciproci.pages.PressReleaseSearchPage;

public class PressReleaseAddUC {
	
	@Test()
	public void verifyAddPR() throws Exception {
		
		LoginPageAct lp = new LoginPageAct();
		lp.verifyLoginSuccess();
		PressReleaseADDPage pra = Menu.PressRelease.AddPressRelease();
		pra.errorMessage();

	}
	
	@Test(enabled=false)
	public void verifyFileVal() throws Exception {
		
		LoginPageAct lp = new LoginPageAct();
		lp.verifyLoginSuccess();
		PressReleaseADDPage pra = Menu.PressRelease.AddPressRelease();
		PressReleaseSearchPage ps = pra.addPressRelease("India");
		ps.verifyPressRelease("ALDO");

	}
	
	
	@Test(enabled=false)
	public void verifyAddPS() throws Exception {
		
		LoginPageAct lp = new LoginPageAct();
		lp.verifyLoginSuccess();
		PressReleaseADDPage pra = Menu.PressRelease.AddPressRelease();
		PressReleaseSearchPage ps = pra.addPressRelease("India");
		ps.verifyPressRelease("ALDO");

	}

}
