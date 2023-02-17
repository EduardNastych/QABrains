package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaNewsBarMenuPageElements extends AbstractBasePage {
    public SteamUaNewsBarMenuPageElements(WebDriver driver) {
        super(driver);
    }

    private final static String INPUT_FIELD_FOR_SEARCH = "//input[contains(@class, 'DialogInput')]";

    public WebElement getInputFieldForSearch() {
        return waitUntilElementToBeClickable(INPUT_FIELD_FOR_SEARCH);
    }

    private final static String BUTTON_NEWS_BAR_MENU = "(//a[@class='tab  '])[2]";

    public WebElement getNewsBarMenu() {
        return waitUntilElementToBeClickable(BUTTON_NEWS_BAR_MENU);
    }
}
