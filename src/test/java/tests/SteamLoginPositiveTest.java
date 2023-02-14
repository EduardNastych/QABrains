package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;

public class SteamLoginPositiveTest extends AbstractBaseTest {
    @Test(priority = 1, groups = { "positiveTests", "smokeTests" })
    public void positiveLoginTest() {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);

        openUrl("https://store.steampowered.com/");
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.writeValidUsername();
        steamUaLoginPageHelper.writeValidPassword();
        steamUaLoginPageHelper.clickOnLoginButton();

        String expectedURL = "https://store.steampowered.com/login/?redir=&redir_ssl=1&snr=1_4_4__global-header";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL, "The required page don`t open");
    }
}
