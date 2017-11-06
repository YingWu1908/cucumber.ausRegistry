package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class VerifyRegistedNumber extends AbstractPageStepDefinition{
	WebDriver driver=getDriver();

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
}
