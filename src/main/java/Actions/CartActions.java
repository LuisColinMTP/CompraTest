package Actions;

import Locators.CartLocators;
import Utilities.ScreenShot;
import org.testng.Assert;

import static Utilities.Base.driver;

public class CartActions {
    CartLocators cartLocators = new CartLocators();

    public void assertYouCart(){
        Assert.assertTrue(cartLocators.yourCartText.isDisplayed());
        System.out.println("Se muestra texto");
    }

    public void checkOutClick (){
        ScreenShot.takeScreenshot("ScreenshotName",driver);
        cartLocators.checkoutBtn.click();
        System.out.println("Click en boton checkout");
    }
}
