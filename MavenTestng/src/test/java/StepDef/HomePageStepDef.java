package StepDef;

import PageObjects.HomePage;
import PageObjects.RegisterPage;
import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStepDef {

	TestContext testContext;
	HomePage homePage;
	
	
	public HomePageStepDef(TestContext context) {
		System.out.println("Step 1");
		testContext = context;
		homePage = testContext.getPageObjectManager().getHomePage();
		
	}
	
	@Given("^User launches the application$")
	public void launch_app() throws Exception
	{
		System.out.println("Step 4");
		homePage.launch_app();
	}
	
	@When("^Enter username and password to signin$")
	public void login() throws Exception
	{
		
	}
	
	
}
