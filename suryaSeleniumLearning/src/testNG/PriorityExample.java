package testNG;

import org.testng.annotations.Test;
//Priority Example
public class PriorityExample {

	@Test(priority=0)
	public void startEngine(){
		System.out.println("Engine started");
	}
	@Test(priority=1,enabled=false)
	public void putSeatBelt(){
		System.out.println("waer seat belt");
	}
	@Test(priority=2)
	public void putFirstGear(){
		System.out.println("frist gear");
	}
	@Test(priority=3)
	public void putSecondGear(){
		System.out.println("second gear");
	}
	@Test(priority=4)
	public void putThirdGear(){
		System.out.println("third gear");
		
	}
}
