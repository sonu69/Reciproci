package useCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import reciproci.pages.LoginPageAct;
import reciproci.pages.Menu;
import reciproci.pages.TemplateSearchPage;

public class TempSrchUC extends LoginValidation{

	@Test
	public void verifySearchTemplate() throws Exception {
		TemplateSearchPage search = Menu.Marketing.Templates.search();
		search.verifySearch();
	}



}
