package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport
{
//Here I will keep all the code related to linking of the extent or generating html reports.
	public static ExtentReports getExtentReport()
	{
		// locate the path of extent report
		String extentReportPath=System.getProperty("user.dir")+"\\Reports\\ExtentReport.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(extentReportPath);
		reporter.config().setReportName("SpiceJet Automation Report");
		reporter.config().setDocumentTitle("SpiceJet Automation Testing");
		
		ExtentReports extentReport=new ExtentReports();
		extentReport.attachReporter(reporter);
		
		return extentReport;
		
	}
}