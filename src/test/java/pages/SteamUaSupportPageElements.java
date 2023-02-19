package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaSupportPageElements extends AbstractBasePage {
    public SteamUaSupportPageElements(WebDriver driver) {
        super(driver);
    }
    private final static String FORGOT_LOGIN_DATA_LINK_BUTTON = "//span[text()= 'Я не пам’ятаю логін і пароль свого акаунта Steam']";
    private final static String STOLEN_ACCOUNT_LINK_BUTTON = "//span[text()= 'Мій акаунт Steam було викрадено, і мені необхідна допомога, щоб повернути його']";
    private final static String NOT_RECEIVING_CODE_LINK_BUTTON = "//span[text()= 'Я не отримую код від Steam Guard']";
    private final static String LOST_AUTHENTICATOR_DATA_LINK_BUTTON = "//span[text()= 'Я видалив або втратив мій мобільний автентифікатор Steam Guard']";

    public WebElement getClickOnForgotLoginDataLinkButton(){
        return waitUntilElementToBeClickable(FORGOT_LOGIN_DATA_LINK_BUTTON);
    }
    public WebElement getClickOnStolenAccountLinkButton(){
        return waitUntilElementToBeClickable(STOLEN_ACCOUNT_LINK_BUTTON);
    }
    public WebElement getClickOnNotReceivingCodeLinkButton(){
        return waitUntilElementToBeClickable(NOT_RECEIVING_CODE_LINK_BUTTON);
    }
    public WebElement getClickOnLostAuthenticatorDataLinkButton(){
        return waitUntilElementToBeClickable(LOST_AUTHENTICATOR_DATA_LINK_BUTTON);
    }
}
