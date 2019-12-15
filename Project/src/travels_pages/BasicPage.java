package travels_pages;

import org.openqa.selenium.*;

public class BasicPage {
	protected WebDriver driver;
	
	public BasicPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void klick(WebElement we) {
		we.click();
	}
	
	public void sendKeys(WebElement we, String sta) {
		we.sendKeys(sta);
	}
}
