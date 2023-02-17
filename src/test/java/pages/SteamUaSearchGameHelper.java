package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaSearchGameHelper extends SteamUaSearchGameElements {

    public SteamUaSearchGameHelper(WebDriver driver) {
        super(driver);
    }

    public SteamUaSearchGameHelper writeNameOfGame(){
        getClickOnSearchInputGame().sendKeys("Couter Strike");
        return this;
    }

    public SteamUaSearchGameHelper clickOnSearchButtonOfGame(){
        getClickOnSearchButtonGame().click();
        return this;
    }

    public SteamUaSearchGameHelper visibleCounterStrikeGame(){
        getVisibleCounterStrike().isDisplayed();
        return this;
    }
}
