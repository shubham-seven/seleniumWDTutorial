package SwitchTo;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchAlert {
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
	public void test1() throws InterruptedException {
		Thread.sleep(1000);
		WebElement alertExample = driver.findElement(By.name("enter-name"));
		alertExample.sendKeys("shubham");
		Thread.sleep(3000);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//Here in this page no option for cancel so not using it
		//alert.dismiss();
	}
	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(1000);
		WebElement alertExample = driver.findElement(By.name("enter-name"));
		alertExample.sendKeys("shubham");
		Thread.sleep(3000);
		driver.findElement(By.id("confirmbtn")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}

	

}
