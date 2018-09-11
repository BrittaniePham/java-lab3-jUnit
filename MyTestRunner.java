package lab3_jUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyTestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MyClassTest.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println("Tests run: " + result.getRunCount());
		System.out.println("Tests failed: " + result.getFailureCount());
		System.out.println("Tests passed: " + (result.getRunCount() - result.getFailureCount()));
	}
}