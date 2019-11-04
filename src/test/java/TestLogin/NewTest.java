package TestLogin;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Utilities.MyUtilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class NewTest extends MyUtilities  {
	

	
	
	@Test
	public static void testSuccessfulLogin() {
		
		test = extent.createTest("TESTCASE 1 : Test Successful Login to Online store : AutomationPractice ");
		
		AppiumDriver<MobileElement> driver = MyUtilities.testInitialize();
		
		driver.get("http://www.automationpractice.com");
		Wait();
		
		
		//check if page is launched successfully by checking the page title
	    if (driver.getTitle().toString().equalsIgnoreCase("My Storedsdsdsdsds") ) {
			test.log(Status.PASS, "Page successfully launched");	
		} else {
			test.log(Status.FAIL, "Page fail to launch, actual is : " + driver.getTitle() );
	
		}
		driver.findElementByLinkText("Sign in").click();	
		driver.findElementById("email").sendKeys("blog.cucumber@gmail.com");
		driver.findElementById("passwd").sendKeys("Cucumber@blog");
	    driver.findElementById("SubmitLogin").click();
	    //close the browser
	    driver.quit();
		
	}

	
	
}
