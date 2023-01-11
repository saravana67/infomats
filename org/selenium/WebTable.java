package org.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver_108\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver = new ChromeDriver(options);
		/*driver.get("https://letcode.in/table");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("(//table)[1]/tbody/tr/td"));
		String text = findElement.getText();
		inte
		
		
		for (WebElement webElement : findElements) {
			 List<WebElement> findElements2 = webElement.findElements(By.tagName("td"));
			findElements2.get(3).findElement(By.xpath("//input[@type='checkbox']")).click();
			
		}
		driver.findElement(By.xpath("(//table)[2]/tbody/tr/td//input[@id=\"first\"]")).click();
		driver.findElement(By.xpath("//input[@id='first']")).click();
		driver.navigate().to("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement> findElements = driver.findElements(By.xpath("(//table)[2]/tbody/tr"));
		for (WebElement webElement : findElements) {
			//Thread.sleep(5000);
		
			List<WebElement> findElements2 = webElement.findElements(By.tagName("td"));
			//Thread.sleep(5000);
			
			WebElement findElement = findElements2.get(0).findElement(By.tagName("a"));
			System.out.println(findElement.getText());
			//Thread.sleep(2000);
			//driver.navigate().back();
				
		}*/
		driver.navigate().to("https://demo.guru99.com/test/web-table-element.php");
		 float a=0;
		for(int i=1;i<=26;i++) {
			Thread.sleep(2000);
			WebElement findElement = driver.findElement(By.xpath(("//*[@id='leftcontainer']/table/tbody/tr[" + (i+0)+ "]/td[4]")));
			String text = findElement.getText();
			float parseInt = Float.parseFloat(text);
	       
			if(parseInt>a)
			{
				a=parseInt;
				
			}
			Thread.sleep(2000);
			
		}
		System.out.println(a);
	}
}

