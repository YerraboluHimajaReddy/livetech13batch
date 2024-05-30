package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Common.BaseOrCommon;
import Methods.ForgotYourPasswordMethods;
import Pages.LoginPage;

public class TC_2_VerifyForgotYourPassword extends BaseOrCommon {
	
	LoginPage lp;
	
	ForgotYourPasswordMethods fpm;
	
	@BeforeSuite
	public void launchBrowser() {
		
		browserLaunching("Chrome");
		
		lp = new LoginPage(driver);
		
		fpm = new ForgotYourPasswordMethods(driver);
		
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
	
	@Test(priority = 0)
	public void clickForgotYourPassword() {
		
		lp.clickForgotYourPassword();
		
		System.out.println("i am in @test enterusername method");
	}
	
	
	@Test(priority = 1)
	public void enterUsername() {
		
		fpm.enterUsername("Siressha");
		
		System.out.println("i am in @test enterusername method");
	}
	
	@Test(priority = 2)
	public void clickCancel() {
		
		fpm.clickCancel();
		
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
