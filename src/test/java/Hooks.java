import Utilities.Base;
import Utilities.ExtentReport;
import Utilities.ScreenShot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static Utilities.Base.driver;

public class Hooks {
    @BeforeSuite
    public void beforeSuite(){
        ExtentReport.getReporter();
        Base.setUp();
    }


    @AfterSuite
    public void afterSuite() throws InterruptedException {
        ExtentReport.flush();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ScreenShot.takeScreenshot("ScreenshotName",driver);
        Base.closeDriver();
    }
}
