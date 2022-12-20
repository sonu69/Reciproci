package useCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import reciproci.base.Base;
import reciproci.pages.LoginPageAct;

public class LoginValidation extends Initials{
	
	LoginPageAct lp;

	@Test
	public void doLogin(){
		lp = new LoginPageAct();
		lp.doLogin();
	}
	
	
	@Test()
	public void doLogin1(){
		lp = new LoginPageAct();
		lp.doLogin("admin", "test@123");
	}
	
	

	
	
	
}
