package tests.web;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.NavigationBarPageObject;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

@Tag("NavigationBar")
@Tag("Web")
@DisplayName("Тесты панели навигации")
@Owner("Тётушкин К.И.")
public class NavigationBarTests extends TestBase {
    NavigationBarPageObject navigationBarPageObject = new NavigationBarPageObject();

    @Test
    @DisplayName("Загрузить статью в формате pdf")
    @Owner("Тётушкин К.И.")

    void downloadButtonTest() {

        step("Open page", () -> open());
        step("Open download page", navigationBarPageObject::clickDownloadPageButton);
        step("Click download button", navigationBarPageObject::clickDownloadButton);

    }

    @Test
    @DisplayName("Открытие случайной статьи")
    @Owner("Тётушкин К.И.")
    void openRandomItemTest() {
        step("Open page", () -> open());
        step("Open random page", navigationBarPageObject::clickRandomPageButton);
        step("Check redirect random page", navigationBarPageObject::checkNavigationButton);

    }

}
