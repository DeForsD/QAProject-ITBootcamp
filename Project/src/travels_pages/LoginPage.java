package travels_pages;

import org.openqa.selenium.*;

public class LoginPage extends BasicPage{
	private By email = By.name("email");
	private By pswrd = By.name("password");
	private By remember = By.cssSelector("[name='remember']");
	private By forgot = By.cssSelector("#link-forgot");
	private By sub = By.cssSelector("[type='submit']");
 	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPswrd() {
		return driver.findElement(pswrd);
	}

	public WebElement getRemember() {
		return driver.findElement(remember);
	}

	public WebElement getForgot() {
		return driver.findElement(forgot);
	}

	public WebElement getSubmit() {
		return driver.findElement(sub);
	}
	
	
}
