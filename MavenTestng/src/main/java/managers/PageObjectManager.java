package managers;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import PageObjects.RegisterPage;

public class PageObjectManager {
	
	public WebDriver driver;
	public HomePage hp;
	public RegisterPage rp;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
		System.out.println("Step 3");
	}
	
	public HomePage getHomePage()
	{
		if(hp == null)
		{
			System.out.println("Step 6");
			return(hp = new HomePage(driver));
		}
		else
		{
			System.out.println("Step 7");
			return hp;
		}
	}
	
	public RegisterPage getRegisterPage()
	{
		if(rp == null)
		{
			return(rp = new RegisterPage(driver));
		}
		else
		{
			return rp;
		}
	}

}
