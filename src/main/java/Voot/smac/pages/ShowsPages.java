package Voot.smac.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class ShowsPages {

	WebDriver driver;
	WebElement showlink, featuredList;

	public ShowsPages(WebDriver driver) {
		this.driver = driver;
	}

	public boolean clickShowsLinkinheader() throws InterruptedException {
		showlink = driver.findElement(By.id("shows_dropbtn"));

		if (showlink.isDisplayed()) {
			System.out.println("show link is present in the homegage");

			Reporter.log("show link is present in home page");

			String sholink = showlink.getAttribute("href");

			System.out.println("show link is :::::" + sholink);

			Actions act = new Actions(driver);

			act.moveToElement(showlink).build().perform();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[1]/header/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/a[4]")).click();
			
			Thread.sleep(3000);
			;
		/*	WebElement elementfeatured = driver.findElement(By.id("Featured Shows"));
			System.out.println(
					"Verifying featured Section is present or not if present:::::" + elementfeatured.getText());
			Reporter.log("Verifying featured Section is present or not if present value is :::::"
					+ elementfeatured.getText());
			List<WebElement> featuredList = driver.findElements(By
					.xpath("html/body/div[1]/div/div/div/div[1]/header/div[1]/div[1]/div[1]/div[3]/div/div/div[1]/a"));

			for (WebElement elem : featuredList) {
				System.out.println(
						"Verifying featured contents is displaying or not if present thease are the value is::::::  "
								+ elem.getText());
				Reporter.log(
						"Verifying featured contents is displaying or not if present thease are the value is::::::   "
								+ elem.getText());
				
				if(elem.getText().equalsIgnoreCase("Kasam")){
					elem.click();
					System.out.println("user has clicked on kasam shows from the featured section");
				Thread.sleep(1000);
				}
			}
*/
			return true;
		} else
			return false;
	}

}
