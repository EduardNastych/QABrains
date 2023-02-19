package pages;

import org.openqa.selenium.WebDriver;


public class SteamUaNewsBarMenuPageHelper extends SteamUaNewsBarMenuPageElements {
    public SteamUaNewsBarMenuPageHelper(WebDriver driver) {
        super(driver);
    }

    public SteamUaNewsBarMenuPageHelper clickOnNewsBarMenu() {
        getNewsBarMenu().click();
        return this;
    }

    public SteamUaNewsBarMenuPageHelper writeOnInputFieldForSearch(String gameName) {
        getInputFieldForSearch().sendKeys(gameName);
        return this;
    }

    private String gameName;

    public void setGameName() {
        this.gameName = getDropDownSearchResult().get(1).getText();
    }

    public String getGameName() {
        return gameName;
    }

}
