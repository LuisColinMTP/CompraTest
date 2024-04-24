import Actions.*;
import Utilities.ExtentReport;
import Utilities.ScreenShot;
import org.testng.annotations.Test;

public class InventoryTest extends Hooks{
    LoginActions loginActions;
    InventoryActions inventoryActions;
    CartActions cartActions;
    CheckOutActions checkOutActions;
    OverviewActions overviewActions;

    @Test
    public void test() throws InterruptedException {
        ExtentReport.startTest("Test ","Se realiza todo el proceso para concluir una compra");
        loginActions = new LoginActions();
        inventoryActions = new InventoryActions();
        cartActions = new CartActions();
        checkOutActions = new CheckOutActions();
        overviewActions = new OverviewActions();

        loginActions.sendUsrName();
        loginActions.sendPassword();
        try {
            loginActions.clickLogin();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        inventoryActions.assertSwagLogo();
        inventoryActions.addToCart();
        inventoryActions.cart();
        cartActions.assertYouCart();
        cartActions.checkOutClick();
        checkOutActions.assertCheckOutYourInf();
        checkOutActions.sendFirstName();
        checkOutActions.sendLastName();
        checkOutActions.sendCp();
        checkOutActions.clickContinue();
        overviewActions.overview();
        overviewActions.clickFinish();
    }

}
