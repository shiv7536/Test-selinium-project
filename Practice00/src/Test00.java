import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test00 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ubuy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement box = driver.findElement(By.name("q"));
		box.sendKeys("sola");
		Thread.sleep(3000);
		List<WebElement> search = driver.findElements(By.xpath("//li[@class='sbct PZPZlf']"));
		System.out.println(search.size());
		for(WebElement b:search) 
		{
			System.out.println(b.getText());
		}
		if (box.isDisplayed())
		{
			System.out.println("Pass: element is displayed");
		}
		else
		{
			System.out.println("Fail: element is not displayed");
		}
		driver.navigate().to("https://ubuy.vom");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement checkbox = driver.findElement(By.xpath("//label[text()='Female']"));
		if (checkbox.isSelected())
		{
			System.out.println("Pass: the element is selected");
		}
		else 
		{
			System.out.println("Fail: element is not selected");
		}
		//driver.close();
		
		
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/dynamic-prop.php");
		driver.findElement(By.id("colorChange")).click();
		WebElement visible = driver.findElement(By.id("visibleAfter"));
		if(visible.isDisplayed())
		{
			System.out.println(visible.getText());
		}
		else
		{
			System.out.println("Fail: button is not displayed.");
		}
		Thread.sleep(7000);
		if(visible.isDisplayed())
		{
			System.out.println(visible.getText());
		}
		else
		{
			System.out.println("Fail: button is not displayed.");
		}
		if(visible.isEnabled())
		{
			System.out.println("Pass: element is enabled.");
		}
		else
		{
			System.out.println("Fail: element is not evavle.");
		}
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
