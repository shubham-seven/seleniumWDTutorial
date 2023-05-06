package ActionFiles;

import static org.junit.Assert.*;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshots {

	WebDriver driver;
	String baseUrl;
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.facebook.com/";
		
		//Maximize the browsers window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.get(baseUrl);
		
	}
	

	
	@Test
	public void test() throws InterruptedException {
		WebElement el1 = driver.findElement(By.id("email"));
		el1.sendKeys("shubhamrolly@gmail.com");
		Thread.sleep(2000);
		
		WebElement el2 = driver.findElement(By.id("pass"));
		el2.sendKeys("mahakaal");
		Thread.sleep(2000);
		
		WebElement el3 = driver.findElement(By.xpath("//div//button[@data-testid='royal_login_button']"));
		el3.click();
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		String filename = getRandomString(10) + ".png";
		String directory = System.getProperty("user.dir") + "//screenshots//";
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + filename));
		driver.quit();
	}

	public static String getRandomString(int length) {
        StringBuilder sb = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i=0;i<length;i++) {
        	int index = (int)(Math.random()* characters.length());
        	sb.append(characters.charAt(index));
        }
        return sb.toString();
	}

}
