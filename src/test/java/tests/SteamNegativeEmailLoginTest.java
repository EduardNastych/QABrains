package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import utils.DataProviderCredentials;

import static utils.Constants.LOGIN_INPUTS_BORDER_LINE_COLOR;
import static utils.Constants.STEAM_URL;

public class SteamNegativeEmailLoginTest extends AbstractBaseTest {

    @Test(priority = 2, dataProvider = "negativeUserEmail", dataProviderClass = DataProviderCredentials.class)
    public void negativeEmailLoginTest(String mail, String password) {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper
                .makeLogin(mail, password)
                .clickOnLoginButton()
                .setLoginColor();

        Assert.assertEquals(LOGIN_INPUTS_BORDER_LINE_COLOR, steamUaLoginPageHelper.getLoginColor());
    }
}
