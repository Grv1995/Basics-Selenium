package webdriver.basics;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebdriverBasicsLocatorswithClassTest extends AbstractWebDriverTest{

	@Test
	public void testTitle() {
	driver.get("http://localhost:8080/pages/index.html");
	WebElement titleElement = driver.findElement(By.className("navbar-brand"));
	assertEquals("SB Admin v2.0", titleElement.getText());
	System.out.println(titleElement.getText());
}

@Test
public void testHugeTextElements() {
	driver.get("http://localhost:8080/pages/index.html");
	List<WebElement> hugeElements = driver.findElements(By.className("huge"));
	for (WebElement hugeElement : hugeElements) {
		System.out.println(hugeElement.getText());

	}
}
}
