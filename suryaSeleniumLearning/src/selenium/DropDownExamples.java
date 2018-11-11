package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D://drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://www.leafground.com/home.html");
		WebElement selectDropdown=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[2]/div/ul/li[5]/a"));
		selectDropdown.click();
		WebElement dropList1=driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropList1);
		select.selectByIndex(3);
		select.selectByVisibleText("Selenium");
		select.selectByValue("3");
		WebElement dropList3=driver.findElement(By.id("dropdown3"));
		Select select2 = new Select(dropList3);
		select2.selectByValue("4");
		

	}

}
