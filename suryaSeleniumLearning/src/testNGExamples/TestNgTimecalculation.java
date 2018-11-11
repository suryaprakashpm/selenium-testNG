package testNGExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
//Time calculation
public class TestNgTimecalculation {
	@Test
	public void lanchbrowser(){
		long startTime= System.currentTimeMillis();
		System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.in");
		long endTime = System.currentTimeMillis();
		long totalTime= endTime - startTime;
		System.out.println(totalTime);
		
	}

}

