package htmlreport2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportTest {
//
//    @Test
//    public void verifySeleniumBlog() {
//
//        String extfile = System.getProperty("user.dir") +
//            "\\extfile.html";
//        String extimg = System.getProperty("user.dir") +
//            "\\extimg.png";
//
//        // Create object of extent report and specify the report file path.
//        ExtentReports ext = new ExtentReports(extfile, false);
//
//        // Start the test using the ExtentTest class object.
//        ExtentTest extentTest = ext.startTest("My First Test",
//            "Verify WebSite Title");
//
//        // Launch the FireFox browser.
//        WebDriver driver = new FirefoxDriver();
//
//        driver.manage().window().maximize();
//
//        extentTest.log(LogStatus.INFO, "Browser Launched");
//
//        // Open application.
//        driver.get("/");
//
//        extentTest.log(LogStatus.INFO, "Moved to www.techbeamers.com");
//
//        // get title.
//        String title = driver.getTitle();
//
//        extentTest.log(LogStatus.INFO, "Get the WebSite title");
//
//        // Verify title.
//        Assert.assertTrue(title.contains("Selenium Webdriver"));
//
//        extentTest.log(LogStatus.PASS, "Title verified");
//
//        // In case you want to take an error screenshot
//        extentTest.log(
//            LogStatus.INFO,
//            "Error Snapshot : " +
//            extentTest.addScreenCapture(extentReportImage));
//
//        // Close application.
//        driver.quit();
//
//        extentTest.log(LogStatus.INFO, "Browser closed");
//
//        // close report.
//        ext.endTest(extentTest);
//
//        // writing everything to document.
//        ext.flush();
//    }
}