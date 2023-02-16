package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaHomePageElements extends AbstractBasePage {
    public SteamUaHomePageElements(WebDriver driver) {
        super(driver);
    }
    private final static String HEADER_LOGIN_BUTTON = "//a[text()='увійти']";

    private final static String PULLWOWN_DESKTOP_CATEGORY = "(//a[text()='Категорії'])[1]";

    private final static String BUTTON_ACTION_CATEGORY = "//a[contains(text(), 'Бойовики')]";

    private final static String BUTTON_NEWS_BAR_MENU = "(//a[@class='tab  '])[2]";

    public WebElement getOpenLoginWindow() {
        return waitUntilVisibilityOfElementLocated(HEADER_LOGIN_BUTTON);
    }

    public WebElement getMoveCursorToCategory() {
        return waitUntilVisibilityOfElementLocated(PULLWOWN_DESKTOP_CATEGORY);
    }

    public WebElement getClickCategoryToAction() {
        return waitUntilVisibilityOfElementLocated(BUTTON_ACTION_CATEGORY);
    }

    public WebElement getMoveCursorToNewsBarMenu() {
        return waitUntilVisibilityOfElementLocated(BUTTON_NEWS_BAR_MENU);
    }

    public WebElement getClickNewsBarMenu() {
        return waitUntilVisibilityOfElementLocated(BUTTON_NEWS_BAR_MENU);
    }
}

