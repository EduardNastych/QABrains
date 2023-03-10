package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Owner;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import pages.SteamUaMobilePageHelper;

import static utils.Constants.*;

public class SteamSwitchPageToLoginPageTest extends AbstractBaseTest {
    @Owner(EDUARD)
    @Test
    public void switchPageToLoginPageTest(){
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);
        SteamUaMobilePageHelper steamUaMobilePageHelper = new SteamUaMobilePageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.clickOnSteamMobileAppLinkButton();
        steamUaMobilePageHelper.clickOnAddNumberButtonLink();
        steamUaLoginPageHelper.clickOnLoginButton();

        Assertions.assertThat(getUrl()).isEqualTo(ADD_NUMBER_URl);
    }
}
