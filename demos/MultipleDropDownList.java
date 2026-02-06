package demos;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleDropDownList {

	public static void main(String[] args) {
		System.getProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/pc/Documents/sample.html");
		Select cars=new Select(driver.findElement(By.id("car")));
		cars.selectByValue("a");
		cars.selectByValue("b");
		cars.selectByValue("v");
		cars.deselectAll();
		driver.close();
		

	}

}
