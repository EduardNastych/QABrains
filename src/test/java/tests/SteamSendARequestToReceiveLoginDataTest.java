package tests;

import base.AbstractBaseTest;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHelpWithLoginInfoPageHelper;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import pages.SteamUaSupportPageHelper;
import utils.DataProviderSteamValidEmail;

import static utils.Constants.FORGOT_LOGIN_DATA_PAGE_URL;

public class SteamSendARequestToReceiveLoginDataTest extends AbstractBaseTest {
    @Test(dataProvider = "randomUserDataLogin", dataProviderClass = DataProviderSteamValidEmail.class)
    public void sendARequestToReceiveLoginDataTest(String email){
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);
        SteamUaSupportPageHelper steamUaSupportPageHelper = new SteamUaSupportPageHelper(driver);
        SteamUaHelpWithLoginInfoPageHelper steamUaHelpWithLoginInfoPageHelper = new SteamUaHelpWithLoginInfoPageHelper(driver);

        openUrl("https://store.steampowered.com/");
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.clickOnHelpLinkButton();
        steamUaSupportPageHelper.clickOnForgotLoginDataLinkButton();
        steamUaHelpWithLoginInfoPageHelper.writeValidEmail(email);
        steamUaHelpWithLoginInfoPageHelper.clickOnSearchButton();

        Assertions.assertThat(getUrl()).isEqualTo(FORGOT_LOGIN_DATA_PAGE_URL);
        Assert.assertTrue(steamUaHelpWithLoginInfoPageHelper.getCaptchaErrorMessage().isDisplayed());
    }
}
