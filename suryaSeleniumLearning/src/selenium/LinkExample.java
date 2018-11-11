package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver.exe");
	WebDriver driver = new FirefoxDriver(); 
	driver.navigate().to("http://www.leafground.com/pages/Link.html");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement clickLink=driver.findElement(By.partialLinkText("Go"));
		clickLink.click();
		
		
		

	}

}
