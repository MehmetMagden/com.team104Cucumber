package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.WebDriverUniversityPage;
import utilities.Driver;

import java.util.Set;

public class WebDriveruniversityStepdefinitions {

    String firstTabHandleValue;

    WebDriverUniversityPage webDriUniPage = new WebDriverUniversityPage();

    @Then("user clicks on login portal link")
    public void user_clicks_on_login_portal_link() {
         firstTabHandleValue = Driver.getDriver().getWindowHandle();
        webDriUniPage.homePageLoginPortalLink.click();

    }
    @Then("user switches to the new tab")
    public void user_switches_to_the_new_tab() {
        Set<String> allHandleValues = Driver.getDriver().getWindowHandles();
        String secondTabHandleValue="";
        for (String eachHandle: allHandleValues
             ) {
            if(!eachHandle.equals(firstTabHandleValue)){
                secondTabHandleValue =eachHandle;
            }
        }

        Driver.getDriver().switchTo().window(secondTabHandleValue);

    }
    @Then("user enters userName")
    public void user_enters_user_name() {
        webDriUniPage.secondTabUserNameTextBoxElement.sendKeys("Osman");
    }
    @Then("user enters password")
    public void user_enters_password() {
        webDriUniPage.secondTabUserPasswordTextBoxElement.sendKeys("12341kl2");
    }
    @Then("user clicks on loginButton")
    public void user_clicks_on_login_button() {
        webDriUniPage.secondTabLoginButton.click();
    }
    @Then("tests that the text of popup is validation failed")
    public void tests_that_the_text_of_popup_is_validation_failed() {
        String actualText =Driver.getDriver().switchTo().alert().getText();
        String expectedText = "validation failed";

        Assert.assertEquals(expectedText,actualText);
    }
    @Then("user clicks ok button at popup")
    public void user_clicks_ok_button_at_popup() {

        Driver.getDriver().switchTo().alert().accept();
    }
    @Then("user returns to the first tab")
    public void user_returns_to_the_first_tab() {
        Driver.getDriver().switchTo().window(firstTabHandleValue);
    }
    @Then("tests that the tab is the first tab")
    public void tests_that_the_tab_is_the_first_tab() {

        Assert.assertFalse(webDriUniPage.homePageLoginPortalLink.isDisplayed());
    }
    @Then("user closes all pages")
    public void user_closes_all_pages() {
        Driver.quitDriver();

    }




}
