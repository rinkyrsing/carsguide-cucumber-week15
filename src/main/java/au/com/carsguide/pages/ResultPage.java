package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {

    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'AUDI')]")
    WebElement verifyMake1;


    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Make')]")
    WebElement verifyMake;



    public String getMakeText(){
        log.info("User shouid see the 'Make' text : " + verifyMake1.getText());
        return getTextFromElement(verifyMake1);
    }
}
