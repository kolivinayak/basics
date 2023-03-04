package batch1trainingSelenium.src.seleniumproj;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FileuploaddownloadRobot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\eclipse-workspace\\Browser driver exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");

		driver.findElement(By.id("pickfiles")).click();
		
		String path = "D:\\test123.docx";
		StringSelection str = new StringSelection(path);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(str, null);

		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		Robot robot = new Robot();
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
	
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("uploadfiles")))).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uploadfiles")));
		driver.findElement(By.id("uploadfiles")).click();
		
		//driver.findElement(By.id("uploadfiles")).click();
	
		
		
		WebElement download = driver.findElement(By.id("download"));
				
		wait.until(ExpectedConditions.visibilityOf(download)).click();
		
		//download.click();
		
		File file = new File("C:\\Users\\vinayak.koli.FORGEAHEAD\\Downloads\\test123.pdf");
		System.out.println(file.exists());
		
		File desFile = new File("D:\\VinayaTest.pdf");
		
		FileUtils.copyFile(file, desFile);
	
	
	}

}
