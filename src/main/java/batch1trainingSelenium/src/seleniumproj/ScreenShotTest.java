package batch1trainingSelenium.src.seleniumproj;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotTest {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\eclipse-workspace\\Browser driver exe\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		driver.get("https://www.google.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		
	//	System.out.println(file.getAbsolutePath());
		
		File newfile = new File("C:\\Users\\vinay\\eclipse-workspace\\screen shots\\ScreenShotTest.png");
		FileUtils.copyFile(file, newfile);
		
		
		
	}

}
