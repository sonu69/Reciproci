package useCases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import reciproci.base.Base;
import reciproci.pages.CommunicationSetting;
import reciproci.pages.LoginPageAct;
import reciproci.pages.Menu;

public class CommunicationValUC extends Initials{

	LoginPageAct lp;
	
	@Test(groups= {"rich"})
	public void testcase_1() throws Exception{
		lp = new LoginPageAct();
		lp.doLogin();
		CommunicationSetting cs = Menu.Configurations.Masters.CommunicationSetting();
		cs.verifyBreadCrumb();
	}

	
	@Test(groups= {"rich"})
	public void testcase_2() throws Exception{
		lp = new LoginPageAct();
		lp.doLogin();
		CommunicationSetting cs = Menu.Configurations.Masters.CommunicationSetting();
		cs.veriyURL();
	}
	
	
	@Test
	public void testcase_5() throws Exception {
		lp = new LoginPageAct();
		lp.doLogin();
		CommunicationSetting cs = Menu.Configurations.Masters.CommunicationSetting();
		cs.verifyColumn();
	}
	
	
	@Test
	public void testcase_9() throws Exception {
		lp = new LoginPageAct();
		lp.doLogin();
		CommunicationSetting cs = Menu.Configurations.Masters.CommunicationSetting();
		cs.verifySenderIDLink();
	}


	
	@Test
	@Parameters({"input"})
	public void testcase_10(@Optional("sonu") String input) throws Exception {
		lp = new LoginPageAct();
		lp.doLogin();
		CommunicationSetting cs = Menu.Configurations.Masters.CommunicationSetting();
		cs.verifyInputResult(input);
	}


	@Test
	public void testcase_32() throws Exception {
		lp = new LoginPageAct();
		lp.doLogin();
		CommunicationSetting cs = Menu.Configurations.Masters.CommunicationSetting();
		cs.verifyHdrTxt();
	}


	@Test
	public void testcase_67() throws Exception {
		lp = new LoginPageAct();
		lp.doLogin();
		CommunicationSetting cs = Menu.Configurations.Masters.CommunicationSetting();
		cs.verifyDupSIdMsg();
	}


	@Test
	public void testcase_81() throws Exception {
		lp = new LoginPageAct();
		lp.doLogin();
		CommunicationSetting cs = Menu.Configurations.Masters.CommunicationSetting();
		cs.verifySucMsg();
	}


}
