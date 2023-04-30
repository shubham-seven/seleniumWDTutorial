package basicweb;



import java.net.MulticastSocket;
import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete {

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
		
		WebElement el1 = driver.findElement(By.xpath("//button[@aria-label='Going to']"));
		el1.click();
		
		Thread.sleep(2000);
		WebElement el2 = driver.findElement(By.id("location-field-destination"));
		el2.sendKeys("D");
		Thread.sleep(1000);
		el2.sendKeys("e");
		Thread.sleep(1000);
		el2.sendKeys("l");
		Thread.sleep(1000);
		Thread.sleep(3000);
		WebElement el3 = driver.findElement(By.xpath("//ul[@class='uitk-action-list no-bullet']/li[3]"));
		el3.click();
		Thread.sleep(5000);
		String innerHTML = el3.getAttribute("innerHTML");
		System.out.println(el3.getTagName());
		System.out.println(innerHTML);
		
		List<WebElement> elements = el3.findElements(By.tagName("li"));
		
		System.out.println(elements);
		/*Thread.sleep(5000);
		WebElement el4 = driver.findElement(By.xpath("//button[@data-day='30']"));
		el4.click();
		Thread.sleep(2000);
		WebElement el5 = driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary']"));
		el5.click();
		Thread.sleep(2000);*/
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		//driver.quit();
	}


}

