package batch1trainingSelenium.src.seleniumproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitAlert {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\eclipse-workspace\\Browser driver exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		
		//driver.get("https://swapnilkoshti.000webhostapp.com/expwait.html");
		driver.get("https://swapnilkoshti.000webhostapp.com/newexpwait.html");
		driver.findElement(By.id("btn")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.close();
	}

}
