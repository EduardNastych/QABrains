package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaSupportPageHelper extends SteamUaSupportPageElements {
    public SteamUaSupportPageHelper(WebDriver driver) {
        super(driver);
    }
    public SteamUaSupportPageHelper clickOnForgotLoginDataLinkButton(){
        getClickOnForgotLoginDataLinkButton().click();
        return this;
    }
    public SteamUaSupportPageHelper clickOnStolenAccountLinkButton(){
        getClickOnStolenAccountLinkButton().click();
        return this;
    }
    public SteamUaSupportPageHelper clickOnNotReceivingCodeLinkButton(){
        getClickOnNotReceivingCodeLinkButton().click();
        return this;
    }
    public SteamUaSupportPageHelper clickOnLostAuthenticatorDataLinkButton(){
        getClickOnLostAuthenticatorDataLinkButton().click();
        return this;
    }
}
