package reciproci.pages;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import locators.MenuLocator;
import reciproci.base.Base;


public class Menu extends Base{

	static MenuLocator nm = new MenuLocator();

	public Menu() throws Exception{
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, nm);
	}

	public static class PressRelease{

		public static void pressRelease() {
			Base.clickJ(nm.pressRelease);
		}

		public static PressReleaseSearchPage searchPressRelease() throws Exception{
			pressRelease();
			Base.clickJ(nm.searchPressRelease);
			return new PressReleaseSearchPage();
		}

		public static PressReleaseADDPage AddPressRelease()  throws Exception{
			pressRelease();
			Base.clickJ(nm.addPressRelease);
			return new PressReleaseADDPage();

		}

	}



	public static class Marketing{

		public static void marketing() {
			Base.clickJ(nm.marketing);
		}

		public static class Templates{

			public static void template() {
				nm.selectTemplates.click();
			}

			public static TemplateSearchPage search()  throws Exception{
				marketing();
				template();
				nm.selectSearchTemplate.click();
				return new TemplateSearchPage();
			}

			public static TemplateADDPage add()  throws Exception{
				marketing();
				template();
				nm.selectAddTemplates.click();
				return new TemplateADDPage();
			}

		}

		public static class CustomerSegment{

			public static void customerSegment() {
				nm.selectCustomerSegments.click();
			}

			public static void search(){
				marketing();
				customerSegment();
				nm.selectSearchSegment.click();
			}

			public static CustSegmentPage add() throws Exception{
				marketing();
				customerSegment();
				nm.selectAddSegment.click();
				return new CustSegmentPage();
			}

		}

		public static class Coupons{

		}


		public static class Campaigns{

			public static CampaignSearch searchCampaigns() throws Exception{
				Base.clickJ(nm.marketing);
				Base.clickJ(nm.selectCampaigns);
				Base.clickJ(nm.selectSearhCampaigns);
				return new CampaignSearch();
			}

			public static CampaignAddPage addCampaigns() throws Exception{
				Base.clickJ(nm.marketing);
				Base.clickJ(nm.selectCampaigns);
				Base.clickJ(nm.selectAddCampaigns);
				return new CampaignAddPage();
			}

		}

	}



	public static class FAQ{

		public static class SearchFAQ{

		}

		public static class AddFAQ{

		}

	}



	public static class AboutUs{

		public static class SearchAboutus{

		}

		public static class AddAboutus{

		}

	}



	public static class Configurations{

		public static class Masters{

			public static CommunicationSetting CommunicationSetting() throws Exception{

				wait.until(ExpectedConditions.visibilityOf(nm.configurations)).click();
				wait.until(ExpectedConditions.visibilityOf(nm.master)).click();
				Base.scrollToElement(nm.communicationSetting);
				wait.until(ExpectedConditions.visibilityOf(nm.communicationSetting)).click();

				return new CommunicationSetting();

			}


			public static void BrandCategory(){
				nm.configurations.click();
				nm.master.click();
				nm.communicationSetting.click();

			}

			public static class FaqCategory{

			}

			public static class AboutUsCategory{

			}



		}

	}



	public static class MenuManagement{



		public static class ViewMember{

		}

		public static class TransactionRequest{

		}

	}

}
