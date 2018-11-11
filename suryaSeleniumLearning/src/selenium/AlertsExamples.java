package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://www.leafground.com/pages/Alert.html");
		WebElement clickAlert=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button"));
		clickAlert.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmBox=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button"));
		confirmBox.click();
		Alert alert1=driver.switchTo().alert();
		alert1.dismiss();
		
	}

}
