package com.sss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Reposss {
	public WebDriver driver;

	By userId=By.id("inputEmail");
	By password=By.id("inputPassword");
	By continueButton=By.xpath("//button[text()='Continue']");
	//validation
	By bmoFinancialGroupLoago=By.xpath("//img[@src='/static/images/u88.png']");
	By home=By.xpath("//a[text()='Home ']");
	
	By automationClient=By.xpath("//div[@class='TPS-header-client']/h1/span");
	By lastSignIn=By.xpath("//h3[contains(text(),'Last Sign-in')]");
	By status=By.xpath("//tr[@class='table-th-font']/td[3]");
	By view=By.xpath("//tr[@class='table-th-font'][1]/td[5]/a[text()='View']");
	
	By implementationRequest=By.xpath("//h2[contains(text(),'Implementation Request:')]");
	By productStatus=By.xpath("//td[text()='Tax-Pay']/following-sibling::td/span");
	By irStatusButtonView=By.xpath("//div[@class='ir-status-button']");
	//add user/delegate
	By addUser=By.xpath("//span[text()='Add User']");
	By firstName=By.id("id_form-0-first_name");
	By lastName=By.id("id_form-0-last_name");
	By email=By.id("id_form-0-email");
	By createAccount=By.xpath("//input[@value='Create account']");
	//sign out
	By signOut=By.xpath("//a[@href='/accounts/logout/']");
	//a[text()='IR Status']
	//delegate
	By viewAsDelegate=By.xpath("//tr[@class='table-th-font'][1]/td[5]/a[text()='View']");
	By viewAndEdit=By.xpath("//span[text()='View/Edit']");
	//select contact
	By implementationContact=By.id("id_implementation_contact");
	By processingContact=By.id("id_processing_contact");
	By technicalContact=By.id("id_technical_contact");
	By galeTest=By.xpath("//span[text()='Gale Test']");
//	By galeTestPc=By.xpath("//*[@id='ui-id-6']/a/span[1]");
//	By galeTestTc=By.xpath("//*[@id='ui-id-8']/a/span[1]");
	
	//accounts
	By selectAccounts=By.id("id_Account_No");
	By wmf=By.xpath("//span[text()='WMF INC_2164']");
	//special instructions
	
	By specialInstruction=By.id("id_special_instructions");
	
	//save in delegate and complete
	By saveDelegate=By.xpath("//button[@class='btn footer-filled-btn save-btn']");
	By completeDelegate=By.xpath("//button[@class='btn footer-filled-btn continue complete-btn']");
	
	//SSS
	By salesReview=By.xpath("//html/body/div[3]/div[2]/table/tbody/tr/td[8]/a");
	By companyTaxID=By.id("id_company_tax_id");
	//product status
	By recentProductStatus=By.xpath("//tbody/tr/td[2]/span");
	
	By clientSubmit=By.xpath("//button[text()='Submit']");
	
	
	
	//SDC
	By viewAsSdc=By.xpath("//tr[@class='table-th-font'][1]/td[8]/a[text()='View']");
	
	//IR Status
	By irStatus=By.xpath("//a[text()='IR Status']");
	
	By finalizeForms=By.xpath("//button[text()='Finalize Forms']");
	
	
	
	//validations After finalize
	By viewButtonVal=By.xpath("//div[@class='ir-status-button']/span[@class='ir-status-button-text']");
	By requestStatusVal=By.xpath("//h4[contains(text(),'Request Status')]");
	public void clientLogin(){
		driver.findElement(userId).sendKeys("auto_client@test.com");
		driver.findElement(password).sendKeys("Test@1234");
		driver.findElement(continueButton).click();
	}
	public void delegateLogin(){
		driver.findElement(userId).sendKeys("auto_delegate@test.com");
		driver.findElement(password).sendKeys("Test@123");
		driver.findElement(continueButton).click();
	}
    public void specLogin(){
    	driver.findElement(userId).sendKeys("auto_spec@test.com");
		driver.findElement(password).sendKeys("Test@123");
		driver.findElement(continueButton).click();
	}
    public void salesLogin(){
    	driver.findElement(userId).sendKeys("auto_sales@test.com");
		driver.findElement(password).sendKeys("Test@123");
		driver.findElement(continueButton).click();
	}
    public void addDelegate(){
    	driver.findElement(addUser).click();
    	driver.findElement(firstName).sendKeys("abcd");
		driver.findElement(lastName).sendKeys("xyz");
		driver.findElement(email).sendKeys("auto_delegate@test.com");
		driver.findElement(createAccount).click();
		
	}
    public void signOut(){
    	Actions action = new Actions(driver);

		// To click on the element
		action.moveToElement(driver.findElement(signOut)).click().perform();
    	//driver.findElement(signOut).click();
	}
    By firstNameForProcessingContact=By.id("first_name");
    By lastNameForProcessingContact=By.id("last_name");
    By phNumForProcessingContact=By.id("phone");
    By emailForProcessingContact=By.id("email");
    By olbbUserIdProcessingContact=By.id("olbb_userid");
    By addButtonProcessingContact=By.xpath("//input[@value='Add']");
    
    
    public void newProcessingContact(){
    	driver.findElement(firstNameForProcessingContact).sendKeys("abcd");
    	driver.findElement(lastNameForProcessingContact).sendKeys("efg");
    	driver.findElement(phNumForProcessingContact).sendKeys("1234567890");
    	driver.findElement(emailForProcessingContact).sendKeys("abcd@gmail.com");
    	driver.findElement(olbbUserIdProcessingContact).sendKeys("abcd");
    	driver.findElement(addButtonProcessingContact).click();
    	
	}


}
