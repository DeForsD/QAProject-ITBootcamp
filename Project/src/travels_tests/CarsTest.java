package travels_tests;

import java.util.List;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import travels_pages.CarsPage;
import travels_pages.MenuPage;

public class CarsTest extends BasicTest {

	@BeforeTest
	public void setup1() throws InterruptedException {
		setupLog();
		MenuPage mp = new MenuPage(driver);

		Thread.sleep(2000);
		mp.getCarsCars().click();
		Thread.sleep(2000);
	}

	@Test(priority = 20)
	public void carsNumber() {
		CarsPage cp = new CarsPage(driver);
		List l = cp.carsList();

		Assert.assertEquals(l.size(), 10);
	}

	@Test(priority = 21)
	public void ordersNumber() {
		boolean b = false;
		CarsPage cp = new CarsPage(driver);

		if (cp.getOrders() >= 26)
			b = true;

		Assert.assertTrue(b);
	}

}
