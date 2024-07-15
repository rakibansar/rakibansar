package BasicUtility;

import com.aventstack.extentreports.ExtentReports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

/**
 * @author Hitendra: ExtentManager class is used for Extent Report
 *  
 */
public class ExtentManagerADGM {
	
	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void setExtent() throws IOException {
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/ExtentReport/" + "MyReport.html");
		htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "/extent-configADGM.xml");
		htmlReporter.config().setDocumentTitle("Automation Test Report");
				htmlReporter.config().setReportName("OrangeHRM Test Automation Report");
				//htmlReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("HostName", "MyHost");
		extent.setSystemInfo("ProjectName", "ADGMProject");
		extent.setSystemInfo("Tester", "Rakib Ansar");
		extent.setSystemInfo("OS", "Win10");
		extent.setSystemInfo("Browser", "Chrome");
	}
	
	public static void endReport() {
		extent.flush();
	}
}