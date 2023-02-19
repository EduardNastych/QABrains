package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaMobilePageElements extends AbstractBasePage {
    public SteamUaMobilePageElements(WebDriver driver) {
        super(driver);
    }
    private final static String APP_STORE_LOGO = "(//img[@class='mobile_apple_store_link'])[3]";
    private final static String ADD_NUMBER_BUTTON_LINK = "//a[contains(text(), 'пов’язати номер телефону зі своїм акаунтом Steam')]";

    public WebElement getClickOnAppStoreLogo() {
        return waitUntilElementToBeClickable(APP_STORE_LOGO);
    }
    public WebElement getClickOnAddNumberButtonLink() {
        return waitUntilElementToBeClickable(ADD_NUMBER_BUTTON_LINK);
    }

}
