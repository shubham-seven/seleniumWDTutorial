package basicweb;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarselection {

	WebDriver driver;
	String baseUrl;
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";
		
		
		//Maximize the browsers window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(baseUrl);
	}
	
	@Test
	public void test() throws InterruptedException {
		
		WebElement el1 = driver.findElement(By.xpath("//button[@data-name='d1']"));
		el1.click();
		Thread.sleep(2000);
		WebElement el2 = driver.findElement(By.xpath("//button[@data-stid='date-picker-paging']"));
		el2.click();
		Thread.sleep(2000);
		WebElement el3 = driver.findElement(By.xpath("//button[@data-day='28']"));
		el3.click();
		Thread.sleep(2000);
		WebElement el4 = driver.findElement(By.xpath("//button[@data-day='30']"));
		el4.click();
		Thread.sleep(2000);
		WebElement el5 = driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']"));
		el5.click();
		Thread.sleep(2000);
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}


}
