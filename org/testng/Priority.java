package org.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class Priority {
	WebDriver driver;
	
  @Test(priority=1,groups="YES")
  public void fv() throws InterruptedException {
	  driver.findElement(By.id("txt_unam")).sendKeys("sylix");
			  driver.findElement(By.id("txt_pass")).sendKeys("admin");
			  driver.findElement(By.id("Button3")).click();
			  Thread.sleep(2000);
			  driver.findElement(By.id("LinkButton1")).click();
			  Thread.sleep(2000);
  }
			  
			  @Test(enabled=true)
			  public void fin() throws InterruptedException {
				  driver.findElement(By.id("txt_unam")).sendKeys("sylix");
						  driver.findElement(By.id("txt_pass")).sendKeys("admi");
						  driver.findElement(By.id("Button3")).click();
						  Thread.sleep(2000);
						  driver.switchTo().alert().dismiss();
						 // driver.findElement(By.id("LinkButton1")).click();

						  Thread.sleep(2000);
  }
			  @Test
			  public void fin1() throws InterruptedException {
				  driver.findElement(By.id("txt_unam")).sendKeys("");
						  driver.findElement(By.id("txt_pass")).sendKeys("admin");
						  driver.findElement(By.id("Button3")).click();
						  Thread.sleep(2000);
						 driver.switchTo().alert().dismiss();
						//  driver.findElement(By.id("LinkButton1")).click();

						 Thread.sleep(2000);
						  }
			  @Test(priority=4,groups="YES")
			  public void f() throws InterruptedException {
				  driver.findElement(By.id("txt_unam")).sendKeys("");
						  driver.findElement(By.id("txt_pass")).sendKeys("");
						  driver.findElement(By.id("Button3")).click();
						  Thread.sleep(2000);
						  driver.switchTo().alert().dismiss();
						 // driver.findElement(By.id("LinkButton1")).click();

						  Thread.sleep(2000);
			  }
  @BeforeClass(groups="YES")
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chrome_driver_108\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		options.addArguments("start-maximized");
		 driver = new ChromeDriver(options);
		 driver.get("http://www.brm.tremplintech.in/web_pages/login.aspx");
  }

  @AfterClass(groups="YES")
  public void afterClass() {
	  driver.close();
  }

}
