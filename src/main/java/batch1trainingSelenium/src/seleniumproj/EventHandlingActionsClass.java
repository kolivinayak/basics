package batch1trainingSelenium.src.seleniumproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class EventHandlingActionsClass {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\eclipse-workspace\\Browser driver exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
			
//		driver.get("https://www.amazon.com/");
//		
//		WebElement el = driver.findElement(By.id("nav-link-accountList"));
//		WebElement el1 = driver.findElement(By.xpath("//*[text()=\"Your Account\"]")); 
//		Actions actions = new Actions(driver);
//		
//		Action action = actions.moveToElement(el).click(el1).build();
//		
//		action.perform();
		
	
/*		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement el1 = driver.findElement(By.cssSelector("li#credit2"));
		WebElement el2 = driver.findElement(By.xpath("//*[@id='bank']/li")); 
		
		Actions actions = new Actions(driver);
	//	Action action = actions.dragAndDrop(el1, el2).build();
		Action action = actions.contextClick(el1).build();
		action.perform();*/
		
		driver.get("https://www.google.co.in/");
		
		WebElement el1 = driver.findElement(By.name("q")); 
		
		Actions actions = new Actions(driver);
		Action action = actions.moveToElement(el1).click().keyDown(Keys.SHIFT).sendKeys("Vinayak").build();
		action.perform();
		
	}

}
