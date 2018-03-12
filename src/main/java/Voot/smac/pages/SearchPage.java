package Voot.smac.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import Utilspackage.com.GenericFunctions;
import Utilspackage.com.Uielements;

public class SearchPage  extends Uielements{

	WebDriver driver;
	WebElement  searchIcon,SearchIconinSearchpage,closeIcon,closeIcon1,SearchInputBox,motupatluserchgesult;
	
	GenericFunctions function=new GenericFunctions(driver);
	
     public SearchPage(WebDriver driver)
	{
		this .driver=driver;
	}
	
     public boolean verifySearchIconInHomePage() throws InterruptedException{
    	 searchIcon=driver.findElement(By.className("VSearch"));
    	 function.highLighterMethod(driver, searchIcon);
    	 function.sleepMode(2000);
    	 if(searchIcon.isDisplayed()){
    		 Reporter.log("Search Icon is present in home page");
    		 System.out.println("Search icon is present in home page");
    		 return true;
    	 }
    	 else return  false;
    		
    	 }
       public void clickOnTheSearchIconinHomePage() throws InterruptedException{
    	   searchIcon.click();
    		 function.sleepMode(2000);

       }
       
       public boolean verifySechIconInSeachPage() throws InterruptedException{
    	   clickOnTheSearchIconinHomePage();
    	  SearchIconinSearchpage= driver.findElement(By.xpath(serchIconinsearchBoxXpath));
    	  function.highLighterMethod(driver, SearchIconinSearchpage);
    		 function.sleepMode(2000);
    	  
    	  if(SearchIconinSearchpage.isDisplayed()){
    		  System.out.println("Search icon is present in Search page");
    		  Reporter.log("Search icon is present in Search page");
    		  return true;
    	  }
    	  else return false;
    	    
       }
       
       public boolean verifyCloseButtoninSearchpage() throws InterruptedException{
    	   clickOnTheSearchIconinHomePage();
    	closeIcon=   driver.findElement(By.xpath(closeIconinsearchPage));
    	function.highLighterMethod(driver, closeIcon);
   	 function.sleepMode(2000);
    	if(closeIcon.isDisplayed()){
    		  System.out.println("Search  close icon is present in Search page");
    		  Reporter.log("Search close  icon is present in Search page");
    		  return true;
    	  }
    	  else return false; 
    	}
       
       public void verifyeCloseIconinSearchPage() throws InterruptedException{
    	 
    		 function.sleepMode(2000);
    	   closeIcon1=   driver.findElement(By.xpath(closeIconinsearchPage));
    	   function.highLighterMethod(driver, closeIcon1);
    		 function.sleepMode(2000);
    	   
       }
       
       public boolean SearchtextBox() throws InterruptedException{
    	  SearchInputBox= driver.findElement(By.id(SearchTextBox_id));
    	  function.highLighterMethod(driver, SearchInputBox);
    	  if(SearchInputBox.isDisplayed()){
    
    		  System.out.println("Search Text box is present in Search page");
    		  Reporter.log("Search Text box is present in Search page");
    		  return true;
    	  }
    	  else return false;
       }
       
       public void enterSomeSearchvalueandVerifyTheResult(String enter) throws InterruptedException{
    	   SearchInputBox.sendKeys(enter);
    	   System.out.println("User has given this  value:::::::::::::+++++++++"+enter);
    	   function.sleepMode(5000);
   
    	  motupatluserchgesult= driver.findElement(By.id(Searchresult_id));
    	//   function.scrollDown(driver);
    	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", motupatluserchgesult);
    	   function.highLighterMethod(driver, motupatluserchgesult);
    	   function.sleepMode(9000);
       }
       
     
      
     }
	
