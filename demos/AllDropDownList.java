package demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllDropDownList {
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("Webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com");
		driver.manage().window().maximize();
		Select cat=new Select(driver.findElement(By.id("gh-cat")));
		List<WebElement> catlist=cat.getOptions();
		int itemcount=catlist.size();
		System.out.println("The size of category list is-->"+itemcount);// size of category list
		//cat.selectByIndex(1);// select first item in the category
		cat.selectByIndex(itemcount-1);//selecting last item
		Thread.sleep(5000);
		
		//Print all items in the category list
		for(int i=1;i<itemcount;i++)
		{
			String catname=catlist.get(i).getText();
			System.out.println(catname);
		}
		//Method-1
		//To check whether particular item is print list or not
		System.out.println("Method-1 To check whether particular item is print list or not");
		String item_tobe_check="Books";
		String res="Test Case Fail";
		for(int i=1;i<itemcount;i++)
		{
			String catname=catlist.get(i).getText();
			if(catname.equalsIgnoreCase(item_tobe_check))
			{
				res="testststTest case Pass";
				break;
			}

		}
		System.out.println(res);

		//Method-2 To check whether particular item is print list or not
		System.out.println("Method-2 To check whether particular item is print list or not");
         boolean is_item_present=false;
         for(int i=1;i<itemcount;i++)
 		{
 			String catname=catlist.get(i).getText();
			if(catname.equalsIgnoreCase(item_tobe_check))
			{
				is_item_present=true;
				break;
			}

 		}
         if(is_item_present)
         {
        	 System.out.println("Test case is Pass");
         }
         else
         {
        	 System.out.println("Test case is Fail");
         }

		driver.close();
}
}

