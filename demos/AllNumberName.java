package demos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllNumberName {

		public static void main(String[] args) {
			System.getProperty("Webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	        
			driver.get("https://www.railyatri.in/time-table");

		  WebElement trains_table=driver.findElement(By.className("timetable_table__4hbNj"));
		  
		  //Number of rows the table including the header
		  List<WebElement> rows=trains_table.findElements(By.tagName("tr"));

			 System.out.println("********************************Method 1*********************************************");

		 for(int i=1;i<rows.size();i++)
		 {
			 List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			 String train_number=cols.get(0).getText();
			 String train_name=cols.get(1).getText();
			 String train_type=cols.get(2).getText();
			 String train_rundays=cols.get(3).getText();
			 String train_deptime=cols.get(4).getText();
			 String train_arrtime=cols.get(5).getText();

			 System.out.println(train_number+" "+train_name+" "+train_type+" "+train_rundays+" "+train_deptime+" "+train_arrtime);
			 System.out.println("---------------------------------------------------------------------------------");

			 } 
		  
		 System.out.println("********************************Method 2 All Data By Two for Loops*********************************************");
		 for(int i=1;i<rows.size();i++)
		 {
			 List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			 for(WebElement element:cols)
			 {
				 String data=element.getText();
				 System.out.println(data);
			 }
		 }
		 driver.close(); 
}
}
