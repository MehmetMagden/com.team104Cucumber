package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage {

    public EditorPage(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy (xpath = "//*[text()='New']")
    public WebElement homePageNewButton;

    @FindBy (id = "DTE_Field_first_name")
    public WebElement infoPageFirstName;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement infoPageLastName;

    @FindBy(id = "DTE_Field_position")
    public WebElement infoPagePosition;

    @FindBy(id = "DTE_Field_office")
    public WebElement infoPageOfficen;

    @FindBy(id = "DTE_Field_extn")
    public WebElement infoPageExtension;

    @FindBy(id = "DTE_Field_start_date")
    public WebElement infoPageStartDate;


    @FindBy(id = "DTE_Field_salary")
    public WebElement infoPageSalary;

    @FindBy(xpath = "//*[text()='Create']")
    public WebElement infoPageCreateButton;

    @FindBy(xpath = "//input[@aria-controls='example']")
    public WebElement homePageSearchTextBox;

    @FindBy(className = "sorting_1")
    public WebElement homePageNamesElement;




}
