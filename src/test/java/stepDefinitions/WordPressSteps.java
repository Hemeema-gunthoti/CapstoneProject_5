package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class WordPressSteps {

    WebDriver driver = Hooks.driver;
    HomePage home;

    @Given("User launches WordPress website")
    public void launchWebsite() {
        driver.get("https://wordpress.org/");
        home = new HomePage(driver);
    }

    @Then("Verify the page title")
    public void verifyTitle() {
        Assert.assertTrue(home.getPageTitle().contains("WordPress"));
    }

    @When("User clicks on Download and Get WordPress")
    public void clickDownload() {
        home.clickDownloadAndGetWordPress();
    }

    @Then("Verify middle text as {string}")
    public void verifyMiddleText(String expected) {
        Assert.assertTrue(home.getMiddleText().contains(expected));
    }

    @When("User clicks Community and Photo Directory")
    public void clickCommunity() {
        home.clickCommunityAndPhotoDirectory();
    }

    @When("User searches for {string}")
    public void searchPic(String text) {
        home.searchFor(text);
    }

    @Then("Verify pictures are displayed")
    public void verifyPictures() {
        Assert.assertTrue(home.areImagesDisplayed());
    }
}