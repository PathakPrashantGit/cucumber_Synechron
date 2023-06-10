package testNGConcepts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssetEx {
	@Test
	public void testCase1(){
		SoftAssert st=new SoftAssert();
		int ExpLinks=20;
		int ActLinks=25; //Selenium code
		
		System.out.println("A");
		st.assertEquals(ActLinks, ExpLinks);
		st.assertEquals("Bangalore", "Bengalooru");
		System.out.println("B");
		
		st.assertAll();
		System.out.println("C");
	}
}
