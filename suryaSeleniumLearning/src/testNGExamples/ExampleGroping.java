package testNGExamples;

import org.testng.annotations.Test;

public class ExampleGroping {

	@Test (groups="stateboard")
	public void stateBoard1(){
		System.out.println("RCHSS");
	}
	@Test (groups="stateboard")
	public void stateboard2(){
		System.out.println("St.Joseph");
	}
	@Test (groups="matriculation")
	public void matriculation1(){
		System.out.println("St.James");
	}
	@Test (groups="matriculation")
	public void matriculation2(){
		System.out.println("Alpha");
	}
	@Test (groups="cbse")
	public void cbse1(){
		System.out.println("SBIOAMS");
	}
	@Test (groups="cbse")
	public void cbse2(){
		System.out.println("KV");
	}
}
