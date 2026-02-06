package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightChangePwd {

	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http:/flights.qedgetech.com");
			driver.findElement(By.name("email")).sendKeys("hemaram.prajapath12345@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Hemu9@1@");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
            driver.findElement(By.partialLinkText("Change Password")).click();
            driver.findElement(By.name("old_password")).sendKeys("Hemu721@805");
    		driver.findElement(By.name("password")).sendKeys("Hemu9@1@");
    		driver.findElement(By.name("c_password")).sendKeys("Hemu9@1@");
    		driver.findElement(By.xpath("//input[@type='submit' and @value='Update']")).click();

	}
}
