package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonPageDefinition extends AbstractPageStepDefinition{
	WebDriver driver=getDriver();

	public static String baseUrl="https://www.ausregistry.com.au/";
	
	@Given("^I am on the ausregister home page$")
	public void I_am_on_the_ausregister_Home_Page() throws Throwable {
		driver.get(baseUrl);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='wrapper']/header/div[1]/div[3]/div/div[1]/a/img[2]")));
	
	}
	
	@When("^User Navigate to ausregistry Home Page$")
	public void user_Navigate_to_ausregistry_Home_Page() throws Throwable {
		driver.get(baseUrl);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[@id='wrapper']/header/div[1]/div[3]/div/div[1]/a/img[2]")));
	}

	@Then("^Closed the browser$")
	public void closed_the_browser() throws Throwable {
		driver.close();
	}
}
