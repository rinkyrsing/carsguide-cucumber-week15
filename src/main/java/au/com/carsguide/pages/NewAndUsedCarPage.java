package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCarPage.class.getName());

    public NewAndUsedCarPage() {
        PageFactory.initElements(driver, this);
    }


     @CacheLookup
     @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
     WebElement verifyNewUasdCar;

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement anyMake;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement anyModel;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement anyLocation;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement carsPrice;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findNextCar;

    public String getNewNUsedCar(){
        log.info(" get title text of New and used car search page" + verifyNewUasdCar.getText());
        return getTextFromElement(verifyNewUasdCar)  ;
    }


    public void selectAnyMakeCars(String make) {
        log.info("select care from the drop down :" + make + anyMake.getText() +"<br>" );
        selectByVisibleTextFromDropDown (anyMake, make);

    }

    public void selectAnyModelCars(String model) {
        log.info("select any model from drop down : " + model  + anyModel.getText() + "<br>");
        selectByVisibleTextFromDropDown(anyModel, model);

    }

    public void selectAnyLocationCars(String location) {
        log.info("select any model from drop down : " + location +anyLocation.getText() + "<br>");
        selectByVisibleTextFromDropDown(anyLocation, location);

    }

    public void selectPriceOfCars(String price) {
        log.info("select any model from drop down : " +price  + carsPrice.getText() + "<br>");
        selectByVisibleTextFromDropDown(carsPrice, price);

    }

    public void clickOnFindMyNextCar() {
        log.info("select any model from drop down : "  + findNextCar.getText());
        clickOnElement(findNextCar);
    }

}