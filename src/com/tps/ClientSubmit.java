package com.tps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClientSubmit extends Repo{
	@BeforeClass
	public void openBrowser() throws InterruptedException {

	    //driver = new FirefoxDriver();
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\pritam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	    driver.get("http://bmo-tps-esf-qa.gale43labs.com/accounts/login/");
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void loginAsClient() throws InterruptedException{
		clientLogin();
	}
	@Test(priority=2)
	public void clickOnView1() throws InterruptedException{
		Actions action = new Actions(driver);

		// To click on the element
		action.moveToElement(driver.findElement(view)).click().perform();
		//driver.findElement(view).click();
		
	}
	@Test(priority=3)
	public void clickOnViewAndEdit1() throws InterruptedException{
		//driver.findElement(viewAndEdit).click();
		
	}
	@Test(priority=4)
	public void checkProductStatus() throws InterruptedException{
		System.out.println(driver.findElement(recentProductStatus).getText());
		Assert.assertEquals(driver.findElement(recentProductStatus).getText(),"COMPLETED");
		
	}
	@Test(priority=5)
	public void clientSubmit() throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(clientSubmit).click();
		
		
	}
	@Test(priority=5)
	public void clientSignout() throws InterruptedException{
		signOut();
		
		
	}
}
