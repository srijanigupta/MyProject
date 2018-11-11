package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

	public WebDriver driver;
	
	public WebDriver getDriver()
	{
		if(driver==null)
		{
			System.out.println("Step 2");
			System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\MyTest\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://newtours.demoaut.com/mercurywelcome.php");
			return driver;
			
		}
		
		else
		{
			return driver;
		}
		
		
	}
}
