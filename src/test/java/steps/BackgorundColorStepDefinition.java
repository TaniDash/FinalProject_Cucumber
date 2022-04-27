package steps;

import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BackgroundColorPage;
import pages.TestBase;

public class BackgorundColorStepDefinition extends TestBase{
	BackgroundColorPage backgroundColorPage;

	@Before
	public void beforeRun() {
		initDriver();
		backgroundColorPage= PageFactory.initElements(driver, BackgroundColorPage.class);
	}
	
	@Given("^\"([^\"]*)\" button exists$")
	public void button_exists(String buttonValidation) {
	    driver.get("https://techfios.com/test/101/");
	    backgroundColorPage.checkSetSkyBlueButton();
	    backgroundColorPage.checkSetWhiteButton();   
	}

	@When("^User clicks on the Set Sky Blue Background button$")
	public void user_clicks_on_the_Set_Sky_Blue_Background_button()  {
	    backgroundColorPage.clickSetSkyBLueBackgroundButton();
	}
	
//	@When("^User clicks on the \"([^\"]*)\"$")
//	public void user_clicks_on_the(String button) {
//		backgroundColorPage.clickSetSkyBLueBackgroundButton();
//		switch(button) {
//		case "Set SkyBlue Background":
//		backgroundColorPage.clickSetSkyBLueBackgroundButton();
//		break;
////		case "Set SkyWhite Background":
////		backgroundColorPage.clickSetWhiteBackgroundButton();
////		break;
//		default:
//			System.out.println("Unable to click" + button);
//			
//		}
//	}
	

	@When("^User should be able to click on the button$")
	public void user_should_be_able_to_click_on_the_button() {
	    backgroundColorPage.clickSetWhiteBackgroundButton();
	}
	
	@Then("^The background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
	backgroundColorPage.checkSkyBlueBackGroundColor();
	  takeScreenshot(driver);
	}
	
	@Then("^The background color will change to white$")
	public void the_background_color_will_change_to_white() {
	    backgroundColorPage.checkWhiteBackGroundColor();
	    takeScreenshot(driver);
	}
	
	
}
