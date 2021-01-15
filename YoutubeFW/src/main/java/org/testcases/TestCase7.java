package org.testcases;
//Comment on video
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.test.base.BaseClass;
import org.testing.pages.SignIn;
import org.testng.annotations.Test;

public class TestCase7 extends BaseClass{

	 @Test
	 public void signin() throws InterruptedException
	 {
		 

		 WebElement signin=driver.findElement(By.id(pr.getProperty("Signin")));
			signin.click();
			
			SignIn s=new SignIn(driver,pr);
			s.login("kimomohite@gmail.com", "kimo7090");
	   Thread.sleep(5000);
	   
	   Actions ac=new Actions(driver);
	   for(int i=0;i<2;i++)
	   {
	   ac.sendKeys(Keys.TAB).perform();;
	   }
	   ac.sendKeys(Keys.ENTER).perform();
	   
	   Thread.sleep(3000);
	   WebElement video=driver.findElement(By.id(pr.getProperty("videotitle")));
	   video.click();
	   Thread.sleep(10000);
	   
	  
	   ac.sendKeys(Keys.PAGE_DOWN).perform();;
	   
	   
	   Thread.sleep(2000);
	   WebElement w10=driver.findElement(By.xpath("//img[@class='style-scope yt-img-shadow'and@alt='kimo mohite']"));
	 w10.click();
	 Thread.sleep(2000);
	 
	   ac.sendKeys(Keys.TAB).perform();;
	   
	w10.sendKeys("great");
	 Thread.sleep(3000);
}}
