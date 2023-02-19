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
    private final static String HELP_ERROR_MESSAGE = "//div[contains(text(), 'Нам не вдалося знайти акаунт за наданою вами інформацією.')]";

    public WebElement getClickOnDataInput(){
        return waitUntilElementToBeClickable(DATA_INPUT);
    }
    public WebElement getClickOnSearchButton(){
        return waitUntilElementToBeClickable(SEARCH_BUTTON);
    }
    public WebElement getCaptchaErrorMessage(){
        return waitUntilVisibilityOfElementLocated(CAPTCHA_ERROR_MESSAGE);
    }
    public WebElement getHelpErrorMessage(){
        return waitUntilVisibilityOfElementLocated(HELP_ERROR_MESSAGE);
    }

}
