package webdriver.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriveBasicsLocatorsWithLinkTextTest extends AbstractWebDriverTest {
  @Test
	public void getIn28minutesLinksAndText() {

		driver.get("http://localhost:8080/login");
		WebElement linkElement = driver.findElement(By.linkText("in28Minutes"));
		System.out.println(linkElement.getText());
		System.out.println(linkElement.getAttribute("href"));
		linkElement.click();
		System.out.println(driver.getCurrentUrl());
  }

	@Test
	public void getIn28minutesTableLinks() {

		driver.get("http://localhost:8080/pages/index.html");
		WebElement linkElement = driver.findElement(By.linkText("Tables"));
		System.out.println(linkElement.getText());
		System.out.println(linkElement.getAttribute("href"));
		linkElement.click();
		System.out.println(driver.getCurrentUrl());
	}

	@Test
	public void getSBAdminPartialLinks() {

		driver.get("http://localhost:8080/pages/index.html");
		WebElement linkElement = driver.findElement(By.partialLinkText("SB Admin"));
		System.out.println(linkElement.getText());
		System.out.println(linkElement.getAttribute("href"));
		linkElement.click();
		System.out.println(driver.getCurrentUrl());
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
