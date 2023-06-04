package Page.Classes;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	public static WebElement element = null;
	
	public static void flight(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath("//a/span[text()='Flights']")).click();
        Thread.sleep(5000); 		
	}

	public static void leavingFromTextBox(WebDriver driver,String origin) throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@aria-label='Leaving from']"));
		element.click();
		Thread.sleep(4000);
		element = driver.findElement(By.xpath("//input[@placeholder='Where are you leaving from?']"));
		element.sendKeys(origin);
		Thread.sleep(3000);
		element.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	public static void goingToTextBox(WebDriver driver,String dest) throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@aria-label='Going to']"));
		element.click();
		Thread.sleep(4000);
		element = driver.findElement(By.xpath("//input[@placeholder='Where are you going to?']"));
		element.sendKeys(dest);
		Thread.sleep(3000);
		element.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	public static void departingDateButton(WebDriver driver) throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@aria-label='Departing June 18, 2023']"));
		element.click();
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//tbody/tr[2]/td[7]/button[@data-day=10]"));
		element.click();
		Thread.sleep(2000);
		element = driver.findElement(By.xpath("//div[@class='uitk-date-picker date-picker-menu']/div[2]/div/button"));
		element.click();
		Thread.sleep(3000);
		
	}
	public static void returningDateButton(WebDriver driver) throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@aria-label='Returning June 11, 2023']"));
		element.click();
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//div[@class='uitk-date-picker-menu-months-container']/div[2]//tbody/tr[2]/td[4]/button"));
		element.click();
		Thread.sleep(2000);
		element = driver.findElement(By.xpath("//div[@class='uitk-date-picker date-picker-menu']/div[2]/div/button"));
		element.click();
		Thread.sleep(3000);
		
	}
	
	public static void submitButton(WebDriver driver) throws InterruptedException {
		
		element = driver.findElement(By.xpath("//button[@data-testid='submit-button']"));
		element.click();
		Thread.sleep(8000);
	}
}
