package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","/youtpath/chromedriver");
		WebDriver myTestDriver=new ChromeDriver();
			
		
			myTestDriver.get("http://www.google.com");
			
			
			Thread.sleep(2000);
			myTestDriver.manage().window().maximize();
			Thread.sleep(5000);
			myTestDriver.close();
			
			
	}

}
