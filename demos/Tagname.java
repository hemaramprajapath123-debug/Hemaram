package demos;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tagname {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("chromedriver.driver.chrome", "Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.globalsqa.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getClass());
        System.out.println(driver.getTitle());
        System.out.println(driver.getWindowHandle());
      
        List<WebElement> hello=driver.findElements(By.tagName("a"));
        System.out.println(hello.size());
        for(WebElement element:hello)
        {
        	String gg=element.getText();
        	System.out.println(gg);
       
        }
        
        TakesScreenshot ts=(TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        File target=new File("hhh.png");
        FileUtils.copyFile(source, target);
        
        driver.quit();
        
        
        
	}
}

