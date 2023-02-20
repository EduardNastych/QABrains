package tests;

import base.AbstractBaseTest;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;

import static utils.Constants.MAKS;

public class SteamLanguageGermanPositiveTest extends AbstractBaseTest {
    @Owner(MAKS)
    @Test
    public void positiveLanguageTest(){ SteamUaHomePageHelper steamUaHomePageHelper=new SteamUaHomePageHelper(driver);

        openUrl("https://store.steampowered.com/");
        steamUaHomePageHelper.openLanguages();
        steamUaHomePageHelper.switchToGerman();
        String newsButtonGerman ="NEUERSCHEINUNGEN";
        steamUaHomePageHelper.waitUntilChangeLanguageFinish();

        Assert.assertEquals(steamUaHomePageHelper.getToNews().getText(),newsButtonGerman);








    }


}
