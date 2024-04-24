package Locators;

import Utilities.SeleniumPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators extends SeleniumPageFactory {
    @FindBy(xpath = "(//input[@id='user-name'])[1]")
    public WebElement userNameInput;

    @FindBy(xpath = "(//input[@id='password'])[1]")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@id='login-button']")
    public WebElement loginBtn;

    public LoginLocators(){

    }
}
