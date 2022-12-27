package useCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import reciproci.base.Base;
import reciproci.pages.LoginPageAct;


public class Initials {
	
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Initializing properties file, constants and csv file");
	}
	

	@BeforeTest
	public void beforeTest() {
		System.out.println("Test tag gets started");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
	}
	
	
	
	
	@AfterMethod
	public void afterMethod(){
		Base.driver=null;
	}
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("Test tag gets Ended");
	}
	
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Closing properties file, constants and csv file");
	}
	

}
