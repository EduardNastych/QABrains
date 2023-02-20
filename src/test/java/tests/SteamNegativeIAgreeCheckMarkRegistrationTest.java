package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;
import pages.SteamUaRegistrationPageHelper;

import static utils.Constants.MAKS;
import static utils.Constants.STEAM_URL;

public class SteamNegativeIAgreeCheckMarkRegistrationTest extends AbstractBaseTest {
    @Owner(MAKS)
    @Test
    public void negativeIAgreeCheckMarkRegistrationTest() {
        SteamUaHomePageHelper steamUaHomePageHelper = new SteamUaHomePageHelper(driver);
        SteamUaRegistrationPageHelper steamUaRegistrationPageHelper = new SteamUaRegistrationPageHelper(driver);

        openUrl(STEAM_URL);
        steamUaHomePageHelper.openLoginWindow();
        steamUaRegistrationPageHelper.clickOnJoinToSteamButton();
        steamUaRegistrationPageHelper.writeValidEmail();
        steamUaRegistrationPageHelper.writeValidEmailInReenter();
        steamUaRegistrationPageHelper.clickOnIAgreeCheckMark();
        steamUaRegistrationPageHelper.clickOnContinueButton();

        Assert.assertTrue(steamUaRegistrationPageHelper.getErrorDisplay().isDisplayed(), "Error display is visible");
    }
}
