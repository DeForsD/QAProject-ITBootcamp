package travels_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import travels_pages.*;
import travels_utils.*;

public class LoginTest extends BasicTest {

	@Test(priority = 0)
	public void login() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);

		ExelManipulator ep = new ExelManipulator();

		Thread.sleep(5000);

		ep.setExcell("..\\Project\\Username.xlsx");
		ep.setWorkSheet(0);
		System.out.println(ep.getDataAt(1, 0));
		System.out.println(ep.getDataAt(1, 1));

		lp.getEmail().sendKeys(ep.getDataAt(1, 0));
		lp.getPswrd().sendKeys(ep.getDataAt(1, 1));
		lp.getSubmit().click();
		Thread.sleep(5000);

		MenuPage mp = new MenuPage(driver);

		Assert.assertEquals(mp.getTitle(), "Dashboard");
	}

}
