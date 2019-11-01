package TestLogin;

import org.testng.annotations.Test;

import Utilities.MyUtilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class NewTest extends MyUtilities  {
	

	
	
	@Test
	public static void testSuccessfulLogin() {
		
		test = extent.createTest("TESTCASE 1 : Test Successful Login to DP - Staging");
		
		AppiumDriver<MobileElement> driver = MyUtilities.testInitialize();
		
		driver.get("http://www.automationpractice.com");	
		driver.findElementByLinkText("Sign in").click();	
		driver.findElementById("email").sendKeys("blog.cucumber@gmail.com");
		driver.findElementById("passwd").sendKeys("Cucumber@blog");
	    driver.findElementById("SubmitLogin").click();
	    //close the browser
	    driver.quit();
		
	}

	
}
