package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.ResultPage;
import au.com.carsguide.pages.UsedCarsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class UsedCarSteps {



    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
       String expectedText = "Used Cars For Sale";
       String actualText = new UsedCarsPage().getTitleTextOfUsedCarsForSalePage();
       Assert.assertEquals("User can not see 'Used Cars For Sale' Page not displayed: ", expectedText,actualText);
    }
}
