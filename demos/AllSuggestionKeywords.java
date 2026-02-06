package demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllSuggestionKeywords {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
		Thread.sleep(5000);
		
		List<WebElement> keywords=driver.findElement(By.className("G43f7e")).findElements(By.tagName("li"));
		System.out.println(keywords.size());
		for(WebElement element:keywords)
		{
			String keyword=element.getText();
			if(keyword.toLowerCase().contains("interview questions"))
			{
				element.click();
				System.out.println(keyword);
				break;
			}			
		}		
	}
}
