package Tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Common.BaseOrCommon;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignOut;

public class TC_3_LoginAndLogout extends BaseOrCommon {
	
	LoginPage lp;
	
	HomePage hp;
	
	SignOut sp;
	
	@BeforeSuite
	public void launchBrowser() {
		
		browserLaunching("Chrome");
		
		lp = new LoginPage(driver);
		
		//Classname objectname = pagefactory.initElements(webdriver object, Classname.class);
		
		hp = PageFactory.initElements(driver, HomePage.class);
		
		sp = PageFactory.initElements(driver, SignOut.class);
		
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
		
		lp.enterUsername("Admin");
		
		System.out.println("i am in @test enterusername method");
	}
	
	@Test(priority = 2)
	public void enterPassword() {
		
		lp.enterpassword("admin123");
		
		System.out.println("i am in @test enterPassword method");
	}
	
	@Test(priority = 3)
	public void clickLogin() {
		
		lp.clickLogin();
		
		System.out.println("i am in @test clickLogin method");
	}
	
	@Test(priority = 4)
	public void clickUsernameDropdown() {
		
		hp.clickUserNameDropdown();
		
		System.out.println("i am in @test clickUsernameDropdown method");
	}
	

	@Test(priority = 5)
	public void clickLogout() {
		
		sp.clickLogout();
		
		System.out.println("i am in @test clickLogout method");
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
