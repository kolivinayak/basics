package batch1trainingSelenium.src.seleniumproj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\selenium java\\Bhadur\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		
		driver.get("https://qa.csqa.me/enroll/1/details");
		
		driver.findElement(By.xpath("//div[@class='einField']//input[1]")).sendKeys("1");
		driver.findElement(By.xpath("//div[@class='einField']//input[2]")).sendKeys("2");
		driver.findElement(By.xpath("//div[@class='einField']//input[3]")).sendKeys("3");
		driver.findElement(By.xpath("//div[@class='einField']//input[4]")).sendKeys("4");
		driver.findElement(By.xpath("//div[@class='einField']//input[5]")).sendKeys("5");
		driver.findElement(By.xpath("//div[@class='einField']//input[6]")).sendKeys("6");
		driver.findElement(By.xpath("//div[@class='einField']//input[7]")).sendKeys("7");
		driver.findElement(By.xpath("//div[@class='einField']//input[8]")).sendKeys("8");
		driver.findElement(By.xpath("//div[@class='einField']//input[9]")).sendKeys("9");
	
	}

}
