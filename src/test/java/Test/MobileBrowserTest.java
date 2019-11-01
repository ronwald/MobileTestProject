package Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileBrowserTest {
	
	
	public static void main(String[]args) {
		
		//set desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "My Emulator");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersiob", "9");
		cap.setCapability("browserName", "Chrome");
		cap.setCapability("noReset", true);
		
		//set chrome driver location
		System.setProperty("webdriver.chrome.driver","C:/Chrome Driver/chromedriver_win32/chromedriver.exe");
		
		
		//instantiate appium driver
		AppiumDriver<MobileElement> driver = null;
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
			
		}catch(MalformedURLException e) {
			System.out.println(e.getMessage());
			
		}
		
		//launch the application
		driver.get("http://www.automationpractice.com");
		
		//click sign in
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElementByLinkText("Sign in").click();
		
		//click sign in
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElementById("email").sendKeys("blog.cucumber@gmail.com");
		driver.findElementById("passwd").sendKeys("Cucumber@blog");
	    driver.findElementById("SubmitLogin").click();
		
	}

}
