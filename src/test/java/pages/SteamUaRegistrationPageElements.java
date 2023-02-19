package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaRegistrationPageElements extends AbstractBasePage {
    public SteamUaRegistrationPageElements(WebDriver driver) {
        super(driver);
    }

    private final static String JOIN_TO_STEAM_BUTTON = ("//a[@class='btnv6_white_transparent btn_medium']");
    private final static String EMAIL_INPUT = ("//input[@id='email']");
    private final static String REENTER_EMAIL_INPUT = ("//input[@id='reenter_email']");
    private final static String CHECK_MARK = ("//input[@id='i_agree_check']");
    private final static String CONTINUE_BUTTON = ("//button[@id='createAccountButton']");
    private final static String ERROR_DISPLAY = ("//div[@id='error_display']");


    public WebElement getClickOnJoinToSteamButton() {
        return waitUntilElementToBeClickable(JOIN_TO_STEAM_BUTTON);
    }

    public WebElement getClickOnEmailInput() {
        return waitUntilElementToBeClickable(EMAIL_INPUT);
    }

    public WebElement getClickOnReenterEmailInput() {
        return waitUntilElementToBeClickable(REENTER_EMAIL_INPUT);
    }

    public WebElement getClickOnCheckMark() {
        return waitUntilElementToBeClickable(CHECK_MARK);
    }

    public WebElement getClickOnContinueButton() {
        return waitUntilElementToBeClickable(CONTINUE_BUTTON);
    }

    public WebElement getErrorDisplay() {
        return waitUntilVisibilityOfElementLocated(ERROR_DISPLAY);
    }
}


