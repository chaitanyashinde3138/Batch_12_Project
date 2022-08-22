package Test_3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_D_3 {
	
	@Test
	public void test_3() {
		
		SoftAssert soft=new SoftAssert();
		
		
		System.out.println("Email Enter");
		System.out.println("Password Enter");
		System.out.println("Login button");
		
		String expected="BugSpotter";
		String actual="bugspotter";
	
	    soft.assertEquals(actual, expected);    // pass // Soft Assert
	
	    System.out.println("Test Done");
	    
	    soft.assertAll();
	}

}
