package TestngXmlDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenersClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + "Test Started ");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName() + "Test Successed ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName() + "Test Failed  ");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName() + "Test Skipped ");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println(context.getName() + "Execution Started  ");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + "Execution Finish  ");
	}

}
