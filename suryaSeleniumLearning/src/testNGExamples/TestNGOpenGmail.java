package testNGExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGOpenGmail {
	@Test
	public void openGmail(){
		
	System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver.exe");
	
	WebDriver driver= new FirefoxDriver();
	
	driver.get("http://www.gmail.com");
	}
}

