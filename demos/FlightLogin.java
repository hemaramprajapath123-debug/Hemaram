package demos;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http:/flights.qedgetech.com");
		driver.findElement(By.name("email")).sendKeys("hemaram.prajapath12345@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Hemu9@1@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
		//Dashboard Click 
		driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
		driver.findElement(By.partialLinkText("Dashboard")).click();
		String dashboardurl=driver.getCurrentUrl().toLowerCase();
		String dashboardtitle=driver.getTitle();
		System.out.println(dashboardtitle);
		if(dashboardurl.contains("dashboard"))
				{
			System.out.println("Dashboad click Test case is Pass-->"+dashboardurl);
				}
		else
		       { 
			    System.out.println("Dashboad click Test case is Fail"+dashboardurl);
		       }
		
		//driver.navigate().back();
		//My Profile.
		driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
		driver.findElement(By.partialLinkText("My Profile")).click();
		String myprofiledurl=driver.getCurrentUrl();
		String myprofiledtitle=driver.getTitle();
		System.out.println(myprofiledtitle);
		if(myprofiledurl.contains("account-settings"))
		{
			System.out.println("My Profile Test case is Pass-->"+myprofiledurl);
		}
		else
		{
			System.out.println("My Profile Test case is Fail-->"+myprofiledurl);
		}
  
		//Change Password
		driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
		driver.findElement(By.partialLinkText("Change Password")).click();
		String changepwdtitle=driver.getTitle();
		String changepwdurl=driver.getCurrentUrl();
		System.out.println(changepwdtitle);
		if(changepwdurl.contains("change-password"))
		{
			System.out.println("Change Password Test case is Pass-->"+changepwdurl);
		}
		else
		{
			System.out.println("Change Password Test case is Fail-->"+changepwdurl);

		}
		
		//Logout
		driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
		driver.findElement(By.partialLinkText("Logout")).click();
		String logout=driver.getCurrentUrl();
		if(logout.contains("login"))
		{
			System.out.println("Logout Test case is Pass-->"+logout);

		}
		else
		{
			System.out.println("Logout Test case is Pass-->"+logout);

		}

		//driver.close();
	}

}
