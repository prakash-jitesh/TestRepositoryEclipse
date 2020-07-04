package Tests;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
static AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public static void main(String[] args) {
		try {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		//caps.setCapability("platformName", "ANDRIOD");
		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(CapabilityType.VERSION, "10.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME,"NEXUS 5X API 24");
		caps.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60");
		//caps.setCapability(MobileCapabilityType.APP,"");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
		

		
			URL url = new URL ("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,caps);
		
		}catch(Exception exp) {
			
			//System.out.println("Cause is :" ,+exp.getCause());
			//System.out.println("Message is : " ,+exp.getMessage());
			exp.printStackTrace();
		}
		
	} 
	
	@Test
	public void SampleTest() {
		System.out.println("I am inside Test");
	}
	
	@AfterTest
public void teardown() {
		
		
	}
}

