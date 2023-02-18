package tests;

import base.AbstractBaseTest;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaViewHelper;

import static utils.Constants.*;

public class SteamCheckViewHeaderElementsTest extends AbstractBaseTest {
    @Test
    public void checkViewHeaderElementsTest() {
        SteamUaViewHelper steamUaViewHelper = new SteamUaViewHelper(driver);
        openUrl(STEAM_URL);

        Assert.assertTrue(STEAM_ICON, true);

        Assert.assertTrue(STORE_MENU_ITEM, true);
        steamUaViewHelper.moveToStoreMenuItem();
        Assert.assertTrue(HOME_SUBMENU_ITEM, true);
        Assert.assertTrue(DISCOVERY_QUEUE_SUBMENU_ITEM, true);
        Assert.assertTrue(WISHLIST_SUBMENU_ITEM, true);
        Assert.assertTrue(POINT_SHOP_SUBMENU_ITEM, true);
        Assert.assertTrue(NEWS_SUBMENU_ITEM, true);
        Assert.assertTrue(STATS_SUBMENU_ITEM, true);

        Assert.assertTrue(COMMUNITY_MENU_ITEM, true);
        steamUaViewHelper.moveToCommunityMenuItem();
        Assert.assertTrue(ANOTHER_HOME_SUBMENU_ITEM, true);
        Assert.assertTrue(DISCUSSIONS_SUBMENU_ITEM, true);
        Assert.assertTrue(WORKSHOP_SUBMENU_ITEM, true);
        Assert.assertTrue(MARKET_SUBMENU_ITEM, true);
        Assert.assertTrue(BROADCAST_SUBMENU_ITEM, true);

        Assert.assertTrue(ABOUT_MENU_ITEM, true);
        Assert.assertTrue(SUPPORT_MENU_ITEM, true);
        Assert.assertTrue(INSTALL_STEAM_BUTTON, true);
        Assert.assertTrue(LOGIN_LINK_BUTTON, true);
        Assert.assertTrue(LANGUAGE_PULL_DOWN_LINK, true);
    }
}
