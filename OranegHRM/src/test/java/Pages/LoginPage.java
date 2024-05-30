package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	// 1st way

	private By username_TextBox = By.xpath("//input[@name='username']");

	private By password_TextBox = By.xpath("//input[@name='password']");

	private By login_Button = By.xpath("//button[@type='submit']");

	private By forgotYourPassword_Link = By.xpath("//p[text()='Forgot your password? ']");

	public void enterUsername(String username) {

		driver.findElement(username_TextBox).sendKeys(username);
	}

	public void enterpassword(String password) {

		driver.findElement(password_TextBox).sendKeys(password);
	}

	public void clickLogin() {

		driver.findElement(login_Button).click();
	}

	public void clickForgotYourPassword() {

		driver.findElement(forgotYourPassword_Link).click();
	}

}
