package Voot.smac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import Utilspackage.com.ApplicationData;
import Utilspackage.com.Uielements;

public class VootLoginPage  extends Uielements{
	WebDriver driver;
	WebElement vootlogoele,verfimessage ;
	ApplicationData appdata=new ApplicationData();

	public VootLoginPage(WebDriver driver )
	{
		this .driver=driver ;
	}
	
	
	public boolean vootLogopreaset() throws InterruptedException
	{
		vootlogoele=driver.findElement(By.xpath(vootApplicationlogoxpath));
		if(vootlogoele.isDisplayed())
		{
			Reporter.log("Voot logo is diaplsying on the home page screen and it is  clickable");
			vootlogoele.click();
			Thread.sleep(1000);
			return true;
		}
			else 
			{
				return false;
			}
		}
	
	public boolean verifyUseEmailMessage()
	{
		verfimessage =driver.findElement(By.xpath(EmailTextmessage));
        String Actualmessage=verfimessage.getText();
        
		if(Actualmessage.equals(appdata.verifyloginpageInformationMessage))
		{
			Reporter.log("This is the message getting from system "+Actualmessage );
			return true;
		}
		else
			return false;
		}
	}
	

