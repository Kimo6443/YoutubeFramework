package org.testcases;
//trending category


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.test.base.BaseClass;
import org.testing.pages.SignIn;

import org.testing.utilities.ScreenshotCap;
import org.testing.utilities.ScreenshotCap;
import org.testng.annotations.Test;

public class TestCase1 extends BaseClass{
	WebDriverWait Wait=new WebDriverWait(driver,10);
@Test
public void sign() throws InterruptedException, IOException
{
	WebElement signin=driver.findElement(By.id(pr.getProperty("Signin")));
	signin.click();
	
	SignIn s=new SignIn(driver,pr);
	s.login("kimomohite@gmail.com", "kimo7090");
    
	WebElement Trending=driver.findElement(By.id(pr.getProperty("trending")));
	
	Trending.click();
	   
	   
	   ScreenshotCap.takescreenshot(driver, "/htdf/src/main/java/testorg/first.png");

}

}
