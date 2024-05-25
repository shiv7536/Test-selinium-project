package Actionsclass;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouseclick {

	public static void main(String[] args) {
		
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
				
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		//driver.switchTo().alert().dismiss();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement explore = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a=new Actions(driver);
		a.moveToElement(explore).perform();
		
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/buttons.php");
		WebElement dbc = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		a.contextClick(dbc).perform();
		WebElement dbl = driver.findElement(By.id("doublec"));
		System.out.println(dbl.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
