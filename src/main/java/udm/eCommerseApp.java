package udm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class eCommerseApp {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.getProperty("user.dir"));
        String path = System.getProperty("user.dir") + "/src/main/resources/"+"chromedriver.exe";
        System.out.println("path :"+ path);
        System.setProperty("webdriver.chrome.driver", path);
//        System.setProperty("webdriver.gecko.driver", "C:\\vinayak\\code\\basics-master\\basics-master\\src\\main\\resources\\geckodriver.exe");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setAcceptInsecureCerts(true);
        ChromeOptions options = new ChromeOptions();
        options.merge(desiredCapabilities);
        driver = new ChromeDriver(options);
//        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        

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
