package tests;

import base.AbstractBaseTest;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaLoginPageHelper;
import pages.SteamUaMobilePageHelper;

import static utils.Constants.*;

public class SteamAddAPhoneNumberToYourSteamAccountTest extends AbstractBaseTest {
    @Test
    public void addAPhoneNumberToYourSteamAccountTest(){
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaLoginPageHelper steamUaLoginPageHelper = new SteamUaLoginPageHelper(driver);
        SteamUaMobilePageHelper steamUaMobilePageHelper = new SteamUaMobilePageHelper(driver);

        openUrl("https://store.steampowered.com/");
        steamUaHomePageHelper.openLoginWindow();
        steamUaLoginPageHelper.clickOnSteamMobileAppLinkButton();
        steamUaMobilePageHelper.clickOnAddNumberButtonLink();
        steamUaLoginPageHelper.clickOnLoginButton();

        Assertions.assertThat(getUrl()).isEqualTo(ADD_NUMBER_URl);
    }
}
