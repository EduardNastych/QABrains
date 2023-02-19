package tests;

import base.AbstractBaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SteamUaHomePageHelper;

public class SteamLanguageGermanPositiveTest extends AbstractBaseTest {
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
