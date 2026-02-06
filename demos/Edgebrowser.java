package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgebrowser {

	public static void main(String[] args) {
             System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
             WebDriver driver=new EdgeDriver();
             
            	        driver.manage().deleteAllCookies();
            	        driver.manage().window().maximize();
            	        driver.get("https://www.facebook.com/");
            	        String url=driver.getCurrentUrl();
            	        System.out.println(url);
            	        if(url.toLowerCase().contains("facebook"))
            	        {
            	   		 System.out.println("Test case Pass for page title");
            	        }
            	   	    else
            	   	    {
            	   	    System.out.println("Test case Fail for page title");
            	   	     }
            	        WebElement element=driver.findElement(By.partialLinkText("Forgotten password?"));
            	        element.click();
            	        WebElement element2=driver.findElement(By.xpath("//input[@type='text' and @name='email']"));
            	        element2.sendKeys("hemaram.prajapath123@gmail.com");
            	        //WebElement loginButton = driver.findElement(By.xpath("//button[@id='did_submit']"));
            	        //loginButton.submit();
            	        driver.close();
       

	}

}
