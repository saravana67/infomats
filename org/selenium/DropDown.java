package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver_108\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Select s = new Select(driver.findElement(By.name("country")));
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("ALBANIA");
		Thread.sleep(2000);
		s.selectByVisibleText("ANDORRA");
		
	}

}
