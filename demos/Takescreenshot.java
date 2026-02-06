package demos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.netty.handler.codec.http.multipart.FileUpload;



public class Takescreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File trgfile=new File("C:\\Users\\pc\\Desktop\\Selenium_Screenshot\\sample1.png");
		FileUtils.copyFile(srcfile,trgfile);
	    System.err.println("Filed Copied");
	    driver.close();
	}

}
