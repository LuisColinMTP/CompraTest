package Locators;

import Utilities.SeleniumPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryLocators extends SeleniumPageFactory {
    @FindBy(xpath = "(//div[@class='app_logo'])[1]")
    public WebElement swagLogo;

    @FindBy(xpath = "(//button[@id='add-to-cart-sauce-labs-backpack'])[1]")
    public WebElement sauLabBackPackAddToCartBtn;

    @FindBy(xpath = "(//a[@class='shopping_cart_link'])[1]")
    public WebElement cartBnt;

    public InventoryLocators(){

    }
}
