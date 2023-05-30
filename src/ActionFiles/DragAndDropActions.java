package ActionFiles;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {
	WebDriver driver;
	String baseUrl;
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://jqueryui.com/";
		//Maximize the browsers window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(baseUrl);
	}



	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		Thread.sleep(5000);
		//Switch Frame by Index
		driver.switchTo().frame(0);
		
		WebElement draggableElement = driver.findElement(By.id("draggable"));
		WebElement droppableElement = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		//Drag And Drop Method From Action Class
		//action.dragAndDrop(draggableElement, droppableElement).build().perform();
		//Drag And Drop manually
		action.clickAndHold(draggableElement).moveToElement(droppableElement).release().build().perform();
		
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.close();
		
	}

}
