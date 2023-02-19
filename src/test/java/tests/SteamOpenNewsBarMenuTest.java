package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaNewsAppPageHelper;
import pages.SteamUaNewsBarMenuPageHelper;


public class SteamOpenNewsBarMenuTest extends AbstractBaseTest {
    @Test
    public void openNewsBarMenu() {
        SteamUaNewsBarMenuPageHelper steamUaNewsBarMenuPageHelper = new SteamUaNewsBarMenuPageHelper(driver);
        SteamUaNewsAppPageHelper steamUaNewsAppPageHelper = new SteamUaNewsAppPageHelper(driver);

        String nameOfGame = "DayZ";

        openUrl("https://store.steampowered.com/");
        steamUaNewsBarMenuPageHelper.clickOnNewsBarMenu();
        steamUaNewsBarMenuPageHelper.writeOnInputFieldForSearch(nameOfGame);
        steamUaNewsBarMenuPageHelper.setGameName();
        steamUaNewsBarMenuPageHelper.getDropDownSearchResult().get(1).click();

        Assert.assertTrue(steamUaNewsAppPageHelper.getTextGameDayz(steamUaNewsBarMenuPageHelper.getGameName()).isDisplayed());

    }

}