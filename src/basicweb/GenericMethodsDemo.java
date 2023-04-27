package basicweb;



import java.time.Duration;
import java.util.List;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericMethodsDemo {
	private WebDriver driver;
	private	String urlString;
	//private	GenericMethods gMethods;
	private gmethodsforelementlist gMethods;
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		urlString = "https://www.letskodeit.com/practice";
		
		//generic method for locating element
		//gMethods = new GenericMethods(driver); 
		
		//generic method for elementlist
		gMethods = new gmethodsforelementlist(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(urlString);
		/*WebElement element1 = driver.findElement(By.id("name"));
		element1.sendKeys("yo shubham");
		Thread.sleep(2000);
		element1.clear();*/
		
		// By generic methods 
		List<WebElement> element2 = gMethods.getElements("//input[@type='text']","xpath");
		//element2.sendKeys("shubham gmethod");
	int size =	element2.size();
	System.out.println(size);
	
		Thread.sleep(2000);
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		
	}



}
