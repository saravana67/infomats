package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver_108\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	Actions a = new Actions(driver);
	Thread.sleep(3000);
	//a.dragAndDrop(	driver.findElement(By.xpath("//a[text()=' BANK ']")), driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"))).perform();
 // Thread.sleep(3000);
	//a.dragAndDrop(driver.findElement(By.xpath("((//a[@class='button button-orange'])[2])")),driver.findElement(By.xpath("((//li[@class='placeholder'])[2])"))).perform();
	//Thread.sleep(3000);
	//a.dragAndDrop(driver.findElement(By.xpath("//a[text()=' SALES ']")),driver.findElement(By.xpath("((//li[@class='placeholder'])[3])"))).perform();
	//Thread.sleep(3000);
	a.dragAndDrop(driver.findElement(By.xpath("((//a[@class='button button-orange'])[4])")),driver.findElement(By.xpath("((//li[@class='placeholder'])[4])"))).perform();
}
}
