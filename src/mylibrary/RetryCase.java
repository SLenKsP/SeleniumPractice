package mylibrary;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryCase implements IRetryAnalyzer
{
	int retryMin= 0, retryMax= 2;
	
	
	public boolean retry(ITestResult result) {
		if(retryMin<=retryMax)
		{
			System.out.println("Following test is failing "+ result.getName());
			
			System.out.println("Retrying the test count is: "+ (retryMin+1));
			
			retryMin++;
			
			return true;
		}
		
		return false;
	}

}
