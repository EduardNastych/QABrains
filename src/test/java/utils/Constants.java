package utils;

public class Constants {
    public final static String STEAM_URL = "https://store.steampowered.com/";
    //DataProvider
    public static final String VALID_USERNAME = "anyashyta";
    public static final String VALID_EMAIL = "ed27nast@gmail.com";
    public static final String VALID_PASSWORD = "eduard27072002";
    public static final String INVALID_USERNAME = "eduardnastych";
    public static final String INVALID_PASSWORD = "anya10102002";

    //Login Tests
    public static final String LOGIN_INPUTS_BORDER_LINE_COLOR = "rgb(193, 87, 85)";
    public static final String ERROR_MESSAGE_COLOR = "rgb(193, 87, 85)";
    public static final String AUTHORIZATION_PAGE_URL = "https://store.steampowered.com/login/?redir=&redir_ssl=1&snr=1_4_4__global-header";

    //CheckPresenceOfElements Test
    public static final String STEAM_ICON = "//img[@src='https://store.cloudflare.steamstatic.com/public/shared/images/header/logo_steam.svg?t=962016']";
    public static final String STORE_MENU_ITEM = "(//a[contains(text(),'Крамниця')])[1]";
    public static final String HOME_SUBMENU_ITEM = "(//a[contains(text(),'Домівка')])[1]";
    public static final String DISCOVERY_QUEUE_SUBMENU_ITEM = "(//a[contains(text(), 'Черга знахідок')])[1]";
    public static final String WISHLIST_SUBMENU_ITEM = "(//a[contains(text(), 'Бажане')])[1]";
    public static final String POINT_SHOP_SUBMENU_ITEM = "(//a[contains(text(), 'Крамниця жетонів')])[1]";
    public static final String NEWS_SUBMENU_ITEM = "(//a[contains(text(), 'Новини')])[1]";
    public static final String STATS_SUBMENU_ITEM = "(//a[contains(text(), 'Статистика')])[1]";
    public static final String COMMUNITY_MENU_ITEM = "//a[contains(text(),'СПІЛЬНОТА')]";
    public static final String ANOTHER_HOME_SUBMENU_ITEM = "(//a[contains(text(), 'Головна')])[2]";
    public static final String DISCUSSIONS_SUBMENU_ITEM = "(//a[contains(text(), 'Обговорення')])[1]";
    public static final String WORKSHOP_SUBMENU_ITEM = "(//a[contains(text(), 'Майстерня')])[1]";
    public static final String MARKET_SUBMENU_ITEM = "(//a[contains(text(), 'Ринок')])[1]";
    public static final String BROADCAST_SUBMENU_ITEM = "(//a[contains(text(), 'Трансляції')])[1]";
    public static final String ABOUT_MENU_ITEM = "//a[contains(text(),'ПРО STEAM')]";
    public static final String SUPPORT_MENU_ITEM = "//a[contains(text(),'ПІДТРИМКА')]";
    public static final String INSTALL_STEAM_BUTTON = "//a[contains(text(),'Інсталювати Steam')]";
    public static final String LOGIN_LINK_BUTTON = "//a[contains(text(),'увійти')]";
    public static final String LANGUAGE_PULL_DOWN_LINK = "//span[contains(text(),'мова')]";
    public static final String VALVE_LOGO_ICON = "(//img[@alt='Valve Software'])[1]";
    public static final String PRIVATE_POLICY_LINK_BUTTON = "(//a[contains(text(),'Політика конфіденційності')])[1]";
    public static final String LEGAL_LINK_BUTTON = "(//a[contains(text(),'Юридична інформація')])[1]";
    public static final String STEAM_SUBSCRIBER_AGREEMENT_LINK_BUTTON = "(//a[contains(text(),'Угода підписника Steam')])[1]";
    public static final String REFUSE_LINK_BUTTON = "(//a[contains(text(),'Повернення грошей')])[1]";
    public static final String COOKIES_LINK_BUTTON = "(//a[contains(text(),'Файли cookie')])[1]";
    public static final String ABOUT_VALVE_LINK_BUTTON = "//a[contains(text(),'Про Valve')]";
    public static final String JOBS_LINK_BUTTON = "//a[contains(text(),'Вакансії')]";
    public static final String STEAMWORKS_LINK_BUTTON = "//a[contains(text(),'Steamworks')]";
    public static final String STEAM_DISTRIBUTION_LINK_BUTTON = "//a[contains(text(),'Видання у Steam')]";
    public static final String SUPPORT_LINK_BUTTON = "(//a[contains(text(),'Підтримка')])[2]";
    public static final String GIFT_CARD_LINK_BUTTON = "//a[contains(text(),'Подарункові картки')]";
    public static final String FACEBOOK_LINK_BUTTON = "//a[@href='https://steamcommunity.com/linkfilter/?url=http://www.facebook.com/Steam']";
    public static final String TWITTER_LINK_BUTTON = "//a[@href='http://twitter.com/steam']";
    public static final String LOGIN_INPUT = "(//input[@class='newlogindialog_TextInput_2eKVn'])[1]";
    public static final String PASSWORD_INPUT = "//input[@type='password']";
    public static final String REMEMBER_ME_CHECK_BOX = "//div[@class='newlogindialog_Checkbox_3tTFg']";
    public final static String LOGIN_BUTTON = "//button[text()='Увійти']";
    public final static String HELP_I_CANT_SIGN_IN_LINK_BUTTON = "//a[contains(text(),'Help, I can')]";
    public final static String STEAM_MOBILE_APP_LINK_BUTTON = "//a[contains(text(),'Steam Mobile App')]";
    public final static String POP_UP_NOTIFICATION = "//div[contains(text(), 'Під час наступного запуску Steam вам не потрібно буде вводити пароль чи підтверджувати вхід до акаунта.')]";

    //SupportPage Tests
    public final static String FORGOT_LOGIN_DATA_PAGE_URL = "https://help.steampowered.com/uk/wizard/HelpWithLoginInfo?issueid=406";
    public final static String RECEIVE_STOLEN_ACCOUNT_PAGE_URL = "https://help.steampowered.com/uk/wizard/HelpWithLoginInfo?reset=1&issueid=408";
    public final static String NOT_RECEIVE_CODE_PAGE_URL = "https://help.steampowered.com/uk/wizard/HelpWithLoginInfo?reset=2&issueid=409";
    public final static String LOST_AUTHENTICATOR_PAGE_URL = "https://help.steampowered.com/uk/wizard/HelpWithLoginInfo?lost=8&issueid=402";
    public final static String LOGIN_PAGE_URL = "https://store.steampowered.com/mobile";
    public final static String ADD_NUMBER_URl = "https://store.steampowered.com/login/?redir=phone%2Fmanage&redir_ssl=1";
    public final static String HELP_ERROR_MESSAGE_BORDER_LINE_COLOR = "rgb(129, 0, 0)";
}
