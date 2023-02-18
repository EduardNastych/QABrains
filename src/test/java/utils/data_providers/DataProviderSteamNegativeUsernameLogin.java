package utils.data_providers;

import org.testng.annotations.DataProvider;
import static utils.Constants.*;

public class DataProviderSteamNegativeUsernameLogin {
    @DataProvider
    public static Object[][] randomUserDataLogin() {
        return new Object[][]{
                {INVALID_USERNAME, VALID_PASSWORD}
        };
    }
}
