package useCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import reciproci.base.Base;
import reciproci.pages.LoginPageAct;

public class LoginValidation extends Initials{
	
	LoginPageAct lp;

	@Test
	public void doLogin() throws Exception{
		lp = new LoginPageAct();
		lp.doLogin();
	}
	
	
	@Test()
	public void doLogin1() throws Exception{
		lp = new LoginPageAct();
		lp.doLogin("admin", "test@123");
	}
	
	

	
	
	
}
