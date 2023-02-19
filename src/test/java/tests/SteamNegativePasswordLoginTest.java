package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import utils.data_providers.DataProviderSteamNegativePasswordLogin;

import static utils.Constants.LOGIN_INPUTS_BORDER_LINE_COLOR;
import static utils.Constants.STEAM_URL;

public class SteamNegativePasswordLoginTest extends AbstractBaseTest {
    @Test(priority = 4, dataProvider = "randomUserDataLogin", dataProviderClass = DataProviderSteamNegativePasswordLogin.class)
    public void negativeLoginTestWithInvalidLogin(String username, String password) {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.makeLogin(username, password);
        steamUaLoginPageHelper.clickOnLoginButton();
        steamUaLoginPageHelper.setPasswordColor();

        Assert.assertEquals(LOGIN_INPUTS_BORDER_LINE_COLOR, steamUaLoginPageHelper.getPasswordColor());
    }
}
