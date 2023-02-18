package tests;

import base.AbstractBaseTest;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.data_providers.DataProviderSteamValidEmail;

import static utils.Constants.*;

public class SteamSendARequestToReceiveStolenAccountTest extends AbstractBaseTest {
    @Test(priority = 10, dataProvider = "randomUserDataLogin", dataProviderClass = DataProviderSteamValidEmail.class)
    public void sendARequestToReceiveStolenAccountTest(String email){
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);
        SteamUaSupportPageHelper steamUaSupportPageHelper = new SteamUaSupportPageHelper(driver);
        SteamUaHelpWithAccountStolenPageHelper steamUaHelpWithAccountStolenPageHelper = new SteamUaHelpWithAccountStolenPageHelper(driver);
        SteamUaHelpWithLoginInfoPageHelper steamUaHelpWithLoginInfoPageHelper = new SteamUaHelpWithLoginInfoPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.clickOnHelpLinkButton();
        steamUaSupportPageHelper.clickOnStolenAccountLinkButton();
        steamUaHelpWithAccountStolenPageHelper.ClickOnResetPasswordButton();
        steamUaHelpWithLoginInfoPageHelper.writeValidEmail(email);
        steamUaHelpWithLoginInfoPageHelper.clickOnSearchButton();
        steamUaHelpWithLoginInfoPageHelper.setCaptchaColor();

        Assertions.assertThat(getUrl()).isEqualTo(RECEIVE_STOLEN_ACCOUNT_PAGE_URL);
        Assert.assertEquals(HELP_ERROR_MESSAGE_BORDER_LINE_COLOR, steamUaHelpWithLoginInfoPageHelper.getCaptchaColor());
    }
}
