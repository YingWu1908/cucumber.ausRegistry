package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class AboutAuDomain extends AbstractPageStepDefinition{
    WebDriver driver=getDriver();

    @When("^Navigate to about ausregistry page from menu on the top$")
    public void navigate_to_about_ausregistry_page_from_menu_on_the_top() throws Throwable {
        WebElement aboutRegistry=driver.findElement(By.className("menu-text"));
        sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(aboutRegistry);
        sleep(2000);
        WebElement about=driver.findElement(By.xpath("//span[contains(text(),'About')]"));
        about.click();
        sleep(2000);
    }

    @Then("^Verifying \"(.*?)\" was displayed$")
    public void verifying_was_displayed(String arg1) throws Throwable {
        Assert.assertTrue(driver.getPageSource().contains(arg1));
    }
}
