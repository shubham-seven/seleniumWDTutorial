package Page.Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	WebDriver driver;

	@FindBy(xpath = "//a/span[text()='Flights']")
	WebElement flightTab;
	
	@FindBy(xpath = "//a/span[text()='Cars']")
	WebElement carsTab;
	
	@FindBy(xpath = "//a/span[text()='Packages']")
	WebElement packagesTab;
	
	@FindBy(xpath = "//a/span[text()='Things to do']")
	WebElement thingsToDoTab;
	
	@FindBy(xpath = "//a/span[text()='Cruises']")
	WebElement cruisesTab;
	
	public SearchPageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightTab(WebDriver driver) throws InterruptedException {
		flightTab.click();
		Thread.sleep(3000);
		
		}
	public void clickCarsTab(WebDriver driver) throws InterruptedException {
		carsTab.click();
		Thread.sleep(3000);
		
	}
	public void clickPackagesTab(WebDriver driver) throws InterruptedException {
		packagesTab.click();
		Thread.sleep(3000);
	}
	public void clickThingsToDoTab(WebDriver driver) throws InterruptedException {
		thingsToDoTab.click();
		Thread.sleep(3000);
}
	public void clickCruisesTab(WebDriver driver) throws InterruptedException {
		cruisesTab.click();
		Thread.sleep(3000);
}
}
