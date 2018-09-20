package com.pom.pages.pomBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	WebDriver driver;
	
	public OpenBrowser() {
		String path="C:\\Users\\M1046926\\Downloads\\chromedriver_win32\\chromedriver.exe";
	   	 System.setProperty("webdriver.chrome.driver", path);
	   	 driver=new ChromeDriver();	
	}
	public void openBrowser() {
		
	   	 driver.manage().window().maximize();
	   	 driver.get("https://www.facebook.com");
	}

}
