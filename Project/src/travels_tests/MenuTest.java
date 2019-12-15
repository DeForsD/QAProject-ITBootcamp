package travels_tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import travels_pages.MenuPage;
import travels_utils.ExelManipulator;

public class MenuTest extends BasicTest {

	@BeforeTest
	public void setup1() throws InterruptedException {
		setupLog();

		MenuPage mp = new MenuPage(driver);
		Thread.sleep(2000);
	}

	@BeforeTest
	public void iFrameProblem() {
		super.iframeClose();
	}

	@Test(priority = 10)
	public void ManuUpdates() throws InterruptedException {
		Thread.sleep(5000);
		MenuPage mp = new MenuPage(driver);
		ExelManipulator ep = new ExelManipulator();

		mp.getUpdates().click();
		Thread.sleep(5000);
		Assert.assertEquals(mp.getTitle(), "Updates");
	}

	@Test(priority = 11)
	public void ManuModules() throws InterruptedException {
		MenuPage mp = new MenuPage(driver);
		ExelManipulator ep = new ExelManipulator();

		mp.getModuls().click();
		Thread.sleep(5000);
		Assert.assertEquals(mp.getTitle(), "Modules");
	}

	@Test(priority = 12)
	public void ManuCoupons() throws InterruptedException {
		MenuPage mp = new MenuPage(driver);
		ExelManipulator ep = new ExelManipulator();

		mp.getCoupons().click();
		Thread.sleep(5000);
		Assert.assertEquals(mp.getTitle(), "Coupon Codes Management");
	}

	@Test(priority = 13)
	public void ManuNewsletters() throws InterruptedException {
		MenuPage mp = new MenuPage(driver);
		ExelManipulator ep = new ExelManipulator();

		mp.getNewsletter().click();
		Thread.sleep(5000);
		Assert.assertEquals(mp.getTitle(), "Newsletter Management");
	}

	@Test(priority = 14)
	public void ManuBooking() throws InterruptedException {
		MenuPage mp = new MenuPage(driver);
		ExelManipulator ep = new ExelManipulator();

		mp.getBooking().click();
		Thread.sleep(5000);
		Assert.assertEquals(mp.getTitle(), "Booking Management");
	}

	@Test(priority = 15)
	public void ManuTours() throws InterruptedException {
		MenuPage mp = new MenuPage(driver);
		ExelManipulator ep = new ExelManipulator();

		mp.getTours().click();
		mp.getToursAdd().click();
		Thread.sleep(5000);
		Assert.assertEquals(mp.getTitle(), "Add Tour");
	}
	
}
