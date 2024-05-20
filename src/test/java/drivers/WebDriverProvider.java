package drivers;

import com.codeborne.selenide.Configuration;
import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;

public class WebDriverProvider {
    public static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class);

    public static void setConfig() {
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowserName();
        Configuration.browserSize = config.getBrowserSize();


        }
    }
