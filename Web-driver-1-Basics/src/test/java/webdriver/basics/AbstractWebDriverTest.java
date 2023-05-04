package webdriver.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class AbstractWebDriverTest {

	protected WebDriver driver;

	public AbstractWebDriverTest() {
		super();
	}

	@BeforeTest
	public void before() {
	//		WebDriverManager.chromedriver().setup();
			WebDriverManager.firefoxdriver().setup();
	
			// Create a instance of webdriver
	//		ChromeDriver driver = new ChromeDriver();
			driver = new FirefoxDriver();
		}

	@AfterTest
	public void after() {
		driver.quit();
	}

	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}