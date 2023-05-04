package webdriver.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import webdriver.basics.AbstractWebDriverTest;

public class FirstWebApplicationExtendedLoginTest extends AbstractWebDriverTest {

	@Test
	public void login() {
		driver.get("http://localhost:8080/pages/login.html");
		sleep(5);

		WebElement emailElement = driver.findElement(By.name("email"));
		emailElement.sendKeys("in28minutes");
		sleep(2);

		WebElement passwordElement = driver.findElement(By.name("password"));
		passwordElement.sendKeys("dummyselenium");
		sleep(2);

		WebElement loginElement = driver.findElement(By.tagName("a"));
		loginElement.click();
		sleep(2);


		WebElement welcomeMessageElemet = driver.findElement(By.tagName("h1"));
		System.out.println(welcomeMessageElemet.getText());
		sleep(2);

		System.out.println(driver.getCurrentUrl());
		sleep(2);

  }
}
