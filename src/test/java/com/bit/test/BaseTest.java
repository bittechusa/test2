package com.bit.test;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sun.jna.Platform;

public class BaseTest 
{ 
	public WebDriver driver;
	 
	/*@Before
	public void test3()
	{
		System.setProperty("webdriver.ie.driver", "C:/IEDriverServer.exe");
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		//driver = new ChromeDriver();
		driver = new FirefoxDriver();
		//driver = new InternetExplorerDriver();
	
	 }
		 */
    @Before
	public void setUp() throws Exception 
	{

        DesiredCapabilities capabillities = DesiredCapabilities.iphone();
        capabillities.setCapability("version", "5.0");
        capabillities.setCapability("platform", Platform.MAC);
        capabillities.setCapability("name", "Moga Alamgir");
        this.driver = new RemoteWebDriver(
					  new URL("http://malamgir64:7278d2e3-1b3a-4084-b124-6938458d7d5f@ondemand.saucelabs.com:80/wd/hub"),
					  capabillities);
    }

	
	@After
	public void test2()
	{
		
		driver.quit();
		
	}
}
