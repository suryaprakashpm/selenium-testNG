package guru99Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Day4 {
	@Test
public void checkManagerId(){
	System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver-v0.23.0-win64//geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.demo.guru99.com/V4/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement enterUserID =driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
	enterUserID.sendKeys("mngr159115"+Keys.TAB);
	WebElement enterPassword = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	enterPassword.sendKeys("AputagY"+Keys.TAB);
	WebElement clickLogin= driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
	clickLogin.click();
	
	boolean checkManagerID;
	WebElement managerID=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
	String ID = managerID.getText();
	checkManagerID=managerID.isDisplayed();
	if(checkManagerID && ID.contains("mngr159115")){
		System.out.println("Manager ID is verified");
	}else{
		System.out.println("Manager ID wrong");
	}
	
}
}
