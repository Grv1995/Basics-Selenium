package webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebdriverBasicsLocatorswithXpathSelector extends AbstractWebDriverTest{

	@Test
	public void testXpathSelectorTable() {
		driver.get("http://localhost:8080/pages/tables.html");
		WebElement browserRow1 = driver
				.findElement(By.xpath("//*[@id='dataTables-example']/thead/tr/th[2]"));
		System.out.println(browserRow1.getText());
	}

	@Test
	public void testXpathSelectorTable2() {
		driver.get("http://localhost:8080/pages/tables.html");
		WebElement browserRowSort1 = driver
				.findElement(By.xpath("//*[@id='dataTables-example']/thead/tr/th[2]"));
		sleep(2);

		browserRowSort1.click();

		sleep(2);

		WebElement sortElement = driver
				.findElement(By.xpath("//*[@id='dataTables-example']/tbody/tr[1]/td[2]"));
		assertEquals(sortElement.getText(), "All others");
	}
}
