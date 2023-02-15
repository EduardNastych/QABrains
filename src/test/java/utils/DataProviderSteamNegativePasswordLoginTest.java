package utils;

import org.testng.annotations.DataProvider;

public class DataProviderSteamNegativePasswordLoginTest {
    private final static String USERNAME = "anyashyta";
    private final static String PASSWORD = "27072002";

    @DataProvider
    public static Object[][] randomUserDataLogin() {
        return new Object[][]{
                {USERNAME, PASSWORD}
        };
    }
}
