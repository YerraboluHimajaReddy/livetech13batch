package TestNg_Attributes;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestNg.BaseOrCommon;

public class Attribute_DataProvider extends BaseOrCommon {
	
	@BeforeSuite
	public void launchBrowser() {
		
		browserLaunching("chrome"); 
		
		driver.manage().window().maximize();
		
		System.out.println("i am in @BeforeSuite method");
	}
	
	@BeforeClass
	public void launchURL() {
		
		urlLaunching("https://www.facebook.com/");
		
		System.out.println("i am in @BeforeClass method");
	}
	
	@BeforeMethod	
	public void wiatingTime() {
		
		waitingTime();
		
		System.out.println("i am in @BeforeMethod method");
	}
	
	@DataProvider (name ="facebookLogin")
	public Object[][] getCredentials(){
		
		Object[][] values  = new Object[3][2];
		
		values[0][0] ="pavan";
		values[0][1] = "pavan@test";
		
		values[1][0] ="Sudha";
		values[1][1] = "sudh123";
		
		values[2][0] ="madhu";
		values[2][1] = "livetech***";		
		
		return values;
		
	}
	
	@Test(dataProvider = "facebookLogin")
	public void enterCredentials(String username, String password) {
		
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name='pass']")).clear();
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
		
		System.out.println("i am in @test enterCredentials method");

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
