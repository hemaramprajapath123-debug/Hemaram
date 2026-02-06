package demos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeEmpIDSearch {
	
	public static void main(String[] args) {
		System.getProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        
        driver.navigate().to("http://orangehrm.qedgetech.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
        driver.findElement(By.id("btnLogin")).submit();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("menu_pim_addEmployee")).click();
        driver.findElement(By.id("firstName")).sendKeys("Hemaram");
        driver.findElement(By.id("lastName")).sendKeys("Prajapath");
        String empid=driver.findElement(By.id("employeeId")).getAttribute("value");
        driver.findElement(By.xpath("//input[@id='btnSave']")).click();
       
        driver.findElement(By.partialLinkText("Employee List")).click();
        driver.findElement(By.id("empsearch_id")).sendKeys(empid);
		WebElement Emp_table=driver.findElement(By.id("resultTable"));
		List<WebElement> rows=Emp_table.findElements(By.tagName("tr"));
		
		for(int i=1;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			{
				if(cols.get(1).getText().equals(empid))
				{
					System.out.println("ID is present-->"+empid);
				}
				else
				{
					System.out.println("ID is present-->"+empid);
				}
				}
         driver.close();      
	}
	}
}
