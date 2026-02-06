package demos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IrctcPage {

	public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/train-search");
        
        // Use WebDriverWait to wait for the alert to be present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());

        // Switch to the alert and accept it (click OK)
        Alert alert = driver.switchTo().alert();
        alert.accept(); // Clicks the 'OK' button
	}

}
