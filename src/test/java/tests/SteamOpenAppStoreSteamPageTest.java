package tests;

import base.AbstractBaseTest;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import pages.SteamUaMobilePageHelper;

import static utils.Constants.APP_STORE_STEAM_PAGE_URL;

public class SteamOpenAppStoreSteamPageTest extends AbstractBaseTest {
    @Test
    public void openAppStoreSteamPageTest(){
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);
        SteamUaMobilePageHelper steamUaMobilePageHelper = new SteamUaMobilePageHelper(driver);

        openUrl("https://store.steampowered.com/");
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.clickOnSteamMobileAppLinkButton();
        steamUaMobilePageHelper.clickOnAppStoreLogo();

        Assertions.assertThat(getUrl()).isNotEqualTo(APP_STORE_STEAM_PAGE_URL);
    }
}
