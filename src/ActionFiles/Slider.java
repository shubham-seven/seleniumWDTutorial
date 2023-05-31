package ActionFiles;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
WebDriver driver;
String baseUrl;
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://jqueryui.com/";
		//Maximize the browsers window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseUrl);
		
	}

	@Test
	public void test() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Slider']")).click();
		Thread.sleep(5000);
		//HANDLE FRAME
		driver.switchTo().frame(0);
		//LOCATE SLIDER WEB ELEMENT IN I-FRAME
		WebElement sliElement = driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(sliElement, 200, 0).perform();
		Thread.sleep(3000);
		action.dragAndDropBy(sliElement, -100, 0).perform();
		
		
		
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.close();
	}



}
