package utils;

import org.testng.annotations.DataProvider;

public class DataProviderSteamNegativeDataTest {
    private final static String USERNAME = "eduardnastych";
    private final static String PASSWORD = "27072002";

    @DataProvider
    public static Object[][] randomUserDataLogin() {
        return new Object[][]{
                {USERNAME, PASSWORD}
        };
    }
}
