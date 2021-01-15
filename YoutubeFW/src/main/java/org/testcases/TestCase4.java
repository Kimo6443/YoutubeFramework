package org.testcases;
//History category
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.base.BaseClass;
import org.testing.pages.SignIn;

import org.testng.annotations.Test;

public class TestCase4 extends BaseClass{
	 @Test
	 public void signin() throws InterruptedException
	 { WebElement signin=driver.findElement(By.id(pr.getProperty("Signin")));
		signin.click();
		
		SignIn s=new SignIn(driver,pr);
		s.login("kimomohite@gmail.com", "kimo7090");
	  
	   WebElement History1=driver.findElement(By.id(pr.getProperty("History")));
	   History1.click();
	   Thread.sleep(3000);
}}
