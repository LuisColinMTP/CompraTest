package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ExtentReport {
    static ExtentReports extent;
    static Map<Integer, ExtentTest> extentTestMap = new HashMap();

    //Genera carpeta de reporte
    public synchronized static ExtentReports getReporter(){
        File pathReport = new File("src/reportes/index.html");
        if (extent==null){
            ExtentSparkReporter html = new ExtentSparkReporter(pathReport);
            html.config().setDocumentTitle("Test");
            html.config().setReportName("Reporte");
            html.config().setTheme(Theme.STANDARD);
            extent = new ExtentReports();
            extent.attachReporter(html);
        }
        return extent;
    }
    public static synchronized ExtentTest startTest(String testName, String desc){
        ExtentTest test = getReporter().createTest(testName, desc);
        extentTestMap.put((int)(long)(Thread.currentThread().getId()),test);
        return test;
    }

    public static void flush(){
        extent.flush();
    }
}
