package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaNewsAppPageElement extends AbstractBasePage {

    public SteamUaNewsAppPageElement(WebDriver driver) {
        super(driver);
    }

    private static String TEXT_GAME_DAYZ = "//div[contains(text(), '%s')]";

    public WebElement getTextGameDayz(String gameName) {
        return waitUntilVisibilityOfElementLocated(String.format(TEXT_GAME_DAYZ, gameName));
    }



}
