package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class VerifyRegistedNumber extends AbstractPageStepDefinition{
	WebDriver driver=getDriver();
	//	ChromeOptions chromeOptions = new ChromeOptions();
//	public static String baseUrl="https://www.ausregistry.com.au/";
//	
//	@Given("^URL of ausregistry homepage on chrome browser$")
//	public void url_of_ausregistry_homepage_on_chrome_browser() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "E:\\Helen\\selenium\\Chromedriver\\Chromedriver.exe");
//		System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//		chromeOptions.addArguments("--start-maximized");
//		driver=new ChromeDriver(chromeOptions);
//	}

//	@When("^User Navigate to ausregistry Home Page$")
//	public void user_Navigate_to_ausregistry_Home_Page() throws Throwable {
//		driver.get(baseUrl);
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='wrapper']/header/div[1]/div[3]/div/div[1]/a/img[2]")));
//	}

	@When("^User Navigate to the number of registed$")
	public void user_Navigate_to_the_number_of_regiested() throws Throwable {
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1500)");
		Thread.sleep(2000);
		}
	
	@Then("^Verify the number of registed is bigger than (\\d+)$")
	public void verify_the_number_of_registed_is_bigger_than(int arg1) throws Throwable {
		Object data=(((JavascriptExecutor)driver).executeScript(
				"var data=document.getElementsByClassName('number'); "
				+ "var m=''; "
				+ "for (var i=0; i<document.getElementsByClassName('number').length; i++)"
				+ "{m+=data[i].innerHTML}; return m;"));
		Assert.assertTrue((Integer.parseInt(data.toString())>arg1));
	}
	
//	@Then("^Closed the browser$")
//	public void closed_the_browser() throws Throwable {
//		driver.quit();
//	}	
}
