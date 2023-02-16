package pages;

import org.openqa.selenium.WebDriver;

public class SteamUaRegistrationPageHelper extends SteamUaRegistrationPageElements {
    public SteamUaRegistrationPageHelper (WebDriver driver) {   super(driver);}


    public SteamUaRegistrationPageHelper writeValidEmail(){
        getClickOnEmailInput().sendKeys("natat@gmail.com");
        return this ;
    }
    public SteamUaRegistrationPageHelper writeValidEmailInReenter(){
        getClickOnReenterEmailInput().sendKeys("natat@gmail.com");
        return this;
    }
    public SteamUaRegistrationPageHelper clickOnJoinToSteamButton (){
        getClickOnJoinToSteamButton().click();
        return this;
    }
    public SteamUaRegistrationPageHelper clickOnIAgreeCheckMark(){
        getClickOnCheckMark().click();
        return this;

    }
    public SteamUaRegistrationPageHelper clickOnContinueButton(){
        getClickOnContinueButton().click();
        return this;
    }
    public SteamUaRegistrationPageHelper ErrorDisplay(){
        getErrorDisplay().isDisplayed();
        return this;
    }
}
