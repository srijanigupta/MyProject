package StepDef;

import PageObjects.HomePage;
import PageObjects.RegisterPage;

import cucumber.TestContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class RegisterPageStepDef {

	TestContext testContext;
	RegisterPage registerPage;
	HomePage homePage;
	
	public RegisterPageStepDef(TestContext context) {
		testContext = context;
		registerPage = testContext.getPageObjectManager().getRegisterPage();
		homePage = testContext.getPageObjectManager().getHomePage();
	}
	
	@When("^Select the Register link to register and fill the details$")
	public void register() throws Exception
	{
		registerPage.enter_Details();
		homePage.visibility();
	}
	
	
	
}
