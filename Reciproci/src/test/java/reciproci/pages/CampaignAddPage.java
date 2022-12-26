package reciproci.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import locators.CampaignAddLoc;
import reciproci.base.Base;

public class CampaignAddPage extends Base{

	CampaignAddLoc ca = new CampaignAddLoc();

	public CampaignAddPage() {
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, ca);
	}

	
	public void englishTemplate() throws Exception {
		
		String seltemplate="yes";
		
		Thread.sleep(8000);

		Wait<WebDriver> fw = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(Exception.class);
		
		fw.until(ExpectedConditions.elementToBeClickable(ca.clickActivity));
		
		waitv(ca.pageHeader);
		
		waitv(ca.clickActivity);

		click(ca.clickActivity);
		Thread.sleep(2000);
		click(ca.otherCampaignType);
		
		type(ca.campaignName,"Testing campaign 122001");
		type(ca.campaignDescription,"Testing campaign 072101");

		click(ca.pushCommunicationType);
		click(ca.smsCommunicationType);
		click(ca.EmailCommunicationType);

		waitv(ca.deliverySchedule);
		
		clickJ(ca.deliverySchedule);
		
		waitv(ca.immediateSchedule);
		clickJ(ca.immediateSchedule);
		clickJ(ca.continueBasic.get(0));
		
		waitv(ca.notificationLimit);
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

		ca.pushContentTab.click();
		Thread.sleep(1000);
		ca.liknTo.click();
		Thread.sleep(1000);
		ca.liknToOption.click();
		Thread.sleep(1000);

		click(ca.pushTemplate);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Birthday Notification']"))).click();

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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Diwali']"))).click();
		clickJ(ca.smsContentTab);
		
		Thread.sleep(1000);
		clickJ(ca.emailContentTab);
		
		Thread.sleep(1000);
		clickJ(ca.emailTemplate);
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'New Year Offer')]"))).click();
		
		Thread.sleep(2000);
		clickJ(ca.emailSenderIDdd);

		Thread.sleep(2000);
		clickJ(ca.emailSenderID);
		
		Thread.sleep(2000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);

		Thread.sleep(2000);
		clickJ(ca.engEmailContent);
		Thread.sleep(2000);
		typeJ(ca.subject.get(1),"Happy Birthday English");
		Thread.sleep(2000);
		clickJ(ca.engEmailContent);
		
	}
	
	
	public void arabicAndTemplate() throws Exception {
		
		String seltemplate="yes";
		String iArabic="yes";
		
		Thread.sleep(8000);

		Wait<WebDriver> fw = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(Exception.class);
		
		fw.until(ExpectedConditions.elementToBeClickable(ca.clickActivity));
		
		waitv(ca.pageHeader);
		
		waitv(ca.clickActivity);

		click(ca.clickActivity);
		Thread.sleep(2000);
		click(ca.otherCampaignType);
		
		type(ca.campaignName,"Testing campaign 122001");
		type(ca.campaignDescription,"Testing campaign 072101");

		click(ca.pushCommunicationType);
		click(ca.smsCommunicationType);
		click(ca.EmailCommunicationType);

		waitv(ca.deliverySchedule);
		waite(ca.deliverySchedule);
		clickJ(ca.deliverySchedule);
		
		waitv(ca.immediateSchedule);
		waite(ca.immediateSchedule);
		clickJ(ca.immediateSchedule);
		clickJ(ca.continueBasic.get(0));
		
		waitv(ca.notificationLimit);
		waite(ca.notificationLimit);
		type(ca.notificationLimit,"1");
		
		waitv(ca.isArabic);
		waite(ca.isArabic);
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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Birthday Notification']"))).click();

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
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Diwali']"))).click();
		clickJ(ca.smsContentTab);
		
		Thread.sleep(1000);
		clickJ(ca.emailContentTab);
		
		Thread.sleep(1000);
		clickJ(ca.emailTemplate);
		
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'New Year Offer')]"))).click();
		
		Thread.sleep(2000);
		clickJ(ca.emailSenderIDdd);
		Thread.sleep(2000);
		clickJ(ca.emailSenderID);
		Thread.sleep(2000);

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);


		Thread.sleep(2000);
		clickJ(ca.engEmailContent);
		Thread.sleep(2000);
		typeJ(ca.subject.get(2),"Happy Birthday English");
		Thread.sleep(2000);
//		Thread.sleep(3000);
//		driver.switchTo().frame(0);
//		Thread.sleep(2000);
//		ca.emailContentBody.sendKeys("This is just for the Testing Purpose,English");
//		driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent();
		clickJ(ca.engEmailContent);

		
		Thread.sleep(2000);
		clickJ(ca.arbEmailContent);
		Thread.sleep(2000);
		typeJ(ca.subject.get(3),"Happy Birthday Arabic");
		Thread.sleep(2000);
