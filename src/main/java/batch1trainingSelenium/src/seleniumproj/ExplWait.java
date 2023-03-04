package batch1trainingSelenium.src.seleniumproj;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplWait {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\eclipse-workspace\\Browser driver exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

		driver.get("https://swapnilkoshti.000webhostapp.com/newexpwait.html");
	
		
		WebElement elm = driver.findElement(By.id("btn"));
		
//		Wait<WebDriver> wt = new WebDriverWait(driver, 30);
		Wait<WebDriver> wt = new WebDriverWait(driver, Duration.ofSeconds(30));
		wt.until(ExpectedConditions.visibilityOf(elm));

		elm.click();
		
		wt.until(ExpectedConditions.alertIsPresent());
		
		/******** Try this method on your own ***********/
		//wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		//wt.until(ExpectedConditions.invisibilityOfAllElements(elements))
		
		driver.switchTo().alert().accept();

		driver.close();
	}

}
