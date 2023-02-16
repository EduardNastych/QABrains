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

    public SteamUaNewsBarMenuPageHelper clickOnInputFieldForSearch() {
        getInputFieldForSearch().click();
        return this;
    }

    public SteamUaNewsBarMenuPageHelper writeOnInputFieldForSearch() {
        getInputFieldForSearch().sendKeys("DayZ");
        return this;
    }
}
