package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;

public class SteamNegativeEmailLoginTest extends AbstractBaseTest {

    @Test
    public void negativeEmailLoginTest() {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);

        openUrl("https://store.steampowered.com/");
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.writeValidUsername();
        steamUaLoginPageHelper.writeValidPassword();
        steamUaLoginPageHelper.clickOnLoginButton();

        Assert.assertTrue(steamUaLoginPageHelper.getPopupNotification().isDisplayed(), "Pop-up notification isn`t visible");
        
    }
}
