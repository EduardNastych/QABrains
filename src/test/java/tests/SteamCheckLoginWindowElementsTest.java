package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;

import static utils.Constants.*;

public class SteamCheckLoginWindowElementsTest extends AbstractBaseTest {
    @Test
    public void checkLoginWindowElementsTest() {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);
        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();

        Assert.assertTrue(true, LOGIN_INPUT);
        Assert.assertTrue(true, PASSWORD_INPUT);
        Assert.assertTrue(true, REMEMBER_ME_CHECK_BOX);
        steamUaLoginPageHelper.moveToRememberMeCheckBox();
        Assert.assertTrue(true, POP_UP_NOTIFICATION);
        Assert.assertTrue(true, LOGIN_BUTTON);
        Assert.assertTrue(true, HELP_I_CANT_SIGN_IN_LINK_BUTTON);
        Assert.assertTrue(true, STEAM_MOBILE_APP_LINK_BUTTON);
    }
}
