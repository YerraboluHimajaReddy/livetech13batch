package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Rohit_SignOut {

	public WebDriver driver;

	public Rohit_SignOut(WebDriver driver) {

		this.driver = driver;
	}
	
	//2nd way
	
	@FindBy(xpath= "//a[text()='About']")
	private WebElement about;
	
	@FindBy(xpath= "//a[text()='Support']")
	private WebElement support;
	
	@FindBy(xpath= "//a[text()='Logout']")
	private WebElement logout;

	@FindBy(xpath= "//a[text()='Change Password']")
	private WebElement changePassword;

	public void clickSupport() {

		support.click();		
	}

	public void clickLogout() {

		logout.click();		
	}	

	public void clickChangePassword() {

		changePassword.click();		
	}

	public void clickAbout() {

		about.click();
	}

}
