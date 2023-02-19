package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaHomePageElements extends AbstractBasePage {
    public SteamUaHomePageElements(WebDriver driver) {
        super(driver);
    }

    private final static String HEADER_LOGIN_BUTTON = "//a[text()='увійти']";

    private final static String PULLWOWN_DESKTOP_CATEGORY = "(//a[text()='Категорії'])[1]";

    private final static String BUTTON_ACTION_CATEGORY = "//a[contains(text(), 'Бойовики')]";

    private final static String BUTTON_NEWS_BAR_MENU = "(//a[@class='tab  '])[2]";
    private final static  String LANGUAGE_BUTTON ="//span[@id='language_pulldown']";
    private final static String GERMAN_BUTTON = "//a[contains(@onclick,'german')]";
    protected final static String NEWS_BUTTON ="//a[contains(@href,'explore/new/?snr=1_4_4__146')]";
    private final static String CHANGED_LANGUAGE ="//div[@class='newmodal_header_border']";

    public WebElement getOpenLoginWindow() {
        return waitUntilVisibilityOfElementLocated(HEADER_LOGIN_BUTTON);
    }

    public WebElement getMoveCursorToCategory() {
        return waitUntilVisibilityOfElementLocated(PULLWOWN_DESKTOP_CATEGORY);
    }

    public WebElement getClickCategoryToAction() {
        return waitUntilVisibilityOfElementLocated(BUTTON_ACTION_CATEGORY);
    }

    public WebElement getMoveCursorToNewsBarMenu() {
        return waitUntilVisibilityOfElementLocated(BUTTON_NEWS_BAR_MENU);
    }

    public WebElement getClickNewsBarMenu() {
        return waitUntilVisibilityOfElementLocated(BUTTON_NEWS_BAR_MENU);
    }
    public WebElement getOpenLanguageMenu(){return waitUntilVisibilityOfElementLocated(LANGUAGE_BUTTON);}
    public WebElement getGermanLanguage(){return waitUntilVisibilityOfElementLocated(GERMAN_BUTTON);}
    public WebElement getToNews(){return waitUntilVisibilityOfElementLocated(NEWS_BUTTON);}
    public  WebElement changerLanguagePopUp(){return waitUntilVisibilityOfElementLocated(CHANGED_LANGUAGE);}
}

