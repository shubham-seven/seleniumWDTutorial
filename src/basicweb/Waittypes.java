package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Waittypes {

	WebDriver driver;
	
	public  Waittypes(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement waitforElement (By locator,int timeout) {
		WebElement element = null;
		
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			System.out.println("Element appeared on the webpage");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not appeared on the webpage");
		}
		return element;
	}
	public void waitForClickableElement (By locator,int timeout) {
		
		try {
			WebElement element = null;
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
			element = wait.until(ExpectedConditions.elementToBeClickable(locator));
			System.out.println("Element appeared on the webpage");
			element.click();
			
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not appeared on the webpage");
		}
	
	}
}
