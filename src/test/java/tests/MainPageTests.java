package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.MainPageObject;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class MainPageTests extends TestBase {
    @Test
    @DisplayName("Проверка поисковой строки")
    @Tag("MainPage")
    public void searchLineTest() {
        step("Open page", () -> open());
        step("Open search page", MainPageObject::clickSearchButton);
        step("Set search value", () -> MainPageObject.setSearchStringValue(valueSearchString));
        step("Check tile page", () -> MainPageObject.checksearchResults(valueSearchString));

    }

    @Test
    @DisplayName("Переход по ссылке из ховера")
    @Tag("MainPage")
    void hoverLinkTest() {
        step("Open page", () -> open());
        step("Open hover", MainPageObject::wellcomeTitleHover);
        step("Click hover", MainPageObject::clickPopupWellcomeTitle);
        step("Check redirect page", () -> MainPageObject.checkValueMainHeaderPage(checkValueHover));


    }

    @Test
    @DisplayName("Переход в песочницу создания статей")
    @Tag("MainPage")
    void openCreateItemSandbox() {
        step("Open page", () -> open());
        step("Click create item button", MainPageObject::clickCreateItemButton);
        step("Click sandbox button", MainPageObject::clickSandboxButton);
        step("Check value sandbox header");
        MainPageObject.checkValueMainHeaderPage(checkValueSabdbox);
    }

}


