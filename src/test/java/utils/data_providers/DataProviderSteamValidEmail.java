package utils.data_providers;

import org.testng.annotations.DataProvider;
import static utils.Constants.*;

public class DataProviderSteamValidEmail {
    @DataProvider
    public static Object[][] randomUserDataLogin() {
        return new Object[][]{
                {VALID_EMAIL}
        };
    }
}
