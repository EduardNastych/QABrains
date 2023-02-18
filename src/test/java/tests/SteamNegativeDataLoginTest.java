package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import utils.data_providers.DataProviderSteamNegativeData;

import static utils.Constants.STEAM_URL;

public class SteamNegativeDataLoginTest extends AbstractBaseTest {
    @Test(dataProvider = "randomUserDataLogin", dataProviderClass = DataProviderSteamNegativeData.class)
    public void negativeLoginTestWithInvalidLogin(String username, String password) {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.makeLogin(username, password);
        steamUaLoginPageHelper.clickOnLoginButton();

        Assert.assertTrue(steamUaLoginPageHelper.getErrorMessage().isDisplayed());
    }
}
