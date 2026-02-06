package demos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
                System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
                WebDriver driver=new ChromeDriver();
                driver.manage().deleteAllCookies();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
                
                driver.get("http://orangehrm.qedgetech.com/");
                driver.findElement(By.id("txtUsername")).sendKeys("Admin");
                driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
                driver.findElement(By.id("btnLogin")).submit();
                //driver.findElement(By.partialLinkText("Buzz")).click();
                //driver.findElement(By.partialLinkText("Welcome")).click();
                //driver.findElement(By.linkText("Logout")).click();
                driver.findElement(By.linkText("PIM")).click();
                driver.findElement(By.linkText("Employee list")).click();
                
	}

}
