package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
    System.setProperty("webdriver.firefox.driver", "geckodriver-0.36.0");
    WebDriver driver=new FirefoxDriver();
    driver.manage().deleteAllCookies();
    driver.manage().window().maximize();
    driver.get("https://learn.qedgetech.com/");
    String url=driver.getCurrentUrl();
    System.out.println(url);
    if(url.toLowerCase().contains("qedge"))
    {
		 System.out.println("Test case Pass for page title");
    }
	    else
	    {
	    System.out.println("Test case Fail for page title");
	     }
    WebElement element=driver.findElement(By.partialLinkText("Login"));
    element.click();
    driver.close();
	}

}
