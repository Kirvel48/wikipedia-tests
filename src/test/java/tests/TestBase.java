package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.WebDriverProvider;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import io.qameta.allure.selenide.AllureSelenide;

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
        WebDriverProvider.setConfig();
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
