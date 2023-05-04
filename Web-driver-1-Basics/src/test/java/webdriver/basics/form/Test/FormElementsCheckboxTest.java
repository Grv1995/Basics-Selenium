package webdriver.basics.form.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import webdriver.basics.AbstractWebDriverTest;


public class FormElementsCheckboxTest extends AbstractWebDriverTest {
  @Test
	public void readFromTextElement() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement checkboxElement = driver.findElement(By.name("checkboxElement1"));
		System.out.println(checkboxElement.isSelected());
		assertFalse(checkboxElement.isSelected());

		WebElement checkboxElement2 = driver.findElement(By.name("checkboxElement2"));
		System.out.println(checkboxElement2.isSelected());
		assertTrue(checkboxElement2.isSelected());


	}

	@Test
	public void setValueIntoCheckboxElement() {
		driver.get("http://localhost:8080/pages/forms.html");
		WebElement checkboxElement1 = driver.findElement(By.name("checkboxElement1"));
		sleep(4);
		checkboxElement1.click();
		sleep(4);

		WebElement checkboxElement3 = driver.findElement(By.name("checkboxElement3"));
		sleep(4);
		checkboxElement3.click();
		sleep(4);
	}

	@Test
	public void checkACheckbox() {
		driver.get("http://localhost:8080/pages/forms.html");


		checkACheckbox("checkboxElement1");
		checkACheckbox("checkboxElement2");
		checkACheckbox("checkboxElement3");
		sleep(4);
	}

	private void checkACheckbox(String checkboxName) {
		WebElement checkboxElement1 = driver.findElement(By.name("checkboxName"));

		boolean currentValue = checkboxElement1.isSelected();

		if (currentValue == false) {
			checkboxElement1.click();
		}
	}
	@Test
	public void uncheckACheckbox() {
		driver.get("http://localhost:8080/pages/forms.html");


		uncheckACheckbox("checkboxElement1");
		sleep(2);
		uncheckACheckbox("checkboxElement2");
		sleep(2);
		uncheckACheckbox("checkboxElement3");
		sleep(4);
	}

	private void uncheckACheckbox(String checkboxName) {
		WebElement checkboxElement1 = driver.findElement(By.name("checkboxName"));

		boolean currentValue = checkboxElement1.isSelected();

		if (currentValue == true) {
			checkboxElement1.click();
		}
		sleep(4);
	}

}
