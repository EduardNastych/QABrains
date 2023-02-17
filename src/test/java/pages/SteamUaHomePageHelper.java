package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaHomePageHelper extends SteamUaHomePageElements {
    public SteamUaHomePageHelper(WebDriver driver) {
        super(driver);
    }

    public SteamUaHomePageHelper openLoginWindow() {
        getOpenLoginWindow().click();
        return this;
    }

    public SteamUaHomePageHelper moveCursorToCategoryAction() {
        moveCursor(getMoveCursorToCategory());
        getClickCategoryToAction().click();
        return this;
    }

    public SteamUaHomePageHelper moveCursorToNewsBarMenu() {
        moveCursor(getMoveCursorToNewsBarMenu());
        getClickNewsBarMenu().click();
        return this;
    }
}
