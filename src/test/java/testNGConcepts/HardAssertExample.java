package testNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
	@Test
	public void testCase1(){
		int ExpLinks=20;
		int ActLinks=25; //Selenium code
		
		System.out.println("A");
		try{
		Assert.assertEquals(ActLinks, ExpLinks);
		}catch(Throwable t){
			System.out.println(t.getMessage());
		}
		System.out.println("B");
	}
}
