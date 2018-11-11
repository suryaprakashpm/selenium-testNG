package suryaTestNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNgOpenGoogle {
	@Test
public void openGoogle(){
	System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.Google.co.in");
		}
}
