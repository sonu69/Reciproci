package useCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reciproci.pages.CustSegmentPage;
import reciproci.pages.LoginPageAct;
import reciproci.pages.Menu;

public class CustomerSegmentUC {
	
	Menu mn;
	
	@BeforeTest
	public void doLogin() throws Exception {
		LoginPageAct la = new LoginPageAct();
		la.doLogin("admin", "test@123");
	}
	
	
	@Test
	public void customerSegment() throws Exception{
		CustSegmentPage cp = Menu.Marketing.CustomerSegment.add();
		cp.createSegment();
	}
	

}
