package Voot.smac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import Utilspackage.com.ApplicationData;
import Utilspackage.com.GenericFunctions;
import Utilspackage.com.Uielements;

public class VootLoginPage extends Uielements {
	WebDriver driver;
	WebElement vootlogoele, verfimessage, inputEmail, registerbutton,loginbutton,OrTextmessage,loginwith,facebookbutton,googlebutton,errormessage,closebutton;
	ApplicationData appdata = new ApplicationData();
	GenericFunctions functions=new GenericFunctions(driver);

	public VootLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean vootLogopreaset() throws InterruptedException {
		vootlogoele = driver.findElement(By.xpath(vootApplicationlogoxpath));
		functions.highLighterMethod(driver, vootlogoele);
		System.out.println("When user click on 'Profile Avatar',login popup should be displayed.");
		if (vootlogoele.isDisplayed()) {
			Reporter.log("user click on 'Profile Avatar',login popup is displaying.");
			vootlogoele.click();
			Thread.sleep(1000);
			return true;
		} else {
			return false;
		}
	}

	public boolean verifyUseEmailMessage() throws InterruptedException {
		verfimessage = driver.findElement(By.xpath(EmailTextmessage));
		functions.highLighterMethod(driver, verfimessage);
		String Actualmessage = verfimessage.getText();
		
		if (Actualmessage.equals(appdata.verifyloginpageInformationMessage)) {
			Reporter.log("This is the message getting from system " + Actualmessage);
			System.out.println("atcual message is " + Actualmessage);
			return true;
		} else
			return false;
	}

	public boolean verifyEmailAddressInputField() throws InterruptedException {

		inputEmail = driver.findElement(By.xpath(EmailField_xpath));
		functions.highLighterMethod(driver, inputEmail);
		if (inputEmail.isDisplayed()) {
			System.out.println("Email input Text field is displaying on the login popup");
			return true;
		} else
			return false;
	}

	public boolean enter_Emailid_Address_in_InputField(String EmailId) throws InterruptedException {

		inputEmail = driver.findElement(By.xpath(EmailField_xpath));
		functions.highLighterMethod(driver, inputEmail);
		if (inputEmail.isDisplayed()) {
			inputEmail.sendKeys(EmailId);
			System.out.println("User has given Email is:::::::::::::::" + EmailId);
			return true;
		} else
			return false;
	}

	
	public boolean verifyRegesterButtonOnLoginPage() throws InterruptedException {
		registerbutton = driver.findElement(By.xpath(rigisterButton_xpath));
		functions.highLighterMethod(driver, registerbutton);
		String registertextvalue = registerbutton.getText();
		if (registerbutton.isDisplayed()) {
			System.out.println("Register button is displaying on the login page " + registertextvalue);
			Assert.assertEquals(registertextvalue, appdata.registerButtonText);

			return true;
		} else
			return false;
	}
	
	public boolean verifyLoginButtonOnLoginPage() throws InterruptedException {
		loginbutton = driver.findElement(By.id(loginButton_Id));
		functions.highLighterMethod(driver, loginbutton);
		String logintextvalue = loginbutton.getText();
		if (loginbutton.isDisplayed()) {
			functions.sleepMode(2000);
			System.out.println("Login button is displaying on the login page " + logintextvalue);
			Assert.assertEquals(logintextvalue, appdata.loginButtonText);

			return true;
		
		} else
			return false;
	}
	public boolean verify_Or_Text_Message_OnLoginPage() throws InterruptedException {
		OrTextmessage = driver.findElement(By.xpath(OrMessageinLoginPage_xpath));
		functions.highLighterMethod(driver, OrTextmessage);
		String TextValueOfOR = OrTextmessage.getText();
		if (OrTextmessage.isDisplayed()) {
			functions.sleepMode(2000);
			System.out.println("Or text message  is displaying on the login page " + TextValueOfOR);
			Assert.assertEquals(TextValueOfOR, appdata.OrTextValue);
			return true;
		} else
			return false;
	}
	
	public boolean verify_Login_Text_On_LoginPage() throws InterruptedException {
		loginwith = driver.findElement(By.xpath(loginwith_Xpath));
		functions.highLighterMethod(driver, loginwith);
		String TextValueofLoginwith = loginwith.getText();
		if (loginwith.isDisplayed()) {
			functions.sleepMode(2000);
			System.out.println("Login with text message is displaying on the login page and Text value is :::::::::::" + TextValueofLoginwith);
			Assert.assertEquals(TextValueofLoginwith, appdata.LoginWithTextValue);
			return true;
		} else
			return false;
}
	
	public boolean verify_Login_with_facebook_Button() throws InterruptedException {
		facebookbutton = driver.findElement(By.xpath(loginwithfacebookbutton_xpath));
		functions.highLighterMethod(driver, facebookbutton);
		functions.sleepMode(2000);
		if (facebookbutton.isDisplayed()) {
			System.out.println("Login with facebook button is displaying on the login page ");
			return true;
		} else
			return false;
}
	public boolean verify_Login_with_Google_Button() throws InterruptedException {
		googlebutton = driver.findElement(By.xpath(loginwithgoolebutton_xpath));
	
		functions.highLighterMethod(driver, googlebutton);
		functions.sleepMode(2000);
		if (googlebutton.isDisplayed()) {
			functions.sleepMode(5000);
			System.out.println("Login with google button is displaying on the login page ");
			return true;
		} else
			return false;
	}
	
	public boolean closeIcon() throws InterruptedException {
		closebutton = driver.findElement(By.xpath(closebuttonxpath));
	
		functions.highLighterMethod(driver, closebutton);
		functions.sleepMode(2000);
		if (closebutton.isDisplayed()) {
			functions.sleepMode(5000);
			System.out.println("close icon  is displaying on the login page ");
			closebutton.click();
			functions.sleepMode(2000);
			return true;
		} else
			return false;
	}
	
    public void verify_Error_message_without_EnteringEmail() throws InterruptedException
    {
    	vootLogopreaset();
    	inputEmail.sendKeys();
    	registerbutton.click();
    	errormessage=driver.findElement(By.xpath(emailErrormessage));
    	String errorTextValue=errormessage.getText();
    	functions.highLighterMethod(driver, errormessage);
    	System.out.println("verify error message :::::::::::::"+errorTextValue);
    	functions.sleepMode(1000);
    	Assert.assertEquals(errorTextValue, appdata.errorMessage);
    	
    }

}