package pomLite;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

class Initialize {

	protected static WebDriver driver=null;

	@BeforeTest
	public void startTest() {
		System.out.println("startTest");
	}

	@BeforeMethod
	public void beforeMethod() {
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://ca-admin-uat.reciproci.com/admin/login");
		}
	}

	@AfterMethod
	public void afterMethod() {
		driver=null;

	}


	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}



}
