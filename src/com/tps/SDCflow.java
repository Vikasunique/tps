package com.tps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SDCflow extends Repo {
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
	public void login() throws InterruptedException{
		clientLogin();
		Assert.assertTrue(driver.findElement(bmoFinancialGroupLoago).isDisplayed());
		Assert.assertTrue(driver.findElement(home).isDisplayed());
		Assert.assertTrue(driver.findElement(lastSignIn).isDisplayed());
		
	}
	@Test(priority=2)
	public void clickOnView() throws InterruptedException{
		Actions action = new Actions(driver);

		// To click on the element
		action.moveToElement(driver.findElement(view)).click().perform();
		//driver.findElement(view).click();
		
	}
	@Test(priority=3)
	public void clickOnAddUserDelegate() throws InterruptedException{
		addDelegate();
		
	}
	@Test(priority=4)
	public void logOut() throws InterruptedException{
		signOut();
		
	}
	@Test(priority=5)
	public void loginAsDelegate() throws InterruptedException{
		delegateLogin();
	}
	@Test(priority=6)
	public void clickOnViewAsDelegate() throws InterruptedException{
		driver.findElement(viewAsDelegate).click();
		
	}
	@Test(priority=7)
	public void clickOnViewAndEdit() throws InterruptedException{
		driver.findElement(viewAndEdit).click();
		
	}
	//CID client setup forms

	@Test(priority=8)
	public void implementationContact() throws InterruptedException{
		driver.findElement(implementationContact).clear();
		driver.findElement(implementationContact).sendKeys("Gale");
		Thread.sleep(4000);
		driver.findElement(galeTest).click();		
	}
	@Test(priority=9)
	public void processingContact() throws InterruptedException{
		Thread.sleep(4000);
//		driver.findElement(processingContact).clear();
//		driver.findElement(processingContact).sendKeys("Gale Test");
		Thread.sleep(4000);
		//driver.findElement(galeTestPc).click();
	}
	@Test(priority=10)
	public void technicalContact() throws InterruptedException{
		driver.findElement(technicalContact).clear();
		driver.findElement(technicalContact).sendKeys("Gale Test");
		Thread.sleep(4000);
		
		//driver.findElement(galeTestTc).click();	
	}
	//Accounts
	@Test(priority=11)
	public void selectAccounts() throws InterruptedException{
		driver.findElement(selectAccounts).clear();
		driver.findElement(selectAccounts).sendKeys("wmf");
		Thread.sleep(4000);
		driver.findElement(wmf).click();		
	}
	
	//Special instruction
	@Test(priority=12)
	public void instructions() throws InterruptedException{
		driver.findElement(specialInstruction).clear();
		driver.findElement(specialInstruction).sendKeys("abcd");
		Thread.sleep(4000);
				
	}
	@Test(priority=13)
	public void saveDelegate() throws InterruptedException{
		Actions action = new Actions(driver);

		// To click on the element
		action.moveToElement(driver.findElement(saveDelegate)).click().perform();
		//driver.findElement(saveDelegate).click();
		Thread.sleep(10000);
		
	}
	@Test(priority=14)
	public void completeDelegate() throws InterruptedException{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(completeDelegate)).click().perform();
		
		Thread.sleep(10000);
	}
	@Test(priority=15)
	public void signoutFromDelegate() throws InterruptedException{
		Thread.sleep(4000);
		signOut();
	}
	@Test(priority=16)
	public void loginAsClient() throws InterruptedException{
		clientLogin();
	}
	@Test(priority=17)
	public void clickOnView1() throws InterruptedException{
		Actions action = new Actions(driver);

		// To click on the element
		action.moveToElement(driver.findElement(view)).click().perform();
		//driver.findElement(view).click();
		
	}
	@Test(priority=18)
	public void clickOnViewAndEdit1() throws InterruptedException{
		//driver.findElement(viewAndEdit).click();
		
	}
	@Test(priority=19)
	public void checkProductStatus() throws InterruptedException{
		System.out.println(driver.findElement(recentProductStatus).getText());
		Assert.assertEquals(driver.findElement(recentProductStatus).getText(),"COMPLETED");
		
	}
	@Test(priority=20)
	public void clientSubmit() throws InterruptedException{
		Thread.sleep(7000);
		driver.findElement(clientSubmit).click();
		
		
	}
	@Test(priority=21)
	public void clientSignout() throws InterruptedException{
		signOut();
	}
	@Test(priority=22)
	public void sdcLogin() throws InterruptedException {
		specLogin();
	}
	@Test(priority=23)
	public void ViewSdc() throws InterruptedException {
		driver.findElement(viewAsSdc).click();
	}
	@Test(priority=24)
	public void viewAndEdit() throws InterruptedException {
		driver.findElement(viewAndEdit).click();
	}
	//SDC EDIT
	//Accounts
		@Test(priority=25)
		public void selectAccounts_sdc() throws InterruptedException{
			driver.findElement(selectAccounts).clear();
			driver.findElement(selectAccounts).sendKeys("12345");
			Thread.sleep(4000);
					
		}
		
		//Special instruction
		@Test(priority=26)
		public void instructionsSdc() throws InterruptedException{
			driver.findElement(specialInstruction).clear();
			driver.findElement(specialInstruction).sendKeys("khsdbsmbdm");
			Thread.sleep(4000);
					
		}
		@Test(priority=27)
		public void saveSdc() throws InterruptedException{
			Actions action = new Actions(driver);

			// To click on the element
			action.moveToElement(driver.findElement(saveDelegate)).click().perform();
			//driver.findElement(saveDelegate).click();
			Thread.sleep(10000);
			
		}
		@Test(priority=28)
		public void completeSdc() throws InterruptedException{
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(completeDelegate)).click().perform();
			
			Thread.sleep(10000);
		}
		@Test(priority=29)
		public void clickOnIRStatus() throws InterruptedException{
			driver.findElement(irStatus).click();
		}
		@Test(priority=30)
		public void clickOnFinalizeForms() throws InterruptedException{
			driver.findElement(finalizeForms).click();
		}
		@Test(priority=31)
		public void validationAfterFinalize() throws InterruptedException{
			Assert.assertEquals(driver.findElement(viewButtonVal).getText(),"View");
			Assert.assertEquals(driver.findElement(requestStatusVal).getText(),"Request Status: COMPLETED");
		}
	

}
