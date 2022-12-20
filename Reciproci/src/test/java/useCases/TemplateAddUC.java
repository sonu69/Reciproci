package useCases;

import org.testng.annotations.Test;

import reciproci.pages.LoginPageAct;
import reciproci.pages.Menu;
import reciproci.pages.TemplateADDPage;

public class TemplateAddUC {
	
	@Test(enabled=false)
	public void verifyAddTemplate() throws Exception {
		
		LoginPageAct lp = new LoginPageAct();
		lp.doLogin("admin", "test@123");
		TemplateADDPage tp = Menu.Marketing.Templates.add();
		tp.addWhatsappTemplate();
	}
	
	
	
	@Test(enabled=true)
	public void verifyErrorMsg() throws Exception {
		
		LoginPageAct lp = new LoginPageAct();
		lp.doLogin("admin", "test@123");
		TemplateADDPage tp = Menu.Marketing.Templates.add();
		tp.duplicateSenderID();
	}
	

}
