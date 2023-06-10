package udm;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calendar {

    public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\vinayak\\code\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        //WebDriver driver = chromeDriver;
        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800)", "");
        
        Thread.sleep(5000);
        
        driver.findElement(By.id("form-field-travel_comp_date")).click();
        while(!(driver.findElement(By.cssSelector("[class='flatpickr-month'] [class='flatpickr-current-month'] [class='cur-month']")).getText().contains("August")))
        {
            driver.findElement(By.xpath("(//div[@class='flatpickr-current-month']/following-sibling::span)[1]")).click();
            Thread.sleep(2000);
        }
        
        List<WebElement> dates= driver.findElements(By.cssSelector("[class='flatpickr-innerContainer'] [class='flatpickr-days']   [class='dayContainer']  [class='flatpickr-day '] "));
//Grab common attribute//Put into list and iterate
        Iterator< WebElement> itr = dates.listIterator();
        while (itr.hasNext()){
            WebElement day = itr.next();
            if( day.getText().equalsIgnoreCase("21")){
                day.click();
                break;
            }
        }

        Thread.sleep(5000);
        driver.close();
    }
}

