package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaActionCategoryPageHelper extends SteamUaActionCategoryPageElements {

    public SteamUaActionCategoryPageHelper(WebDriver driver) {
        super(driver);
    }

    public SteamUaActionCategoryPageHelper clickOnCategoryActionAdventure() {
        getActionAdventureCategory().click();
        return this;
    }

}
