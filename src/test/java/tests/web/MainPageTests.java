package tests.web;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.MainPage;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("MainPage")
@Tag("Web")
@DisplayName("Тесты главной страницы")
@Owner("Тётушкин К.И.")

public class MainPageTests extends TestBase {
    MainPage mainPage = new MainPage();

    @Test
    @DisplayName("Проверка поисковой строки")
    public void searchLineTest() {
        step("Open page", () -> open());
        step("Open search page", mainPage::clickSearchButton);
        step("Set search value", () -> mainPage.setSearchStringValue(valueSearchString));
        step("Check tile page", () -> mainPage.checksearchResults(valueSearchString));

    }

    @Test
    @DisplayName("Переход по ссылке из ховера")
    void hoverLinkTest() {
        step("Open page", () -> open());
        step("Open hover", mainPage::welcomeTitleHover);
        step("Click hover", mainPage::clickPopupWelcomeTitle);
        step("Check redirect page", () -> mainPage.checkValueMainHeaderPage(checkValueHover));


    }

    @Test
    @DisplayName("Переход в песочницу создания статей")
    void openCreateItemSandbox() {
        step("Open page", () -> open());
        step("Click create item button", mainPage::clickCreateItemButton);
        step("Click sandbox button", mainPage::clickSandboxButton);
        step("Check value sandbox header");
        mainPage.checkValueMainHeaderPage(checkValueSabdbox);
    }

}


