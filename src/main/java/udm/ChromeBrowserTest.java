package udm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ChromeBrowserTest {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        
        System.setProperty("webdriver.chrome.driver", "C:\\vinayak\\code\\basics-master\\basics-master\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--remote-debugging-port=52015");
        options.addArguments("start-maximized"); // open Browser in maximized mode
        options.addArguments("disable-infobars"); // disabling infobars
        options.addArguments("--disable-extensions"); // disabling extensions
        options.addArguments("--disable-gpu"); // applicable to windows os only


        driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String[] itemNeeded = {"Brocolli","Cucumber","Cauliflower","Tomato","Carrot","Pumpkin"};

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        List<WebElement> itemlist = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));

        List itemsToBuy = Arrays.asList(itemNeeded);

        for (int i = 0; i < products.size(); i++) {
            int check = 0;
            String[] name = products.get(i).getText().split("-");
            String itemselected = name[0];
            if (itemsToBuy.contains(itemselected.trim())) {
                System.out.println("product selected " + itemselected);
                itemlist.get(i).click();
                check = check + 1;
            }
            if (check >= itemNeeded.length) {
                break;
            }
        }
        Thread.sleep(60000);
        driver.quit();


    }
}
