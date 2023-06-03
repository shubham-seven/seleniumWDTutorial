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

public class keypressdemo1 {
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
	public void test() throws InterruptedException {
		//I-Frame Example
		//driver.switchTo().frame(0);
		Thread.sleep(3000);
		//Click on Sign-In Button	
		driver.findElement(By.xpath("//div/a[text()='Sign In']")).click();
		Thread.sleep(3000);
		//Locate Email-Id Element
	WebElement mailElement = driver.findElement(By.xpath("//input[@id='email'][1]"));
		mailElement.sendKeys("shubham@gmail.com");
		Thread.sleep(2000);
		//Using Tab Shift To PSW Filling Space
		mailElement.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		//Locate PSW Element
		WebElement pswElement = driver.findElement(By.xpath("//input[@id='login-password']"));
		pswElement.sendKeys("123123");
		Thread.sleep(3000);
		//Using Keys Package DO enter
		pswElement.sendKeys(Keys.ENTER);
		
		}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}



}
