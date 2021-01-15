package org.testcases;
//Subscribe category
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.base.BaseClass;
import org.testing.pages.SignIn;

import org.testng.annotations.Test;

public class TestCase5 extends BaseClass {

	 @Test
	 public void signin() throws InterruptedException
	 {
		 WebElement signin=driver.findElement(By.id(pr.getProperty("Signin")));
			signin.click();
			
			SignIn s=new SignIn(driver,pr);
			s.login("kimomohite@gmail.com", "kimo7090");
	   
	   WebElement video=driver.findElement(By.id(pr.getProperty("videotitle")));
	   video.click();
	   Thread.sleep(5000);
	   WebElement subs=driver.findElement(By.id(pr.getProperty("subscribe")));
	   
	 subs.click();
	 }
	 

}
