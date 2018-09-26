package basicSelenium;

import org.testng.annotations.Test;

public class getTitle extends callWebDriver
{
	@Test
	public void checkTitle()
	{
		driver.navigate().to("https://www.google.com/search?source=hp&ei=GlRvW-unM4mZjwTf_ajIAg&q=facebook&btnK=Google+Search&oq=facebook&gs_l=psy-ab.3..0i131l3j0j0i131j0j0i131j0l3.2289.3464..580280...0.0..0.87.487.8......0....1..gws-wiz.951NFEWcOuY");
		
		System.out.println(driver.getTitle());
	}
	

}
