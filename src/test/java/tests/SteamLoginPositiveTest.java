package tests;

import base.AbstractBaseTest;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import utils.data_providers.DataProviderSteamPositiveData;

import static utils.Constants.AUTHORIZATION_PAGE_URL;
import static utils.Constants.STEAM_URL;

public class SteamLoginPositiveTest extends AbstractBaseTest {
    @Test(dataProvider = "randomUserDataLogin", dataProviderClass = DataProviderSteamPositiveData.class)
    public void positiveLoginTest(String username, String password) {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.makeLogin(username, password);
        steamUaLoginPageHelper.clickOnLoginButton();

        Assertions.assertThat(getUrl()).isEqualTo(AUTHORIZATION_PAGE_URL);
    }
}
