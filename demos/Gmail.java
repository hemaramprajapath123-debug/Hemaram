package demos;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Gmail {


		public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();//deleting browser cookies
		 driver.manage().window().maximize();//maximoze the window 
		 //driver.get("https://google.com");//accessing the website by get()
		 driver.navigate().to("https://google.com");
		 driver.findElement(By.linkText("Gmail")).click();
		 
		    WebElement element=driver.findElement(By.linkText("Sign in"));
			element.click();
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hemaram.prajapath123@gmail.com");
			driver.findElement(By.xpath("//span[text()='Next']")).click();
	        
}
}