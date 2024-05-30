package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Common.BaseOrCommon;
import Pages.LoginPage;

public class TC_1_LoginToOrangeHRMTest extends BaseOrCommon {
	
	LoginPage lp;
	
	@BeforeSuite
	public void launchBrowser() {
		
		browserLaunching("Chrome");
		
		lp = new LoginPage(driver);
		
		driver.manage().window().maximize();
		
		System.out.println("i am in @BeforeSuite method");
	}
	
	@BeforeClass
	public void launchURL() {
		
		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("i am in @BeforeClass method");
	}
	
	@BeforeMethod	
	public void wiatingTime() {
		
		waitingTime();		
		
		System.out.println("i am in @BeforeMethod method");
	}
	
	@Test(priority = 1)
	public void enterUsername() {
		
		lp.enterUsername("naagamani");
		
		System.out.println("i am in @test enterusername method");
	}
	
	@Test(priority = 2)
	public void enterPassword() {
		
		lp.enterpassword("manasa");
		
		System.out.println("i am in @test enterPassword method");
	}
	
	@Test(priority = 3)
	public void clickLogin() {
		
		lp.clickLogin();
		
		System.out.println("i am in @test clickLogin method");
	}
	
	
	@AfterMethod	
	public void wiatingTime1() {
		
		waitingTime();
		
		System.out.println("i am in @aftermethod method");
	}
	
	@AfterSuite
	public void closeBrowser() {
		
		browserClosing();
		
		System.out.println("i am in @AfterSuite method");
	}

}
