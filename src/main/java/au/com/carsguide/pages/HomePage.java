package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage(){
        PageFactory.initElements(driver, this);
    }



    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement mouseHoverBuyNsell;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCar;

    @CacheLookup
    @FindBy(xpath = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement usedCar;




    public void mouseHoverOnBuyNSell(){
        log.info("Mouse hover on buy+sell tab : " + mouseHoverBuyNsell.getText());
        mouseHoverToElement(mouseHoverBuyNsell);
    }

    public void clickOnSearchCar(){
        log.info("Click on search car : " + searchCar.getText() );
        clickOnElement(searchCar);
    }
    public void clickOnUsedCarsLink(){
        log.info("Click on used care from the buy n sell search : " + usedCar.getText());
        clickOnElement(usedCar);
    }

}
