package webdriver.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebdriverBasicsLocatorswithCssSelector extends AbstractWebDriverTest{

	@Test
	public void testCssSelectorTable() {
		driver.get("http://localhost:8080/pages/tables.html");
		WebElement browserRow1 = driver
				.findElement(By.cssSelector("#dataTables-example > tbody > tr:nth-child(1) > td:nth-child(2)"));
		System.out.println(browserRow1.getText());
	}

	@Test
	public void testCssSelectorTable2() {
		driver.get("http://localhost:8080/pages/tables.html");
		WebElement browserRowSort1 = driver
				.findElement(By.cssSelector("#dataTables-example > thead > tr > th:nth-child(2)"));
		browserRowSort1.click();
		sleep(2);
		WebElement sortElement = driver
				.findElement(By.cssSelector("#dataTables-example > tbody > tr.gradeU.odd > td.sorting_1"));
		assertEquals(sortElement.getText(), "All others");
	}
}
