package basicweb;



import java.time.Duration;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicsJUnit {
	
	WebDriver driver1;

	String url;
	
	@Before
	public void setUp(){
		
		
		driver1 = new ChromeDriver();
		
		url = "https://www.letskodeit.com/";
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	

	
	@Test
	public void test() throws InterruptedException  {
        
		driver1.get(url);
		
		driver1.findElement(By.xpath("//a[@href='/login']")).click();
		 
		driver1.findElement(By.id("email")).clear();
		driver1.findElement(By.id("email")).sendKeys("shubhamrolly@gmail.com");
		Thread.sleep(3000);
		driver1.findElement(By.id("login-password")).clear();
		driver1.findElement(By.id("login-password")).sendKeys("123456");
		Thread.sleep(3000);
		driver1.findElement(By.id("login")).click();
		Thread.sleep(6000);
		driver1.close();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("End of program");
	}


}
