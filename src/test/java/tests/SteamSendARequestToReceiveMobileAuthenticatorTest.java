package tests;

import base.AbstractBaseTest;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static utils.Constants.*;

public class SteamSendARequestToReceiveMobileAuthenticatorTest extends AbstractBaseTest {
    @Test(priority = 12)
    public void sendARequestToReceiveMobileAuthenticatorTest() {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);
        SteamUaSupportPageHelper steamUaSupportPageHelper = new SteamUaSupportPageHelper(driver);
        SteamUaHelpWithLoginInfoPageHelper steamUaHelpWithLoginInfoPageHelper = new SteamUaHelpWithLoginInfoPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.clickOnHelpLinkButton();
        steamUaSupportPageHelper.clickOnLostAuthenticatorDataLinkButton();
        steamUaHelpWithLoginInfoPageHelper.clickOnSearchButton();
        steamUaHelpWithLoginInfoPageHelper.setMessageColor();

        Assertions.assertThat(getUrl()).isEqualTo(LOST_AUTHENTICATOR_PAGE_URL);
        Assert.assertEquals(HELP_ERROR_MESSAGE_BORDER_LINE_COLOR, steamUaHelpWithLoginInfoPageHelper.getMessageColor());
    }
}
