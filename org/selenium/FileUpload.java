package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver_108\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload");
		driver.findElement(By.xpath("//*[@id='uploadfile_0']")).sendKeys("E:\\Study method.docx");
		driver.findElement(By.xpath("//*[@id='terms']")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	}

}
