package webdriver.basics.form.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import webdriver.basics.AbstractWebDriverTest;


public class FormElementsRadioButtonTest extends AbstractWebDriverTest {
  @Test
	public void readFromRadioButton() {
		driver.get("http://localhost:8080/pages/forms.html");
		List<WebElement> options = driver.findElements(By.name("optionsRadios"));
		for (WebElement option : options) {
			System.out.println(option.getAttribute("value") + " " + option.isSelected());

		}
		// option1 false
		// option2 false
		// option3 true
	}

	@Test
	public void readFromRadioButtonWithAFrameWork() {
		driver.get("http://localhost:8080/pages/forms.html");
		System.out.println(getSelectedRadioButtonValue("optionsRadios"));
		System.out.println(getSelectedRadioButtonValue("optionsRadiosInline"));
	}

	@Test
	public void setValueForRadioButton() {
		driver.get("http://localhost:8080/pages/forms.html");
		List<WebElement> options = driver.findElements(By.name("optionsRadios"));
		sleep(4);

		for (WebElement option : options) {
			if (option.getAttribute("value").equals("option2")) {
				option.click();
			}
		}
		sleep(4);
	}

	@Test
	public void setValueForRadioButtonwithFramwworkMethod() {
		driver.get("http://localhost:8080/pages/forms.html");

		setRadioButtonToValue("optionsRadios", "option2");
		sleep(4);

		setRadioButtonToValue("optionsRadiosInline", "inline-option1");
		sleep(4);


	}

	private void setRadioButtonToValue(String radioButtonName, String valueToSelect) {
		List<WebElement> options = driver.findElements(By.name(radioButtonName));

		for (WebElement option : options) {
			if (option.getAttribute("value").equals(valueToSelect)) {
				option.click();
			}
		}
	}

	private String getSelectedRadioButtonValue(String name) {
		List<WebElement> options = driver.findElements(By.name(name));
		for (WebElement option : options) {
			if (option.isSelected()) {
				return option.getAttribute("value");
			}

		}
		return null;
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
		WebElement checkboxElement1 = driver.findElement(By.name(checkboxName));

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
		WebElement checkboxElement1 = driver.findElement(By.name(checkboxName));

		boolean currentValue = checkboxElement1.isSelected();

		if (currentValue == true) {
			checkboxElement1.click();
		}
		sleep(4);
	}

}
