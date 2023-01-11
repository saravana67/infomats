package org.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Alert;


public class AutoStudy {
static WebDriver driver;

	// public static final WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver_108\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.get("https://mail.google.com/mail/u/0/#inbox");

		System.out.println(driver.getCurrentUrl());
		//driver.manage().window().maximize();
		//Thread.sleep(3000);
		//Alert a = driver.switchTo().alert();
		

		
	}

}
