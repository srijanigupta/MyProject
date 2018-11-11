package PageObjects;

//import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import managers.WebDriverManager;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage{
	
	//WebDriver driver;

	public HomePage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	    
	}
	
	@FindBy(xpath="//input[@name='userName']")
	public WebElement user_name;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//b[text()='Oct 28, 2018']")
	WebElement today_date;
	
	public void launch_app() throws Exception
	{
		System.out.println("Step 5");
		
		user_name.sendKeys("test");
		password.sendKeys("test");
		
	}
	
	public void visibility() throws Exception
	{
		System.out.println(today_date.isDisplayed());
	}
	
	
}
