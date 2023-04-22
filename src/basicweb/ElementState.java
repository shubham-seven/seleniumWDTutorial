package basicweb;

import static org.junit.Assert.*;

import java.sql.Driver;
import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriverLogLevel;

public class ElementState {
  WebDriver driver ;
  String url;
  
	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		url = "https://www.google.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void test() {
	
		driver.get(url);
		WebElement e1 = driver.findElement(By.id("APjFqb"));
		System.out.println("E1 is enabled : "+ e1.isEnabled());
		e1.sendKeys("Sumit Talreja mindtree");
		//Submit the text is very important remember this
		e1.submit();
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}
	



}
