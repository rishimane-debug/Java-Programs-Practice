package rahulshettyacademy.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReporterNG {
	
	public static ExtentReports getReportObject()
	{
		//ExtentReports ExtentSparkReporter
				String path = System.getProperty("user.dir") + "\\reports\\index.html";
				ExtentSparkReporter reporter = new ExtentSparkReporter(path);
				reporter.config().setReportName("Web Automation Report");
				reporter.config().setDocumentTitle("Test Results");
				
				ExtentReports extent = new ExtentReports();
				extent.attachReporter(reporter);
				extent.setSystemInfo("Tester", "Rushikesh Mane");
				extent.createTest(path);
				return extent;
	}

}
