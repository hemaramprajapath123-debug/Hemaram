package demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAphaOrder {

	public static void main(String[] args) {
		System.getProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		Select cat =new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> catlist=cat.getOptions();
		boolean ordered=true;
		String cat1,cat2;
		
		for(int i=1;i<catlist.size();i++)
		{
			cat1=catlist.get(i-1).getText();
			cat2=catlist.get(i).getText();
			
			if(cat2.compareToIgnoreCase(cat2)<0)
			{
				ordered=false;
				break;
			}
						
		}
	}

}
