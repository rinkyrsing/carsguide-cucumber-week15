package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class HomePageSteps {


    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverOnBuyNSell();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() throws InterruptedException {
        Thread.sleep(2000);
        new HomePage().clickOnSearchCar();
    }


    @And("^I click ‘Used’ link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedCarsLink();
    }
}
