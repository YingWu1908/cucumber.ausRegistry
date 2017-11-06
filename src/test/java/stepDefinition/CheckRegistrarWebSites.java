package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CheckRegistrarWebSites extends AbstractPageStepDefinition{
	WebDriver driver=getDriver();
	
	@When("^Using the dynamic panel with icons located on the right‐hand side$")
	public void using_the_dynamic_panel_with_icons_located_on_the_right_hand_side() throws Throwable {
		WebElement searchIcon=driver.findElement(By.xpath("//*[@id='shortcutLinks']/ul/li[4]/a/i"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(searchIcon).perform();
		Thread.sleep(2000);
		WebElement findRegistrar=driver.findElement(By.xpath("//*[@id='shortcutLinks']/ul/li[4]/a"));
		findRegistrar.click();
		Thread.sleep(2000);
	}

	@Then("^Counting a number of external http links to the registrar web sites in “Find your domain” section$")
	public void counting_a_number_of_external_http_links_to_the_registrar_web_sites_in_Find_your_domain_section() throws Throwable {
		System.out.println("We have total " + (((JavascriptExecutor)driver).executeScript(
				"var links=document.getElementsByClassName('fusion-column-wrapper').length;"
				+ "return links"))+" ExternalLinks");
	}

	@Then("^“Learn more” button located below “Find your domain” section$")
	public void learn_more_button_located_below_Find_your_domain_section() throws Throwable {
		WebElement learnMore=driver.findElement(By.xpath("//*[@id='post-12063']/div/div[3]/div/div[2]/div/div[1]/a/span"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", learnMore);
		Thread.sleep(2000);
		learnMore.click();
		Thread.sleep(2000);
	}

	@Then("^Verifying “Become a Registrar” page was displayed$")
	public void verifying_Become_a_Registrar_page_was_displayed() throws Throwable {
		Assert.assertEquals("Become a Registrar - AusRegistry", driver.getTitle());
	}

	@Then("^Verifying the main text section on the page contains email and phone number$")
	public void verifying_the_main_text_section_on_the_page_contains_email_and_phone_number() throws Throwable {
		Assert.assertTrue(driver.getPageSource().contains("Email"));
		Assert.assertTrue(driver.getPageSource().contains("Phone"));
	}
}
