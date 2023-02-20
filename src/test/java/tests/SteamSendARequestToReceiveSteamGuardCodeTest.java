package tests;

import base.AbstractBasePage;
import base.AbstractBaseTest;
import io.qameta.allure.Owner;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static utils.Constants.*;

public class SteamSendARequestToReceiveSteamGuardCodeTest extends AbstractBaseTest {
    @Owner(EDUARD)
    @Test(priority = 11)
    public void sendARequestToReceiveSteamGuardCodeTest() {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);
        SteamUaSupportPageHelper steamUaSupportPageHelper = new SteamUaSupportPageHelper(driver);
        SteamUaHelpWithSteamGuardCodePageHelper steamUaHelpWithSteamGuardCodePageHelper = new SteamUaHelpWithSteamGuardCodePageHelper(driver);
        SteamUaHelpWithLoginInfoPageHelper steamUaHelpWithLoginInfoPageHelper = new SteamUaHelpWithLoginInfoPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.clickOnHelpLinkButton();
        steamUaSupportPageHelper.clickOnNotReceivingCodeLinkButton();
        steamUaHelpWithSteamGuardCodePageHelper.clickOnVerifyAndUpdateEmailButton();
        steamUaHelpWithLoginInfoPageHelper
                .clickOnSearchButton()
                .setCaptchaColor();

        Assertions.assertThat(getUrl()).isEqualTo(NOT_RECEIVE_CODE_PAGE_URL);
        Assert.assertTrue(steamUaHelpWithLoginInfoPageHelper.getHelpErrorMessage().isDisplayed());
    }
}
