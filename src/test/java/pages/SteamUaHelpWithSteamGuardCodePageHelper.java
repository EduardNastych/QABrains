package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaHelpWithSteamGuardCodePageHelper extends SteamUaHelpWithSteamGuardCodePageElements{
    public SteamUaHelpWithSteamGuardCodePageHelper(WebDriver driver) {
        super(driver);
    }
    public SteamUaHelpWithSteamGuardCodePageHelper clickOnVerifyAndUpdateEmailButton(){
        getClickOnVerifyAndUpdateEmailButton().click();
        return this;
    }
}
