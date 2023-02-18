package tests;

import base.AbstractBaseTest;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import pages.SteamUaMobilePageHelper;

import static utils.Constants.*;

public class SteamDoNotSwitchPageToAppStoreSteamPageTest extends AbstractBaseTest {
    @Test(priority = 1)
    public void doNotSwitchPageToAppStoreSteamPageTest(){
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);
        SteamUaMobilePageHelper steamUaMobilePageHelper = new SteamUaMobilePageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.clickOnSteamMobileAppLinkButton();
        steamUaMobilePageHelper.clickOnAppStoreLogo();

        Assertions.assertThat(getUrl()).isEqualTo(LOGIN_PAGE_URL);
    }
}
