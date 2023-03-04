package batch1trainingSelenium.src.seleniumproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSelectorDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Tools\\selenium java\\Bhadur\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
	//	driver.findElement(By.xpath("//a[@data-pid=\"23\" and @class = \"gb_P\"]")).click();
	//	driver.findElement(By.xpath("//*[starts-with(@data-pid,\"2\")]")).click();
		
		driver.findElement(By.xpath("//a[contains(@data-pid,\"23\")]")).click();
		// //*[contains(@data-pid,"2")]
		//  //*[text()="Gmail"]
		
	}

}
