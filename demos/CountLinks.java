package demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement element:links)
		{
			String alllinks=element.getText();
	        System.out.println(alllinks);
		}
		driver.findElement(By.linkText("Privacy")).click();
		String pageurl=driver.getCurrentUrl();
		System.out.println(pageurl);
		if(driver.getTitle().contains("Privacy & Terms"))
		{
			System.out.println("Web page is redirected to Privacy page-->"+"Test Case is Pass!!");
		}
		else
		{
			System.out.println("Web page is not redirected to Privacy page-->"+"Test Case is Fail!!");

		}
		driver.close();
	}

}
