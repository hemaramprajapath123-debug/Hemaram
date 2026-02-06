package demos;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testdummy {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		/*Select keys=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> search=keys.getOptions();
		int counting=search.size();
		System.out.println(counting);
		keys.selectByIndex(4);*/
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//img[@alt='Action figures']")));
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File tar=new File("C:\\Users\\pc\\Desktop\\Selenium_Screenshot\\scr.png");
		FileUtils.copyFile(src, tar);
		driver.close();
	}
	}