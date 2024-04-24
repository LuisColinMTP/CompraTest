package Actions;

import Locators.InventoryLocators;
import Utilities.ScreenShot;
import org.testng.Assert;

import static Utilities.Base.driver;

public class InventoryActions {
    InventoryLocators inventoryLocators = new InventoryLocators();

    public void assertSwagLogo(){
        Assert.assertTrue(inventoryLocators.swagLogo.isDisplayed());
        System.out.println("Se muestra Logo Swag");
    }

    public void addToCart() throws InterruptedException {
        inventoryLocators.sauLabBackPackAddToCartBtn.click();
        System.out.println("Se agregó la mochila al carrito");
        Thread.sleep(3000);
    }

    public void cart() throws InterruptedException {
        ScreenShot.takeScreenshot("ScreenshotName",driver);
        inventoryLocators.cartBnt.click();
        System.out.println("Click en boton carrito de compra");
        Thread.sleep(3000);
    }
}
