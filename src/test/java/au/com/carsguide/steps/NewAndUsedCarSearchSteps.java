package au.com.carsguide.steps;

import au.com.carsguide.pages.NewAndUsedCarPage;
import au.com.carsguide.pages.ResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class NewAndUsedCarSearchSteps {


    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        String expectedText = "New & Used Car Search - carsguide";
        String actualText = new NewAndUsedCarPage().getNewNUsedCar();
        Assert.assertEquals("User can not see the text", expectedText,actualText);
    }
    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make)  {
       new NewAndUsedCarPage().selectAnyMakeCars(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model)  {
        new NewAndUsedCarPage().selectAnyModelCars(model);
    }
    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location)  {
       new NewAndUsedCarPage().selectAnyLocationCars(location);
    }
    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price)  {
       new NewAndUsedCarPage().selectPriceOfCars(price);
    }
    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarPage().clickOnFindMyNextCar();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String make)  {

    Assert.assertTrue(new ResultPage().getMakeText().contains(make));
}


}
