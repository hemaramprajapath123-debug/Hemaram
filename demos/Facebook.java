package demos;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import java.time.Duration;



public class Facebook {

	public static void main(String[] args) {
              System.setProperty("webdriver.chrome.driver","chromedriver.exe");
              WebDriver driver=new ChromeDriver();
              driver.manage().window().maximize();
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
              
              driver.get("https://www.facebook.com/");
              driver.findElement(By.id("email")).sendKeys("hemaram.prajapath123@gmail.com");
              driver.findElement(By.id("pass")).sendKeys("9948150105");
              driver.findElement(By.name("login")).click();
              driver.close();
              
}
}