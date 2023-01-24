package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebDriverUniversityPage {

    public WebDriverUniversityPage (){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//h1[text()='LOGIN PORTAL']")
    public WebElement homePageLoginPortalLink;

    @FindBy(id = "text")
    public WebElement secondTabUserNameTextBoxElement;

    @FindBy(id = "password")
    public WebElement secondTabUserPasswordTextBoxElement;

    @FindBy(id = "login-button")
    public WebElement secondTabLoginButton;


}
