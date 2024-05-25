package chapter2p;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollbarLocation {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/git/git_getstarted.asp?remote=github");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='SPACES']"));
		Point loc = ele.getLocation();
		int X = loc.getX();
		int Y = loc.getY();
		System.out.println(X+" is the x co-ordinate of the webelement");
		System.out.println(Y+" is the y co-ordinate of the webelement");
		
		// creage an object for the class javascript.
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy("+ X +","+ Y +")");
		
		Thread.sleep(2000);
		
		ele.click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.w3schools.com/git/git_getstarted.asp?remote=github");
		WebElement wele = driver.findElement(By.xpath("//a[text()='SPACES']"));
		Point locc = wele.getLocation();
		int x=locc.getX();
		int y=locc.getY();
		
		System.out.println(x+ " is the x coordinate of the webelement");
		System.out.println(y+" is the y coordinate of the webelement");
		Thread.sleep(2000);
		JavascriptExecutor jss=(JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		wele.click();
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
