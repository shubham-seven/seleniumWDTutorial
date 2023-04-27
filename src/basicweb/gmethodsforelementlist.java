package basicweb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gmethodsforelementlist {

	WebDriver driver;
	
	public gmethodsforelementlist(WebDriver driver) {
		this.driver = driver;
	}
	
	public List<WebElement> getElements(String locator,String type) {
		
		type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("element found with id : "+locator);
			return this.driver.findElements(By.id(locator));
		}
		else if (type.equals("xpath")) {
			System.out.println("element found with xpath : "+locator);
			return this.driver.findElements(By.xpath(locator));
		}
		else {
			System.out.println("Locator type is not supported");
			return null;
		}
	}
}
