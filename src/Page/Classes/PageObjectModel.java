package Page.Classes;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageObjectModel {
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
		SearchPage.flight(driver);
		SearchPage.leavingFromTextBox(driver,"New York");
		SearchPage.goingToTextBox(driver,"Chicago");
		SearchPage.departingDateButton(driver);
		SearchPage.returningDateButton(driver);
		SearchPage.submitButton(driver);
    }

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}



}
