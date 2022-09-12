package test.java;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.JsonFormatter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import main.java.kite.pageEvents.LoginPageEvents;
import main.java.utils.FrameworkConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    public ExtentSparkReporter sparkReporter;
    public static ExtentReports extent;
    public static ExtentTest logger;

    public static ExtentReports addScreenCaptureFromPath;
    FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);





    @BeforeTest
    public void beforeTestMethod() throws IOException {
        String timeStamp = new SimpleDateFormat("dd-M-yyyy hh-mm-ss").format(new Date());
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + File.separator + "reports" + File.separator + "AutomationReport.html " + timeStamp );
      //  JsonFormatter json = new JsonFormatter ("extent.json"); // To add multiple Report

        sparkReporter.config().setEncoding("utf-8");
        sparkReporter.config().setCss("css-string");
        sparkReporter.config().setDocumentTitle("Falcon Report");
        sparkReporter.config().setTimelineEnabled(true);
        sparkReporter.config().setEncoding("utf-8");
        sparkReporter.config().setJs("js-string");
        sparkReporter.config().setProtocol(Protocol.HTTPS);
        sparkReporter.config().setReportName("Build 1.0.0");
        sparkReporter.config().setTheme(Theme.DARK);


        extent =new ExtentReports();
     //   extent.createDomainFromJsonArchive("extent.json"); // Same multiple report
        extent.attachReporter(sparkReporter); // Same Multiple Report
        extent.setSystemInfo("Host name","localhost");
        extent.setSystemInfo("Environment","QA");
        extent.setSystemInfo("User","Gourav Sharma");


    }


    @BeforeMethod
    @Parameters(value = {"browserName", "projectName"})
    public void beforeMethodMethod(String browserName, String projectName, Method testMethod) {
        logger = extent.createTest(testMethod.getName());
        logger.info(projectName+"TEST TEST");
        setDriver(browserName);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(projectName.equalsIgnoreCase("kite") ? config.kite() : config.dart());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod

    public void afterMethodMethod(ITestResult result) {
        if (result.getStatus() == ITestResult.SUCCESS) {
            String methodName = result.getMethod().getMethodName();
            String logText = "Test Case: " + methodName + " Passed";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
            logger.log(Status.PASS, m);
            logger.addScreenCaptureFromPath("../screenshots/"+result.getName()+".png");


        } else if (result.getStatus() == ITestResult.FAILURE) {
            String methodName = result.getMethod().getMethodName();
            String logText = "Test Case: " + methodName + "Failed";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
            logger.log(Status.FAIL, m);
            logger.addScreenCaptureFromPath("../screenshots/"+result.getName()+".png");

        }
         else if (result.getStatus() == ITestResult.SKIP) {
            String methodName = result.getMethod().getMethodName();
            String logText = "Test Case: " + methodName + "Failed";
            Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
            logger.log(Status.FAIL, m);
            logger.addScreenCaptureFromPath("../screenshots/"+result.getName()+".png");
        }
        driver.quit();
    }


    @AfterTest
    public void afterTestMethod() {
        extent.flush();

    }

    public static void setDriver(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

    }

    public void LoginMethod() throws InterruptedException, IOException {
        logger.info("Doing Loging");
        LoginPageEvents loginPageEvents =new LoginPageEvents(driver);
        logger.info("Website Title is "+ driver.getTitle());
        loginPageEvents.loginMethod();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


}
