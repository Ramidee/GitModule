package org.base;

import org.login.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test extends BaseClass {
	
	public static void main(String[] args) {
		
		
		chromeBrowser();
		
		urlLaunch("https://www.facebook.com/");
		
		implicitlyWait(30);
		
		LoginPage l=new LoginPage();
		
		//WebElement txtusername = d.findElement(By.id("email"));
		//sendKeys(txtusername, "Ramesh");
		
		sendKeys(l.getTxtUsername(), "Ramesh");
		
		sendKeys(l.getTxtPass(),"123");
		
		click(l.getBtnLogin());
		
		
	
		
	}
	
	
	
	
	
	
	
}
