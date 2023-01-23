package stepdefinitions;


import io.cucumber.java.en.And;
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
        amazonPage = new AmazonPage();
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


    @Then("user search for Java in search box")
    public void userSearchForJavaInSearchBox() {
        amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("Java"+ Keys.ENTER);

    }

    @And("tests that results have Java word")
    public void testsThatResultsHaveJavaWord() {


        String expectedWord= "Java";
        String actualRestulsText = amazonPage.amazonResultElement.getText();

        Assert.assertTrue(actualRestulsText.contains(expectedWord));


    }

    @Then("user search for Samsung in search box")
    public void userSearchForSamsungInSearchBox() {
        amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("Samsung"+ Keys.ENTER);
    }

    @And("tests that results have Samsung word")
    public void testsThatResultsHaveSamsungWord() {

        String expectedWord= "Samsung";
        String actualRestulsText = amazonPage.amazonResultElement.getText();

        Assert.assertTrue(actualRestulsText.contains(expectedWord));

    }

    @Then("user search for {string} in search box")
    public void userSearchForInSearchBox(String wordToSearch) {

        amazonPage = new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys(wordToSearch+ Keys.ENTER);

    }

    @And("tests that results have {string} word")
    public void testsThatResultsHaveWord(String desiredWord) {

        String actualRestulsText = amazonPage.amazonResultElement.getText();
        Assert.assertTrue(actualRestulsText.contains(desiredWord));

    }

    @Given("User goes to {string}")
    public void user_goes_to(String desiredUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(desiredUrl));

    }
    @Then("tests that Url has {string} keyword")
    public void tests_that_url_has_keyword(String expectedWord) {

        String actualURl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualURl.contains(expectedWord));


    }

    @Given("user goes to {string} homepage")
    public void userGoesToHomepage(String WebURL) {
        Driver.getDriver().get(ConfigReader.getProperty(WebURL));

    }
}
