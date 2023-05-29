package ActionFiles;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	WebDriver driver;
	String baseUrl;
	JavascriptExecutor js;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.letskodeit.com/practice";
		js = (JavascriptExecutor)driver;
		//Maximize the browsers window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseUrl);
	}


	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,600);");
		Thread.sleep(3000);
		WebElement mouseHover = driver.findElement(By.id("mousehover"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mouseHover).perform();
		Thread.sleep(3000);
		
		WebElement mhSubElement = driver.findElement(By.xpath("//a[@href='#top']"));
		action.moveToElement(mhSubElement).click().perform();
		
	}
	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,600);");
		Thread.sleep(3000);
		WebElement mouseHover = driver.findElement(By.id("mousehover"));
		
		Actions action = new Actions(driver);
		action.moveToElement(mouseHover).perform();
		Thread.sleep(3000);
		
		//WebElement mhSubElement = driver.findElement(By.xpath("//a[@href='']"));
		WebElement mhSubElement = driver.findElement(By.xpath("//a[text()='Reload']"));
		action.moveToElement(mhSubElement).click().perform();
		
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}


}
