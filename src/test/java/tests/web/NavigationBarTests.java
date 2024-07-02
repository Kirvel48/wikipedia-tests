package tests.web;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.NavigationBarPage;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("NavigationBar")
@Tag("Web")
@DisplayName("Тесты панели навигации")
@Owner("Тётушкин К.И.")
public class NavigationBarTests extends TestBase {
    NavigationBarPage navigationBarPage = new NavigationBarPage();

    @Test
    @DisplayName("Кнопка загрузить активна")
    void downloadButtonActiveTest() {
        step("Open page", () -> open());
        step("Open download page", navigationBarPage::clickDownloadPageButton);
        step("Click download button", navigationBarPage::clickDownloadButton);

    }

    @Test
    @DisplayName("Открытие случайной статьи")
    void openRandomItemTest() {
        step("Open page", () -> open());
        step("Open random page", navigationBarPage::clickRandomPageButton);
        step("Check redirect random page", navigationBarPage::checkNavigationButton);

    }

}
