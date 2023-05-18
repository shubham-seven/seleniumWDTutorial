package SwitchTo;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {
	WebDriver driver;
	String baseUrl;
   // JavascriptExecutor jsExecutor;
	@Before
	public void setUp() throws Exception {
	
		driver = new ChromeDriver();
		baseUrl = "https://www.letskodeit.com/practice";
		//jsExecutor = (JavascriptExecutor)driver;
		//Maximize the browsers window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		//How to handle Windows
		String parentHandle = driver.getWindowHandle();
		System.out.printf("parent Window Id: %s\n",parentHandle);
		//Find Open Window Button
		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();
		//Get All Handles
		Set<String> handles = driver.getWindowHandles();
		
		//Switching b/w handles
		for(String handle : handles) {
			System.out.println(handle);
			if(!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				WebElement searchBox = driver.findElement(By.xpath("//div//input[@id='search']"));
				searchBox.sendKeys("python");
				
				Thread.sleep(2000);
				driver.close();
				break;
			}
		}
		//Switch back to the Parent Window
		driver.switchTo().window(parentHandle);
		WebElement textBox = driver.findElement(By.id("autosuggest"));
		textBox.sendKeys("test successful");
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}
