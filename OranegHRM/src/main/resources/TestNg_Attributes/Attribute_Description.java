package TestNg_Attributes;

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

public class Attribute_Description {

	public WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() {
		
		driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		System.out.println("i am in @BeforeSuite method");
	}
	
	@BeforeClass
	public void launchURL() {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("i am in @BeforeClass method");
	}
	
	@BeforeMethod	
	public void wiatingTime() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		System.out.println("i am in @BeforeMethod method");
	}
	
	@Test(priority = 1)
	public void enterUsername() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		System.out.println("i am in @test enterusername method");

	}
	
	@Test(priority = 2, description = "this method is used to enter password to the password textbox")
	public void enterPassword() {
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		System.out.println("i am in @test enterPassword method");

	}
	
	@Test(priority = 3, description = "this method is used to click the login button")
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
	public void closeBrowser() {
		
		driver.quit();
		
		System.out.println("i am in @AfterSuite method");

	}

}
