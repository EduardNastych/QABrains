package tests;

import base.AbstractBaseTest;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import pages.SteamUaMobilePageHelper;

import static utils.Constants.*;

public class SteamDoNotOpenAppStoreSteamPageTest extends AbstractBaseTest {
    @Test
    public void doNotOpenAppStoreSteamPageTest(){
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);
        SteamUaMobilePageHelper steamUaMobilePageHelper = new SteamUaMobilePageHelper(driver);

        openUrl("https://store.steampowered.com/");
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.clickOnSteamMobileAppLinkButton();
        steamUaMobilePageHelper.clickOnAppStoreLogo();

        Assertions.assertThat(getUrl()).isEqualTo(MOBILE_STEAM_PAGE_STEAM_PAGE_URL);
    }
}
