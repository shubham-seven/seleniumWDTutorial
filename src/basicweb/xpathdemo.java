package basicweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {
   
	//No need to use SuppressWarnings("deprecation") instead of this u can use Duration.ofSeconds()
	//Refer class BasicsJUnit.java
	@SuppressWarnings("deprecation")
	public static void main(String[] args)  {

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\shubh\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String baseUrl = "https://letskodeit.teachable.com/";
		driver.get(baseUrl);
		
		
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		
		
		int size = driver.findElements(By.tagName("iframe")).size(); 
		System.out.println(size);
		driver.switchTo().frame(0);
		//Thread.sleep(3000);
		
driver.findElement(By.xpath("//div[@id=\"challenge-stage\"]/div/label/input")).click();
                            
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	/*boolean isSelected = element.isSelected();
	System.out.println(isSelected);
	
	//performing click operation if element is not checked
	if(isSelected == false) {
		
		element.click();
	}*/

		driver.quit();
	}

}
