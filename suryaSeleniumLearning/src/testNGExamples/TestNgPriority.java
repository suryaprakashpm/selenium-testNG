package testNGExamples;

import org.testng.annotations.Test;
//Priority With Alphabet order
/*public class TestNgPriority {

	@Test
	public void clickFirefox(){
		System.out.println("Click Firefox");
	}
	@Test
	public void enterGoogle(){
		System.out.println("Enter Google.co.in");
	}
	@Test
	public void enetrKey(){
		System.out.println("Press Eneter");
	}
	@Test
	public void googleHome(){
		System.out.println("Google Home Page");
	}
}*/

//Priority Order
/*public class TestNgPriority {

	@Test(priority=0)
	public void clickFirefox(){
		System.out.println("Click Firefox");
	}
	@Test(priority=1)
	public void enterGoogle(){
		System.out.println("Enter Google.co.in");
	}
	@Test(priority=2)
	public void enetrKey(){
		System.out.println("Press Eneter");
	}
	@Test(priority=3)
	public void googleHome(){
		System.out.println("Google Home Page");
	}
}*/

//Enabled option in priority
public class TestNgPriority {

@Test(priority=0)
public void clickFirefox(){
	System.out.println("Click Firefox");
}
@Test(priority=1)
public void enterGoogle(){
	System.out.println("Enter Google.co.in");
}
@Test(priority=2,enabled=false)
public void enetrKey(){
	System.out.println("Press Eneter");
}
@Test(priority=3)
public void googleHome(){
	System.out.println("Google Home Page");
}
}


