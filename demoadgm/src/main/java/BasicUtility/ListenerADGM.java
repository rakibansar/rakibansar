
package BasicUtility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;


public class ListenerADGM extends ExtentManagerADGM implements ITestListener {
	public static ExtentTest test;

	ScreenShotADGM screen= new ScreenShotADGM();
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getName());
	}

	
//	public void onTestSuccess(ITestResult result) {
//		if (result.getStatus() == ITestResult.SUCCESS) {
//			test.log(Status.PASS, "Pass Test case is: " + result.getName());
//		}
//	}
//
//	public void onTestFailure(ITestResult result) {
//		if (result.getStatus() == ITestResult.FAILURE) {
//			try {
//				test.log(Status.FAIL,
//						MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
//				test.log(Status.FAIL,
//						MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
//				String imgPath = screen.screenShot(base.browserlaunch(), result.getName());
//			
//				test.fail("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(imgPath).build());
//				
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//
//	public void onTestSkipped(ITestResult result) {
//		if (result.getStatus() == ITestResult.SKIP) {
//			test.log(Status.SKIP, "Skipped Test case is: " + result.getName());
//		}
//	}
//
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		// TODO Auto-generated method stub
//	}
//
//	public void onStart(ITestContext context) {
//		// TODO Auto-generated method stub
//
//	}
//
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//	}
}
