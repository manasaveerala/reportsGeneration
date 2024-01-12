package htmlreport2;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ExtentDemo {
static ExtentTest test;
static ExtentReports report;
WebDriver driver;
@BeforeClass
public static void startTest()
{
report = new ExtentReports(System.getProperty("user.dir")+"/reports/ExtentReportResults.html");
test = report.startTest("ExtentDemo");
}
@Test
public void extentReportsDemo() throws IOException
{
//System.setProperty("webdriver.chrome.driver", "D:SubmittalExchange_TFSQAAutomation3rdpartychromechromedriver.exe");
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();

driver.get("https://www.google.co.in");
if(driver.getTitle().equals("Gogle"))
{
test.log(LogStatus.PASS, "Navigated to the specified URL");
}
else
{
test.log(LogStatus.FAIL, "Test Failed");
test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver))+ "Test Failed");
}


}
public static String capture(WebDriver driver) throws IOException {
File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
File Dest = new File(".\\screenshots"+ System.currentTimeMillis()
+ ".png");
String errflpath = Dest.getAbsolutePath();
FileUtils.copyFile(scrFile, Dest);
return errflpath;
}
@AfterClass
public static void endTest()
{
report.endTest(test);
report.flush();
}
}
