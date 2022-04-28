package batch1trainingSelenium.src.seleniumproj;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Tools\\selenium java\\Bhadur\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
//		driver.findElement(By.cssSelector("a[href*=\"oog\"]")).click();
//		
//		driver.findElement(By.cssSelector("a[data-g-label=\"Sign in\"]")).click();
//		
		
//		driver.findElement(By.cssSelector("div[style= \"min-width: 220px;\"]")).findElements(By.tagName("a")).get(0).click();
		System.out.println(driver.findElement(By.cssSelector("div[style= \"min-width: 220px;\"]")).findElements(By.tagName("a")).size());
		System.out.println(" value : " + driver.findElement(By.cssSelector("div[style= \"min-width: 220px;\"]")).findElements(By.tagName("a")).get(0).getText());
		System.out.println(" value : " + driver.findElement(By.cssSelector("div[style= \"min-width: 220px;\"]")).findElements(By.tagName("a")).get(1).getText());
		driver.findElement(By.cssSelector("div[style= \"min-width: 220px;\"]")).findElements(By.tagName("a")).get(2).click();
		 System.out.println(" value : " + driver.findElement(By.cssSelector("div[style= \"min-width: 220px;\"]")).findElements(By.tagName("a")).get(3).getText());
	}

}
