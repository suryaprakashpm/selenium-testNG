package guru99Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day2 {
	WebDriver driver;
	@BeforeSuite
	public void lanuchBrowser(){
	System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver-v0.23.0-win64//geckodriver.exe");
	driver = new FirefoxDriver();
	}
	@Test
public void openGuru(){
	driver.get("http://www.demo.guru99.com/V4/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement enterUserID=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input"));
	enterUserID.sendKeys("mngr159115"+Keys.TAB);
	WebElement enterPassword=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	enterPassword.sendKeys("AputagY"+Keys.TAB);
	WebElement clickLogin=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
	clickLogin.click();
	Boolean loginSuccess;
	WebElement logoutlink=driver.findElement(By.linkText("Log out"));
	loginSuccess=logoutlink.isDisplayed();
	if(loginSuccess){
		System.out.println("Login Successful");
	}else{
		System.out.println("Login unsucessful");
	}
}
}
