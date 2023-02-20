package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaViewElements extends AbstractBasePage {
    public SteamUaViewElements(WebDriver driver) {
        super(driver);
    }
    private static final String STEAM_ICON = "//img[@src='https://store.cloudflare.steamstatic.com/public/shared/images/header/logo_steam.svg?t=962016']";
    private static final String STORE_MENU_ITEM = "(//a[contains(text(),'Крамниця')])[1]";
    private static final String COMMUNITY_MENU_ITEM = "//a[contains(text(),'СПІЛЬНОТА')]";
    private static final String ABOUT_MENU_ITEM = "//a[contains(text(),'ПРО STEAM')]";
    private static final String SUPPORT_MENU_ITEM = "//a[contains(text(),'ПІДТРИМКА')]";
    private static final String INSTALL_STEAM_BUTTON = "//a[contains(text(),'Інсталювати Steam')]";
    private static final String LOGIN_LINK_BUTTON = "//a[contains(text(),'увійти')]";
    private static final String LANGUAGE_PULL_DOWN_LINK = "//span[contains(text(),'мова')]";
    private static final String VALVE_LOGO_ICON = "(//img[@alt='Valve Software'])[1]";
    private static final String PRIVATE_POLICY_LINK_BUTTON = "//a[@href='https://store.steampowered.com/privacy_agreement/?snr=1_44_44_']";
    private static final String LEGAL_LINK_BUTTON = "//a[@href='https://store.steampowered.com/legal/?snr=1_44_44_']";
    private static final String STEAM_SUBSCRIBER_AGREEMENT_LINK_BUTTON = "//a[@href='https://store.steampowered.com/subscriber_agreement/?snr=1_44_44_']";
    private static final String REFUSE_LINK_BUTTON = "//a[@href='https://store.steampowered.com/account/cookiepreferences/?snr=1_44_44_']";
    private static final String COOKIES_LINK_BUTTON = "(//a[contains(text(),'Файли cookie')])[1]";
    private static final String ABOUT_VALVE_LINK_BUTTON = "//a[contains(text(),'Про Valve')]";
    private static final String JOBS_LINK_BUTTON = "//a[contains(text(),'Вакансії')]";
    private static final String STEAMWORKS_LINK_BUTTON = "//a[contains(text(),'Steamworks')]";
    private static final String STEAM_DISTRIBUTION_LINK_BUTTON = "//a[contains(text(),'Видання у Steam')]";
    public WebElement getSteamIcon() {
        return waitUntilElementToBeClickable(STEAM_ICON);
    }
    public WebElement getStoreMenuItem() {
        return waitUntilElementToBeClickable(STORE_MENU_ITEM);
    }
    public WebElement getCommunityMenuItem() {
        return waitUntilElementToBeClickable(COMMUNITY_MENU_ITEM);
    }

    public WebElement getAboutMenuItem() {
        return waitUntilElementToBeClickable(ABOUT_MENU_ITEM);
    }
    public WebElement getSupportMenuItem() {
        return waitUntilElementToBeClickable(SUPPORT_MENU_ITEM);
    }
    public WebElement getInstallSteamButton() {
        return waitUntilElementToBeClickable(INSTALL_STEAM_BUTTON);
    }
    public WebElement getLoginLinkButton() {
        return waitUntilElementToBeClickable(LOGIN_LINK_BUTTON);
    }
    public WebElement getLanguagePullDownLink() {
        return waitUntilElementToBeClickable(LANGUAGE_PULL_DOWN_LINK);
    }
    public WebElement getValveLogoIcon() {
        return waitUntilElementToBeClickable(VALVE_LOGO_ICON);
    }
    public WebElement getPrivatePolicyLinkButton() {
        return waitUntilElementToBeClickable(PRIVATE_POLICY_LINK_BUTTON);
    }
    public WebElement getLegalLinkButton() {
        return waitUntilElementToBeClickable(LEGAL_LINK_BUTTON);
    }
    public WebElement getSteamSubscriberAgreementLinkButton() {
        return waitUntilElementToBeClickable(STEAM_SUBSCRIBER_AGREEMENT_LINK_BUTTON);
    }
    public WebElement getRefuceLinkButton() {
        return waitUntilElementToBeClickable(REFUSE_LINK_BUTTON);
    }
    public WebElement getCookiesLinkButton() {
        return waitUntilElementToBeClickable(COOKIES_LINK_BUTTON);
    }
    public WebElement getAboutValveLinkButton() {
        return waitUntilElementToBeClickable(ABOUT_VALVE_LINK_BUTTON
        );
    }
    public WebElement getJobsLinkButton() {
        return waitUntilElementToBeClickable(JOBS_LINK_BUTTON);
    }
    public WebElement getSteamWorksLinkButton() {
        return waitUntilElementToBeClickable(STEAMWORKS_LINK_BUTTON);
    }
    public WebElement getSteamDistributionLinkButton() {
        return waitUntilElementToBeClickable(STEAM_DISTRIBUTION_LINK_BUTTON);
    }
    public WebElement getSupportLinkButton() {
        return waitUntilElementToBeClickable(VALVE_LOGO_ICON);
    }
    public WebElement getGiftCardsLinkButton() {
        return waitUntilElementToBeClickable(VALVE_LOGO_ICON);
    }
    public WebElement getFacebookLinkButton() {
        return waitUntilElementToBeClickable(VALVE_LOGO_ICON);
    }
    public WebElement getTwitterLinkButton() {
        return waitUntilElementToBeClickable(VALVE_LOGO_ICON);
    }
}
