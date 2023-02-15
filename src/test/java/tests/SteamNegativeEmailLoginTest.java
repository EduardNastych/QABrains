package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import utils.DataProviderSteamNegativeEmailLogin;

import static utils.Constants.LOGIN_INPUTS_BORDER_LINE_COLOR;

public class SteamNegativeEmailLoginTest extends AbstractBaseTest {

    @Test(dataProvider = "randomUserDataLogin", dataProviderClass = DataProviderSteamNegativeEmailLogin.class)
    public void negativeEmailLoginTest(String mail, String password) {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);

        openUrl("https://store.steampowered.com/");
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.makeLogin(mail, password);
        steamUaLoginPageHelper.clickOnLoginButton();
        steamUaLoginPageHelper.setLoginColor();

        Assert.assertEquals(LOGIN_INPUTS_BORDER_LINE_COLOR, steamUaLoginPageHelper.getLoginColor());
    }
}
