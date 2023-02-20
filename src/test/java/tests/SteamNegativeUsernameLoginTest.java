package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import utils.DataProviderCredentials;

import static utils.Constants.ERROR_MESSAGE_COLOR;
import static utils.Constants.STEAM_URL;

public class SteamNegativeUsernameLoginTest extends AbstractBaseTest {
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
