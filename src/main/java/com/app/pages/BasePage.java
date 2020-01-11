package com.app.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	public static WebDriver driver;
	public String browser = "chrome";
	

	public BasePage() {
		
		if (driver == null) {
			if ( browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\Chrome.exe");
			driver = new ChromeDriver();				
			}
						
		}
//		else if(driver.equals("firefox")){
//			
//			System.setProperty("webdriver.gecko.driver", " ");
//			driver = new FireFoxDriver();
//		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(" ");
		
	}
	
	
}
