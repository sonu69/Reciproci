package useCases;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import reciproci.base.Base;
import reciproci.pages.LoginPageAct;

public class LoginValidation extends Initials{
	
	LoginPageAct lp;


	@Test(enabled=false)
	public void doLogin(String username, String password) throws Exception{
		lp = new LoginPageAct();
		lp.doLogin(username,password);
	}
	
	
	@Test(enabled=false)
	public void doLogin1() throws Exception{
		lp = new LoginPageAct();
		lp.doLogin("admin", "test@123");
	}
	
	
	@Test(dataProviderClass=Base.class,dataProvider="excel-data")
	public void loginVal(String username, String password,String runMode) throws Exception{
		LoginPageAct lp = new LoginPageAct();
		if(runMode.equalsIgnoreCase("N")) {
			throw new SkipException("");
		}else {
		lp.verifyLogin(username,password);
		}
	}

	
	
	
}
