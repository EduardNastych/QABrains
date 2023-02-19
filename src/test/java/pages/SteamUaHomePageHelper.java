package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaHomePageHelper extends SteamUaHomePageElements {
    public SteamUaHomePageHelper(WebDriver driver) {
        super(driver);
    }

    public SteamUaHomePageHelper openLoginWindow() {
        getOpenLoginWindow().click();
        return this;
    }

    public SteamUaHomePageHelper moveCursorToCategoryAction() {
        moveCursor(getMoveCursorToCategory());
        getClickCategoryToAction().click();
        return this;
    }

    public SteamUaHomePageHelper moveCursorToNewsBarMenu() {
        moveCursor(getMoveCursorToNewsBarMenu());
        getClickNewsBarMenu().click();
        return this;
    }
    public SteamUaHomePageHelper openLanguages() {
        getOpenLanguageMenu().click();
        return this;
    }

    public SteamUaHomePageHelper switchToGerman() {
        getGermanLanguage().click();
        return this;
    }

    public boolean newsButtonTextToBe(String text){

        return waitUntilTextToBe( getGermanLanguage(),text);
    }
    public void waitUntilChangeLanguageFinish(){
        waitUntilInvisibilityOfElement(changerLanguagePopUp());
    }

}
