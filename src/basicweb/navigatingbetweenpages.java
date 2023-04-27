package basicweb;



import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigatingbetweenpages {
   WebDriver driver;
	String url;
	
	@Before
	public void setUp() throws Exception {
	driver = new ChromeDriver();
	url = "https://letskodeit.teachable.com/";
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(url);
		String title = driver.getTitle();
		System.out.printf("Title of the page is : %s\n ",title);
		String currentUrl = driver.getCurrentUrl();
		System.out.printf("Current url is : %s\n",currentUrl);
		
		String urlNavigate = "https://www.youtube.com/";
		driver.navigate().to(urlNavigate);
		Thread.sleep(2000);
		
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	
	Thread.sleep(2000);
	driver.navigate().refresh();
	
	
	Thread.sleep(2000);
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);
	}
	
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}



}
