package tests;

import base.AbstractBaseTest;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SteamUaActionCategoryPageHelper;
import pages.SteamUaHomePageHelper;

public class SteamOpenCategoryActionTest extends AbstractBaseTest {
    @Test
    public void openActionCategoryTest() {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaActionCategoryPageHelper steamUaActionCategoryPageHelper = new SteamUaActionCategoryPageHelper(driver);

        openUrl("https://store.steampowered.com/");
        steamUaHomePageHelper.moveCursorToCategoryAction();
        steamUaActionCategoryPageHelper.clickOnCategoryActionAdventure();

        Assertions.assertThat(getUrl()).isEqualTo("https://store.steampowered.com/category/action/?tab=2");
    }
}
