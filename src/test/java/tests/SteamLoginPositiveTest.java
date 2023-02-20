package tests;

import base.AbstractBaseTest;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import utils.DataProviderCredentials;

import static utils.Constants.AUTHORIZATION_PAGE_URL;
import static utils.Constants.STEAM_URL;

public class SteamLoginPositiveTest extends AbstractBaseTest {
    @Test(priority = 1, dataProvider = "positiveUserData", dataProviderClass = DataProviderCredentials.class)
    public void positiveLoginTest(String username, String password) {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper
                .makeLogin(username, password)
                .clickOnLoginButton();

        Assertions.assertThat(getUrl()).isEqualTo(AUTHORIZATION_PAGE_URL);
    }
}
