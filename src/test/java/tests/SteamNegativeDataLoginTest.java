package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import utils.DataProviderCredentials;

import static utils.Constants.EDUARD;
import static utils.Constants.STEAM_URL;

public class SteamNegativeDataLoginTest extends AbstractBaseTest {
    @Owner(EDUARD)
    @Test(priority = 5, dataProvider = "negativeUserData", dataProviderClass = DataProviderCredentials.class)
    public void negativeLoginTestWithInvalidLogin(String username, String password) {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper
                .makeLogin(username, password)
                .clickOnLoginButton();

        Assert.assertTrue(steamUaLoginPageHelper.getErrorMessage().isDisplayed());
    }
}
