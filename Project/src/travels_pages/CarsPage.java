package travels_pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.*;

public class CarsPage extends BasicPage{
	public By tabel = By.cssSelector("#content > div.panel.panel-default > div.panel-body tbody");
	private List<WebElement> rows = driver.findElements(By.className("xcrud-row"));
	
	public CarsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public List<WebElement> carsList(){
		List<WebElement> cars = new ArrayList<WebElement>();
		
		for(int i=0; i<rows.size();i++) {
			WebElement name = rows.get(i).findElements(By.tagName("td")).get(4);
			cars.add(name);
		}
		
		return cars;
	}
	
	public int getOrders(){
		int sum =0;
		for(int i=0; i<rows.size();i++) {
			WebElement order = rows.get(i).findElements(By.tagName("td")).get(9).findElement(By.cssSelector("[type='number']"));
			System.out.println(order.getAttribute("value"));
			sum+= Integer.parseInt(order.getAttribute("value"));
		}
		return sum;
	}
	
}
