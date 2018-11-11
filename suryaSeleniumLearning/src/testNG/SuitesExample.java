package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuitesExample {
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
	public void openGoogle(){


		driver.get("http://www.google.co.in");


	}

	@Test
	public void openBing(){


		driver.get("http://www.bing.com");


	}
	@Test
	public void openYahoo(){
		driver.get("http://www.yahoo.com");

	}

	@AfterSuite
	public void closeBrowser(){
		driver.quit();
		endTime	=System.currentTimeMillis();
		totalTime	= endTime- startTime;
		System.out.println(totalTime);
	}

}
