package testNGExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgSuits {

	WebDriver driver;
	long startTime;
	long endTime;
	long totalTime;
	
	@BeforeSuite
	public void launchBrowser(){
		startTime=System.currentTimeMillis();
		System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver.exe");
		driver= new FirefoxDriver();
	}

	@Test
	public void openAmzon(){
		driver.get("http://www.amazon.in");
	}

	@Test
	public void openFlipkart(){
		driver.get("http://www.flipkart.com");
	}
	@Test
	public void openEbay(){
		driver.get("http://www.ebay.in");
	}

	@AfterSuite
	public void closeBrowser(){
		driver.quit();
		endTime	=System.currentTimeMillis();
		totalTime	= endTime- startTime;
		System.out.println(totalTime);
	}

}


