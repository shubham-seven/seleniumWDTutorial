package RegressionTestingFindingAllLinks;

import static org.junit.Assert.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.Classes.SearchPageFactory;

public class FindAllLinks {
	WebDriver driver;
	String baseUrl;
	SearchPageFactory search;
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.expedia.com/";
		
		search = new SearchPageFactory(driver);
		
		//Maximize the browsers window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseUrl);
	}
	@Test
	public void testFindLinks() throws InterruptedException {
		search.clickFlightTab(driver);
		
		List<WebElement> linkslist = clickableLinks(driver);
		try {
			for(WebElement link : linkslist) {
			String href =	link.getAttribute("href");
			URL u = new URL(href);
			System.out.println("Url " + href + " responsemsg " + linkStatus(u));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static List<WebElement> clickableLinks(WebDriver driver) {
		List<WebElement> linksToClick = new ArrayList<WebElement>();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		elements.addAll(driver.findElements(By.tagName("img")));
		
		for(WebElement e : elements) {
			if (e.getAttribute("href")!= null) {
				linksToClick.add(e);
			}
		}
		
		
		return linksToClick;
	}

	public static String linkStatus(URL url) {
	try {
		HttpURLConnection http =(HttpURLConnection) url.openConnection();
		http.connect();
		String responseMessage = http.getResponseMessage();
		http.disconnect();
		
		return responseMessage;
	} catch (Exception e) {
		// TODO: handle exception
		return e.getMessage();
	}
	
		
	}
	@After
	public void tearDown() throws Exception {
	}

	

}
