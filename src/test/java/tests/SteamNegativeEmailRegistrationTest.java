package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaRegistrationPageHelper;

import static utils.Constants.STEAM_URL;

public class SteamNegativeEmailRegistrationTest extends AbstractBaseTest {
    @Test
    public void negativeEmailRegistrationTest() {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaRegistrationPageHelper steamUaRegistrationPageHelper = new SteamUaRegistrationPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaRegistrationPageHelper.clickOnJoinToSteamButton();
        steamUaRegistrationPageHelper.writeValidEmail();
        steamUaRegistrationPageHelper.clickOnContinueButton();

        Assert.assertTrue(steamUaRegistrationPageHelper.getErrorDisplay().isDisplayed(), "Error display is visible");
    }
}
