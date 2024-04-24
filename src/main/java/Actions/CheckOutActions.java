package Actions;

import Locators.CheckOutLocators;
import Utilities.FileProperties;
import Utilities.ScreenShot;
import org.testng.Assert;

import static Utilities.Base.driver;

public class CheckOutActions {
    CheckOutLocators checkOutLocators = new CheckOutLocators();

    public void assertCheckOutYourInf(){
        Assert.assertTrue(checkOutLocators.checkOutYourInfText.isDisplayed());
        System.out.println("Muestra texto CheckOut");
    }

    public void sendFirstName(){
        checkOutLocators.firstNameInput.sendKeys(FileProperties.getProperty().getProperty("firstName"));
        System.out.println("Ingresa Nombre");
    }

    public void sendLastName(){
        checkOutLocators.lastNameInput.sendKeys(FileProperties.getProperty().getProperty("lastName"));
        System.out.println("Ingresa LastName");
    }

    public void sendCp(){
        checkOutLocators.cpInput.sendKeys(FileProperties.getProperty().getProperty("cp"));
        System.out.println("Ingresa CP");
    }

    public void clickContinue(){
        ScreenShot.takeScreenshot("ScreenshotName",driver);
        checkOutLocators.continueBtn.click();
        System.out.println("Click continue");
    }
}
