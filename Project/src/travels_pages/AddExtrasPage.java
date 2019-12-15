package travels_pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class AddExtrasPage extends BasicPage{
	private By name = By.name("cHRfZXh0cmFzLmV4dHJhc190aXRsZQ--");
	private By status = By.name("cHRfZXh0cmFzLmV4dHJhc19zdGF0dXM-");
	private By price = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/div/input");
	private By save = By.cssSelector(".btn.btn-primary.xcrud-action");
	private By edit = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[9]/span/a[2]");
	
	public AddExtrasPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement getName() {
		return driver.findElement(name);
	}
	
	public WebElement getEdit() {
		return driver.findElement(edit);
	}
	
	public WebElement getStatus() {
		return driver.findElement(status);
	}
	
	public Select GetStatusSelect() {
		Select s = new Select(this.getStatus());
		return s;
	}

	public WebElement getPrice() {
		return driver.findElement(price);
	}

	public WebElement getSave() {
		return driver.findElement(save);
	}
	
	

}
