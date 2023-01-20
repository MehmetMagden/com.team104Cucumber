package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QualityDemiPage {


    public QualityDemiPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy (xpath = "//*[text()='Log in']")
    public WebElement homePageLoginButton;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement loginPageEmailTextBox;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement loginPagePasswordTextBox;

    @FindBy (xpath = "//button[text()='Login']")
    public WebElement loginPageLoginButton;

    @FindBy (xpath = "//a[text()='Instructor']")
    public WebElement firstPageInstButton;



}
