package batch1trainingSelenium.src.seleniumproj;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidTest {
/*
	public static void main(String[] args) {
 		 // WebDriver driver;
		  AndroidDriver<WebElement> driver;
		  File app = new File("C:\\Users\\vinay\\eclipse-workspace\\android\\src\\test\\resource","app-dev-debug.apk");
		  DesiredCapabilities capability = new DesiredCapabilities();
		  capability.setCapability("device","android");
		  capability.setCapability(CapabilityType.BROWSER_NAME, "");
		  capability.setCapability(CapabilityType.VERSION, "8.1.0");
		  capability.setCapability("app", app.getAbsolutePath());
		  capability.setCapability("deviceName", "vinayak");
		  capability.setCapability("platformName", "android");
		  capability.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		  capability.setCapability("uninstallOtherPackages", "com.constructsecure.bahadur.dev");
		  // to be captured from adb catlog
		  capability.setCapability("appPackage", "com.constructsecure.bahadur.dev");
		  // to be captured from adb catlog method name which opens the app
		 capability.setCapability("appActivity", "com.constructsecure.bahadur.ui.splashscreen.SplashActivity");
		  try {
			//driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capability);
			driver = new AndroidDriver<WebElement> (new URL("http://127.0.0.1:4723/wd/hub"),capability);
		//	driver = new AndroidDriver (new URL("127.0.0.1:4723/wd/hub"),capability);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("In first catch");
			System.out.println(" The error message is " + e.getMessage());
		} 

		  
		  try {
		  System.out.println("starting Android test");
		  driver.findElement(By.xpath("//*[@id = 'password' and index = '4' ]")).sendKeys("Test@123456"); 
		  driver.findElement(By.xpath("//*[@text ='SIGN IN']")).click();
	 	  System.out.println("Exiting test");
	 	  
	 	  //driver.quit();
		  }
	 	  catch (Exception e) {
	 		System.out.println("in second catch");
			System.out.println(e.getMessage());
		//	e.printStackTrace();
	 	  }
			  
	}		*/
}


