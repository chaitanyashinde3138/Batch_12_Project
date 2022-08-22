package Test_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_D_7 {

	@Test
	public void A() {
		System.out.println("A");
		Assert.assertTrue(false);   // true=false
	}
	
	@Test(dependsOnMethods="A")
	public void C() {
		System.out.println("C");
	}
	
	
	
	
	
	
	
}
