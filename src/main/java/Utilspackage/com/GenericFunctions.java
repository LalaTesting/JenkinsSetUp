package Utilspackage.com;

import java.io.File;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GenericFunctions {
	WebDriver driver;

	public GenericFunctions(WebDriver driver) {
		this.driver = driver;
	}

	public void implicitwait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public void sleepMode(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public void explicitlyWaitCondition(WebDriver driver, int time, WebElement element) {
		System.out.println("Waiting for Element in Dom");
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/*public void scrollDown(WebDriver driver) throws InterruptedException {

		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		    jse.executeScript("window.scrollBy(0,550)", "");

*/
	
		{
			/*for (int j = 0; j < 5; j++)
				js.executeScript("javascript:window.scrollBy(0,-200)");
			Thread.sleep(3000);*/
		}
		/*
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * 
		 * ((JavascriptExecutor)driver).executeScript(
		 * "arguments[0].scrollIntoView();", element);
		 */

		// js.executeScript("window.scrollBy(0,250)", element);

	

	public void selectDropDownByIndex(WebElement element, int index) {

		Select sel = new Select(driver.findElement(By.xpath("element")));
		sel.selectByIndex(index);

	}

	public void selectDropDownByVisibleTest(WebElement element, String visibleText) {

		Select sel = new Select(driver.findElement(By.xpath("element")));
		sel.selectByVisibleText(visibleText);
	}

	public void acceptAlertPopUp() {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

	public void dismisstAlertPopUp() {
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}

	public void clickElement(WebDriver driver, WebElement element) {
		element.click();
		System.out.println("click operation has been perfomed");

	}

	public void mouseOverAction(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();

	}

	public void highLighterMethod(WebDriver driver, WebElement element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (int i = 0; i < 2; i++) {
			 js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: red; border: 2px solid red;");
			//Thread.sleep(100);

		}
	}
//this is for home page scrolling till down and up
	public void scroll_top_to_bottom(WebDriver driver ) throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		for (int second = 0; ; second++) {
		        if(second >=25){
		            break;
		        }
		            jse.executeScript("window.scrollBy(0,600)", ""); //y value '800' can be altered
		            Thread.sleep(2000);
		}

	}
	
	//this is for page up from down to up
public void scrollDownFromTopOfPage(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	for (int second = 0; ; second++) {
        if(second >=25){
            break;
        }
	js.executeScript("window.scrollBy(0, -600)" ,"");
	 Thread.sleep(2000);
		
	}

     }
public void scrolltoptobottomafterclickonthefirstTray(WebDriver driver ) throws InterruptedException {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	for (int second = 0; ; second++) {
	        if(second >=6){
	            break;
	        }
	            jse.executeScript("window.scrollBy(0,300)", ""); //y value '800' can be altered
	            Thread.sleep(2000);
	}

}

public void scrollbottomToTopafterclickonthefirstTray(WebDriver driver ) throws InterruptedException {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	for (int second = 0; ; second++) {
	        if(second >=6){
	            break;
	        }
	            jse.executeScript("window.scrollBy(0,-300)", ""); //y value '800' can be altered
	            Thread.sleep(2000);
	}
}
}


  
