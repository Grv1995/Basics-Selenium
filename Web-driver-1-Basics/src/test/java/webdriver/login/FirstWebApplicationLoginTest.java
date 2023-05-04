package webdriver.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import webdriver.basics.AbstractWebDriverTest;

public class FirstWebApplicationLoginTest extends AbstractWebDriverTest {

	@Test
	public void login() {
		driver.get("http://localhost:8080/login");
		sleep(5);

		WebElement nameElement = driver.findElement(By.name("name"));
		nameElement.sendKeys("in28minutes");
		sleep(2);

		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("dummy");
		sleep(2);

		WebElement submitElement = driver.findElement(By.id("submit"));
		submitElement.click();
		sleep(2);


		WebElement welcomeMessageElemet = driver.findElement(By.id("welcome-message"));
		System.out.println(welcomeMessageElemet.getText());
		sleep(2);

  }
}
