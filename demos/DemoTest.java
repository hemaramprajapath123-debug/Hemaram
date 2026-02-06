package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.manage().deleteAllCookies();//deleting browser cookies
	 driver.manage().window().maximize();//maximoze the window 
	 //driver.get("https://google.com");//accessing the website by get()
	 driver.navigate().to("https://google.com");
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh(); 
	 String pgtitle=driver.getTitle();
	 System.out.println("Page Title:-"+pgtitle);
	 if(pgtitle.toLowerCase().contentEquals("google"))
	 {
		 System.out.println("Test case Pass for page title");
	 }
	 else
	 {
		 System.out.println("Test case Fail for page title");

	 }
	 driver.findElement(By.linkText("Gmail")).click();
	 String pgurl=driver.getCurrentUrl();
	if(pgurl.toLowerCase().contains("gmail"))
	{
		System.out.println("Test case Pass for url link");
	 }
	 else
	 {
		 System.out.println("Test case Fail for url link");
	 }
	
			driver.close();
	}

}
