package webdriver.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriveBasicsLocatorsWithTagTest extends AbstractWebDriverTest {
  @Test
	public void getDetailsaAboutLoginButton() {

		driver.get("http://localhost:8080/pages/login.html");
		WebElement linkElement = driver.findElement(By.tagName("a"));
		System.out.println(linkElement.getText());
		System.out.println(linkElement.getAttribute("class"));
		System.out.println(linkElement.getAttribute("href"));
  }

	@Test
	public void getDetailsaAboutInputTags_FindAllElementWillReturnFirstElement() {

		driver.get("http://localhost:8080/pages/login.html");
		List<WebElement> linkElements = driver.findElements(By.tagName("input"));
		for (WebElement linkElement : linkElements) {
			System.out.println(linkElement.getAttribute("class"));// form-control
			System.out.println(linkElement.getAttribute("placeholder"));// E-mail
		}
	}

	@Test
	public void getDetailsaAboutInputTags_FindAllElements_Login() {

		driver.get("http://localhost:8080/login");
		List<WebElement> linkElements = driver.findElements(By.tagName("input"));
		for (WebElement linkElement : linkElements) {
			System.out.println(linkElement.getAttribute("type"));// form-control
			System.out.println(linkElement.getAttribute("name"));// E-mail
			sleep(2);
		}
	}
}
