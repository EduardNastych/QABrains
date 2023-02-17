package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaViewHelper extends SteamUaViewElements {
    public SteamUaViewHelper(WebDriver driver) {
        super(driver);
    }

    public SteamUaViewHelper moveToCommunityMenuItem() {
        moveCursor(getCommunityMenuItem());
        return this;
    }

    public SteamUaViewHelper moveToStoreMenuItem() {
        moveCursor(getStoreMenuItem());
        return this;
    }
}
