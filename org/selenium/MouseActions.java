package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver_108\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://flipkart.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("(//img[@class=\"_396cs4  _3exPp9\"])[6]")).click();
	Thread.sleep(2000);
	WebElement b = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
	Actions a = new Actions(driver);
	a.moveToElement(b).perform();
	//a.contextClick(b).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@title='Bath Towels']")).click();
	Thread.sleep(2000);
	WebElement e = driver.findElement(By.xpath("(//a[contains(text(),'TRIDENT Cotton 380')])[1]"));
	System.out.println(e.getText());
	
}
}
