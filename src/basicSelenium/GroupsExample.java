package basicSelenium;

import org.testng.annotations.Test;

public class GroupsExample 
{
	@Test (groups= {"Regression"})
	public void test1()
	{
		System.out.println("Regression only");
	}
	
	@Test (groups= {"Smoke Test"})
	public void test2()
	{
		System.out.println("Smoke only");
	}
	@Test (groups= {"Regression"})
	public void test3()
	{
		System.out.println("Regression only");
	}
	
	@Test (groups= {"Regression ,Smoke Test"})
	public void test4()
	{
		System.out.println("Regression and Smoke");
	}
	
	@Test (groups= {"Smoke Test"})
	public void test5()
	{
		System.out.println("Smoke only");
	}
	

}
