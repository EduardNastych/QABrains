package pages;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SteamNegativeIAgreeCheckMarkRegistrationTest extends AbstractBaseTest {
    @Test
    public void negativeIAgreeCheckMarkRegistrationTest(){
        SteamUaHomePageHelper steamUaHomePageHelper=new SteamUaHomePageHelper(driver);
        SteamUaRegistrationPageHelper steamUaRegistrationPageHelper=new SteamUaRegistrationPageHelper(driver);




        openUrl("https://store.steampowered.com/");
        steamUaHomePageHelper.openLoginWindow();
        steamUaRegistrationPageHelper.clickOnJoinToSteamButton();
        steamUaRegistrationPageHelper.writeValidEmail();
        steamUaRegistrationPageHelper.writeValidEmailInReenter();
        steamUaRegistrationPageHelper.clickOnIAgreeCheckMark();
        steamUaRegistrationPageHelper.clickOnContinueButton();



        Assert.assertTrue(steamUaRegistrationPageHelper.getErrorDisplay().isDisplayed(), "Error display is visible");

    }
}
