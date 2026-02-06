package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QedgePage {
	public static void main(String[] arg)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
        driver.findElement(By.className("Continue with Google")).click();
        driver.close();
	}

}
