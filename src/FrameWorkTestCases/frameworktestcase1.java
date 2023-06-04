package FrameWorkTestCases;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.Classes.SearchPageFactory;

public class frameworktestcase1 {
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
	public void test() throws InterruptedException {
	
		search.clickFlightTab(driver);
		search.clickCarsTab(driver);
		search.clickPackagesTab(driver);
		search.clickThingsToDoTab(driver);
		search.clickCruisesTab(driver);
	}


	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.close();
	}

	
}
