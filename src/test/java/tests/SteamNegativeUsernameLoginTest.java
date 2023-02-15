package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import utils.DataProviderSteamNegativeUsernameLoginTest;

public class SteamNegativeUsernameLoginTest extends AbstractBaseTest {
    @Test(dataProvider = "randomUserDataLogin", dataProviderClass = DataProviderSteamNegativeUsernameLoginTest.class)
    public void negativeLoginTestWithInvalidLogin(String username, String password) {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);

        openUrl("https://store.steampowered.com/");
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.makeLogin(username, password);
        steamUaLoginPageHelper.clickOnLoginButton();

        Assert.assertTrue(steamUaLoginPageHelper.getPopupNotification().isDisplayed(), "Pop-up notification isn`t visible");
    }
}