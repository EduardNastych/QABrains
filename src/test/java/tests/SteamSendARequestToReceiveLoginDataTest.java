package tests;

import base.AbstractBaseTest;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHelpWithLoginInfoPageHelper;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import pages.SteamUaSupportPageHelper;
import utils.DataProviderCredentials;

import static utils.Constants.FORGOT_LOGIN_DATA_PAGE_URL;
import static utils.Constants.STEAM_URL;

public class SteamSendARequestToReceiveLoginDataTest extends AbstractBaseTest {
    @Test(priority = 9, dataProvider = "positiveUserEmail", dataProviderClass = DataProviderCredentials.class)
    public void sendARequestToReceiveLoginDataTest(String email){
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);
        SteamUaSupportPageHelper steamUaSupportPageHelper = new SteamUaSupportPageHelper(driver);
        SteamUaHelpWithLoginInfoPageHelper steamUaHelpWithLoginInfoPageHelper = new SteamUaHelpWithLoginInfoPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.clickOnHelpLinkButton();
        steamUaSupportPageHelper.clickOnForgotLoginDataLinkButton();
        steamUaHelpWithLoginInfoPageHelper
                .writeValidEmail(email)
                .clickOnSearchButton();

        Assertions.assertThat(getUrl()).isEqualTo(FORGOT_LOGIN_DATA_PAGE_URL);
        Assert.assertTrue(steamUaHelpWithLoginInfoPageHelper.getCaptchaErrorMessage().isDisplayed());
    }
}
