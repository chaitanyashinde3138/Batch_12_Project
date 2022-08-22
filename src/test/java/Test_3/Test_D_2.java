package Test_3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_D_2 {
	

	@Test
	public void verify_test_1() {
		
		System.out.println("Email Enter");
		System.out.println("Password Enter");
		System.out.println("Login button");
		
		String expected="BugSpotter";
		String actual="bugspotter";
		Assert.assertEquals(actual, expected);  //Fail    // Hard Assert
		
		System.out.println("Test Done");
	}
	
	
	
	@Test
	public void test_2() {
		System.out.println("Test 2");
	}
	
	
	
	
	
	
	
	
	
}
