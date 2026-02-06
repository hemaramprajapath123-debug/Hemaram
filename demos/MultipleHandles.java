package demos;

	import java.io.File;
import java.io.IOException;
import java.util.List;
	import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//	import org.openqa.selenium.chrome.ChromeDriver;

	public class MultipleHandles {

		public static void main(String[] args) throws IOException {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.findElement(By.linkText("About")).click();
			driver.findElement(By.linkText("Blog")).click();
			driver.findElement(By.linkText("Privacy")).click();


			Set<String> all_handles=driver.getWindowHandles();
			System.out.println(all_handles);
			
			//code to separate All handles from set
			Object[] obj=all_handles.toArray();
			String window1=obj[0].toString();
			String window2=obj[1].toString();
			String window3=obj[2].toString();
			System.out.println("Handle1-->"+window1);
			System.out.println("Handle2->"+window2);
			System.out.println("Handle3-->"+window3);
			driver.switchTo().window(window3);
			driver.findElement(By.linkText("Overview")).click();
			
			//Taking screenshot
			TakesScreenshot ts=(TakesScreenshot) driver;
			File f1=ts.getScreenshotAs(OutputType.FILE);
			File f2=new File("C:\\Users\\pc\\Desktop\\Selenium_Screenshot\\sample4.png");
			FileUtils.copyFile(f1, f2);
			driver.close();
			
			
		}

	}

		