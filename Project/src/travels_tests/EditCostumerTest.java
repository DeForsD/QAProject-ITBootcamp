package travels_tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import travels_pages.AddCostomerPage;
import travels_pages.MenuPage;

public class EditCostumerTest extends BasicTest {

	@BeforeTest
	public void setupForCostumers() throws InterruptedException {
		setupLog();
		iframeClose();

		AddCostomerPage acp = new AddCostomerPage(driver); // marko
		MenuPage mp = new MenuPage(driver);
		mp.getAcount().click();
		Thread.sleep(2000);
		mp.getCostumers().click();
		mp.getCostumersAdd().click();
		iframeClose();
	}

	@Test
	public void editCostumer() throws InterruptedException {

		AddCostomerPage acp = new AddCostomerPage(driver); // marko
		MenuPage mp = new MenuPage(driver);
		String name = "Marko";

		acp.getfName().clear();
		acp.getfName().sendKeys(name);
		acp.getlName().clear();
		acp.getlName().sendKeys("Mitrovic");
		acp.getEmail().clear();
		acp.getEmail().sendKeys("marko@gmail.com");
		acp.getMobile().clear();
		acp.getMobile().sendKeys("06000000002");
		acp.getAdresa1().sendKeys("Mirkova BB");
		acp.getStatus().selectByIndex(0);
		acp.getCountry().click();
		acp.getCountryWrite().sendKeys("Serbia");
		acp.getCountryWrite().sendKeys(Keys.ENTER);
		acp.getNewsSub().click();
		acp.getSub().click();

		Thread.sleep(3000);
		String check = driver
				.findElement(
						By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[3]"))
				.getText();

		Assert.assertEquals(check, name);

	}
}
