package chapter1p;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement search = driver.findElement(By.name("q"));
		if(search.isDisplayed())
		{
			System.out.println("Pass: The element is displayed");
		}
		else
		{
			System.out.println("Fail: The element is not displayed");
		}
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
