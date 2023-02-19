package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaHelpWithLoginInfoPageHelper extends SteamUaHelpWithLoginInfoPageElements{
    public SteamUaHelpWithLoginInfoPageHelper(WebDriver driver) {
        super(driver);
    }
    public SteamUaHelpWithLoginInfoPageHelper writeValidEmail(String email){
        getClickOnDataInput().sendKeys(email);
        return this;
    }
    public SteamUaHelpWithLoginInfoPageHelper clickOnSearchButton(){
        getClickOnSearchButton().click();
        return this;
    }
    private String captchaColor;

    public void setCaptchaColor() {
        this.captchaColor = getCaptchaErrorMessage().getCssValue("border-color");
    }

    public String getCaptchaColor() {
        return captchaColor;
    }
    private String messageColor;

    public void setMessageColor() {
        this.messageColor = getHelpErrorMessage().getCssValue("border-color");
    }

    public String getMessageColor() {
        return messageColor;
    }
}
