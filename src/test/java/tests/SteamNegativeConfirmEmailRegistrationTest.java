package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaRegistrationPageHelper;

import static utils.Constants.STEAM_URL;

public class SteamNegativeConfirmEmailRegistrationTest extends AbstractBaseTest {
    @Test
    public void negativeConfirmEmailRegistrationTest() {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaRegistrationPageHelper steamUaRegistrationPageHelper = new SteamUaRegistrationPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaRegistrationPageHelper.clickOnJoinToSteamButton();
        steamUaRegistrationPageHelper.writeValidEmail();
        steamUaRegistrationPageHelper.writeValidEmailInReenter();
        steamUaRegistrationPageHelper.clickOnContinueButton();

        Assert.assertTrue(steamUaRegistrationPageHelper.getErrorDisplay().isDisplayed(), "Error display is visible");
    }
}
