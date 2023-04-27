package basicweb;



import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwaitdemo {
WebDriver driver;
String baseUrl ; 
	
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
		WebElement  el1 = driver.findElement(By.xpath("//div/a[@href='/login']"));
		el1.click();
		Thread.sleep(2000);
		//driver.navigate().back();
		
		driver.findElement(By.id("email")).sendKeys("test123");
	
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

	

}
