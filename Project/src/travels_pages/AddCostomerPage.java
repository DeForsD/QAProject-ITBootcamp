package travels_pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class AddCostomerPage extends BasicPage{
	private By fName  = By.cssSelector("[placeholder='First name']");
	private By lName  = By.cssSelector("[placeholder='Last name']");
	private By email  = By.cssSelector("[placeholder='Email address']");
	private By passwrd  = By.cssSelector("[placeholder='Password']");
	private By mobile  = By.cssSelector("[placeholder='Mobile Number']");
	private By adresa1  = By.name("address1");
	private By adresa2  = By.name("address2");
	private By country  = By.cssSelector("#s2id_autogen1 > a > span.select2-chosen");
	private By status  = By.name("status");
	private By sub = By.cssSelector("#content > form > div > div.panel-footer > button");
	private By newsSub = By.name("newssub");
	private By countryWrite = By.cssSelector("#select2-drop > div > input"); 
	
	public AddCostomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement getfName() {
		return driver.findElement(fName);
	}

	public WebElement getlName() {
		return driver.findElement(this.lName);
	}

	public WebElement getEmail() {
		return driver.findElement(this.email);
	}

	public WebElement getPasswrd() {
		return driver.findElement(this.passwrd);
	}

	public WebElement getMobile() {
		return driver.findElement(mobile);
	}

	public WebElement getAdresa1() {
		return driver.findElement(adresa1);
	}

	public WebElement getAdresa2() {
		return driver.findElement(adresa2);
	}

	public WebElement getCountry() {
		return driver.findElement(country);
	}
	
	public WebElement getCountryWrite() {
		return driver.findElement(countryWrite);
	}

	public Select getStatus() {
		Select s = new Select(driver.findElement(status));
		return s;
	}

	public WebElement getSub() {
		return driver.findElement(sub);
	}

	public WebElement getNewsSub() {
		return driver.findElement(newsSub);
	}
	
	

}
