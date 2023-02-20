package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaNewsAppPageHelper;
import pages.SteamUaNewsBarMenuPageHelper;

import static utils.Constants.KOLYA;
import static utils.Constants.STEAM_URL;

public class SteamOpenNewsBarMenuTest extends AbstractBaseTest {
    @Owner(KOLYA)
    @Test
    public void openNewsBarMenu() {
        SteamUaNewsBarMenuPageHelper steamUaNewsBarMenuPageHelper = new SteamUaNewsBarMenuPageHelper(driver);
        SteamUaNewsAppPageHelper steamUaNewsAppPageHelper = new SteamUaNewsAppPageHelper(driver);

        String nameOfGame = "DayZ";

        openUrl(STEAM_URL);
        steamUaNewsBarMenuPageHelper.clickOnNewsBarMenu();
        steamUaNewsBarMenuPageHelper.writeOnInputFieldForSearch(nameOfGame);
        steamUaNewsBarMenuPageHelper.setGameName();
        steamUaNewsBarMenuPageHelper.getDropDownSearchResult().get(1).click();

        Assert.assertTrue(steamUaNewsAppPageHelper.getTextGameDayz(steamUaNewsBarMenuPageHelper.getGameName()).isDisplayed());

    }
}