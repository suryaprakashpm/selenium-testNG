package testNGExamples;

import org.testng.annotations.Test;

public class GroupingExample {


	@Test (groups="Benz")
	public void benz1(){
		System.out.println("Benz");
	}
	@Test(groups="Benz")
	public void benz2(){
		System.out.println("Benz2");
	}
	@Test(groups="Bmw")
	public void bmw1(){
		System.out.println("Bmw1");
	}
	@Test(groups="Bmw")
	public void bmw2(){
		System.out.println("Bmw2");
	}
	@Test(groups="Bugati")
	public void bugati1(){
		System.out.println("Bugati1");
	}
	@Test(groups="Bugati")
	public void bugati2(){
		System.out.println("Bugati2");
	}
	
}
