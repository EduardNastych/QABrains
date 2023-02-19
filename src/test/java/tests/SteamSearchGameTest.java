package tests;

import base.AbstractBasePage;
import base.AbstractBaseTest;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaNewsBarMenuPageHelper;
import pages.SteamUaSearchGameHelper;

import static utils.Constants.RECEIVE_STOLEN_ACCOUNT_PAGE_URL;
import static utils.Constants.STEAM_URL;

public class SteamSearchGameTest extends AbstractBaseTest {

    @Test
    public void searchGameInInputField() {

        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaSearchGameHelper steamUaSearchGameHelper = new SteamUaSearchGameHelper(driver);

        openUrl(STEAM_URL);
        steamUaSearchGameHelper.writeNameOfGame();
        steamUaSearchGameHelper.clickOnSearchButtonOfGame();

       // Assert.assertTrue(steamUaSearchGameHelper.visibleCounterStrikeGame().getVisibleCounterStrike().isDisplayed());
    }
}
