package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaLoginPageHelper extends SteamUaLoginPageElements {
    public SteamUaLoginPageHelper(WebDriver driver) {
        super(driver);
    }

    public SteamUaLoginPageHelper writeValidUsername() {
        getClickOnLoginInput().sendKeys("anyashyta");
        return this;
    }

    public SteamUaLoginPageHelper writeValidEmail() {
        getClickOnLoginInput().sendKeys("ed27nast@gmail.com");
        return this;
    }

    public SteamUaLoginPageHelper writeValidPassword() {
        getClickOnPasswordInput().sendKeys("eduard27072002");
        return this;
    }

    public SteamUaLoginPageHelper clickOnLoginButton() {
        getClickOnLoginButton().click();
        return this;
    }

    public SteamUaLoginPageHelper makeLogin(String username, String password) {
        getClickOnLoginInput().sendKeys(username);
        getClickOnPasswordInput().sendKeys(password);
        return this;
    }

    public SteamUaLoginPageHelper moveToRememberMeCheckBox() {
        moveCursor(getRememberMeCheckBox());
        return this;
    }
    public SteamUaLoginPageHelper clickOnHelpLinkButton() {
        getClickOnHelpLinkButton().click();
        return this;
    }
    public SteamUaLoginPageHelper clickOnSteamMobileAppLinkButton() {
        getClickOnSteamMobileAppLinkButton().click();
        return this;
    }

    private String loginColor;

    public void setLoginColor() {
        this.loginColor = getErrorLoginInput().getCssValue("border-color");
    }

    public String getLoginColor() {
        return loginColor;
    }

    private String passwordColor;

    public void setPasswordColor() {
        this.passwordColor = getErrorPasswordInput().getCssValue("border-color");
    }

    public String getPasswordColor() {
        return passwordColor;
    }

    private String errorMessageColor;

    public void setErrorMessageColor() {
        this.errorMessageColor = getErrorMessage().getCssValue("border-color");
    }

    public String getErrorMessageColor() {
        return errorMessageColor;
    }
}
