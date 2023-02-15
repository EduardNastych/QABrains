package utils;

import org.testng.annotations.DataProvider;

public class DataProviderSteamNegativeEmailLogin {
    private final static String MAIL = "ed27nast@gmail.com";
    private final static String PASSWORD = "eduard27072002";

    @DataProvider
    public static Object[][] randomUserDataLogin() {
        return new Object[][]{
                {MAIL, PASSWORD}
        };
    }
}
