package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChechboxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check Box
		System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://www.leafground.com/home.html");
		WebElement checkBox=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[7]/a"));
		checkBox.click();
		WebElement selectJava=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/input[1]"));
		selectJava.click();
		WebElement selectCplus=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/input[5]"));
		selectCplus.click();
		WebElement selectSelenium=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/input"));
		selectSelenium.click();
		WebElement deselectBox=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/input[2]"));
		deselectBox.click();
		WebElement selectOpt1=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[1]"));
		selectOpt1.click();
		WebElement selectOpt2=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[2]"));
		selectOpt2.click();
		WebElement selectOpt3=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[3]"));
		selectOpt3.click();
		WebElement selectOpt4=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[4]"));
		selectOpt4.click();
		WebElement selectOpt5=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[5]"));
		selectOpt5.click();
		WebElement selectOpt6=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/input[6]"));
		selectOpt6.click();
		

	}

}
