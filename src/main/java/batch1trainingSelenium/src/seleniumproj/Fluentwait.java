package batch1trainingSelenium.src.seleniumproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fluentwait {

/*	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\eclipse-workspace\\Browser driver exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		
		driver.get("https://swapnilkoshti.000webhostapp.com/newexpwait.html");
	
		WebElement elm = driver.findElement(By.id("btn"));
		
		Wait<WebDriver> wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOf(elm));
		
		elm.click();
		
	*//*
		Wait<WebDriver> fwt = new FluentWait<WebDriver>(driver).pollingEvery(700, TimeUnit.MILLISECONDS).withTimeout(60, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
	*//*//	Wait<WebDriver> fwt1 = new FluentWait<WebDriver>
		
		fwt.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		
		driver.close();
	
	}*/

}
