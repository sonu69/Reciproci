package reciproci.pages;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import locators.CampaignAddLoc;
import reciproci.base.Base;

public class CampaignAddPage extends Base{

	CampaignAddLoc ca = new CampaignAddLoc();

	public CampaignAddPage() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, ca);
	}
	
	public void addCampaign() throws InterruptedException {
		
		String seltemplate="yes";
		String iArabic="yes";

		Thread.sleep(5000);
		click(ca.clickActivity);
		Thread.sleep(2000);
		click(ca.otherCampaignType);
		type(ca.campaignName,"Testing campaign 121501");
		type(ca.campaignDescription,"Testing campaign 072101");

		click(ca.pushCommunicationType);
		click(ca.smsCommunicationType);
		click(ca.EmailCommunicationType);

		clickJ(ca.deliverySchedule);
		Thread.sleep(1000);
		clickJ(ca.immediateSchedule);
		clickJ(ca.continueBasic.get(0));
		Thread.sleep(2000);
		type(ca.notificationLimit,"1");
		Thread.sleep(1000);
		click(ca.selectSegment);
		Thread.sleep(2000);
		clickJ(ca.segmentRule);
		driver.findElement(By.xpath("//option[contains(text(),'Gender')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Male')]")).click();
		click(ca.submitSegment.get(1));
		Thread.sleep(1000);
		clickJ(ca.continueBasic.get(1));
		Thread.sleep(1000);

		ca.pushContentTab.click();Thread.sleep(1000);
		ca.liknTo.click();Thread.sleep(1000);
		ca.liknToOption.click();Thread.sleep(1000);
		
		
		ca.subject.get(0).sendKeys("Hope You are doing great");
		Thread.sleep(1000);
		ca.content.get(0).sendKeys("This is just for the Testing Purpose");
		Thread.sleep(1000);
		
		clickJ(ca.smsContentTab);
		Thread.sleep(1000);
		clickJ(ca.smsUserNamedd);
		Thread.sleep(2000);
		clickJ(ca.smsUsername);
		Thread.sleep(1000);
		clickJ(ca.smsSenderIDdd);
		Thread.sleep(2000);
		clickJ(ca.smsSenderID);
		Thread.sleep(1000);
		ca.content.get(1).sendKeys("This is just for the Testing Purpose");
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		clickJ(ca.emailContentTab);
		Thread.sleep(1000);
		clickJ(ca.emailSenderIDdd);Thread.sleep(2000);
		clickJ(ca.emailSenderID);Thread.sleep(2000);
		
		clickJ(ca.engEmailContent);Thread.sleep(2000);
		//ca.emailSubject.get(1).sendKeys("Hope You are doing great");Thread.sleep(1000);
		driver.switchTo().frame(0);
		ca.emailContentBody.get(0).sendKeys("This is just for the Testing Purpose");
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		//clickJ(ca.submitCampaign);
	
	}


	public void createmultilingualCampaign() throws InterruptedException {
		String arabic="yes";
		Thread.sleep(6000);
		click(ca.clickActivity);
		Thread.sleep(2000);
		click(ca.otherCampaignType);
		type(ca.campaignName,"Testing campaign 121501");
		type(ca.campaignDescription,"Testing campaign 072101");

		click(ca.pushCommunicationType);
		click(ca.smsCommunicationType);
		click(ca.EmailCommunicationType);

		clickJ(ca.deliverySchedule);
		Thread.sleep(1000);
		clickJ(ca.immediateSchedule);
		clickJ(ca.continueBasic.get(0));
		Thread.sleep(2000);
		type(ca.notificationLimit,"1");
		Thread.sleep(1000);

		if(arabic=="yes") {
			click(ca.arabicCheckbox);
		}
		Thread.sleep(1000);
		click(ca.selectSegment);
		Thread.sleep(2000);
		clickJ(ca.segmentRule);
		driver.findElement(By.xpath("//option[contains(text(),'Gender')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Male')]")).click();
		click(ca.submitSegment.get(1));
		Thread.sleep(1000);
		clickJ(ca.continueBasic.get(1));
		Thread.sleep(1000);

		ca.pushContentTab.click();Thread.sleep(1000);
		ca.liknTo.click();Thread.sleep(1000);
		ca.liknToOption.click();Thread.sleep(1000);
		
		
		ca.subject.get(0).sendKeys("Hope You are doing great");
		Thread.sleep(1000);
		ca.content.get(0).sendKeys("This is just for th Testing Purpose");
		Thread.sleep(1000);
		
		if(arabic.equalsIgnoreCase("yes")) {
			ca.subject.get(1).sendKeys("Hope You are doing great");
			Thread.sleep(1000);
			ca.content.get(1).sendKeys("This is just for th Testing Purpose");
			Thread.sleep(1000);
		}
		
		
		clickJ(ca.smsContentTab);
		Thread.sleep(1000);
		clickJ(ca.smsUserNamedd);
		Thread.sleep(2000);
		clickJ(ca.smsUsername);
		Thread.sleep(1000);
		clickJ(ca.smsSenderIDdd);
		Thread.sleep(2000);
		clickJ(ca.smsSenderID);
		Thread.sleep(1000);
		ca.content.get(2).sendKeys("This is just for th Testing Purpose");
		Thread.sleep(1000);
		ca.content.get(3).sendKeys("This is just for th Testing Purpose");
		
		Thread.sleep(1000);
		clickJ(ca.emailContentTab);
		Thread.sleep(1000);
		clickJ(ca.emailSenderIDdd);Thread.sleep(2000);
		clickJ(ca.emailSenderID);Thread.sleep(2000);
		
		clickJ(ca.engEmailContent);Thread.sleep(2000);
//		ca.emailSubject.get(2).sendKeys("Hope You are doing great");Thread.sleep(2000);
		driver.switchTo().frame(0);
		ca.emailContentBody.get(0).sendKeys("This is just for th Testing Purpose");
		driver.switchTo().parentFrame();
		
		if(arabic.equalsIgnoreCase("yes")) {
		clickJ(ca.arbEmailContent);
		Thread.sleep(2000);
//		ca.emailSubject.get(3).sendKeys("Hope You are doing great");
		Thread.sleep(1000);
		driver.switchTo().frame("arabicID_ifr");
		Thread.sleep(2000);
		ca.emailContentBody.get(0).sendKeys("This is just for th Testing Purpose");
		driver.switchTo().parentFrame();
		}
		
		driver.switchTo().defaultContent();
		clickJ(ca.submitCampaign);
	
	}
	
	public void selectTemplate() {
		
	}
	
	public void addWhatsappCampaign() {
		
	}
	
	public void addMultilingualWhatsappCampaign() {
		
	}

	public void memberFileUploadSegment() {
		
	}
	
	public void nonMemberFileUploadSegment() {
		
	}
	

	public void arabicAndTemplate() throws Exception {
		String seltemplate="yes";
		String iArabic="yes";

		Thread.sleep(5000);
		click(ca.clickActivity);
		Thread.sleep(2000);
		click(ca.otherCampaignType);
		type(ca.campaignName,"Testing campaign 122001");
		type(ca.campaignDescription,"Testing campaign 072101");

		click(ca.pushCommunicationType);
		click(ca.smsCommunicationType);
		click(ca.EmailCommunicationType);

		clickJ(ca.deliverySchedule);
		Thread.sleep(1000);
		clickJ(ca.immediateSchedule);
		clickJ(ca.continueBasic.get(0));
		Thread.sleep(2000);
		type(ca.notificationLimit,"1");
		Thread.sleep(1000);
		clickJ(ca.isArabic);
		Thread.sleep(1000);
		click(ca.selectSegment);
		Thread.sleep(2000);
		clickJ(ca.segmentRule);
		driver.findElement(By.xpath("//option[contains(text(),'Gender')]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'Male')]")).click();
		click(ca.submitSegment.get(1));
		Thread.sleep(1000);
		clickJ(ca.continueBasic.get(1));
		Thread.sleep(1000);
		
		ca.pushContentTab.click();Thread.sleep(1000);
		ca.liknTo.click();Thread.sleep(1000);
		ca.liknToOption.click();Thread.sleep(1000);
		
		click(ca.pushTemplate);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add profile']"))).click();
		
		clickJ(ca.smsContentTab);
		Thread.sleep(2000);
		clickJ(ca.smsUserNamedd);
		Thread.sleep(2000);
		clickJ(ca.smsUsername);
		Thread.sleep(2000);
		clickJ(ca.smsSenderIDdd);
		Thread.sleep(2000);
		clickJ(ca.smsSenderID);
		Thread.sleep(1000);

		click(ca.smsTemplate);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='BIRTHDAY SMS']"))).click();
		clickJ(ca.smsContentTab);
		
		Thread.sleep(1000);
		clickJ(ca.emailContentTab);
		Thread.sleep(2000);
		clickJ(ca.emailSenderIDdd);
		Thread.sleep(2000);
		
		clickJ(ca.emailSenderID);
		Thread.sleep(2000);

		
		clickJ(ca.engEmailContent);
		
		Thread.sleep(5000);
		
		//clickJ(ca.subject.get(3));
		
//		scrollToElement(ca.subject.get(3));
		
		Thread.sleep(5000);
		
		ca.subject.get(3).sendKeys("Hello Email subject");
		
		Thread.sleep(5000);
		
		driver.switchTo().frame(0);
		ca.emailContentBody.get(0).sendKeys("This is just for the Testing Purpose");
		driver.switchTo().parentFrame();

		Thread.sleep(2000);
		clickJ(ca.arbEmailContent);
		Thread.sleep(2000);
		
		scrollToElement(ca.subject.get(4));
		Thread.sleep(2000);
		type(ca.subject.get(4), "Hope You are doing great");
		
		driver.switchTo().frame(1);
		ca.emailContentBody.get(1).sendKeys("This is just for the Testing Purpose");
		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
