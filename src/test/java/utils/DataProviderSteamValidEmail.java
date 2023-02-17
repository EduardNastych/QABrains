package utils;

import org.testng.annotations.DataProvider;

public class DataProviderSteamValidEmail {
    private final static String EMAIL = "ed27nast@gmail.com";

    @DataProvider
    public static Object[][] randomUserDataLogin() {
        return new Object[][]{
                {EMAIL}
        };
    }
}
