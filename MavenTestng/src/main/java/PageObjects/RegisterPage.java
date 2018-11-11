package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.FindBy;

public class RegisterPage {

	
	//WebDriver driver;

	public RegisterPage(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	    
	}
	
	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement register_hyperlink;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstname_inbox;
	
	public void enter_Details() throws Exception
	{
		register_hyperlink.click();
		firstname_inbox.sendKeys("abcde");
		
		
	}
	
	
}
