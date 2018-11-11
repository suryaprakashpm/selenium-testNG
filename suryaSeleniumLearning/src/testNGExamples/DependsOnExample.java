package testNGExamples;

import org.testng.annotations.Test;

public class DependsOnExample {
	@Test 
	public void tenthStd(){
		System.out.println("10th");
	}
	
	@Test(dependsOnMethods="tenthStd")
	public void plusTwo(){
		System.out.println("12 th");
	}
	
	@Test(dependsOnMethods="plusTwo")
	public void degree(){
		System.out.println("degree");
	}
}
