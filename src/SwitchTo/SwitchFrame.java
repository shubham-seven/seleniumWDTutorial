package SwitchTo;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrame {
WebDriver driver;
String baseUrl;
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.letskodeit.com/practice";
		//Maximize the browsers window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		//Switch to iframe using string
     //driver.switchTo().frame("courses-iframe");
   //Switch to iframe by id
    // WebElement searchBox = driver.findElement(By.id("search"));
  
      //Switch to iframe by name
     //WebElement searchBox = driver.findElement(By.name("course"));
     
      //Switch to iframe using number(here only one i-frame on webpage so default value is 0)
     driver.switchTo().frame(0);
     //After switching to frame searching webelement on i-frame
     WebElement searchBox = driver.findElement(By.name("course"));
     searchBox.sendKeys("Python");
     Thread.sleep(4000);
     //Switch to default page
     driver.switchTo().defaultContent();
     
     WebElement textBox = driver.findElement(By.id("autosuggest"));
     textBox.sendKeys("Test Successful");
     Thread.sleep(4000);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.close();
	}
	



}
