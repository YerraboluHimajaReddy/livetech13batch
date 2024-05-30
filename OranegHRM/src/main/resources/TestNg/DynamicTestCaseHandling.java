package TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DynamicTestCaseHandling extends BaseOrCommon {
	
	@BeforeSuite
	public void launchBrowser() {
		
		browserLaunching("chrome"); 
		
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
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		System.out.println("i am in @test enterusername method");

	}
	
	@Test(priority = 2)
	public void enterPassword() {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		System.out.println("i am in @test enterPassword method");

	}
	
	@Test(priority = 3)
	public void clickLogin() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
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
