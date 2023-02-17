package pages;

import base.AbstractBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SteamUaSearchGameElements extends AbstractBasePage {

    public SteamUaSearchGameElements(WebDriver driver) { super(driver);}

    private final static String SEARCH_INPUT_GAME = "//input[@id='store_nav_search_term']";

    private final static String SEARCH_GAME_BUTTON = "(//img[contains(@src, 'store.cloudflare')])[5]";

    private final static String VisibleCounterStrike = "(//div[@class='col search_capsule'])[1]";
    public WebElement getClickOnSearchInputGame(){
        return waitUntilElementToBeClickable(SEARCH_INPUT_GAME);
    }

    public WebElement getClickOnSearchButtonGame(){
        return waitUntilElementToBeClickable(SEARCH_GAME_BUTTON);
    }

    public WebElement getVisibleCounterStrike(){
        return waitUntilVisibilityOfElementLocated(VisibleCounterStrike);
    }

}
