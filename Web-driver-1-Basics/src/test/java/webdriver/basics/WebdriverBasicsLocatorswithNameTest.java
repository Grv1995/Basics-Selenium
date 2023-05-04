package webdriver.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class WebdriverBasicsLocatorswithNameTest extends AbstractWebDriverTest {

	@Test

	public void getInformationAboutName() {
		driver.get("http://localhost:8080/pages/login.html");
		WebElement nameElement = driver.findElement(By.name("email"));
		System.out.println(nameElement.getTagName()); // input
		System.out.println(nameElement.getAttribute("class"));
		System.out.println(nameElement.getAttribute("placeholder"));
		System.out.println(nameElement.getAttribute("value")); // value - Empty
	}


	@Test
	public void getInformationAboutPassword() {
		driver.get("http://localhost:8080/pages/login.html");
		WebElement nameElement = driver.findElement(By.name("password"));
		System.out.println(nameElement.getTagName()); // input
		System.out.println(nameElement.getAttribute("class"));
		System.out.println(nameElement.getAttribute("placeholder"));
		System.out.println(nameElement.getAttribute("value")); // value - Empty
	}

	@Test
	public void getInformationAboutCheckbox() {
		driver.get("http://localhost:8080/pages/login.html");
		WebElement nameElement = driver.findElement(By.name("remember"));
		System.out.println(nameElement.getTagName()); // input
		System.out.println(nameElement.getAttribute("class"));
		System.out.println(nameElement.getAttribute("type"));
		System.out.println(nameElement.getAttribute("value")); // value - checkbox
	}

	@Test(enabled = false)
	@Ignore
	public void getInformationAboutLogin() {
		driver.get("http://localhost:8080/pages/login.html");
		WebElement nameElement = driver.findElement(ByClassName.className("btn btn-lg btn-success btn-block"));
		System.out.println(nameElement.getTagName()); // input
		System.out.println(nameElement.getAttribute("class"));
		System.out.println(nameElement.getAttribute("type"));
		System.out.println(nameElement.getAttribute("value")); // value - checkbox
	}

}
