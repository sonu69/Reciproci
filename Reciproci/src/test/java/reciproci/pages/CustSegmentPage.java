package reciproci.pages;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import locators.CustSegmentLoc;
import reciproci.base.*;

public class CustSegmentPage extends Base{

	CustSegmentLoc cl = new CustSegmentLoc();

	public CustSegmentPage() throws Exception{

		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, cl);

	}

	public void createSegment() throws InterruptedException {

		Thread.sleep(3000);
		type(cl.segmentName, "Hello Sonuuuu");
		Thread.sleep(1000);
		type(cl.segmentDescription, "Happy Birthday");
		Thread.sleep(1000);
		selectSegment();
		scrollToElement(cl.add.get(1));
		Thread.sleep(1000);
		clickJ(cl.add.get(1));
		clickJ(cl.add.get(0));

	}
	
	
	public void selectSegment() throws InterruptedException {
		Thread.sleep(1000);
		cl.segment.click();
		segmentCreate("Gender", "in", "Female", 0);
//		cl.addRule.click();
//		segmentCreate("Customer Tag", "in", "M7", 1);
//		Thread.sleep(1000);
//		cl.addRule.click();
//		segmentCreate("Migrated", "equal", "Yes", 2);
		
	}


	public void segmentCreate(String attribute,String operator,String value, int i) throws InterruptedException {

		switch(attribute) {

		case "Gender":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			selectDropDown(cl.selValue.get(i), value);
			break;

		case "Customer Preferred Language":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			selectDropDown(cl.selValue.get(i), value);
			break;

		case "Customer onboarded but NOT transacted":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			break;

			
		case "Advance Birthday Notification":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			selectDropDown(cl.selValue.get(i), value);
			break;

		case "Email Id":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			break;


		case "Receive CA Promotional SMS":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			break;


		case "Receive CA Promotional EMAIL":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			break;


		case "WhatsApp Notifications Opted In":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			break;

		case "Customer Onboarded on CA App":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			break;


		case "Customer Onboarded on PWA":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			break;

		case "Receive CA Promotional PUSH":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			selectDropDown(cl.selValue.get(i), value);
			break;

		case "Receive Location Notifications":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			selectDropDown(cl.selValue.get(i), value);
			break;

		case "Migrated":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			selectDropDown(cl.selValue.get(i), value);
			break;
			
		case "Customer Tag":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			selectDropDown(cl.selValue.get(i), value);
			break;

		case "Incomplete Profile":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			break;


		default:
			System.out.println("Hello");
			break;
		}


	}

	public void segmentCreate(String attribute,String operator,String value1,String value2, int i) throws InterruptedException {

		switch(attribute) {

		case "Gender":
			selectDropDown(cl.filter.get(i), attribute);
			selectDropDown(cl.operator.get(i), operator);
			selectDropDown(cl.selValue.get(i), value1);
			break;

		case "Advance Birthday Notification":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			selectDropDown(cl.selValue.get(i), value1);
			break;


		case "Customer Preferred Language":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			selectDropDown(cl.selValue.get(i), value1);
			break;

		case "Age":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			cl.selValue.get(i).sendKeys(value1);

		case "DOB Range without year":
			selectDropDown(cl.filter.get(i), attribute);		
			selectDropDown(cl.operator.get(i), operator);
			cl.inputValue.get(i).sendKeys(value1);
			cl.inputValue.get(i+1).sendKeys(value2);


		}







	}







}
