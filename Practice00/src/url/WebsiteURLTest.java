package url;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

//package url;

public class WebsiteURLTest {
	public static void main(String[] args) {
        // Set the path to chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\swapn\\Downloads\\selnium\\Selenium supportive files\\chromedriver-win32");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://www.ubuy.co.in/");

        // Find all links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Iterate through each link and get its URL
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                // Test the URL
                driver.get(url);
                System.out.println("Testing URL: " + url);
                
                // Verify if the page loaded successfully
                if (driver.getTitle().contains("404") || driver.getTitle().contains("Page Not Found")) {
                    System.out.println("Page not found: " + url);
                } else {
                    System.out.println("Page loaded successfully: " + url);
                }
            }
        }

        // Close the WebDriver
        driver.quit();
    }
}


