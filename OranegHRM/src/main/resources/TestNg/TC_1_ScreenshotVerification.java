package TestNg;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Listners.Laptop_Listeners;

public class TC_1_ScreenshotVerification extends BaseOrCommon {
	
	Laptop_Listeners lp;
	
	@BeforeSuite
	public void launchBrowser() throws IOException {
		
		browserLaunching("chrome");
		
		lp = new Laptop_Listeners();
		
		driver.manage().window().maximize();
		
		System.out.println("i am in @BeforeSuite method");
		
		screenshot("browserLaunched");
	}
	
	@BeforeClass
	public void launchURL() throws IOException {
		
		lp.beforeNavigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", driver);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		lp.afterNavigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", driver);

		System.out.println("i am in @BeforeClass method");
		
		screenshot("URLLaunched");

	}
	
	@BeforeMethod	
	public void wiatingTime() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		System.out.println("i am in @BeforeMethod method");
	}
	
	@Test(priority = 1)
	public void enterUsername() throws IOException {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		System.out.println("i am in @test enterusername method");
		
		screenshot("username");

	}
	
	@Test(priority = 2)
	public void enterPassword() throws IOException {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		System.out.println("i am in @test enterPassword method");
		
		screenshot("password");


	}
	
	@Test(priority = 3)
	public void clickLogin() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("i am in @test clickLogin method");

	}
	
	
	@AfterMethod	
	public void wiatingTime1() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		System.out.println("i am in @aftermethod method");
	}
	
	@AfterSuite
	public void closeBrowser() throws IOException {
		
		screenshot("Homepage");
		
		driver.quit();
		
		System.out.println("i am in @AfterSuite method");

	}

}
