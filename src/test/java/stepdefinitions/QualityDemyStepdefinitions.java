package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualityDemiPage;
import utilities.ConfigReader;

public class QualityDemyStepdefinitions {

    QualityDemiPage qualityDemiPage = new QualityDemiPage();

    @Then("user clicks homepage login button")
    public void user_clicks_homepage_login_button() {
        qualityDemiPage.homePageLoginButton.click();

    }
    @Then("user enters valid User Email {string}")
    public void user_enters_valid_user_email(String userEmail) {

        qualityDemiPage.loginPageEmailTextBox.sendKeys(ConfigReader.getProperty(userEmail));

    }
    @Then("user enters valid User Password {string}")
    public void user_enters_valid_user_password(String userPassword) {

        qualityDemiPage.loginPagePasswordTextBox.sendKeys(ConfigReader.getProperty(userPassword));
    }
    @Then("user clicks on login button")
    public void user_clicks_on_login_button() {
        qualityDemiPage.loginPageLoginButton.click();

    }
    @Then("user tests that if could be able to login")
    public void user_tests_that_if_could_be_able_to_login() {

        Assert.assertTrue(qualityDemiPage.firstPageInstButton.isDisplayed());

    }
    @Then("user waits for {int} sec")
    public void user_waits_for_sec(Integer second) {

        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {

        }


    }

    @And("user tests that  could not be able to login")
    public void userTestsThatCouldNotBeAbleToLogin() {

        Assert.assertTrue(qualityDemiPage.loginPageEmailTextBox.isDisplayed());

    }


    @And("user manually enters invalid Emails {string}")
    public void userManuallyEntersInvalidEmails(String userMail) {

        qualityDemiPage.loginPageEmailTextBox.sendKeys(userMail);


    }

    @And("user manually enters invalid Passwords {string}")
    public void userManuallyEntersInvalidPasswords(String userPasswrod) {

        qualityDemiPage.loginPagePasswordTextBox.sendKeys(userPasswrod);
    }
}
