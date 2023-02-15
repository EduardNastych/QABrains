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
    public final static String ERROR_MESSAGE = "//div[text()='Будь ласка, перевірте логін і пароль свого акаунта, а потім спробуйте знову.']";

    public WebElement getClickOnLoginInput() {
        return waitUntilElementToBeClickable(LOGIN_INPUT);
    }

    public WebElement getClickOnPasswordInput() {
        return waitUntilElementToBeClickable(PASSWORD_INPUT);
    }

    public WebElement getClickOnLoginButton() {
        return waitUntilElementToBeClickable(LOGIN_BUTTON);
    }
    public WebElement getErrorMessage(){
        return waitUntilVisibilityOfElementLocated(ERROR_MESSAGE);
    }
    public WebElement getErrorLoginInput(){
        return waitUntilVisibilityOfElementLocated(ERROR_LOGIN_INPUT);
    }
    public WebElement getErrorPasswordInput(){
        return waitUntilVisibilityOfElementLocated(ERROR_PASSWORD_INPUT);
    }

}
