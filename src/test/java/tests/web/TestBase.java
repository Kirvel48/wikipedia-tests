package tests.web;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverConfig;
import helpers.Attach;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    public String userName = "Kirvel";
    public String password = "123QWEasdf";
    public String valueSearchString = "Рислинг";
    public String checkValueSabdbox = "Инкубатор:Песочница";
    public String checkValueHover = "Википедия";

    @BeforeAll
    static void beforeAll() {
        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
        Configuration.baseUrl = config.getBaseUrl();
        Configuration.browser = config.getBrowserName();
        Configuration.browserVersion = config.getBrowserVersion();
        Configuration.browserSize = config.getBrowserSize();
        Configuration.remote = config.getRemoteUrl();
        Configuration.pageLoadStrategy = "eager";
        Configuration.timeout = 15000;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        ChromeOptions chromeOptions = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("intl.accept_languages", "en");
        chromeOptions.setExperimentalOption("prefs", prefs);
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

        Configuration.browserCapabilities = capabilities;
    }


    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("");
    }


    @AfterEach
    void addAttachment() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }


}
