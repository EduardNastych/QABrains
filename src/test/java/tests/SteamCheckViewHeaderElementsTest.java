package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Owner;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaViewHelper;

import static utils.Constants.*;

public class SteamCheckViewHeaderElementsTest extends AbstractBaseTest {
    @Owner(EDUARD)
    @Test(priority = 6)
    public void checkViewHeaderElementsTest() {
        SteamUaViewHelper steamUaViewHelper = new SteamUaViewHelper(driver);

        openUrl(STEAM_URL);

        Assert.assertTrue(steamUaViewHelper.getSteamIcon().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getStoreMenuItem().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getCommunityMenuItem().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getAboutMenuItem().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getSupportMenuItem().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getInstallSteamButton().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getLoginLinkButton().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getLanguagePullDownLink().isDisplayed());
    }
}
