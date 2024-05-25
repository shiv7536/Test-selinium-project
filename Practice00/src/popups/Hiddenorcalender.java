package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenorcalender {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/ubuy.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[@class='lbl_input appendBottom10'])[3]")).click();
		//Thread.sleep(1500);
		driver.findElement(By.xpath("(//p[text()='30'])[1]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
