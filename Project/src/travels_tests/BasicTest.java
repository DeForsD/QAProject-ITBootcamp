package travels_tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import travels_pages.LoginPage;
import travels_pages.MenuPage;
import travels_utils.ExelManipulator;

public class BasicTest {
	protected WebDriver driver;

	@BeforeTest
	public void setup() {
		String baseUrl = "https://www.phptravels.net/admin";
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}

	public void iframeClose() {
		try {
			Thread.sleep(10000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("return document.querySelector(\"#chat-widget-container\").remove();");
			js.executeScript("return document.querySelector(\"#livechat-eye-catcher-img > img\").remove();");

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Nema ga");
		}
	}

	public void setupLog() {

		LoginPage lp = new LoginPage(driver);

		ExelManipulator ep = new ExelManipulator();

		ep.setExcell("..\\Project\\Username.xlsx");
		ep.setWorkSheet(0);
		System.out.println(ep.getDataAt(1, 0));
		System.out.println(ep.getDataAt(1, 1));

		lp.getEmail().sendKeys(ep.getDataAt(1, 0));
		lp.getPswrd().sendKeys(ep.getDataAt(1, 1));
		lp.getSubmit().click();

		MenuPage mp = new MenuPage(driver);
	}

	@AfterTest
	public void quit() throws InterruptedException {
		 Thread.sleep(5000);
		 driver.close();
	}
}
