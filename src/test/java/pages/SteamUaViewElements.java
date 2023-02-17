package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaViewElements extends AbstractBasePage {
    public SteamUaViewElements(WebDriver driver) {
        super(driver);
    }

    private static final String COMMUNITY_MENU_ITEM = "//a[contains(text(),'СПІЛЬНОТА')]";
    private static final String STORE_MENU_ITEM = "(//a[contains(text(),'Крамниця')])[1]";
    private static final String VALVE_LOGO_ICON = "(//img[@alt='Valve Software'])[1]";

    public WebElement getCommunityMenuItem() {
        return waitUntilElementToBeClickable(COMMUNITY_MENU_ITEM);
    }

    public WebElement getStoreMenuItem() {
        return waitUntilElementToBeClickable(STORE_MENU_ITEM);
    }

    public WebElement getValveLogoIcon() {
        return waitUntilElementToBeClickable(VALVE_LOGO_ICON);
    }
}
