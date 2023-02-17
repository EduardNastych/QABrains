package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaHelpWithSteamGuardCodePageElements extends AbstractBasePage {
    public SteamUaHelpWithSteamGuardCodePageElements(WebDriver driver) {
        super(driver);
    }
    private static final String VERIFY_AND_UPDATE_EMAIL_BUTTON = "//div[text()='Перевірте та оновіть мою адресу електронної пошти']";
    public WebElement getClickOnVerifyAndUpdateEmailButton(){
        return waitUntilElementToBeClickable(VERIFY_AND_UPDATE_EMAIL_BUTTON);
    }
}
