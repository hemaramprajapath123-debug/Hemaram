package demos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NoRowsIrctc {

	public static void main(String[] args) {
		System.getProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        
		driver.get("https://www.railyatri.in/time-table");

	  WebElement trains_table=driver.findElement(By.className("timetable_table__4hbNj"));
	  
	  //Number of rows the table including the header
	  List<WebElement> rows=trains_table.findElements(By.tagName("tr"));
	  int rowcount=rows.size();
	  System.out.println(rowcount);
	  
	  //Number of columns in the table
	  List<WebElement> cols=rows.get(0).findElements(By.tagName("th"));
	  int colcount=cols.size();
	  System.out.println(colcount);
		  
		  
		  
	 driver.close();
	}
}

