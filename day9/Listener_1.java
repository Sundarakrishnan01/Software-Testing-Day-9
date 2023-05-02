package test.day9;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_1 implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
//		ITestListener.super.onTestStart(result);
		System.out.println("On test Starts- "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On test success -"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On test failure -"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On test Skipped- "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("on Test Failed But Within Success Percentage- "+result.getName());
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test failed with timeout -"+result.getName());
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On Starts " + context.getName());
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On finish " + context.getName());
	}
	

}
