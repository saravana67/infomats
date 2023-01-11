package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsAndLinkText {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver_108\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
	options.addArguments("start-maximized");
	options.addArguments("--incognito");
	WebDriver driver = new ChromeDriver(options);
	driver.get("http://demo.guru99.com/test/link.html");
	//driver.findElement(By.linkText("click here")).click();
	driver.findElement(By.xpath("/html/body/a[2]")).click();
	
}
}
