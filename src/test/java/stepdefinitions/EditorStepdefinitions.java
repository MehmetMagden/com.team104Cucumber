package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EditorPage;
import utilities.Driver;

public class EditorStepdefinitions {

    EditorPage editorPage = new EditorPage();

    @When("user manually goes to {string} homepage")
    public void user_manually_goes_to_homepage(String pageURL) {

        Driver.getDriver().get(pageURL);
    }

    @Then("clicks the new button")
    public void clicks_the_new_button() {
        editorPage.homePageNewButton.click();

    }

    @Then("enters firstName {string}")
    public void enters_first_name(String firstName) {
        editorPage.infoPageFirstName.sendKeys(firstName);

    }

    @Then("enters lastName {string}")
    public void enters_last_name(String lastName) {
        editorPage.infoPageLastName.sendKeys(lastName);

    }

    @Then("enters position {string}")
    public void enters_position(String position) {
        editorPage.infoPagePosition.sendKeys(position);

    }

    @Then("enters office {string}")
    public void enters_office(String office) {
        editorPage.infoPageOfficen.sendKeys(office);

    }

    @Then("enters extension {string}")
    public void enters_extension(String extension) {
        editorPage.infoPageExtension.sendKeys(extension);

    }

    @Then("enters startdate {string}")
    public void enters_startdate(String startDate) {

        editorPage.infoPageStartDate.sendKeys(startDate);
    }

    @Then("enters salary {string}")
    public void enters_salary(String salary) {
        editorPage.infoPageSalary.sendKeys(salary);
    }


    @Then("clicks the Create button")
    public void clicks_the_create_button() {

        editorPage.infoPageCreateButton.click();
    }

    @When("user searches by {string}")
    public void userSearchesBy(String firstName) {

        editorPage.homePageSearchTextBox.sendKeys(firstName);
    }

    @Then("verifies that {string} is in the name list")
    public void verifiesThatIsInTheNameList(String firstname) {
        String actualNameText = editorPage.homePageNamesElement.getText();

        Assert.assertTrue(actualNameText.contains(firstname));

    }
}
