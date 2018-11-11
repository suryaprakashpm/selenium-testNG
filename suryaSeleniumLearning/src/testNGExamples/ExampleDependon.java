package testNGExamples;

import org.testng.annotations.Test;

public class ExampleDependon {

	@Test
	public void father(){
		System.out.println("Father");
	}
	@Test(dependsOnMethods="father")
	public void mother(){
		System.out.println("Mother");
	}
	@Test(dependsOnMethods="mother")
	public void children(){
		System.out.println("Children");
	}
}
