package udm;

import io.netty.handler.codec.string.LineSeparator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.List;

public class Assignment {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        Assert.assertTrue(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());

        driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());

        List<WebElement> checkboxs = driver.findElements(By.cssSelector("input[type='checkbox']"));

        System.out.println("The no of checkbozes on page are : " +checkboxs.size());

        driver.quit();

    }

}
