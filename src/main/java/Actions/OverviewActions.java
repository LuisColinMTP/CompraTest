package Actions;

import Locators.OverviewLocators;
import Utilities.ScreenShot;
import org.testng.asserts.SoftAssert;

import static Utilities.Base.driver;

public class OverviewActions {
    OverviewLocators overviewLocators = new OverviewLocators();

    public void overview(){
        String resultEspe = "Checkout: Overview";
        String overviewText = overviewLocators.overviewText.getText();
        System.out.println(overviewText);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(resultEspe,overviewText,"No estas en la pagina correcta");
        softAssert.assertAll();
    }

    public void clickFinish() throws InterruptedException {
        ScreenShot.takeScreenshot("ScreenshotName",driver);
        overviewLocators.finishBtn.click();
        System.out.println("Click en Finish");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
