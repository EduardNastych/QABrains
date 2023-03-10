package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaLoginPageElements extends AbstractBasePage {
    public SteamUaLoginPageElements(WebDriver driver) {
        super(driver);
    }

    private final static String LOGIN_INPUT = "(//input[@class='newlogindialog_TextInput_2eKVn'])[1]";
    private final static String ERROR_LOGIN_INPUT = "(//input[@class='newlogindialog_TextInput_2eKVn newlogindialog_Danger_1-HwJ'])[1]";
    private final static String PASSWORD_INPUT = "//input[@type='password']";
    private final static String ERROR_PASSWORD_INPUT = "(//input[@class='newlogindialog_TextInput_2eKVn newlogindialog_Danger_1-HwJ'])[2]";
    private final static String LOGIN_BUTTON = "//button[text()='Увійти']";
    private final static String ERROR_MESSAGE = "//div[text()='Будь ласка, перевірте логін і пароль свого акаунта, а потім спробуйте знову.']";
    private static final String REMEMBER_ME_CHECK_BOX = "//div[@class='newlogindialog_Checkbox_3tTFg']";
    private final static String HELP_I_CANT_SIGN_IN_LINK_BUTTON = "//a[text()='Я не можу ввійти']";
    private final static String STEAM_MOBILE_APP_LINK_BUTTON = "//a[contains(text(),'мобільний застосунок Steam')]";
    private final static String POP_UP_NOTIFICATION = "//div[contains(text(), 'Під час наступного запуску Steam вам не потрібно буде вводити пароль чи підтверджувати вхід до акаунта.')]";

    public WebElement getLoginInput() {
        return waitUntilElementToBeClickable(LOGIN_INPUT);
    }

    public WebElement getPasswordInput() {
        return waitUntilElementToBeClickable(PASSWORD_INPUT);
    }

    public WebElement getLoginButton() {
        return waitUntilElementToBeClickable(LOGIN_BUTTON);
    }

    public WebElement getErrorMessage() {
        return waitUntilVisibilityOfElementLocated(ERROR_MESSAGE);
    }
    public WebElement getErrorLoginInput() {
        return waitUntilVisibilityOfElementLocated(ERROR_LOGIN_INPUT);
    }

    public WebElement getErrorPasswordInput() {
        return waitUntilVisibilityOfElementLocated(ERROR_PASSWORD_INPUT);
    }

    public WebElement getRememberMeCheckBox() {
        return waitUntilElementToBeClickable(REMEMBER_ME_CHECK_BOX);
    }
    public WebElement getHelpLinkButton() {
        return waitUntilElementToBeClickable(HELP_I_CANT_SIGN_IN_LINK_BUTTON);
    }
    public WebElement getSteamMobileAppLinkButton() {
        return waitUntilElementToBeClickable(STEAM_MOBILE_APP_LINK_BUTTON);
    }
    public WebElement getPopUpNotification() {
        return waitUntilElementToBeClickable(POP_UP_NOTIFICATION);
    }


}
