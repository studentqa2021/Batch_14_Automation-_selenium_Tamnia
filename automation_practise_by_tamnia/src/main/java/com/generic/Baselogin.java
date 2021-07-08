package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.Highlight;
import com.util.Screenshot;

public class Baselogin {
	public static void getlogin() {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to(BaseConfig.getFile("URL")); 
	driver.manage().window().maximize();
	Practisepf obj=new Practisepf(driver);
	Highlight.addColor1(obj.getSignin(), driver);
	Screenshot.getscreenshot(driver, "homepage");
	obj.getSignin().click();
	Screenshot.getscreenshot(driver, " after signin homepage");
	obj.getEmail().sendKeys(BaseConfig.getFile("USER"));
	obj.getPassword().sendKeys(BaseConfig.getFile("PASSWORD"));
	obj.getLogin().click();
	
	}

}
