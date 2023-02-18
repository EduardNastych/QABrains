package utils.data_providers;

import org.testng.annotations.DataProvider;
import static utils.Constants.*;

public class DataProviderSteamPositiveData {
    @DataProvider
    public static Object[][] randomUserDataLogin() {
        return new Object[][]{
                {VALID_USERNAME, VALID_PASSWORD}
        };
    }
}
