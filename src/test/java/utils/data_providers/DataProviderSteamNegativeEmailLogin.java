package utils.data_providers;

import org.testng.annotations.DataProvider;
import static utils.Constants.*;

public class DataProviderSteamNegativeEmailLogin {
    @DataProvider
    public static Object[][] randomUserDataLogin() {
        return new Object[][]{
                {VALID_EMAIL, VALID_PASSWORD}
        };
    }
}
