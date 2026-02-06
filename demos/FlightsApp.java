package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightsApp {

	public static void main(String[] args) {
		          System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		          WebDriver driver=new ChromeDriver();
		          driver.manage().deleteAllCookies();
		          driver.manage().window().maximize();
		          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		          
		          driver.navigate().to("http:/flights.qedgetech.com");
		          driver.findElement(By.partialLinkText("Register")).click();
		          driver.findElement(By.id("name")).sendKeys("Hemaram");
		          driver.findElement(By.id("contact")).sendKeys("9010721805");
		          driver.findElement(By.id("email")).sendKeys("hemaram.prajapath12345@gmail.com");
		          driver.findElement(By.name("password")).sendKeys("Hemu9@1@");
		          //driver.findElement(By.name("gender")).sendKeys("Male");
		          WebElement dropdownElement = driver.findElement(By.name("gender"));
		          Select dropdown = new Select(dropdownElement);
		          dropdown.selectByVisibleText("Male");
		         driver.findElement(By.name("dob")).sendKeys("28-02-1992");
		         driver.findElement(By.className("form-check-input")).click();
		         driver.findElement(By.name("submit")).click();
		         driver.close();
		         

	}

}
