package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SteamUaNewsBarMenuPageElements extends AbstractBasePage {
    public SteamUaNewsBarMenuPageElements(WebDriver driver) {
        super(driver);
    }
    private final static String INPUT_FIELD_FOR_SEARCH = "//input[@type = 'text']";
    private final static String BUTTON_NEWS_BAR_MENU = "//div[@class = 'store_nav_bg']//a[@class = 'tab  '][contains(@href, 'news')]";
    private final static String DROP_DOWN_SEARCH_RESULT = "//div[@class='storesuggest_GameName_3DcZv']";

    public WebElement getInputFieldForSearch() {
        return waitUntilElementToBeClickable(INPUT_FIELD_FOR_SEARCH);
    }

    public WebElement getNewsBarMenu() {
        return waitUntilElementToBeClickable(BUTTON_NEWS_BAR_MENU);
    }

    public List<WebElement> getDropDownSearchResult() {
        return waitUntilElementsToBeClickable(DROP_DOWN_SEARCH_RESULT);
    }
}
