package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_Execution {

	public static void main(String[] args) {

		//parent objectname = new childclass();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java");
	}

}
