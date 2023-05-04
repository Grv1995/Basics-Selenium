package webdriver.basics.form.Test;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import webdriver.basics.AbstractWebDriverTest;


public class FormElementsTest extends AbstractWebDriverTest {
  @Test
	public void readFromTextElement() {
		driver.get("http://localhost:8080/pages/forms.html");

		assertEquals(driver.findElement(By.id("textElement")).getAttribute("value"), "in28minutes");

	}

	@Test
	public void setSpecificValueIntoElement() {
		driver.get("http://localhost:8080/pages/forms.html");

		WebElement textElement = driver.findElement(By.id("textElement"));
		sleep(4);
		textElement.clear();
		textElement.sendKeys("NewValue");
		sleep(4);

  }

	@Test
	public void writeAndReadValueFromTextArea() {
		driver.get("http://localhost:8080/pages/forms.html");

		WebElement textAreaElement = driver.findElement(By.id("textAreaElement"));
		assertEquals(textAreaElement.getAttribute("value"), "");
		sleep(4);
		textAreaElement.clear();
		textAreaElement.sendKeys("FirstLine");
		textAreaElement.sendKeys("\n");
		textAreaElement.sendKeys("SecondLine");

		sleep(4);
		assertEquals(textAreaElement.getAttribute("value"), "FirstLine\nSecondLine");
		sleep(4);

	}
}
