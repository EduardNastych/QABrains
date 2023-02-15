package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaLoginPageHelper extends SteamUaLoginPageElements{
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

    public SteamUaLoginPageHelper makeLogin(String username, String password){
        getClickOnLoginInput().sendKeys(username);
        getClickOnPasswordInput().sendKeys(password);
        return this;
    }
}
