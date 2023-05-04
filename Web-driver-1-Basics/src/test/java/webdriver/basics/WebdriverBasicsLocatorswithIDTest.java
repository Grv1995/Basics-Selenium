package webdriver.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebdriverBasicsLocatorswithIDTest extends AbstractWebDriverTest{



	@Test

	public void getInformationAboutName() {
		driver.get("http://localhost:8080/login");
		WebElement nameElement = driver.findElement(By.id("name"));
		System.out.println(nameElement.getTagName()); // input
		System.out.println(nameElement.getAttribute("name")); // text
		System.out.println(nameElement.getAttribute("value")); // value - Empty
	}

	@Test

	public void getInformationAboutPassword() {
		WebElement passwordElement = driver.findElement(By.id("password"));
		System.out.println(passwordElement.getTagName()); // input
		System.out.println(passwordElement.getAttribute("name")); // text
		System.out.println(passwordElement.getAttribute("value")); // value - Empty
	}

	@Test

	public void getInformationAboutSubmitButton() {
		WebElement submitbuttonElement = driver.findElement(By.id("submit"));
		System.out.println(submitbuttonElement.getTagName()); // input
		System.out.println(submitbuttonElement.getAttribute("type"));// text
		System.out.println(submitbuttonElement.getAttribute("value")); // value - Empty

	}

}
