package javascriptexecution;




import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavaScriptExecution {
	WebDriver driver;
	String baseUrl;
	JavascriptExecutor jsExecutor;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		//baseUrl = "https://www.letskodeit.com/practice";
		jsExecutor = (JavascriptExecutor)driver; 
		
		//Maximize the browsers window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void test() throws InterruptedException {
		//Navigation
		//driver.get(baseUrl);
		jsExecutor.executeScript("window.location = 'https://www.letskodeit.com/practice';");
		
		//Finding Element
		
		//WebElement textBox = driver.findElement(By.id("autosuggest"));
		//textBox.sendKeys("test");
		
		WebElement textBox = (WebElement)jsExecutor.executeScript("return document.getElementById('autosuggest')");
		textBox.sendKeys("test");
		Thread.sleep(2000);
		
		//Size of the Window(we have to use long keyword only as output from javascript is coming in long)
		
	   long height = (Long)jsExecutor.executeScript("return window.innerHeight;");
	   long width = (Long)jsExecutor.executeScript("return window.innerWidth;");
	   System.out.println(height);
	   System.out.println(width);
	   
	   //Scroll Down 
	   jsExecutor.executeScript("window.scrollBy(0,1300);");
	   Thread.sleep(2000);
	   
	   //Scroll Up
	   jsExecutor.executeScript("window.scrollBy(0,-1300);");
	   Thread.sleep(2000);
	   
	   //Scroll Element into view
	   
	   WebElement mhElement = (WebElement)jsExecutor.executeScript("return document.getElementById('mousehover');");
	   jsExecutor.executeScript("arguments[0].scrollIntoView(true);", mhElement);   
	   Thread.sleep(2000);
	   jsExecutor.executeScript("window.scrollBy(0,-130);");
	 //mhElement.click();
	   //How to click on element using javascript
	   jsExecutor.executeScript("window.scrollBy(0,-1300);");
	   //System.out.println(mhElement.isDisplayed());
	   Thread.sleep(2000);
	   WebElement buttton = (WebElement)jsExecutor.executeScript("return document.getElementById('openwindow');");
	    jsExecutor.executeScript("arguments[0].click();", buttton);
	  
	    //While interacting with elements if you find element is not interactable then use javascript commands
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		
	}


}
