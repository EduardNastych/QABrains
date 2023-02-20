package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;

import static utils.Constants.*;

public class SteamCheckLoginWindowElementsTest extends AbstractBaseTest {
    @Owner(EDUARD)
    @Test(priority = 8)
    public void checkLoginWindowElementsTest() {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();

        Assert.assertTrue(steamUaLoginPageHelper.getLoginInput().isDisplayed());
        Assert.assertTrue(steamUaLoginPageHelper.getPasswordInput().isDisplayed());
        Assert.assertTrue(steamUaLoginPageHelper.getRememberMeCheckBox().isDisplayed());
        steamUaLoginPageHelper.moveToRememberMeCheckBox();
        Assert.assertTrue(steamUaLoginPageHelper.getPopUpNotification().isDisplayed());
        Assert.assertTrue(steamUaLoginPageHelper.getLoginButton().isDisplayed());
        Assert.assertTrue(steamUaLoginPageHelper.getHelpLinkButton().isDisplayed());
        Assert.assertTrue(steamUaLoginPageHelper.getSteamMobileAppLinkButton().isDisplayed());
    }
}
