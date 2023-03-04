package udm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;


public class DropdownAutoSuggestive {



    public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

        System.setProperty("webdriver.gecko.driver", "./src/main/resources/geckodriver.exe");

        WebDriver driver =new FirefoxDriver(); // ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

        WebElement autoDrop = driver.findElement(By.xpath("//input[@id='autosuggest']"));

        autoDrop.click();
        autoDrop.sendKeys("Uni");
        Thread.sleep(3000);

        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for (WebElement option : options){
            if (option.getText().equalsIgnoreCase("United States (USA)")){
                option.click();
                break;
            }
        }

//        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
       // driver.quit();
        
    }



}