package utils;
import org.testng.annotations.DataProvider;

import static utils.Constants.*;

public class DataProviderCredentials {
    @DataProvider
    public static Object[][] positiveUserData() {
        return new Object[][]{
                {VALID_USERNAME, VALID_PASSWORD}
        };
    }
    @DataProvider
    public static Object[][] positiveUserEmail() {
        return new Object[][]{
                {VALID_EMAIL}
        };
    }
    @DataProvider
    public static Object[][] negativeUserData() {
        return new Object[][]{
                {INVALID_USERNAME, INVALID_PASSWORD}
        };
    }
    @DataProvider
    public static Object[][] negativeUserEmail() {
        return new Object[][]{
                {VALID_EMAIL, VALID_PASSWORD}
        };
    }
    @DataProvider
    public static Object[][] negativeUserPassword() {
        return new Object[][]{
                {VALID_USERNAME, INVALID_PASSWORD}
        };
    }
    @DataProvider
    public static Object[][] negativeUserUsername() {
        return new Object[][]{
                {INVALID_USERNAME, VALID_PASSWORD}
        };
    }
}
