package TestLogin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Utilities.MyUtilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;



public class UserAccountTest extends MyUtilities  {
	

	
	
	@Test(priority = 0)
	public static void testSuccessfulLogin() {
		
		test = extent.createTest("TESTCASE 1 : Test Successful Login to Online store : AutomationPractice ");
		
		AppiumDriver<MobileElement> driver = MyUtilities.testInitialize();
		
		driver.get("http://www.automationpractice.com");
		Wait();
		
		//check if page is launched successfully by checking the page title
	    if (driver.getTitle().toString().equalsIgnoreCase("My Store") ) {
			test.log(Status.PASS, "Page successfully launched");	
		} else {
			test.log(Status.FAIL, "Page fail to launch, actual is : " + driver.getTitle() );
	
		}
		driver.findElementByLinkText("Sign in").click();	
		driver.findElementById("email").sendKeys("blog.cucumber@gmail.com");
		driver.findElementById("passwd").sendKeys("Cucumber@blog");
	    driver.findElementById("SubmitLogin").click();
	    Wait();
	    
	    //close the browser
	    driver.quit();
		
	}
	
	@Test(priority = 1)
	public static void testAddAddress() {
		
		test = extent.createTest("TESTCASE 2 : Test Successful Adding of Address");
		
		AppiumDriver<MobileElement> driver = MyUtilities.testInitialize();
		
		driver.get("http://www.automationpractice.com");
		Wait();
		driver.findElementByLinkText("Sign in").click();	
		driver.findElementById("email").sendKeys("blog.cucumber@gmail.com");
		driver.findElementById("passwd").sendKeys("Cucumber@blog");
	    driver.findElementById("SubmitLogin").click();
	    Wait();
	    

	    //click My address button
	    driver.findElement(By.xpath("//a[@title='Addresses']")).click();
	    Wait();
	    //click Add a new Address button
	    driver.findElement(By.xpath("//a[@title='Add an address']")).click();
	    Wait();
	    
	    
	    //close the browser
	    driver.quit();
		
	}

	
	
}
