package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import page.NavigationBarPageObject;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;



public class NavigationBarTests extends TestBase {

    @Test
    @DisplayName("Загрузить статью в формате pdf")
    @Tag("NavigationBar")
    void downloadButtonTest() {

        step("Open page", () -> open());
        step("Open download page", NavigationBarPageObject::clickDownloadPageButton);
        step("Click download button", NavigationBarPageObject::clickDownloadButton);

    }

    @Test
    @DisplayName("Открытие случайной статьи")
    @Tag("NavigationBar")
    void openRandomItemTest() {
        step("Open page", () -> open());
        step("Open random page", NavigationBarPageObject::clickRandomPageButton);
        step("Check redirect random page", NavigationBarPageObject::checkNavigationButton);

    }

}
