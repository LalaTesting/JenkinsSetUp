package Voot.smac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class VootLoginPage {


	
	WebDriver driver;
	
	WebElement vootlogoele,verfimessage ;
	

	
	public VootLoginPage(WebDriver driver )
	{
		this .driver=driver ;
	}
	
	
	public boolean vootLogopreaset() throws InterruptedException
	{
		vootlogoele=driver.findElement(By.xpath("//span[@class='user-login']"));
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
		verfimessage =driver.findElement(By.xpath("//span[@class='use-your-eamil-address']"));
        String Actualmessage=verfimessage.getText();
        String expectdmessage="USE YOUR EMAIL ADDRESS";
        
		if(Actualmessage.equals(expectdmessage))
		{
			Reporter.log("This is the message getting from system "+Actualmessage );
			return true;
		}
		else
			return false;
		}
	}
	

