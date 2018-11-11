package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;

public class GoHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.navigate().to("http://www.leafground.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement clickGoHome=driver.findElement(By.xpath("//*[@id='home']"));
		clickGoHome.click();
		WebElement clickEditTool=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[1]/a/img"));
		clickEditTool.click();
		WebElement removeText=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input"));
		removeText.clear();
		WebElement typeNewText=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input"));
		typeNewText.sendKeys("Black Rose");

	}

}
