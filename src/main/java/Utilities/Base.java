package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Base {
    public static WebDriver driver;

    public static void setUp(){
        String getBrowser = FileProperties.getProperty().getProperty("browser");
        switch (getBrowser){
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--remote-allow-origins=*");
                driver = new ChromeDriver(options);
                break;
            case "Edge":
                WebDriverManager.edgedriver().setup();
                EdgeOptions optionsE = new EdgeOptions();
                optionsE.addArguments("--remote-allow-origins=*");
                driver = new EdgeDriver(optionsE);
                break;
            default:
                System.out.println("No se ha ingresado un navegador valido");
        }
        driver.navigate().to(FileProperties.getProperty().getProperty("url"));
    }

    public static void closeDriver(){
        driver.quit();
    }
}
