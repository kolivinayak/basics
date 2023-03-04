package batch1trainingSelenium.src.seleniumproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\selenium java\\Bhadur\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://swapnilkoshti.000webhostapp.com/login.html");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		driver.switchTo().frame(0);
//		driver.findElement(By.name("username")).sendKeys("Vinayak");
//		driver.findElement(By.name("password")).sendKeys("Test@1234");
//		driver.switchTo().parentFrame();
//		driver.switchTo().frame(1);
//		driver.findElement(By.id("btn")).click();
	/* By string */
//		
//		driver.switchTo().frame("myframe1");
//		driver.findElement(By.name("username")).sendKeys("Vinayak");
//		driver.findElement(By.name("password")).sendKeys("Test@1234");
//		driver.switchTo().parentFrame();
//		driver.switchTo().frame("myframe2");
//		driver.findElement(By.id("btn")).click();
	
		/* By web element */ 
		
		
		driver.switchTo().frame(driver.findElement(By.id("myframe1")));
		driver.findElement(By.name("username")).sendKeys("Vinayak");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.id("myframe2")));
		driver.findElement(By.id("btn")).click();
		driver.switchTo().defaultContent(); // take us to root frame 
		
		//Thread.sleep(3000);
		//driver.close();
	}

}
