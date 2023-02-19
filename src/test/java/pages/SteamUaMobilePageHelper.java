package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaMobilePageHelper extends SteamUaMobilePageElements {
    public SteamUaMobilePageHelper(WebDriver driver) {
        super(driver);
    }
    public SteamUaMobilePageHelper clickOnAppStoreLogo(){
        getClickOnAppStoreLogo().click();
        return this;
    }
    public SteamUaMobilePageHelper clickOnAddNumberButtonLink(){
        getClickOnAddNumberButtonLink().click();
        return this;
    }
}