//		driver.switchTo().frame(1);
//		Thread.sleep(2000);
//		ca.emailContentBody.sendKeys("This is just for the Testing Purpose,Arabic");
//		driver.switchTo().parentFrame();
//		driver.switchTo().defaultContent();
		clickJ(ca.arbEmailContent);
		Thread.sleep(2000);
		// ca.cancelCampaign.click();

	}
	
	
	public void arabicCampaign() throws Exception {
		
		String seltemplate="yes";
		String iArabic="yes";
		
		Thread.sleep(8000);

		Wait<WebDriver> fw = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(Exception.class);
		
		fw.until(ExpectedConditions.elementToBeClickable(ca.clickActivity));
		
		waitv(ca.pageHeader);
		
		waitv(ca.clickActivity);

		click(ca.clickActivity);
		Thread.sleep(2000);
		click(ca.otherCampaignType);
		
		type(ca.campaignName,"Testing campaign 122001");
		type(ca.campaignDescription,"Testing campaign 072101");

		click(ca.pushCommunicationType);
		click(ca.smsCommunicationType);
		click(ca.EmailCommunicationType);

		waitv(ca.deliverySchedule);
		waite(ca.deliverySchedule);
		clickJ(ca.deliverySchedule);
		
		waitv(ca.immediateSchedule);
		waite(ca.immediateSchedule);
		clickJ(ca.immediateSchedule);
		clickJ(ca.continueBasic.get(0));
		
		waitv(ca.notificationLimit);
		waite(ca.notificationLimit);
		type(ca.notificationLimit,"1");
		
		waitv(ca.isArabic);
		waite(ca.isArabic);
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

		ca.pushContentTab.click();
		Thread.sleep(1000);
		ca.liknTo.click();
		Thread.sleep(1000);
		ca.liknToOption.click();
		Thread.sleep(1000);
		
		ca.subject.get(0).sendKeys("Push Subject english");
		Thread.sleep(1000);
		ca.content.get(0).sendKeys("Push Content english");
		Thread.sleep(1000);
		ca.subject.get(1).sendKeys("Push Subject Arb");
		Thread.sleep(1000);
		ca.content.get(1).sendKeys("Push Content Arabic");

//		click(ca.pushTemplate);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Birthday Notification']"))).click();

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

//		click(ca.smsTemplate);
//		Thread.sleep(1000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Diwali']"))).click();
		
		ca.content.get(2).sendKeys("SMS Content english");
		Thread.sleep(1000);
		ca.content.get(3).sendKeys("SMS Content arabic");
		Thread.sleep(1000);
		clickJ(ca.smsContentTab);
		
		Thread.sleep(1000);
		clickJ(ca.emailContentTab);
		Thread.sleep(2000);
		clickJ(ca.emailSenderIDdd);
		Thread.sleep(2000);
		clickJ(ca.emailSenderID);
		Thread.sleep(2000);


		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);

		Thread.sleep(2000);
		clickJ(ca.engEmailContent);
		Thread.sleep(2000);
		typeJ(ca.subject.get(2),"Happy Birthday English");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		ca.emailContentBody.sendKeys("This is just for the Testing Purpose,English");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		clickJ(ca.engEmailContent);

		
		Thread.sleep(2000);
		clickJ(ca.arbEmailContent);
		Thread.sleep(2000);
		typeJ(ca.subject.get(3),"Happy Birthday Arabic");
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		ca.emailContentBody.sendKeys("This is just for the Testing Purpose,Arabic");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		clickJ(ca.arbEmailContent);
		Thread.sleep(2000);
		//ca.cancelCampaign.click();

	}
	
	
	public void englishCampaign() throws Exception {
		
		Thread.sleep(6000);

		Wait<WebDriver> fw = new FluentWait<WebDriver> (driver)
		.withTimeout(Duration.ofSeconds(30))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(Exception.class);
		
		fw.until(ExpectedConditions.elementToBeClickable(ca.clickActivity));
		
		waitv(ca.pageHeader);
		
		waitv(ca.clickActivity);

		click(ca.clickActivity);
		Thread.sleep(2000);
		click(ca.otherCampaignType);
		
		type(ca.campaignName,"Testing campaign 122001");
		type(ca.campaignDescription,"Testing campaign 072101");

		click(ca.pushCommunicationType);
		click(ca.smsCommunicationType);
		click(ca.EmailCommunicationType);

		waitv(ca.deliverySchedule);
		waite(ca.deliverySchedule);
		clickJ(ca.deliverySchedule);
		
		waitv(ca.immediateSchedule);
		waite(ca.immediateSchedule);
		clickJ(ca.immediateSchedule);
		clickJ(ca.continueBasic.get(0));
		
		waitv(ca.notificationLimit);
		waite(ca.notificationLimit);
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

		ca.pushContentTab.click();
		Thread.sleep(1000);
		ca.liknTo.click();
		Thread.sleep(1000);
		ca.liknToOption.click();
		Thread.sleep(1000);
		
		ca.subject.get(0).sendKeys("Push Subject english");
		Thread.sleep(1000);
		ca.content.get(0).sendKeys("Push Content english");
		Thread.sleep(1000);

//		click(ca.pushTemplate);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Birthday Notification']"))).click();

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

//		click(ca.smsTemplate);
//		Thread.sleep(1000);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Diwali']"))).click();
		
		ca.content.get(1).sendKeys("SMS Content english");
		Thread.sleep(1000);
		clickJ(ca.smsContentTab);
		
		Thread.sleep(1000);
		clickJ(ca.emailContentTab);
		Thread.sleep(2000);
		clickJ(ca.emailSenderIDdd);
		Thread.sleep(2000);
		clickJ(ca.emailSenderID);
		Thread.sleep(2000);

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		rb.keyRelease(KeyEvent.VK_PAGE_DOWN);

		Thread.sleep(2000);
		clickJ(ca.engEmailContent);
		Thread.sleep(2000);
		typeJ(ca.subject.get(1),"Happy Birthday English");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		ca.emailContentBody.sendKeys("This is just for the Testing Purpose,English");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		clickJ(ca.engEmailContent);
		
		Thread.sleep(2000);
		ca.cancelCampaign.click();


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
		//ca.emailContentBody.get(0).sendKeys("This is just for the Testing Purpose");
		driver.switchTo().parentFrame();

		driver.switchTo().defaultContent();

		//clickJ(ca.submitCampaign);

	}



}
