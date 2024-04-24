package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShot {
    //Obtener fecha actual
    public static String getDate(){
        DateFormat dateFormat = new SimpleDateFormat("ddMMyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    //obtener hora actual formato hora minuto seg
    public static String getHour(){
        DateFormat dateFormat = new SimpleDateFormat("HHmmss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    //Tomar captura
    public static void takeScreenshot(String screenName, WebDriver driver){
        File myScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            //Se crea raiz del proyecto
            //FileUtils.copyFile(myScreenshot, new File(screenName+"-"+getDate()+getHour()+".png"));

            //Se crea en carpeta screenshot
            String path = "screenshot\\";
            FileUtils.copyFile(myScreenshot, new File(path+screenName+"-"+getDate()+"-"+getHour()+".png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
