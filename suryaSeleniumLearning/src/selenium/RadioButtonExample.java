package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindActiveElement;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Radio Button
		System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://www.leafground.com/home.html");
		WebElement radioButton=driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[6]/a"));
		radioButton.click();
		
		WebElement selectYes=driver.findElement(By.id("yes"));
		selectYes.click();
		
		WebElement selectUncheck=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input[1]"));
		selectUncheck.click();	
		
		WebElement selectabove40years=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[3]"));
		selectabove40years.click();
	}

}
