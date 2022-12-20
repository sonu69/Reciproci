package pomLite;


import org.testng.SkipException;
import org.testng.annotations.Test;

import reciproci.base.Base;
import reciproci.pages.LoginPageAct;

import org.openqa.selenium.By;

 class LoginValidation extends Initialize{

	@Test
	public void doLogin() {
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("test@123");
		driver.findElement(By.cssSelector(".login")).click();
	}
	
	
	@Test
	public void doLoginAgain() {
		driver.findElement(By.name("userName")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("test@1234");
		driver.findElement(By.cssSelector(".login")).click();
	}
	
	@Test(dataProviderClass=Base.class,dataProvider="excel-data",enabled=false)
	public void login(String username, String password,String runMode) throws Exception{
		LoginPageAct lp = new LoginPageAct();
		if(runMode.equalsIgnoreCase("N")) {
			throw new SkipException("");
		}else {
		lp.doLogin(username,password);
		}
	}


}
