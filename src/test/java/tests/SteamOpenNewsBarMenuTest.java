package tests;

import base.AbstractBaseTest;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaNewsBarMenuPageHelper;

import static utils.Constants.STEAM_URL;

public class SteamOpenNewsBarMenuTest extends AbstractBaseTest {
    @Test
    public void openNewsBarMenu() {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaNewsBarMenuPageHelper steamUaNewsBarMenuPageHelper = new SteamUaNewsBarMenuPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.moveCursorToNewsBarMenu();
        steamUaNewsBarMenuPageHelper.clickOnNewsBarMenu();
        //steamUaNewsBarMenuPageHelper.clickOnInputFieldForSearch();
        steamUaNewsBarMenuPageHelper.writeOnInputFieldForSearch();

        // Assertions.assertThat(getUrl()).isEqualTo("https://store.steampowered.com/news/");
    }
}