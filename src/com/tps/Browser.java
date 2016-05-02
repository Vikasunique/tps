package com.tps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	public static WebDriver driver;
	public static WebDriver getBrowser() {
		if(Constants.Browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pritam\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Constants.Browser.equals("ie")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\pritam\\Downloads\\chromedriver_win32\\nternetExplorerDriver.exe");
			driver = new InternetExplorerDriver();
		}
		else if(Constants.Browser.equals("firefox")){
			
			driver = new FirefoxDriver();
		}
		return driver;
		
		}

}
