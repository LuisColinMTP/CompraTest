package Locators;

import Utilities.SeleniumPageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverviewLocators extends SeleniumPageFactory {
    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement overviewText;

    @FindBy(xpath = "//button[@id='finish']")
    public WebElement finishBtn;

    public OverviewLocators (){

    }
}
