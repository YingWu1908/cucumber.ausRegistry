package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AbstractPageStepDefinition {
	protected static WebDriver driver;
	protected static ChromeOptions chromeOptions = new ChromeOptions();

	protected WebDriver getDriver() {
		if (driver==null) {
			System.setProperty("webdriver.chrome.driver", "E:\\Helen\\selenium\\Chromedriver\\Chromedriver.exe");
			System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			chromeOptions.addArguments("--start-maximized");
			driver=new ChromeDriver(chromeOptions);
		}
		return driver;
	}
}
