package Locators;

import Utilities.SeleniumPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartLocators extends SeleniumPageFactory {

    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement yourCartText;

    @FindBy(xpath = "(//button[normalize-space()='Checkout'])[1]")
    public WebElement checkoutBtn;

    public CartLocators(){

    }
}
