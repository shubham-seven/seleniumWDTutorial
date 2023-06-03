package KeyPress;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keypresseventsusingactionclass {
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
		Actions action = new Actions(driver);
		//Key down for pressing button and Key Up for releasing button
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		//We use build method above as we are performing multiple actions
		//its better to use build method while performing multiple actions
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}



}
