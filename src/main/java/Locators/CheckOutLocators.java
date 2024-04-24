package Locators;

import Utilities.SeleniumPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutLocators extends SeleniumPageFactory {

    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement checkOutYourInfText;

    @FindBy(xpath = "//input[@id='first-name']")
    public WebElement firstNameInput;

    @FindBy(xpath = "//input[@id='last-name']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@id='postal-code']")
    public WebElement cpInput;

    @FindBy(xpath = "(//input[@id='continue'])[1]")
    public WebElement continueBtn;

    public CheckOutLocators(){

    }
}
