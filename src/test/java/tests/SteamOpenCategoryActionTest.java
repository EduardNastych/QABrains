package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Owner;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SteamUaActionCategoryPageHelper;
import pages.SteamUaHomePageHelper;

import static utils.Constants.KOLYA;
import static utils.Constants.STEAM_URL;

public class SteamOpenCategoryActionTest extends AbstractBaseTest {
    @Owner(KOLYA)
    @Test
    public void openActionCategoryTest() {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaActionCategoryPageHelper steamUaActionCategoryPageHelper = new SteamUaActionCategoryPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.moveCursorToCategoryAction();
        steamUaActionCategoryPageHelper.clickOnCategoryActionAdventure();

        Assertions.assertThat(getUrl()).isEqualTo("https://store.steampowered.com/category/action/?tab=2");
    }
}
