package basicweb;

import static org.junit.Assert.*;

import java.time.Duration;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleselect {
	WebDriver driver;
	String urlString;
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		urlString = "https://www.letskodeit.com/practice";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(urlString);
	}
	
	@Test
	public void test() throws InterruptedException {
		
		WebElement element = driver.findElement(By.id("multiple-select-example"));
		
		Select sel = new Select(element);
		
		sel.selectByValue("orange");
		Thread.sleep(2000);
		//sel.deselectByIndex(1);
		//Thread.sleep(2000);
		sel.selectByVisibleText("Apple");
		Thread.sleep(2000);
		//sel.deselectByIndex(0);
		//Thread.sleep(2000);
		sel.selectByIndex(2);
		Thread.sleep(2000);
		//sel.deselectByVisibleText("Peach");
	List<WebElement> allOptions = sel.getAllSelectedOptions();
	for (WebElement option : allOptions) {
		System.out.println(option.getText());
		
	}
		sel.deselectAll();
		
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}



}
