import Actions.InventoryActions;
import Actions.LoginActions;
import org.testng.annotations.Test;

public class LoginTest extends Hooks{
    LoginActions loginActions;
    InventoryActions inventoryActions;
    @Test
    public void test() throws InterruptedException {
        loginActions = new LoginActions();
        inventoryActions = new InventoryActions();
        loginActions.sendUsrName();
        loginActions.sendPassword();
        loginActions.clickLogin();
        inventoryActions.assertSwagLogo();
    }
}
