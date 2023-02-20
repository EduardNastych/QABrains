package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaLoginPageHelper extends SteamUaLoginPageElements {
    public SteamUaLoginPageHelper(WebDriver driver) {
        super(driver);
    }

    public SteamUaLoginPageHelper writeValidUsername() {
        getLoginInput().sendKeys("anyashyta");
        return this;
    }

    public SteamUaLoginPageHelper writeValidEmail() {
        getLoginInput().sendKeys("ed27nast@gmail.com");
        return this;
    }

    public SteamUaLoginPageHelper writeValidPassword() {
        getPasswordInput().sendKeys("eduard27072002");
        return this;
    }

    public SteamUaLoginPageHelper clickOnLoginButton() {
        getLoginButton().click();
        return this;
    }

    public SteamUaLoginPageHelper makeLogin(String username, String password) {
        getLoginInput().sendKeys(username);
        getPasswordInput().sendKeys(password);
        return this;
    }

    public SteamUaLoginPageHelper moveToRememberMeCheckBox() {
        moveCursor(getRememberMeCheckBox());
        return this;
    }
    public SteamUaLoginPageHelper clickOnHelpLinkButton() {
        getHelpLinkButton().click();
        return this;
    }
    public SteamUaLoginPageHelper clickOnSteamMobileAppLinkButton() {
        getSteamMobileAppLinkButton().click();
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
