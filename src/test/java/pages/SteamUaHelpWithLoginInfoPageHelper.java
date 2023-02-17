package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaHelpWithLoginInfoPageHelper extends SteamUaHelpWithLoginInfoPageElements{
    public SteamUaHelpWithLoginInfoPageHelper(WebDriver driver) {
        super(driver);
    }
    public SteamUaHelpWithLoginInfoPageHelper writeValidEmail(String email){
        getClickOnDataInput().sendKeys(email);
        return this;
    }
    public SteamUaHelpWithLoginInfoPageHelper clickOnSearchButton(){
        getClickOnSearchButton().click();
        return this;
    }
}
