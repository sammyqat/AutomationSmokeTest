package Testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;




public class LoginEbay {
	
	public WebDriver driver;
	
  @Test
  
  public void Login() throws InterruptedException {
	   
		    String ebayBrowserOpen = "C:\\Users\\Sham\\Documents\\Kawser_Selenium\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ebayBrowserOpen);
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			driver.get("http://www.ebay.com");
			Thread.sleep(5000);
			
			//Custon xpath. -Textbox= //inputbox, link= //a, button= //button[@name='']
			//driver.findElement(By.xpath("//input[@placeholder='Search for anything' and @name='_nkw']")).sendKeys("watch");
			
			
			// Click on Fashion Link
			driver.findElement(By.xpath("//*[@id='mainContent']/div[1]/ul/li[4]/a")).click();
			Thread.sleep(5000);
            // Click on Women Cloth
			driver.findElement(By.xpath("//*[@id='w1-w0-w0-toggle-button']/span")).click();
			Thread.sleep(5000);
			// Click on Dress Link
			driver.findElement(By.xpath("//*[@id='w1-w0-w0-accordion-subtree']/li[2]/a")).click();
			Thread.sleep(10000);
			// click on active wear
			driver.findElement(By.xpath("//*[@id='w1-w0']/ul/li[3]/a")).click(); 
			Thread.sleep(10000);
			// click on tops
			driver.findElement(By.xpath("//*[@id='w5-xCarousel-x-carousel-items']/ul/li[1]/a/p")).click(); 
			
			//Assert.assertEquals(true, "Women's Activewear Tops");
			
			
			/*
			driver.findElement(By.xpath("//*[@id='u_0_2o']/div/div[2]/a")).click();	
			
			
			driver.findElement(By.xpath("//*[@id='gh-btn']")).sendKeys("Test");

			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kawse@gmail.com");
			
			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("kaaka22");
			*/
			
			
			Thread.sleep(5000);
			
			//driver.findElement(By.xpath("//*[@id='gh-btn']")).sendKeys("Test");
			
			//driver.findElement(By.xpath("//*[@id='edit-submit']")).click();
			//driver.findElement(By.xpath("//*[@id='result-8']/h4/a")).click();
			System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
			 
	 
	System.out.println("this is test");  
	  
  }
}
