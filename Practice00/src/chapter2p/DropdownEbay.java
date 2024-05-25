package chapter2p;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEbay {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		
		// Create an object for Select Calss.
		Select s=new Select(dropdown);
		Thread.sleep(1500);
		s.selectByIndex(0);
		Thread.sleep(1500);
		s.selectByValue("11450");
		Thread.sleep(1500);
		s.selectByVisibleText("Musical Instruments & Gear");
		
		//Look if the drop down is multi select or single select.
		System.out.println(s.isMultiple());
		
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		else
		{
			System.out.println("It is not multiple select drop down");
		}
		
		List<WebElement> allopt = s.getOptions();
		System.out.println(allopt.size());
		
		for (WebElement b:allopt)
		{
			System.out.println(b.getText());
		}
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
