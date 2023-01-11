package org.selenium;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class POI {

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver_108\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		//XSSFWorkbook book = new XSSFWorkbook();
		WebElement u = null;
		//u=driver.findElement(By.id("email"));
		System.out.println(u);*/
		int a[][] = new int[1][1];
		 
		//int[][] a= {{10,20},{1,2}};
		System.out.println(a[0][1]);
	}

}
