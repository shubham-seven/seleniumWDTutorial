package basicweb;



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

public class radiocheckboxdropdown {

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
		//RadioButtons
		
		WebElement e1 = driver.findElement(By.id("bmwradio"));
		e1.click();
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.id("benzradio"));
		e2.click();
		Thread.sleep(2000);
		WebElement e3 = driver.findElement(By.id("hondaradio"));
		e3.click();
		Thread.sleep(2000);
		
		
		//Way to iterate List elements
		
	List<WebElement> radioButtons = driver.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		
	int sizerb = radioButtons.size();
	for (int i=0;i<sizerb;i++) {
	Boolean	isSelected = false;
	isSelected = radioButtons.get(i).isSelected();
	if (isSelected==false) {
		radioButtons.get(i).click();
	}
	Thread.sleep(2000);
	continue;
	}
	
	
	//CheckBoxes
	
	WebElement e4 = driver.findElement(By.id("bmwcheck"));
	e4.click();
	Thread.sleep(2000);
	e4.click();
	Thread.sleep(2000);
	WebElement e5 = driver.findElement(By.id("benzcheck"));
	e5.click();
	Thread.sleep(2000);
	e5.click();
	Thread.sleep(2000);
	WebElement e6 = driver.findElement(By.id("hondacheck"));
	e6.click();
	Thread.sleep(2000);
	e6.click();
	Thread.sleep(2000);
	
	//Way to iterate List elements
	
	List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[contains(@type,'checkbox') and contains(@name,'cars')]"));
	
	int sizecb = checkBoxes.size();
	for (int i=0;i<sizecb;i++) {
	Boolean	isSelected = false;
	isSelected = checkBoxes.get(i).isSelected();
	if (isSelected==false) {
		checkBoxes.get(i).click();
	}
	Thread.sleep(2000);
	continue;
	}
	
	//DropDown Boxes
	WebElement element = driver.findElement(By.id("carselect"));
	
	Select sel = new Select(element);
	Thread.sleep(2000);
	
	sel.selectByIndex(2);
	Thread.sleep(2000);
	
	
	sel.selectByValue("benz");
	Thread.sleep(2000);
	
    sel.selectByVisibleText("BMW");
    Thread.sleep(2000);

	
	//Way to iterate List elements(DropDown boxes have different method)
	
	List<WebElement> options = sel.getOptions();
	      int size = options.size();
	
	for (int i=0;i<size;i++) {
	String textString =	options.get(i).getText();
	System.out.println(textString);
		options.get(i).click();
		Thread.sleep(2000);
	}
	
	}
	@After
	public void tearDown() throws Exception {
		driver.quit();
		
	}



}
