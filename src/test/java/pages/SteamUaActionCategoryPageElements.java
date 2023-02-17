package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaActionCategoryPageElements extends AbstractBasePage {
    public SteamUaActionCategoryPageElements(WebDriver driver) {
        super(driver);
    }

    private final static String ACTION_ADVENTURE_CATEGORY = "//div[text()='Пригодницькі бойовики']";

    public WebElement getActionAdventureCategory() {
        return waitUntilElementToBeClickable(ACTION_ADVENTURE_CATEGORY);
    }
}
