package travels_pages;

import org.openqa.selenium.*;

public class MenuPage extends BasicPage {
	private By dash = By.cssSelector("#social-sidebar-menu > li:nth-child(1) > a");
	private By updates = By.xpath("//*[@id=\"social-sidebar-menu\"]/li[2]/a/span[1]");
	private By moduls = By.cssSelector("#social-sidebar-menu > li:nth-child(3) > a");
	private By tours = By.cssSelector("#social-sidebar-menu > li:nth-child(9) > a");
	private By toursAdd = By.cssSelector("#Tours > li:nth-child(2) > a");
	private By coupons = By.cssSelector("#social-sidebar-menu > li:nth-child(15) > a");
	private By newsletter = By.cssSelector("#social-sidebar-menu > li:nth-child(16) > a");
	private By booking = By.cssSelector("#social-sidebar-menu > li:nth-child(17) > a");
	private By cars = By.cssSelector("#social-sidebar-menu > li:nth-child(10) > a");
	private By carsCars = By.cssSelector("#Cars > li:nth-child(1) > a");
	private By carsExtras = By.cssSelector("#Cars > li:nth-child(2) > a");
	private By AddExtras = By.cssSelector("#content > div.panel.panel-default > div.panel-body > div > div > div.xcrud-ajax > div.xcrud-top-actions > a.btn.btn-success.xcrud-action");
	private By reviews = By.xpath("//*[@id=\"Tours\"]/li[4]/a");
	private By acount = By.cssSelector("#social-sidebar-menu > li:nth-child(5) > a");
	private By cosumers = By.xpath("//*[@id=\"ACCOUNTS\"]/li[3]/a");
	private By subCos = By.cssSelector("[title='Edit']");

	public MenuPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public WebElement getDash() {
		return driver.findElement(dash);
	}

	public WebElement getUpdates() {
		return driver.findElement(this.updates);
	}

	public WebElement getModuls() {
		return driver.findElement(this.moduls);
	}

	public WebElement getTours() {
		return driver.findElement(this.tours);
	}

	public WebElement getCoupons() {
		return driver.findElement(coupons);
	}

	public WebElement getNewsletter() {
		return driver.findElement(this.newsletter);
	}

	public WebElement getBooking() {
		return driver.findElement(booking);
	}

	public WebElement getToursAdd() {
		this.getTours().click();
		return driver.findElement(this.toursAdd);
	}

	public WebElement getReviews() {
		return driver.findElement(reviews);
	}

	public WebElement getCars() {
		return driver.findElement(this.cars);
	}

	public WebElement getCarsCars() {
		this.getCars().click();
		return driver.findElement(this.carsCars);
	}

	public WebElement getCarsExtras() {
		this.getCars().click();
		return driver.findElement(this.carsExtras);
	}

	public WebElement getAddExtras() {
		return driver.findElement(this.AddExtras);
	}

	public WebElement getAcount() {

		return driver.findElement(this.acount);
	}

	public WebElement getCostumers() {

		return driver.findElement(this.cosumers);
	}

	public WebElement getCostumersAdd() {

		return driver.findElement(this.subCos);
	}

}
