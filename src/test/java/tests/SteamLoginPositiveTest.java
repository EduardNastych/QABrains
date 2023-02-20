package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Owner;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import utils.DataProviderCredentials;

import static utils.Constants.*;

public class SteamLoginPositiveTest extends AbstractBaseTest {
    @Owner(EDUARD)
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
