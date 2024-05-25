package chapter2p;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws IOException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\Selenium supportive files\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/vdespa/introduction-to-postman-course");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Type Casting
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		// Access the method and photo will be stored in Ram.
		
		File ram = ts.getScreenshotAs(OutputType.FILE);
		
		// specify the location of photo to be stored.
		
		File dest=new File("./Photo/git.png");
		
		//copy and paste from ram to specific location.
		
		FileUtils.copyFile(ram, dest);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
