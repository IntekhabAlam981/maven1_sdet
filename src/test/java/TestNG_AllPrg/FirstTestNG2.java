package TestNG_AllPrg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNG2 {
	@Test(priority=1)
	public void setup()
	{
		System.out.println("Opening browser...!");
	}
	@Test(priority=2)
	public void searchCust()
	{
		System.out.println("Searching for Customer!");
		Assert.assertEquals(1, 1);
	}
	@Test(priority=3)
	public void teardown()
	{
		System.out.println("Closing browser...!");
	}

}
