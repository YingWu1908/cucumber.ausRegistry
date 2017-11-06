package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;


public class CheckingAvailabilityPage extends AbstractPageStepDefinition{
	WebDriver driver=getDriver();
	
	@Then("^Using the dynamic panel with icons located on the right‐hand side of the screen$")
	public void using_the_dynamic_panel_with_icons_located_on_the_right_hand_side_of_the_screen() throws Throwable {
		WebElement tickIcon=driver.findElement(By.xpath("//*[@id='shortcutLinks']/ul/li[1]/a/i"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(tickIcon).perform();
		Thread.sleep(2000);
		WebElement checkAvailability=driver.findElement(By.xpath("//*[@id='shortcutLinks']/ul/li[1]/a"));
		checkAvailability.click();
		Thread.sleep(2000);
	}

	@Then("^Checking Avilability page was displayed$")
	public void checking_Avilability_page_was_displayed() throws Throwable {
	   Assert.assertEquals("Domain availability - AusRegistry", driver.getTitle());
	}	
	
	@Then("^Using search box in the middle of the page$")
	public void using_search_box_in_the_middle_of_the_page() throws Throwable {
		WebElement inputBox=driver.findElement(By.xpath("//*[@id='whois-input-box']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", inputBox);
		Thread.sleep(2000);
	}

	@Then("^Perform availability check of the ([^\"]*) with relevant ([^\"]*)$")
	public void perform_availability_check_of_the_with_relevant(String domainName, String value) throws Throwable {
		WebElement inputBox=driver.findElement(By.xpath("//*[@id='whois-input-box']"));
		inputBox.sendKeys(domainName);
		Select channelList= new Select(driver.findElement(By.id("a_zone")));
		channelList.selectByValue(value);
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//*[@id='whois-submit-btn']"));
		search.click();
		Thread.sleep(5000);	
	}

	@Then("^Validate the ([^\"]*)$")
	public void validate_the(String results) throws Throwable {
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		Assert.assertTrue(driver.getPageSource().contains(results));
	}
}
