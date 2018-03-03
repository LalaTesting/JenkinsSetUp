import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GenericFunctions
{
	WebDriver driver;
	
	public  GenericFunctions(WebDriver driver)
	{
		this.driver=driver;
	}
	public void implicitwait(int time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public void explicitlyWaitCondition(int time,By element){
		WebDriverWait wait =new WebDriverWait(driver, time);
				wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	}
	public void scrollDown(By element){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", element);
		
	}
    public void selectDropDownByIndex(WebElement element,int index){
    
    	Select sel=new Select(driver.findElement(By.xpath("element")));
    	sel.selectByIndex(index);
 
    }
    
    public void selectDropDownByVisibleTest(WebElement element,String visibleText){
        
    	Select sel=new Select(driver.findElement(By.xpath("element")));
    	sel.selectByVisibleText(visibleText);
    }
    
    public void acceptAlertPopUp(){
    	Alert alt=driver.switchTo().alert();
    	alt.accept();
    }
    
    public void dismisstAlertPopUp(){
    	Alert alt=driver.switchTo().alert();
    	alt.dismiss();
    }
    
    public void clickElement(WebElement element){
    	element.click();
    	
    }
    
    public void mouseOverAction(WebElement element){
    	Actions action=new  Actions(driver);
    	action.moveToElement(element).click().build().perform();
    	
    }
    
    public void higlightElements(){
    	
    }
}
