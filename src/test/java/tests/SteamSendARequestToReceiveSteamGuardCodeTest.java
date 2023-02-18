package tests;

import base.AbstractBasePage;
import base.AbstractBaseTest;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static utils.Constants.NOT_RECEIVE_CODE_PAGE_URL;
import static utils.Constants.STEAM_URL;

public class SteamSendARequestToReceiveSteamGuardCodeTest extends AbstractBaseTest {
    @Test
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
        steamUaHelpWithLoginInfoPageHelper.clickOnSearchButton();
        steamUaHelpWithLoginInfoPageHelper.setCaptchaColor();

        Assertions.assertThat(getUrl()).isEqualTo(NOT_RECEIVE_CODE_PAGE_URL);
        Assert.assertTrue(steamUaHelpWithLoginInfoPageHelper.getHelpErrorMessage().isDisplayed());
    }
}
