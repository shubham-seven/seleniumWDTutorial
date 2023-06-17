package basicweb;


import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class exercise1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
		String baseUrl = "https://www.letskodeit.com/practice";
	      driver.get(baseUrl); 
	      
	     WebElement el1 = driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]/td[3]"));
	     
	    System.out.println(el1.getText());  
	   
	      driver.close();
	     
	      }

}
