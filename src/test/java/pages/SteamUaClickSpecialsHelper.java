package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaClickSpecialsHelper extends SteamUaClickSpecialsElements {
    public SteamUaClickSpecialsHelper(WebDriver driver) { super(driver);}

    public SteamUaClickSpecialsHelper clickOnSpecialsButton() {
        getButtonSpecials().click();
        return this;
    }
    public SteamUaClickSpecialsHelper clickOnListButtonSortByTrigger() {
        getListButtonSortByTrigger().click();
        return this;
    }
    public SteamUaClickSpecialsHelper clickOnButtonSortByDate() {
        getButtonSortByDate().click();
        return this;
    }

}
