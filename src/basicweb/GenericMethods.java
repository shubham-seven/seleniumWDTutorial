package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericMethods {
	

	WebDriver driver;
	
	public GenericMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElements(String locator,String type) {
		type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("element found with id : "+type);
			return this.driver.findElement(By.id(locator));
		}
		else if (type.equals("xpath")) {
			System.out.println("element found with xpath : "+type);
			return this.driver.findElement(By.xpath(locator));
		}
		else {
			System.out.println("Locator type is not supported");
			return null;
		}
	}
}
