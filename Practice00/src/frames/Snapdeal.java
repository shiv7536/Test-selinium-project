package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// finding element
		WebElement signin = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Thread.sleep(2000);
		// Creating an object for Actions class
		Actions a=new Actions(driver);
		a.moveToElement(signin).perform();
		Thread.sleep(1500);
		// finding element
		driver.findElement(By.xpath("//*[text()='login']")).click();
		
		
		  // shift to frame
		  
		  driver.switchTo().frame(0); 
		  Thread.sleep(2000);
		  driver.findElement(By.id("userName")).sendKeys("9855874563");
		  Thread.sleep(2000); 
		  driver.findElement(By.id("close-pop")).click();
		  
		  // switch control back to the main window.
		  driver.switchTo().defaultContent();
		  
		  // create an object for javascript.
		  
		  JavascriptExecutor js=(JavascriptExecutor) driver; Thread.sleep(2000);
		  js.executeScript("window.scrollBy(0,5000)"); Thread.sleep(2000);
		  js.executeScript("window.scrollBy(0,-5000)");
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
