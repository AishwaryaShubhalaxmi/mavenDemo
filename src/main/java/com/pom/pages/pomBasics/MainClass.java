package com.pom.pages.pomBasics;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      OpenBrowser a= new OpenBrowser();
      Login b= new Login(a.driver);
      CloseBrowser c= new CloseBrowser(a.driver);
      
      a.openBrowser();
      b.login("abcd", "1234");
      c.closeBrowser();
      
	}

}
