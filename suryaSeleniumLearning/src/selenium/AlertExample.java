package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement firstAlert=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
		firstAlert.click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(3000);
		
		WebElement confirmBox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		confirmBox.click();
		Thread.sleep(3000);
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		
		WebElement promtBox=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/button"));
		promtBox.click();
		Thread.sleep(3000);
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("Selenium is easy");
		alert2.accept();
		

		
	}

}
