package com.pom.pages.pomBasics;

import org.openqa.selenium.WebDriver;

public class CloseBrowser {
	 WebDriver driver;
	 
	 public CloseBrowser(WebDriver driver) {
		 this.driver=driver;
		 
	 }
	public void closeBrowser() {
		driver.close();
	}

}
