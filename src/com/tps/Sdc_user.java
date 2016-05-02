package com.tps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sdc_user extends Repo{
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
	public void sdcLogin() throws InterruptedException {
		specLogin();
	}
	@Test(priority=2)
	public void ViewSdc() throws InterruptedException {
		driver.findElement(viewAsSdc).click();
	}
	@Test(priority=3)
	public void viewAndEdit() throws InterruptedException {
		driver.findElement(viewAndEdit).click();
	}
	//SDC EDIT
	//Accounts
		@Test(priority=4)
		public void selectAccounts() throws InterruptedException{
			driver.findElement(selectAccounts).clear();
			driver.findElement(selectAccounts).sendKeys("12345");
			Thread.sleep(4000);
					
		}
		
		//Special instruction
		@Test(priority=5)
		public void instructions() throws InterruptedException{
			driver.findElement(specialInstruction).clear();
			driver.findElement(specialInstruction).sendKeys("khsdbsmbdm");
			Thread.sleep(4000);
					
		}
		@Test(priority=6)
		public void saveSdc() throws InterruptedException{
			Actions action = new Actions(driver);

			// To click on the element
			action.moveToElement(driver.findElement(saveDelegate)).click().perform();
			//driver.findElement(saveDelegate).click();
			Thread.sleep(10000);
			
		}
		@Test(priority=7)
		public void completeSdc() throws InterruptedException{
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(completeDelegate)).click().perform();
			
			Thread.sleep(10000);
		}
		@Test(priority=8)
		public void clickOnIRStatus() throws InterruptedException{
			driver.findElement(irStatus).click();
		}
		@Test(priority=9)
		public void clickOnFinalizeForms() throws InterruptedException{
			driver.findElement(finalizeForms).click();
		}
		@Test(priority=10)
		public void validationAfterFinalize() throws InterruptedException{
			Assert.assertEquals(driver.findElement(viewButtonVal).getText(),"View");
			Assert.assertEquals(driver.findElement(requestStatusVal).getText(),"Request Status: COMPLETED");
		}
	

}
