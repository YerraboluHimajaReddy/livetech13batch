package TestNg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseOrCommon {

	public WebDriver driver;

	public void browserLaunching(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();
		} else {

			driver = new SafariDriver();
		}

	}

	public void urlLaunching(String url) {

		driver.get(url);
	}

	public void browserClosing() {

		driver.quit();
	}
	
	public void waitingTime()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	public void screenshot(String screenshotName) throws IOException {
		
		File nagamani = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(nagamani, new File("C:\\Users\\himaj\\eclipse-workspace\\19thFeb2023\\OranegHRM\\src\\test\\java\\Screenshots\\"+screenshotName +".png")); 
	}
	
	

}
