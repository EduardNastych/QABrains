package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Owner;
import org.assertj.core.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import pages.SteamUaClickSpecialsHelper;

import static utils.Constants.KOLYA;
import static utils.Constants.STEAM_URL;

public class SteamUaClickSpecialsTest extends AbstractBaseTest {
    @Owner(KOLYA)
    @Test
    public void clickSpecialsTest() {
        SteamUaClickSpecialsHelper steamUaClickSpecialsHelper = new SteamUaClickSpecialsHelper(driver);

        openUrl(STEAM_URL);
        steamUaClickSpecialsHelper.clickOnSpecialsButton();
        steamUaClickSpecialsHelper.clickOnListButtonSortByTrigger();
        steamUaClickSpecialsHelper.clickOnButtonSortByDate();

        Assert.assertTrue(steamUaClickSpecialsHelper.getButtonSetingsOnSpecialPage().isDisplayed(), "Settings button is not display");

    }

}
