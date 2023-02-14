package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaHomePageElements extends AbstractBasePage {
    public SteamUaHomePageElements(WebDriver driver) {
        super(driver);
    }
    private final static String HEADER_LOGIN_BUTTON = "//a[text()='увійти']";

    public WebElement getOpenLoginWindow() {
        return waitUntilVisibilityOfElementLocated(HEADER_LOGIN_BUTTON);
    }
}
