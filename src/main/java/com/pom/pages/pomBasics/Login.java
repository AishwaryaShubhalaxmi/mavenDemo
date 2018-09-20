package com.pom.pages.pomBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
     WebDriver driver;
    
   public Login(WebDriver driver) {
	   this.driver=driver;
	   
   }
	public void login(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		String expectedMessage="The password that you've entered is incorrect. Forgotten password?";
		String actualMessage=driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText();
		if(expectedMessage.equals(actualMessage)) {
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		
	}
}
