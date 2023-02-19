package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaHelpWithAccountStolenPageHelper extends SteamUaHelpWithAccountStolenPageElements{
    public SteamUaHelpWithAccountStolenPageHelper(WebDriver driver) {
        super(driver);
    }
    public SteamUaHelpWithAccountStolenPageHelper ClickOnResetPasswordButton(){
        getClickOnResetPasswordButton().click();
        return this;
    }
}
