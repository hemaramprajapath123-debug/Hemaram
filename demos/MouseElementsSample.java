package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseElementsSample {

	public static void main(String[] args) {
		System.getProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        
        driver.navigate().to("https://www.ebay.com");
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Motors")));
        act.build().perform();
        act.contextClick(driver.findElement(By.linkText("Rims")));
        act.build().perform();
        driver.close();
	}

}
