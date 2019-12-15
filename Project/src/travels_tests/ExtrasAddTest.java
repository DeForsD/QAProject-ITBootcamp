package travels_tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import travels_pages.AddExtrasPage;
import travels_pages.MenuPage;

public class ExtrasAddTest extends BasicTest {
	@BeforeTest
	public void setup1() throws InterruptedException {
		setupLog();

		MenuPage mp = new MenuPage(driver);
		Thread.sleep(3000);
		mp.getCars().click();
		Thread.sleep(1000);
		mp.getCarsExtras().click();
		Thread.sleep(2000);
		mp.getAddExtras().click();
		
	}

	@Test(priority = 25)
	public void addExtra() throws InterruptedException {
		AddExtrasPage aep = new AddExtrasPage(driver);
		Thread.sleep(2000);
		String ime = "marko";

		aep.getName().sendKeys(ime);
		aep.getPrice().sendKeys("1000");
		Select s = new Select(aep.getStatus());
		s.selectByIndex(1);
		aep.getSave().click();
		Thread.sleep(4000);
		WebElement wb = driver.findElement(
				By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[4]"));

		Assert.assertEquals(wb.getText(), ime);
	}
}
