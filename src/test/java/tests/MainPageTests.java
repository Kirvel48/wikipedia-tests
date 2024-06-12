package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.MainPageObject;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("MainPage")
@DisplayName("Тесты главной страницы")

public class MainPageTests extends TestBase {
    MainPageObject mainPageObject = new MainPageObject();

    @Test
    @DisplayName("Проверка поисковой строки")
    @Owner("Тётушкин К.И.")
    public void searchLineTest() {
        step("Open page", () -> open());
        step("Open search page", mainPageObject::clickSearchButton);
        step("Set search value", () -> mainPageObject.setSearchStringValue(valueSearchString));
        step("Check tile page", () -> mainPageObject.checksearchResults(valueSearchString));

    }

    @Test
    @DisplayName("Переход по ссылке из ховера")
    @Owner("Тётушкин К.И.")
    void hoverLinkTest() {
        step("Open page", () -> open());
        step("Open hover", mainPageObject::wellcomeTitleHover);
        step("Click hover", mainPageObject::clickPopupWellcomeTitle);
        step("Check redirect page", () -> mainPageObject.checkValueMainHeaderPage(checkValueHover));


    }

    @Test
    @DisplayName("Переход в песочницу создания статей")
    @Owner("Тётушкин К.И.")
    void openCreateItemSandbox() {
        step("Open page", () -> open());
        step("Click create item button", mainPageObject::clickCreateItemButton);
        step("Click sandbox button", mainPageObject::clickSandboxButton);
        step("Check value sandbox header");
        mainPageObject.checkValueMainHeaderPage(checkValueSabdbox);
    }

}


