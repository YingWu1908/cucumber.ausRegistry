package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
}
