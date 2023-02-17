package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaHelpWithLoginInfoPageElements extends AbstractBasePage {
    public SteamUaHelpWithLoginInfoPageElements(WebDriver driver) {
        super(driver);
    }
    private final static String DATA_INPUT = "//input[@id='forgot_login_search']";
    private final static String SEARCH_BUTTON = "//input[@value='Пошук']";
    private final static String CAPTCHA_ERROR_MESSAGE = "//div[@id='form_submit_error']";
    public WebElement getClickOnDataInput(){
        return waitUntilElementToBeClickable(DATA_INPUT);
    }
    public WebElement getClickOnSearchButton(){
        return waitUntilElementToBeClickable(SEARCH_BUTTON);
    }
    public WebElement getCaptchaErrorMessage(){
        return waitUntilVisibilityOfElementLocated(CAPTCHA_ERROR_MESSAGE);
    }
}
