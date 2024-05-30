package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
	}
	
	//1st way
	@FindBy(how = How.XPATH, using = "//p[@class='oxd-userdropdown-name']")
	private WebElement username_Dropdown;


	public void clickUserNameDropdown() {

		username_Dropdown.click();
		
	}

}
