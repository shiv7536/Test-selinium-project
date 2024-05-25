package chapter1p;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationLogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("adminlogin");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'x9f619 xjbqb8w x78zum5 x168nmei')])[5]")).click();
		
		
		
		//verification
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		if (url.equals("https://www.instagram.com/accounts/login/")) 
		{
			System.out.println("url shown is correct");
		}
		else
		{
			System.out.println("url shown in not correct");
		}
		if (title.equals("Login • Instagram"))
		{
			System.out.println("title shown is correct");
		}
		else
		{
			System.out.println("title shown is not correct");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
