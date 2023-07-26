package com.esolutions.stepDefs;

import com.esolutions.pages.BasePage;
import com.esolutions.utilities.BrowserUtils;
import com.esolutions.utilities.ConfigurationReader;
import com.esolutions.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class SoftwareEsolutions_StepDefs extends BasePage {

    BasePage basepage = new BasePage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Given("user on the main page")
    public void user_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @Given("user clicks acceptAll cookies")
    public void userClicksAcceptAllCookies() {

        BrowserUtils.sleep(1);
        basepage.cookies.click();
    }
    @Given("user clicks on softwareEsolutions title")
    public void user_clicks_on_software_esolutions_title() {
        BrowserUtils.sleep(1);
        basepage.softwareEsolutions.click();

    }
    @Given("user scroll down and up the page")
    public void user_scroll_down_and_up_the_page() {
        for (int i = 0; i < 3; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,1800)");
        }
        for (int i = 0; i < 3; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-1800)");
        }

    }
    @Given("user goes back to main page")
    public void user_goes_back_to_main_page() {
        BrowserUtils.sleep(2);
        Driver.getDriver().navigate().back();

    }
    @Then("user should see the title {string}")
    public void user_should_see_the_title(String expectedTitle) {

        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        BrowserUtils.sleep(1);

        Assert.assertEquals(expectedTitle,actualTitle);

    }


    /*
    BasePage basepage = new BasePage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @When("user on the main page")
    public void user_on_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user clicks on softwareEsolutions title")
    public void user_clicks_on_softwareEsolutions_title() {
        BrowserUtils.sleep(1);
        basepage.softwareEsolutions.click();
    }

    @And("user scroll down and up the page")
    public void userScrollDownAndUpThePage() {
        for (int i = 0; i < 3; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,1500)");
        }
        for (int i = 0; i < 3; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-1500)");
        }
    }

    @And("user goes back to main page")
    public void userGoesBackToMainPage() {
        BrowserUtils.sleep(2);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
    }
    @Then("user should see the title {string}")
    public void userShouldSeeTheTitle(String expectedTitle) {
        BrowserUtils.sleep(2);
        String actualTitle = Driver.getDriver().getTitle();
        BrowserUtils.sleep(1);

        Assert.assertEquals(expectedTitle,actualTitle);


     */


}
