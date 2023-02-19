package tests;

import base.AbstractBaseTest;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.SteamUaClickSpecialsHelper;
import static utils.Constants.STEAM_URL;

public class SteamUaClickSpecialsTest extends AbstractBaseTest {

    @Test
    public void clickSpecialsTest() {
        SteamUaClickSpecialsHelper steamUaClickSpecialsHelper = new SteamUaClickSpecialsHelper(driver);

        openUrl(STEAM_URL);
        steamUaClickSpecialsHelper.clickOnSpecialsButton();
        steamUaClickSpecialsHelper.clickOnListButtonSortByTrigger();
        steamUaClickSpecialsHelper.clickOnButtonSortByDate();

        Assertions.assertThat(getUrl()).isEqualTo("https://store.steampowered.com/search/?sort_by=Released_DESC&supportedlang=ukrainian&specials=1&ndl=1");
    }

}
