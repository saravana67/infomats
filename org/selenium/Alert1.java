package org.selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver_108\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = AutoStudy.driver;
		driver.get("http://demo.automationtesting.in/Alerts.html");
		//WebElement b = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		//b.click();
		//driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("hi");
		Thread.sleep(2000);
		a.accept();
	}
}
