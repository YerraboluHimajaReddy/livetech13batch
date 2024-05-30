package SeleniumIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Execution {

	public static void main(String[] args) {

		//parent objectname = new childclass();
		
		//System.getProperty("webdriver.edge.driver", "");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/");
	}

}
