package useCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reciproci.base.Base;
import reciproci.pages.LoginPageAct;
import reciproci.pages.Menu;
import reciproci.pages.PressReleaseSearchPage;

public class PressReleaseSCRUC {

	@Parameters({"username","password"})
	@Test(enabled=false)
	public Menu verifySuccessLogin(String username, String password) throws Exception {
		LoginPageAct lp = new LoginPageAct();
		lp.doLogin(username,password);
		return new Menu();
	}


	@Test(enabled=false)
	public void verifyScrPR1() throws Exception {
		LoginPageAct lp = new LoginPageAct();
		lp.doLogin();
		PressReleaseSearchPage ps = Menu.PressRelease.searchPressRelease();
		ps.verifyPressRelease("ALDOSHOES.IN");
	}


	@Test(enabled=false)
	public void verifyScrPR2() throws Exception {
		LoginPageAct lp = new LoginPageAct();
		lp.doLogin();
		PressReleaseSearchPage ps = Menu.PressRelease.searchPressRelease();
		ps.verifyPressRelease("ALDOSHOES.IN","17/OCT/2022");
	}


	@AfterTest
	public void tearDown() {
		Base.driver=null;
	}

}
