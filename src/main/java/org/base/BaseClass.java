package org.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
				
		public static WebDriver d;
		
		public static WebDriver chromeBrowser() {
		d=new ChromeDriver();
		return d;
		}
		public static void urlLaunch(String url) {
			d.get(url);
			d.manage().window().maximize();
		}
		public static void implicitlyWait(int a) {
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
		}
		public static void sendKeys(WebElement e,String value) {
			e.sendKeys(value);
		}
		public static void click(WebElement e) {
			e.click();

		}
		
		
	}

