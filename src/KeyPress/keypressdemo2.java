package KeyPress;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keypressdemo2 {
	WebDriver driver;
	String baseUrl;
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.letskodeit.com/practice";
		
		//Maximize the browsers window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(baseUrl);
	}
	@Test
	public void test() {
	WebElement testElement = driver.findElement(By.xpath("//button[@id='openwindow']"));
	//testElement.sendKeys(Keys.CONTROL + "a");
	
	//Using Chord
	//testElement.sendKeys(Keys.chord(Keys.CONTROL,"a"));
	
	//By passing String
	String selectAll = Keys.CONTROL + "a";
	testElement.sendKeys(selectAll);
	
	
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}



}
