package cucumber;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TestContext {

	public WebDriverManager webDriverManager;
	public PageObjectManager pageObjectManager;
	
	
	public TestContext(){
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
		
		
	}
	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	
	
}
