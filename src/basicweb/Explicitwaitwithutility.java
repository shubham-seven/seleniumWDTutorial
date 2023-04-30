package basicweb;



import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import basicweb.Waittypes;
public class Explicitwaitwithutility {

	Waittypes wt;
	WebDriver driver;
	String baseUrl ; 
		
		@Before
		public void setUp() throws Exception {
			driver = new ChromeDriver();
			baseUrl = "https://www.letskodeit.com/practice";
			
			wt = new Waittypes(driver);
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
			
			//We can use WebDriverWait or generic method called below
		//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));		
			
			//WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
			//el2.sendKeys("shubham");
			
			WebElement result = wt.waitforElement(By.id("email"), 5);
			result.sendKeys("Shubham Trivedi");
			Thread.sleep(2000);
			wt.waitForClickableElement(By.linkText("Forgot Password?"), 5);
			}

		@After
		public void tearDown() throws Exception {
			Thread.sleep(2000);
			driver.quit();
		}

		


}
