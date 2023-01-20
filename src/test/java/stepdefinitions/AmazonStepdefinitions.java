package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {

    AmazonPage amazonPage = new AmazonPage();

    @Given("user goes to Amazon homepage")
    public void user_goes_to_amazon_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));

    }
    @Then("user search for Nutella in search box")
    public void user_search_for_nutella_in_search_box() {
        amazonPage.amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);


    }
    @Then("tests that results have Nutella word")
    public void tests_that_results_have_nutella_word() {
        String expectedWord= "Nutella";
        String actualRestulsText = amazonPage.amazonResultElement.getText();

        Assert.assertTrue(actualRestulsText.contains(expectedWord));

    }
    @Then("closes the page")
    public void closes_the_page() {

        Driver.closeDriver();
    }


}
