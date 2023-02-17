package tests;

import base.AbstractBaseTest;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.SteamUaViewHelper;

import static utils.Constants.*;

public class SteamCheckViewBottomElementsTest extends AbstractBaseTest {
    @Test
    public void checkViewBottomElementsTest() {
        SteamUaViewHelper steamUaViewHelper = new SteamUaViewHelper(driver);
        openUrl("https://store.steampowered.com/");
        scrollToElement(steamUaViewHelper.getValveLogoIcon());

        Assert.assertTrue(VALVE_LOGO_ICON, true);
        Assert.assertTrue(PRIVATE_POLICY_LINK_BUTTON, true);
        Assert.assertTrue(LEGAL_LINK_BUTTON, true);
        Assert.assertTrue(STEAM_SUBSCRIBER_AGREEMENT_LINK_BUTTON, true);
        Assert.assertTrue(REFUSE_LINK_BUTTON, true);
        Assert.assertTrue(COOKIES_LINK_BUTTON, true);
        Assert.assertTrue(ABOUT_VALVE_LINK_BUTTON, true);
        Assert.assertTrue(JOBS_LINK_BUTTON, true);
        Assert.assertTrue(STEAMWORKS_LINK_BUTTON, true);
        Assert.assertTrue(STEAM_DISTRIBUTION_LINK_BUTTON, true);
        Assert.assertTrue(SUPPORT_LINK_BUTTON, true);
        Assert.assertTrue(GIFT_CARD_LINK_BUTTON, true);
        Assert.assertTrue(FACEBOOK_LINK_BUTTON, true);
        Assert.assertTrue(TWITTER_LINK_BUTTON, true);
    }
}
