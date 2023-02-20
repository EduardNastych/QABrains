package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import utils.DataProviderCredentials;

import static utils.Constants.*;

public class SteamNegativeUsernameLoginTest extends AbstractBaseTest {
    @Owner(EDUARD)
    @Test(priority = 3, dataProvider = "negativeUserUsername", dataProviderClass = DataProviderCredentials.class)
    public void negativeLoginTestWithInvalidLogin(String username, String password) {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper
                .makeLogin(username, password)
                .clickOnLoginButton()
                .setErrorMessageColor();

        Assert.assertEquals(ERROR_MESSAGE_COLOR, steamUaLoginPageHelper.getErrorMessageColor());
    }
}
