package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Guru99Page;

import java.util.List;

public class Guru99StepDefinitions {

    Guru99Page guru99Page = new Guru99Page();
    String alltext="";
    @Then("user prints company names on the console")
    public void user_prints_company_names_on_the_console() {

        List<WebElement> elementList = guru99Page.companyElementList;


        for (WebElement eachElement: elementList
             ) {
           alltext=alltext+ eachElement.getText()+" ";
        }

    }

    @Then("tests that company names have {string}")
    public void tests_that_company_names_have(String companyName) {

        Assert.assertTrue(alltext.contains(companyName));
    }

}
