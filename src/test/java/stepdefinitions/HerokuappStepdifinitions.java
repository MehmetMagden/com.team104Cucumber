package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.http.protocol.RequestUserAgent;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuappPage;
import utilities.ReusableMethods;

public class HerokuappStepdifinitions {

    HerokuappPage herokuappPage = new HerokuappPage();

    @When("Click the {string} button")
    public void click_the_button(String string) {

        herokuappPage.addElementButton.click();

    }
    @Then("Wait until the {string} button is visible")
    public void wait_until_the_button_is_visible(String string) {

        //ReusableMethods.wait(1);
    }
    @Then("Test that the {string} button is visible")
    public void test_that_the_button_is_visible(String string) {

        Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());

    }
    @Then("Delete the button by pressing the Delete button")
    public void delete_the_button_by_pressing_the_delete_button() {

        herokuappPage.deleteButton.click();

    }
    @Then("Test that the delete button is not visible")
    public void test_that_the_delete_button_is_not_visible() {

        try {
            //Assert.assertFalse(herokuappPage.deleteButton.isDisplayed()); because of not being able to find the element
                                                                            // throws an exception
            herokuappPage.deleteButton.isDisplayed();
            Assert.assertTrue(false);

        } catch (NoSuchElementException e) {

            Assert.assertTrue(true);
        }

    }

}
