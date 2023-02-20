package tests;

import base.AbstractBaseTest;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.SteamUaViewHelper;

import static utils.Constants.*;

public class SteamCheckViewBottomElementsTest extends AbstractBaseTest {
    @Test(priority = 7)
    public void checkViewBottomElementsTest() {
        SteamUaViewHelper steamUaViewHelper = new SteamUaViewHelper(driver);
        openUrl(STEAM_URL);
        scrollToElement(steamUaViewHelper.getValveLogoIcon());

        Assert.assertTrue(steamUaViewHelper.getValveLogoIcon().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getPrivatePolicyLinkButton().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getLegalLinkButton().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getSteamSubscriberAgreementLinkButton().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getRefuceLinkButton().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getCookiesLinkButton().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getAboutValveLinkButton().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getJobsLinkButton().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getSteamWorksLinkButton().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getSteamDistributionLinkButton().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getSupportLinkButton().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getGiftCardsLinkButton().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getFacebookLinkButton().isDisplayed());
        Assert.assertTrue(steamUaViewHelper.getTwitterLinkButton().isDisplayed());
    }
}
