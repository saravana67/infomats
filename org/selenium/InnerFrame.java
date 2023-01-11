package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InnerFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver_108\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi");
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);

		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi");

		
	}

}
