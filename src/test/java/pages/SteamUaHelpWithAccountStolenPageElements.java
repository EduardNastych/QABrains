package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaHelpWithAccountStolenPageElements extends AbstractBasePage {
    public SteamUaHelpWithAccountStolenPageElements(WebDriver driver) {
        super(driver);
    }
    private static final String RESET_PASSWORD_BUTTON = "//span[text()='Скинути пароль']";
    public WebElement getClickOnResetPasswordButton(){
        return waitUntilElementToBeClickable(RESET_PASSWORD_BUTTON);
    }
}
