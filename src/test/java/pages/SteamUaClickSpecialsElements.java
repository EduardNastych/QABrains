package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaClickSpecialsElements extends AbstractBasePage {
    public SteamUaClickSpecialsElements(WebDriver driver) { super(driver);}
    private final static String BUTTON_SPECIALS = "//a[@class =  \"big_button\"][2]";
    private final static String LIST_BUTTON_SORT_BY_TRIGGER = "//a[@id =  \"sort_by_trigger\"]";

    private final static String BUTTON_SORT_BY_DATE = "//a[text()=\"за датою випуску\"]";
    public WebElement getButtonSpecials() {
        return waitUntilElementToBeClickable(BUTTON_SPECIALS);
    }
    public WebElement getListButtonSortByTrigger() {
        return waitUntilElementToBeClickable(LIST_BUTTON_SORT_BY_TRIGGER);
    }
    public WebElement getButtonSortByDate() {
        return waitUntilElementToBeClickable(BUTTON_SORT_BY_DATE);
    }
}
